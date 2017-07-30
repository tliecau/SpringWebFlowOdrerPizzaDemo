<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: podm
  Date: 7/27/17
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPizza</title>
</head>
<body>
<h2>Welcome on MyPizza!</h2>

<form:form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
    <input type="text" name="phoneNumber" /><br />
    <input type="submit" name="_eventId_phoneEntered" value="Search for Client"/>
</form:form>

</body>
</html>
