<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Location</title>
</head>
<body>
<form action="updateVendor" method="post">
    <pre>
    Id       : <input type="text" name="id" value="${vendor.id}" readonly="true"/>
    Code     : <input type="text" name="code" value="${vendor.code}"/>
    Name     : <input type="text" name="name" value="${vendor.name}"/>
    type     : <input type="text" name="type" value="${vendor.type}"/>
    email    : <input type="text" name="email" value="${vendor.email}"/>
    phone    : <input type="text" name="phone" value="${vendor.phone}"/>
    address  : <input type="text" name="address" value="${vendor.address}"/>
     <input type="submit" value="save">
    </pre>
</form>
${msg}

<a href="displayVendors">View ALL</a>
</body>
</html>