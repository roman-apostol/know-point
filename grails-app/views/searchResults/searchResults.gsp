<%--
  Created by IntelliJ IDEA.
  User: roma
  Date: 12/18/11
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>


<!DOCTYPE HTML>
<html lang="en">
<head><script type="text/javascript">var NREUMQ=NREUMQ||[];NREUMQ.push(["mark","firstbyte",new Date().getTime()])</script>
    <title>Поиск курсов Киева</title>
    <meta charset="utf-8" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta property="fb:app_id" content="111891482183773" />
    <link rel="shortcut icon" href="/favicon.ico" />
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'main2.css')}">
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'test.css')}">

    <style>
    .dashboardTop, #searchBox { display:none !important; }
    </style>


</head>
<body id="pgHomepage">

<script type="text/javascript" src="http://cdn1.styleseat.com/static/js/min/ssnew.aaec336b.js"></script>



<!--  start tracking code  -->
<script type="text/javascript">
    var campaign_var = "";
    var from_var = "";
</script>


<script language="javascript">
    $j(document).ready(function(){
        $j('#logoutLink').click(function() {
            var href = $j(this).attr("href");
            FB.getLoginStatus(function(response) {
                if (response.authResponse) {
                    FB.logout(function() {
                        window.location.href = href;
                    });
                } else {
                    window.location.href = href;
                }
            });
            return false;
        });

        function hideProfileCompletion() {
            $j('#profileCompletion').parent().fadeToggle("slow");
            setCookie('hpc', "1", 31, "/")
        }

        $j("#hideProfileCompletion").click(function() {
            hideProfileCompletion();
        });

    });
</script>
<script src="http://widgets.awe.sm/v2/widgets.js?key=c4e2cc2a143cd4741589587221017e476474399de7d50b21d73c78f20eaf45da"></script>

<div id="fb-root"></div>
<script src="http://connect.facebook.net/en_US/all.js"></script>
<script>

    var fbLoggedIn = false;

    if(!(typeof FB === 'undefined')) {

        FB.init({
            appId  : '111891482183773',
            status : true, // check login status
            cookie : true, // enable cookies to allow the server to access the session
            xfbml  : true,  // parse XFBML
            oauth  : true,
            channelUrl: 'http://www.styleseat.com/sharing/fb_channel' //custom channel
        });

        // Suggested hotfix in comments for IE Permission Denied bug
        // http://bugs.developers.facebook.net/show_bug.cgi?id=19042
        //FB.UIServer.setActiveNode = function(a,b){FB.UIServer._active[a.id]=b;} // IE

        FB.getLoginStatus(function(response) {
            if(response.status === "connected") {
                window.fbLoggedIn = true;
//	            var hasReloaded = getCookie("reloaded");
//	            if(hasReloaded != "1") {
//	                setCookie("reloaded", "1", 365, "/");
//	                window.location.reload();
//	            }
            }
            else {
                window.fbLoggedIn = false;
            }
        }, true);

        FB.Event.subscribe("auth.authResponseChange", function(response) {
            if(response.status === "connected") {
                window.fbLoggedIn = true;
            }
            else {
                window.fbLoggedIn = false;
            }
        });

        // StyleSeat specific wrappers

    }

</script>

<div class="" id="alert_message" style="display:none"> </div>
<div id="fb_loading_modal" style="display: none;">
    <div style="width: 350px; height: 60px; padding: 10px;">
        <div class="throbberMessage" style="padding-left: 28px; width: 320px; height: 100%; font-size: 2.5em; margin: 0 auto; line-height: 1.2em; vertical-align: text-bottom; background-repeat: no-repeat; background-position: left center;">StyleSeat and Facebook are talking about you... brb!</div>
    </div>
</div>
<div id="wrapper">

<!-- start:loggedOutHeader -->
<header id="siteHeader" role="banner">
    <h1><a href="/"><img  id="logoLight" width="200" height="38" src="${resource(dir: 'images', file: 'logo.png')}" alt="Znaniye"/></a></h1>
    <nav id="siteNav" role="navigation">
        <ul>

            <li class="siteNavItem"><a href="/search">Все курсы</a></li>
            <li class="siteNavItem "><a href="/photos">Расширенный поиск</a></li>
            <li class="siteNavItem " id="searchBox">
                <form id="nav_var_search" method="GET" action="/search" role="search">
                    <fieldset>
                        <div class="fields">
                            <input id="nav_bar_search_q" type="text" name="q" placeholder="pro search" value="pro search" tabindex="-1" onclick="this.value = '';"/>
                        </div><!--end:-->
                        <div class="actions searchActions">
                            <button type="get">поиск</button>
                        </div><!--end:actions-->
                    </fieldset>
                </form>

            </li><!--end:searchBox-->

        </ul>
    </nav><!--end:nav-->

    <ul id="tools">
        <li class="it01"><div class="padMe"><a href="/signup">Внести свою школу</a></div></li>

        <li><div class="padMe"><a href="/login?next=/"><img src ="http://www.handforyou.org/images/facebook_logo.png" width ='15'/>Войти</a></div></li>
    </ul><!--end:tools-->



</header><!--end:loggedOutHeader -->


<div id="central">

<section role="main" class="clearfix fullWidth">

