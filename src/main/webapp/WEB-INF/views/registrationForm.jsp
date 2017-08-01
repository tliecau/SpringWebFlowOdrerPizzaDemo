<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: podm
  Date: 7/27/17
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPizza - new cutomer</title>
</head>
<body>
New Customer registration<br />
<form:form commandName="customer">
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
    Name:<input type="text" name="name" /><br />
    Street:<input type="text" name="street" /><br />
    City:<input type="text" name="city" /><br />
    House number:<input type="text" name="houseNumber" /><br />
    Zip Code<input type="text" name="zipCode" /><br />
    phoneNumber<input type="text" name="phoneNumber" /><br />
    <input type="submit" name="_eventId_submit" value="Create user"/>
    <input type="submit" name="_eventId_cancel" value="Cancel"/>
</form:form>
</body>
</html>
