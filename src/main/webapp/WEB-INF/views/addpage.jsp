<html>
<body>
    <h1 style="color: red; text-align: center">EMPLOYEE MANAGEMENT SYSTEM</h1><br>
    <h2 style="color: green; text-align: center">EMPLOYEE ADD FORM</h2>
    <br><br>
    <form method="POST" action="add">
    <table style="margin-right: auto; margin-left: auto;">
        <tr>
            <td>Employee Number</td>
            <td><input type="text" name="eno" value="${employee.eno}"></td>
        </tr>
        <tr>
            <td>Employee Name</td>
            <td><input type="text" name="ename" value="${employee.ename}"></td>
        </tr>
        <tr>
            <td>Employee Salary</td>
            <td><input type="text" name="esal" value="${employee.esal}"></td>
        </tr>
        <tr>
            <td>Employee Address</td>
            <td><input type="text" name="eaddr" value="${employee.eaddr}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="ADD"></td>
        </tr>
    </table>
    </form>
</body>
</html>