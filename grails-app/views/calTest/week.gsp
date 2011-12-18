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
    <jqueryui:javascript/>
    <r:layoutResources />
  <title>week page</title>
</head>
<body>



<jqueryCalendar:week id="cal1" date="${date}" readonly="${readOnly}" allowCalEventOverlap="${true}" timeslotsPerHour="${4}"
                     firstDayOfWeek="${1}" startHour="${8}" endHour="${22}" limitDisplay="${true}" height="${600}"
controller=""/>

%{--<div id="drag1" class="ui-widget-content" style="width:20%;">
    <p>Item</p>
</div>--}%

<script type="text/javascript">
   $(function(){
//       $('#drag1').draggable();

       $('#jq_week_calendar').mouseup(function() {
           $('#jq_week_calendar').weekCalendar()
       });
   });
</script>

</body>
</html>

