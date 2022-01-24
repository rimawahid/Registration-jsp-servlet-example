<%-- 
    Document   : employeeeregister
    Created on : Jan 24, 2022, 11:13:41 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align = "center">
            <h2>Employee Register Form</h2>
            <form action="<%= request.getContextPath()%>/register" method="POST">
                <table>
                    <tr>
                        <td>First Name</td>
                        <td><input type = "text" name="firstName"></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type = "text" name="lastName"></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type = "text" name="userName"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type = "password" name="password"></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type = "text" name="address"></td>
                    </tr>
                    <tr>
                        <td>Contact</td>
                        <td><input type = "text" name="contact"></td>
                    </tr>
                    
                </table>
                <input type="submit" value="Submit">
            </form>
        </div>

    </body>
</html>
