<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6">
                        Register
                    </div>
                    <div class="col-md-6">
                        <a href="/login">Login Page</a>
                    </div>
                </div>

                <form:form action="/register" method="post" modelAttribute="user" role="form">
                    <div class="form-group">
                        <form:label path="username" for="username">Name</form:label>
                        <form:errors path="username" class="badge text-bg-primary" />
                        <form:input type="text" class="form-control" id="username" path="username" />
                    </div>
                    <div class="form-group">

                        <form:label path="email" for="username">Email</form:label>
                        <form:errors path="email" class="badge text-bg-primary" />
                        <form:input type="text" class="form-control" id="email" path="email" />
                    </div>
                    <div class="form-group">

                        <form:label path="password" for="username">Password</form:label>
                        <form:errors path="password" class="badge text-bg-primary" />
                        <form:input type="text" class="form-control" id="password" path="password" />
                    </div>
                    <div class="form-group">

                        <form:label path="passwordConfirmation" for="username">Confirm Password</form:label>
                        <form:errors path="passwordConfirmation" class="badge text-bg-primary" />
                        <form:input type="text" class="form-control" id="passwordConfirmation" path="passwordConfirmation" />
                    </div>
                    <button type="submit" class="btn btn-primary">
                        Register
                    </button>
                </form:form>
            </div>
        </div>
    </div>
</body>

</html>