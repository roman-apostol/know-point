<%--
  Created by IntelliJ IDEA.
  User: grez
  Date: 12/17/11
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jqueryCalendar:weekResources />
    <r:layoutResources />
  <title>title1 test</title>
</head>
<body>

<j

<jqueryCalendar:week date="${date}" readonly="${readOnly}" allowCalEventOverlap="${true}" timeslotsPerHour="${4}"
                     firstDayOfWeek="${1}" startHour="${8}" endHour="${22}" limitDisplay="${true}" height="${600}"/>

</body>
</html>

