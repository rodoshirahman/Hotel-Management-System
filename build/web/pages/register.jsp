<%-- 
    Document   : register
    Created on : Apr 14, 2019, 1:34:18 PM
    Author     : khadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration system</title>
        <link rel="stylesheet" type="text/css" href="css/file.css">
    </head>
</head>
<body>
    <div class="header">
        <h2>Register</h2>
    </div>

    <form action="../registrationServlet"  method="POST">

        <div class="input-group">
            <label class="input-group">Title*</label>
            <select name="title" class="form-control" required style="width: 95%;height: 20px;font-size: 16px;border-radius: 5px;border: 1px solid gray;">
                <option value selected ></option>
                <option value="Dr.">Dr.</option>
                <option value="Miss.">Miss.</option>
                <option value="Mr.">Mr.</option>
                <option value="Mrs.">Mrs.</option>
                <option value="Prof.">Prof.</option>
                <option value="Rev .">Rev .</option>
                <option value="Rev . Fr">Rev . Fr .</option>
            </select>
        </div>
        <div class="input-group">
            <label>First Name</label>
            <input name="fname" class="form-control" required>

        </div>
        <div class="input-group">
            <label>Last Name</label>
            <input name="lname" class="form-control" required>

        </div>
        <div class="input-group">
            <label>Email</label>
            <input name="email" type="email" class="form-control" required>

        </div>
        <div class="input-group radio-inline">
            <label>Nationality*</label>
            <label class="radio-inline">
                <input type="radio" name="nation"  value="Bangladeshi" checked="">Bangladeshi
            </label>
            <label class="radio-inline">
                <input type="radio" name="nation"  value="Non Bangladeshi ">Non Bangladeshi
            </label>

        </div>

        <div class="input-group">
            <label>Passport Country</label>
            <input name="country" class="form-control" required >
        </div>
        <div class="input-group">
            <label>Phone Number</label>
            <input name="phone" type ="text" class="form-control" required>

        </div>
        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password_1">
        </div>
        <div class="input-group">
            <label>Confirm password</label>
            <input type="password" name="password_2">
        </div>
        <div class="input-group">
            <a href="http://localhost:8084/Hotel_Management/pages/reservation.jsp"><button type="submit" class="btn" name="register">Register</button></a>
        </div>
        <p>
            Already a member? <a href="http://localhost:8084/Hotel_Management/pages/login.jsp">Login</a>
        </p>
    </form>
</body>
</html>
