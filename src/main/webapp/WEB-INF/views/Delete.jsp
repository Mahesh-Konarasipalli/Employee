<html>
<body>
<h1 style="color: red; text-align: center">EMPLOYEE MANAGEMENT SYSTEM</h1><br>
<h2 style="color: green; text-align: center">EMPLOYEE DELETE FORM</h2>
<br><br>
<form method="POST" action="delete">
    <table style="margin-left: auto; margin-right: auto;">
        <tr>
            <td>Employee Number</td>
            <td><input type="text" name="eno" value="${employee.eno}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="DELETE"></td>
        </tr>
    </table>
</form>
</body>
</html>