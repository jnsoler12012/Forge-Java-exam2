<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6">
                        <h1>Welcome to songs and lyrics - LOGIN</h1>
                    </div>
                    <div class="col-md-6">
                        <a href="/register">Registrar</a>
                    </div>
                </div>
                <form role="form">
                    <div class="form-group">

                        <label for="email">
                            Email address
                        </label>
                        <input type="email" class="form-control" id="email" />
                    </div>
                    <div class="form-group">

                        <label for="password">
                            Password
                        </label>
                        <input type="password" class="form-control" id="password" />
                    </div>

                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </form>
            </div>
        </div>
    </div>
</body>

</html>