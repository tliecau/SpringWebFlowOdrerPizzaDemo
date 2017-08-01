<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyPizza</title>
</head>
<body>
<h2>Sorry but we cannot send pizza to your location</h2>

<p>You location is out of our delivery region. You can proceed but it will be necessary to came to us for you pizza.</p>
<a href="${flowExecutionUrl}&_eventId=accept">I want that pizza! Place proceed</a>
<a href="${flowExecutionUrl}&_eventId=cancel">No, thanks. I will come back when I could get you pizza without going out</a>
</body>
</html>
