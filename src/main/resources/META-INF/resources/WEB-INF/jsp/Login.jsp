<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Login Page</title>
    </head>
<body>
    Welcome to the login page

    ${name}
    <form method="post">
        ${error}
        Name: <input name="name" type="text" />
        Password: <input name="password" type="password"/>
        <input type="submit" />
    </form>
</body>
</html>