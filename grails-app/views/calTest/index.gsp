<%--
  Created by IntelliJ IDEA.
  User: grez
  Date: 12/17/11
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    %{--<fullcal:resources debug="true"/>--}%
    <jqueryCalendar:monthResources />


    <r:layoutResources />
    <title>index.gsp of caltest</title>
</head>
<body>
<h1>hello !!!</h1>

%{--<fullcal:calendar id="cal">
    header: { left: "", center: "", right: "prev, today, next" },
    columnFormat: { week: 'ddd d/M' },
    timeFormat: 'HH:mm{ - HH:mm}'
</fullcal:calendar>--}%

<jqueryCalendar:month
        year="${year}"
        month="${month}"
        weekStart="${1}"
        draggable="${true}"
        readonly="${readOnly}"
        fixedWeeks="${true}"
        abbrevDayHeadings="${false}"
        title="${true}"
        showTime="guess" />





<h1>cal after here!!!</h1>
</body>
</html>