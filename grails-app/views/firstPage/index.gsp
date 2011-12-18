
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

    <!--[if lt IE 9]>
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

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


        <ul id="tools">
            <li class="it01"><div class="padMe"><a href="/signup">Внести свою школу</a></div></li>

            <li><div class="padMe"><a href="/login?next=/"><img src ="http://www.handforyou.org/images/facebook_logo.png" width ='15'/>Войти</a></div></li>
        </ul><!--end:tools-->



    </header><!--end:loggedOutHeader -->


    <div id="central">

        <section role="main" class="clearfix fullWidth">

            <div id="searchBlock" class="fullWidth hpHeader">
              <g:form action="search" method="POST" name="form1">
                %{--<form action="${ac}" method="GET">--}%
                    <div id="searchBar2">
                        <!--<h1><span class="teal">Найдите</span> и <span class="teal">запишитесь</span> на курсы возле Вас</h1> -->
                        <br/>
                        <div>
                            <!--<i>Пример: <a href = '#' onclick="document.form1.q.value='курсы английского в голосеевском районе по четвергам после 18:00 цена до 600 грн.'; document.form1.submit();" style = "border-bottom:1px dotted;">курсы английского в голосеевском районе по четвергам после 18:00 цена до 600 грн.</a></i>
                                -->
                        </div>
                        <input id="searchWord" type="text" name="q" class="bigBox" value="" onfocus="if(this.value=='Hair cut') {this.value='';}"/>
                        <!--<label for="searchLocation">Возле</label>
			                    <input id="searchLocation" type="text"  class="bigBox" name="loc" onfocus="if(this.value=='City, State or Zip') {this.value='';}"
                                       value="Kiev, 13" />
									-->
                        <input id="searchButton" class="greenActionButton" type="submit" name="search" value="Поиск">
                        <br/>
                        <ul>
                            <li class="siteNavItem"></li>

                            <li class="siteNavItem"><a href="/search"></a></li>
                            <li class="siteNavItem "><a href="/photos"></a></li>
                        </ul>
                        <ul>
                            <li class="siteNavItem"></li>

                            <li class="siteNavItem"><a class= "rbutton" href="#" onclick="document.form1.submit();">Все курсы</a></li>
                            <li class="siteNavItem">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                            <li class="siteNavItem">&nbsp;</li>
                            <li class="siteNavItem">&nbsp;</li>
                            <li class="siteNavItem "><a class= "rbutton" href="#">Расширенный поиск</a></li>
                        </ul>
                    </div>
                </g:form>
            </div>


            <div class="columns fullWidth">



                <aside class="rightColumn" style="margin-top: 88px;">


                    <div class="facebookBlock banner">
                        <iframe src="http://www.facebook.com/plugins/likebox.php?href=https://www.facebook.com/devua&amp;width=300&amp; height:450px;colorscheme=light&amp;connections=10&amp;stream=false&amp;header=false&amp;height=275&amp;footer=false" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:300px; height:450px; border: 0;" allowTransparency="true"></iframe>
                    </div>




                </aside>
                <center>
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <iframe width="625" height="450" frameborder="0" scrolling="no" marginheight="40px" marginwidth="40px" src="http://maps.google.com/?ie=UTF8&amp;ll=50.469743,30.51178&spn=0.545011,1.454315&amp;t=m&amp;z=10&amp;vpsrc=6&amp;output=embed"></iframe><br /><small><a href="http://maps.google.com/?ie=UTF8&amp;ll=50.43627,30.535297&amp;spn=0.016237,0.045147&amp;t=m&amp;z=15&amp;vpsrc=6&amp;source=embed" style="color:#0000FF;text-align:left">Большая карта</a></small>
                </center>
                <!--
                        <iframe src="/provider/featured" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width: 670px; float:left; height: 615px;" allowTransparency="false"></iframe>
                        <!--
                        <section id="featuredPros">

                            <div id="getAProfile">
                                <h2>Are you a professional? StyleSeat is free!</h2>
                                <a href="/signup"><button class="mediumGreenButton">Sign Up</button></a>
                            </div>
                            <img class="right" src="http://ad.retargeter.com/seg?add=124914" width="1" height="1" />
                        </section>
						-->


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

</body><!--end:wrapper-->


</html>
