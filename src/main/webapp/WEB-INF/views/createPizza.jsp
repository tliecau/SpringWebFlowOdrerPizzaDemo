<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPizza</title>
</head>
<body>
        <h2>New pizza!</h2>
        <form:form commandName="pizza">
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <b>Size: </b><br />
            <form:radiobutton path="size" label="Small (20cm)" value="SMALL" /><br />
            <form:radiobutton path="size" label="Medium (20cm)" value="MEDIUM" /><br />
            <form:radiobutton path="size" label="Large (20cm)" value="LARGE" /><br />
            <form:radiobutton path="size" label="Ginormous (20cm)" value="GINORMOUS" /><br />
            <br />
            <br />

            <b>Toppings: </b><br />
            <form:checkboxes path="toppings" items="${toppingList}" delimiter=" &lt;br /&gt;"/><br /><br />

            <input type="submit" class="button" name="_eventId_addPizza" value="Add"/>
            <input type="submit" class="button" name="_eventId_cancel" value="Cancel"/>
        </form:form>
</body>
</html>
