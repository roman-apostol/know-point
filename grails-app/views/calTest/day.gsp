<%--
  Created by IntelliJ IDEA.
  User: grez
  Date: 12/17/11
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jqueryCalendar:dayResources />
    <r:layoutResources />
  <title></title>
</head>
<body>
<jqueryCalendar:day
        date="${date}"
        readonly="${readOnly}"
        allowCalEventOverlap="${true}"
        timeslotsPerHour="${4}"
        startHour="${8}"
        endHour="${18}"
        limitDisplay="${true}"
        height="${600}"/>
</body>
</html>