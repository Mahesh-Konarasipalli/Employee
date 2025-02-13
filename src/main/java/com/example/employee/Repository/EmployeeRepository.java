package com.example.employee.Repository;

import com.example.employee.Beans.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findEmployeeByEno (int eno);

    @Transactional
    @Modifying
    @Query("UPDATE Employee e SET e.ename = :ename, e.esal = :esal, e.eaddr = :eaddr WHERE e.eno = :eno")
    public int updateEmployee(@Param("eno") int eno,
                              @Param("ename") String ename,
                              @Param("esal") float esal,
                              @Param("eaddr") String eaddr);

    @Transactional
    public int deleteEmployeeByEno(int eno);

    String ename(String ename);
}
