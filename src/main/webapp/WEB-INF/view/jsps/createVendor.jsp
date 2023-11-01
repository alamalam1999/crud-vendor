<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Vendor</title>
</head>
<body>
<form action="saveVendor" method="post">
    <pre>
    Id      : <input type="text" name="id"/>
    Code    : <input type="text" name="code"/>
    Name    : <input type="text" name="name"/>
    Type    : <input type="text" name="type"/>
    email   : <input type="email" name="email"/>
    phone   : <input type="number" name="phone"/>
    address : <input type="text" name="address"/>
    <input type="submit" value="save">
    </pre>
</form>
${msg}

<a href="displayVendors">VIEW ALL</a>
</body>
</html>