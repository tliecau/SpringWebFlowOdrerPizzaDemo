<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPizza</title>
</head>
<body>
        <h2>Payment!</h2>
        <form:form commandName="paymentDetails">
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <b>Size: </b><br />
            <form:radiobuttons path="paymentType" items="${paymentTypeList}" /><br />

            <input type="submit" class="button" name="_eventId_paymentSubmitted" value="Add"/>
            <input type="submit" class="button" name="_eventId_cancel" value="Cancel"/>
        </form:form>
</body>
</html>