<div id="searchBlock" class="fullWidth hpHeader">
    <form action="/search" method="GET">
        <div id="searchBar2" style = "height 100px;">

            <ul>
                <li class="siteNavItem"></li>

                <li class="siteNavItem"><a class= "rbutton" href="/search">Все курсы</a></li>
                <li class="siteNavItem">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li class="siteNavItem">&nbsp;</li>
                <li class="siteNavItem">&nbsp;</li>
                <li class="siteNavItem "><a class= "rbutton" href="/photos">Расширенный поиск</a></li>
            </ul><br/>
            <div>
                <i><br/><br/>Пример: <a href = '' style = "border-bottom:1px dotted;"
                    onclick="document.form1.q.value='курсы английского в голосеевском районе по четвергам после 18:00 цена до 600 грн.'; document.form1.submit();">
                    курсы английского в голосеевском районе по четвергам после 18:00 цена до 600 грн.</a></i>

            </div>
            <input id="searchWord" type="text" name="q" class="bigBox" value="поиск" class="greenActionButton" type="submit" name="search" />
            <input id="searchButton" class="greenActionButton" type="submit" name="search" value="Поиск">
        </div>
    </form>

</div>


<div class="columns fullWidth">



    <aside class="rightColumn" style="margin-top: 88px;">


        <div class="facebookBlock banner">
            <iframe width="300" height="300" frameborder="0" scrolling="no" marginheight="40px" marginwidth="40px" src="http://maps.google.com/?ie=UTF8&amp;ll=50.43627,30.535297&amp;spn=0.016237,0.045147&amp;t=h&amp;z=15&amp;vpsrc=6&amp;output=embed"></iframe><br /><small><a href="http://maps.google.com/?ie=UTF8&amp;ll=50.43627,30.535297&amp;spn=0.016237,0.045147&amp;t=h&amp;z=15&amp;vpsrc=6&amp;source=embed" style="color:#0000FF;text-align:left">View Larger Map</a></small>
        </div>




    </aside>

    <div id="own1">
        <br/>
        <br/>
        <br/>
        <header>
            <h5>Результаты поиска:</h5>
            <!-- <h3>None + None</h3> -->
        </header>
        <section>
            <header id="sortResults" class="fullWidth">
                <span>Сортировать по:</span>
                <a id="sortBestMatch" class="selected"
                   href="#" onclick="$('searchSort').value='best_match'; $('searchForm').submit();">Релевантности<span></span></a>
                <a id="sortMostRecommended" href="#"
                   onclick="$('searchSort').value='most_recommended'; $('searchForm').submit();">Популярности</a>
                <p> </p>
            </header>
        </section>
        <section id="results" class="fullWidth">
            <g:set var="i" value="0" />
            <g:each var="group" in="${groups}" >
                <% i++ %>


                <article id="ss7715" class="resultItem result">
                <div class="left resultLeft">
                    <div class="right">
                        <ul class="featureIconList">


                            <li> ${group.price} UAH</li>
                        </ul>
                    </div>

                    <a href="/sherryreyesashe" target="_blank" class="avatarLink"
                       onMouseDown="return clk(this, 1, 7715, 650021);"><img src=${resource(dir: 'images/random/', file: i + ".jpeg")} src="http://www.speak-up.com.ua/public/themes/speak-up/images/menu_15.jpg" width="100" height="100"/></a>


                    <div class="left" style="max-width:300px;">
                        <span class="resultNumber">${i}.</span>
                        <h3 class="resultTitle">

                            <a href="/sherryreyesashe" target="_blank"
                               onMouseDown="return clk(this, 1, 7715, 650021);"></a>

                        </h3>
                        <span class="resultTagline" style="margin-bottom:19px">${group.name}</span> </span>
                        <table>
                            <g:each var="event" in="${group.schedule.events}" >
                            <tr>
                                <td>
                                    ${event.weekDay}:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>От ${event.startHour}:${event.startMinute}0 до ${event.startHour+event.duration}:${event.startMinute}0 </b>
                                </td>
                            </tr>
                            </g:each>
                        </table>
                        <p class="stylistAddress">Учитель: <a href ="" style="color:blue;"> ${group.schedule.events.asList()[0].teacher.name}</a><br/>
                            <br/>
                        </p>

                        <a class="viewMap" title="Click to view map" target="_map" target="_blank"
                           href="http://maps.google.com/?q=loc%3A761%20Flatbush%20Ave+,+Brooklyn,+NY">Показать на карте</a>
                    </div>
                    <div class = "right_one" float="right">
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <br/>

                        <li class="siteNavItem"><ul><a class ="rbutton" href="" style="color:white;">ПРИСОЕДИНИТСЯ&nbsp;&nbsp;</a></ul></li>
                    </div>

                </div>
                 </article>

           </g:each>


        </section>

    </div>


</div>

</section><!--end:main-->

</div><!--end:central-->




</div><!--end:wrapper-->

<footer id="footerWrapper" style="position: relative;">
    <div>


        <section id="about">
            <strong>О нас</strong>
            <p>
                Точка Знаний это онлайн ресурс для личносного развития. Поиск курсов по расписанию.

            </p>
        </section><!--end:about-->






        <ul id="footerUl">
            <li role="contentinfo">&copy; 2011 Tochka Znaniya. All rights reserved.</li>
            <br/>
            <li><a href="/search">Найти курсы</a></li>
            <li><a href="/signup">Добавить школу</a></li>
            <li><a href="/site/about_us">Команда</a></li>
            <li><a href="/tos">Условия пользования</a></li>
        </ul>
    </div>
</footer>

</div><!--end:wrapper-->


</html>
