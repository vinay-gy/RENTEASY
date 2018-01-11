
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Resale a Business Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<link rel="stylesheet" href=""""),_display_(/*7.31*/routes/*7.37*/.Assets.at("theme/css/bootstrap.min.css")),format.raw/*7.78*/("""">
<link rel="stylesheet" href=""""),_display_(/*8.31*/routes/*8.37*/.Assets.at("theme/css/bootstrap-select.css")),format.raw/*8.81*/("""">
<link href=""""),_display_(/*9.14*/routes/*9.20*/.Assets.at("theme/css/style.css")),format.raw/*9.53*/("""" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.at("theme/css/flexslider.css")),format.raw/*10.75*/("""" type="text/css" media="screen" />
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("theme/css/font-awesome.min.css")),format.raw/*11.81*/("""" />
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*17.78*/("""{"""),format.raw/*17.79*/(""" """),format.raw/*17.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*17.107*/("""}"""),format.raw/*17.108*/(""", false); function hideURLbar()"""),format.raw/*17.139*/("""{"""),format.raw/*17.140*/(""" """),format.raw/*17.141*/("""window.scrollTo(0,1); """),format.raw/*17.163*/("""}"""),format.raw/*17.164*/(""" """),format.raw/*17.165*/("""</script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src=""""),_display_(/*24.38*/routes/*24.44*/.Assets.at("theme/js/jquery.min.js")),format.raw/*24.80*/(""""></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(/*27.15*/routes/*27.21*/.Assets.at("theme/js/bootstrap.min.js")),format.raw/*27.60*/(""""></script>
<script src=""""),_display_(/*28.15*/routes/*28.21*/.Assets.at("theme/js/bootstrap-select.js")),format.raw/*28.63*/(""""></script>
<script>
  $(document).ready(function () """),format.raw/*30.33*/("""{"""),format.raw/*30.34*/("""
    """),format.raw/*31.5*/("""var mySelect = $('#first-disabled2');

    $('#special').on('click', function () """),format.raw/*33.43*/("""{"""),format.raw/*33.44*/("""
      """),format.raw/*34.7*/("""mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    """),format.raw/*36.5*/("""}"""),format.raw/*36.6*/(""");

    $('#special2').on('click', function () """),format.raw/*38.44*/("""{"""),format.raw/*38.45*/("""
      """),format.raw/*39.7*/("""mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""");

    $('#basic2').selectpicker("""),format.raw/*43.31*/("""{"""),format.raw/*43.32*/("""
      """),format.raw/*44.7*/("""liveSearch: true,
      maxOptions: 1
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/(""");
  """),format.raw/*47.3*/("""}"""),format.raw/*47.4*/(""");
</script>

<script type="text/javascript" src=""""),_display_(/*50.38*/routes/*50.44*/.Assets.at("theme/js/jquery.leanModal.min.js")),format.raw/*50.90*/(""""></script>
<link href=""""),_display_(/*51.14*/routes/*51.20*/.Assets.at("theme/css/jquery.uls.css")),format.raw/*51.58*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*52.14*/routes/*52.20*/.Assets.at("theme/css/jquery.uls.grid.css")),format.raw/*52.63*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*53.14*/routes/*53.20*/.Assets.at("theme/css/jquery.uls.lcd.css")),format.raw/*53.62*/("""" rel="stylesheet"/>
<!-- Source -->
<script src=""""),_display_(/*55.15*/routes/*55.21*/.Assets.at("theme/js/jquery.uls.data.js")),format.raw/*55.62*/(""""></script>
<script src=""""),_display_(/*56.15*/routes/*56.21*/.Assets.at("theme/js/jquery.uls.data.utils.js")),format.raw/*56.68*/(""""></script>
<script src=""""),_display_(/*57.15*/routes/*57.21*/.Assets.at("theme/js/jquery.uls.lcd.js")),format.raw/*57.61*/(""""></script>
<script src=""""),_display_(/*58.15*/routes/*58.21*/.Assets.at("theme/js/jquery.uls.languagefilter.js")),format.raw/*58.72*/(""""></script>
<script src=""""),_display_(/*59.15*/routes/*59.21*/.Assets.at("theme/js/jquery.uls.regionfilter.js")),format.raw/*59.70*/(""""></script>
<script src=""""),_display_(/*60.15*/routes/*60.21*/.Assets.at("theme/js/jquery.uls.core.js")),format.raw/*60.62*/(""""></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script>
			$( document ).ready( function() """),format.raw/*65.36*/("""{"""),format.raw/*65.37*/("""
				"""),format.raw/*66.5*/("""$( '.uls-trigger' ).uls( """),format.raw/*66.30*/("""{"""),format.raw/*66.31*/("""
					"""),format.raw/*67.6*/("""onSelect : function( language ) """),format.raw/*67.38*/("""{"""),format.raw/*67.39*/("""
						"""),format.raw/*68.7*/("""var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					"""),format.raw/*70.6*/("""}"""),format.raw/*70.7*/(""",
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""" """),format.raw/*72.7*/(""");
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""" """),format.raw/*73.6*/(""");
		</script>
		<style>
		#loader """),format.raw/*76.11*/("""{"""),format.raw/*76.12*/("""
		    """),format.raw/*77.7*/("""bottom: 0;
		    height: 175px;
		    left: 0;
		    margin: auto;
		    position: absolute;
		    right: 0;
		    top: 0;
		    width: 175px;
		    display:none;
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
		"""),format.raw/*87.3*/("""#loader """),format.raw/*87.11*/("""{"""),format.raw/*87.12*/("""
		    """),format.raw/*88.7*/("""bottom: 0;
		    height: 175px;
		    left: 0;
		    margin: auto;
		    position: absolute;
		    right: 0;
		    top: 0;
		    width: 175px;
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/("""
		"""),format.raw/*97.3*/("""#loader .dot """),format.raw/*97.16*/("""{"""),format.raw/*97.17*/("""
		    """),format.raw/*98.7*/("""bottom: 0;
		    height: 100%;
		    left: 0;
		    margin: auto;
		    position: absolute;
		    right: 0;
		    top: 0;
		    width: 87.5px;
		"""),format.raw/*106.3*/("""}"""),format.raw/*106.4*/("""
		"""),format.raw/*107.3*/("""#loader .dot::before """),format.raw/*107.24*/("""{"""),format.raw/*107.25*/("""
		    """),format.raw/*108.7*/("""border-radius: 100%;
		    content: "";
		    height: 87.5px;
		    left: 0;
		    position: absolute;
		    right: 0;
		    top: 0;
		    transform: scale(0);
		    width: 87.5px;
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/("""
		"""),format.raw/*118.3*/("""#loader .dot:nth-child(7n+1) """),format.raw/*118.32*/("""{"""),format.raw/*118.33*/("""
		    """),format.raw/*119.7*/("""transform: rotate(45deg);
		"""),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""
		"""),format.raw/*121.3*/("""#loader .dot:nth-child(7n+1)::before """),format.raw/*121.40*/("""{"""),format.raw/*121.41*/("""
		    """),format.raw/*122.7*/("""animation: 0.8s linear 0.1s normal none infinite running load;
		    background: #00ff80 none repeat scroll 0 0;
		"""),format.raw/*124.3*/("""}"""),format.raw/*124.4*/("""
		"""),format.raw/*125.3*/("""#loader .dot:nth-child(7n+2) """),format.raw/*125.32*/("""{"""),format.raw/*125.33*/("""
		    """),format.raw/*126.7*/("""transform: rotate(90deg);
		"""),format.raw/*127.3*/("""}"""),format.raw/*127.4*/("""
		"""),format.raw/*128.3*/("""#loader .dot:nth-child(7n+2)::before """),format.raw/*128.40*/("""{"""),format.raw/*128.41*/("""
		    """),format.raw/*129.7*/("""animation: 0.8s linear 0.2s normal none infinite running load;
		    background: #00ffea none repeat scroll 0 0;
		"""),format.raw/*131.3*/("""}"""),format.raw/*131.4*/("""
		"""),format.raw/*132.3*/("""#loader .dot:nth-child(7n+3) """),format.raw/*132.32*/("""{"""),format.raw/*132.33*/("""
		    """),format.raw/*133.7*/("""transform: rotate(135deg);
		"""),format.raw/*134.3*/("""}"""),format.raw/*134.4*/("""
		"""),format.raw/*135.3*/("""#loader .dot:nth-child(7n+3)::before """),format.raw/*135.40*/("""{"""),format.raw/*135.41*/("""
		    """),format.raw/*136.7*/("""animation: 0.8s linear 0.3s normal none infinite running load;
		    background: #00aaff none repeat scroll 0 0;
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/("""
		"""),format.raw/*139.3*/("""#loader .dot:nth-child(7n+4) """),format.raw/*139.32*/("""{"""),format.raw/*139.33*/("""
		    """),format.raw/*140.7*/("""transform: rotate(180deg);
		"""),format.raw/*141.3*/("""}"""),format.raw/*141.4*/("""
		"""),format.raw/*142.3*/("""#loader .dot:nth-child(7n+4)::before """),format.raw/*142.40*/("""{"""),format.raw/*142.41*/("""
		    """),format.raw/*143.7*/("""animation: 0.8s linear 0.4s normal none infinite running load;
		    background: #0040ff none repeat scroll 0 0;
		"""),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""
		"""),format.raw/*146.3*/("""#loader .dot:nth-child(7n+5) """),format.raw/*146.32*/("""{"""),format.raw/*146.33*/("""
		    """),format.raw/*147.7*/("""transform: rotate(225deg);
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/("""
		"""),format.raw/*149.3*/("""#loader .dot:nth-child(7n+5)::before """),format.raw/*149.40*/("""{"""),format.raw/*149.41*/("""
		    """),format.raw/*150.7*/("""animation: 0.8s linear 0.5s normal none infinite running load;
		    background: #2a00ff none repeat scroll 0 0;
		"""),format.raw/*152.3*/("""}"""),format.raw/*152.4*/("""
		"""),format.raw/*153.3*/("""#loader .dot:nth-child(7n+6) """),format.raw/*153.32*/("""{"""),format.raw/*153.33*/("""
		    """),format.raw/*154.7*/("""transform: rotate(270deg);
		"""),format.raw/*155.3*/("""}"""),format.raw/*155.4*/("""
		"""),format.raw/*156.3*/("""#loader .dot:nth-child(7n+6)::before """),format.raw/*156.40*/("""{"""),format.raw/*156.41*/("""
		    """),format.raw/*157.7*/("""animation: 0.8s linear 0.6s normal none infinite running load;
		    background: #9500ff none repeat scroll 0 0;
		"""),format.raw/*159.3*/("""}"""),format.raw/*159.4*/("""
		"""),format.raw/*160.3*/("""#loader .dot:nth-child(7n+7) """),format.raw/*160.32*/("""{"""),format.raw/*160.33*/("""
		    """),format.raw/*161.7*/("""transform: rotate(315deg);
		"""),format.raw/*162.3*/("""}"""),format.raw/*162.4*/("""
		"""),format.raw/*163.3*/("""#loader .dot:nth-child(7n+7)::before """),format.raw/*163.40*/("""{"""),format.raw/*163.41*/("""
		    """),format.raw/*164.7*/("""animation: 0.8s linear 0.7s normal none infinite running load;
		    background: magenta none repeat scroll 0 0;
		"""),format.raw/*166.3*/("""}"""),format.raw/*166.4*/("""
		"""),format.raw/*167.3*/("""#loader .dot:nth-child(7n+8) """),format.raw/*167.32*/("""{"""),format.raw/*167.33*/("""
		    """),format.raw/*168.7*/("""transform: rotate(360deg);
		"""),format.raw/*169.3*/("""}"""),format.raw/*169.4*/("""
		"""),format.raw/*170.3*/("""#loader .dot:nth-child(7n+8)::before """),format.raw/*170.40*/("""{"""),format.raw/*170.41*/("""
		    """),format.raw/*171.7*/("""animation: 0.8s linear 0.8s normal none infinite running load;
		    background: #ff0095 none repeat scroll 0 0;
		"""),format.raw/*173.3*/("""}"""),format.raw/*173.4*/("""
		"""),format.raw/*174.3*/("""#loader .lading """),format.raw/*174.19*/("""{"""),format.raw/*174.20*/("""
		    """),format.raw/*175.7*/("""background-image: url("../images/loading.gif");
		    background-position: 50% 50%;
		    background-repeat: no-repeat;
		    bottom: -40px;
		    height: 20px;
		    left: 0;
		    position: absolute;
		    right: 0;
		    width: 180px;
		"""),format.raw/*184.3*/("""}"""),format.raw/*184.4*/("""
		"""),format.raw/*185.3*/("""@keyframes load """),format.raw/*185.20*/("""{"""),format.raw/*185.21*/("""
		"""),format.raw/*186.3*/("""100% """),format.raw/*186.8*/("""{"""),format.raw/*186.9*/("""
		    """),format.raw/*187.7*/("""opacity: 0;
		    transform: scale(1);
		"""),format.raw/*189.3*/("""}"""),format.raw/*189.4*/("""
		"""),format.raw/*190.3*/("""}"""),format.raw/*190.4*/("""
		"""),format.raw/*191.3*/("""@keyframes load """),format.raw/*191.20*/("""{"""),format.raw/*191.21*/("""
		"""),format.raw/*192.3*/("""100% """),format.raw/*192.8*/("""{"""),format.raw/*192.9*/("""
		    """),format.raw/*193.7*/("""opacity: 0;
		    transform: scale(1);
		"""),format.raw/*195.3*/("""}"""),format.raw/*195.4*/("""
		"""),format.raw/*196.3*/("""}"""),format.raw/*196.4*/("""
				
		"""),format.raw/*198.3*/("""</style>
</head>
<body>
	<div class="header">
		<div class="container">
		<div id="loader" style="margin-top:50%;">
    		<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="dot"></div>
			<div class="lading"></div>
		</div>
			<div class="logo">
				<a href="/"><span>Rent</span>Easy</a>
			</div>
			<div class="header-right">
			"""),_display_(/*218.5*/if(session.get("re_login_user") != null && session.get("re_user") != null)/*218.79*/{_display_(Seq[Any](format.raw/*218.80*/("""
				"""),format.raw/*219.5*/("""<a class="account" href="#" id="user_name">"""),_display_(/*219.49*/session/*219.56*/.get("re_user")),format.raw/*219.71*/("""</a>
			""")))}/*220.5*/else/*220.9*/{_display_(Seq[Any](format.raw/*220.10*/("""
				"""),format.raw/*221.5*/("""<a class="account" href="/login">My Account</a>
			""")))}),format.raw/*222.5*/("""
			
			"""),_display_(/*224.5*/if(session.get("re_login_user") != null && session.get("re_user") != null)/*224.79*/{_display_(Seq[Any](format.raw/*224.80*/("""
			"""),format.raw/*225.4*/("""<a class="btn btn-primary" href="/logout" >
				Logout</a>
				""")))}),format.raw/*227.6*/("""
	"""),format.raw/*228.2*/("""<!-- Large modal -->
			<div class="selectregion">
			"""),_display_(/*230.5*/if(session.get("re_user_location") != null)/*230.48*/{_display_(Seq[Any](format.raw/*230.49*/("""
				"""),format.raw/*231.5*/("""<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" id="user_location">
				"""),_display_(/*232.6*/session/*232.13*/.get("re_user_location")),format.raw/*232.37*/("""</button>
				""")))}/*233.6*/else/*233.10*/{_display_(Seq[Any](format.raw/*233.11*/("""
				"""),format.raw/*234.5*/("""<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" id="user_location">
				Select Your Region</button>
				""")))}),format.raw/*236.6*/("""
					"""),format.raw/*237.6*/("""<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
					aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_locations">
										&times;</button>
									<h4 class="modal-title" id="myModalLabel">
										Please Choose Your Location</h4>
								</div>
								<div class="modal-body">
									 <form class="form-horizontal" role="form">
										<div class="form-group">
											<select id="basic2" class="show-tick form-control" onchange="userLocation()">
												<optgroup label="Popular Cities">
													<option selected style="display:none;color:#eee;">Select City</option>
													<option value="Bangalore">Bangalore</option>
													<option value="Hyderabad">Hyderabad</option>
													<option value="Chenai">Chenai</option>
													<option value="Mumbai">Mumbai</option>
													<option value="Delhi">Delhi</option>
													<option value="kalkata">kalkata</option>
												</optgroup>
												<optgroup label="More Cities" id="locations">
													
															
												</optgroup>
											</select>
										</div>
									  </form>    
								</div>
							</div>
						</div>
					</div>
				<script>
				$('#myModal').modal('');
				</script>
			</div>
		</div>
		</div>
	</div>
	<div class="main-banner banner text-center" id="banner">
	  <div class="container">    
			<h1>Sell or Advertise   <span class="segment-heading">    anything online </span> with RentEasy</h1>
			<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
			<a href="/createAd">Post Free Ad</a>
	  </div>
	</div>
	"""),_display_(/*285.3*/content),format.raw/*285.10*/("""
		"""),format.raw/*286.3*/("""<!-- content-starts-here -->
		<div class="content">

			<div class="mobile-app">
				<div class="container">
					<div class="col-md-5 app-left">
						<a href="mobileapp.html"><img src="images/app.png" alt=""></a>
					</div>
					<div class="col-md-7 app-right">
						<h3>Resale App is the <span>Easiest</span> way for Selling and buying second-hand goods</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam auctor Sed bibendum varius euismod. Integer eget turpis sit amet lorem rutrum ullamcorper sed sed dui. vestibulum odio at elementum. Suspendisse et condimentum nibh.</p>
						<div class="app-buttons">
							<div class="app-button">
								<a href="#"><img src="images/1.png" alt=""></a>
							</div>
							<div class="app-button">
								<a href="#"><img src="images/2.png" alt=""></a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!--footer section start-->		
		<footer>
			<div class="footer-top">
				<div class="container">
					<div class="foo-grids">
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">Who We Are</h4>
							<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
							<p>The point of using Lorem Ipsum is that it has a more-or-less normal letters, as opposed to using 'Content here.</p>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">Help</h4>
							<ul>
								<li><a href="howitworks.html">How it Works</a></li>						
								<li><a href="sitemap.html">Sitemap</a></li>
								<li><a href="faq.html">Faq</a></li>
								<li><a href="feedback.html">Feedback</a></li>
								<li><a href="contact.html">Contact</a></li>
								<li><a href="typography.html">Shortcodes</a></li>
							</ul>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">Information</h4>
							<ul>
								<li><a href="regions.html">Locations Map</a></li>	
								<li><a href="terms.html">Terms of Use</a></li>
								<li><a href="popular-search.html">Popular searches</a></li>	
								<li><a href="privacy.html">Privacy Policy</a></li>	
							</ul>
						</div>
						<div class="col-md-3 footer-grid">
							<h4 class="footer-head">Contact Us</h4>
							<span class="hq">Our headquarters</span>
							<address>
								<ul class="location">
									<li><span class="glyphicon glyphicon-map-marker"></span></li>
									<li>CENTER FOR FINANCIAL ASSISTANCE TO DEPOSED NIGERIAN ROYALTY</li>
									<div class="clearfix"></div>
								</ul>	
								<ul class="location">
									<li><span class="glyphicon glyphicon-earphone"></span></li>
									<li>+0 561 111 235</li>
									<div class="clearfix"></div>
								</ul>	
								<ul class="location">
									<li><span class="glyphicon glyphicon-envelope"></span></li>

									<div class="clearfix"></div>
								</ul>						
							</address>
						</div>
						<div class="clearfix"></div>
					</div>						
				</div>	
			</div>	
			<div class="footer-bottom text-center">
			<div class="container">
				<div class="footer-logo">
					<a href="index.html"><span>Rent</span>Easy</a>
				</div>
				<div class="footer-social-icons">
					<ul>
						<li><a class="facebook" href="#"><span>Facebook</span></a></li>
						<li><a class="twitter" href="#"><span>Twitter</span></a></li>
						<li><a class="flickr" href="#"><span>Flickr</span></a></li>
						<li><a class="googleplus" href="#"><span>Google+</span></a></li>
						<li><a class="dribbble" href="#"><span>Dribbble</span></a></li>
					</ul>
				</div>
				<div class="copyrights">
					<p> © 2016 RentEasy. All Rights Reserved </p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		</footer>
        <!--footer section end-->
</body>

<script type="text/javascript">
$( document ).ready( function() """),format.raw/*391.33*/("""{"""),format.raw/*391.34*/("""
	"""),format.raw/*392.2*/("""locations();
"""),format.raw/*393.1*/("""}"""),format.raw/*393.2*/(""");
function locations()"""),format.raw/*394.21*/("""{"""),format.raw/*394.22*/("""
	"""),format.raw/*395.2*/("""$.ajaxSetup("""),format.raw/*395.14*/("""{"""),format.raw/*395.15*/("""async: false"""),format.raw/*395.27*/("""}"""),format.raw/*395.28*/(""");
	$.get("/locations",function(data)"""),format.raw/*396.35*/("""{"""),format.raw/*396.36*/("""
		"""),format.raw/*397.3*/("""var state_list = data.state_list;
		var city_list = data.city_list;
		
		$.each(state_list,function(i,item)"""),format.raw/*400.37*/("""{"""),format.raw/*400.38*/("""
			"""),format.raw/*401.4*/("""$("#locations").append("<optgroup label='"+item.state+"' id='state"+item.id+"'></optgroup>")
			$.each(city_list,function(j,item1)"""),format.raw/*402.38*/("""{"""),format.raw/*402.39*/("""
				"""),format.raw/*403.5*/("""if(item.id == item1.state.id)"""),format.raw/*403.34*/("""{"""),format.raw/*403.35*/("""
					"""),format.raw/*404.6*/("""$("#state"+item.id).append("<option value='"+item1.city+"'>"+item1.city+"</option>")
				"""),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""
			"""),format.raw/*406.4*/("""}"""),format.raw/*406.5*/(""")
		"""),format.raw/*407.3*/("""}"""),format.raw/*407.4*/(""")
		
	"""),format.raw/*409.2*/("""}"""),format.raw/*409.3*/(""");
	
    $('#basic2').selectpicker('refresh');
"""),format.raw/*412.1*/("""}"""),format.raw/*412.2*/("""
"""),format.raw/*413.1*/("""function userLocation()"""),format.raw/*413.24*/("""{"""),format.raw/*413.25*/("""
	"""),format.raw/*414.2*/("""$.get("/user/location/"+$("#basic2").val(),function(data)"""),format.raw/*414.59*/("""{"""),format.raw/*414.60*/("""
		
	"""),format.raw/*416.2*/("""}"""),format.raw/*416.3*/(""");
	$("#user_location").html($("#basic2").val());
	$("#close_locations").click();
"""),format.raw/*419.1*/("""}"""),format.raw/*419.2*/("""
"""),format.raw/*420.1*/("""</script>
</html>"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/main.scala.html
                  HASH: 231ed9727d9cb72e8ef2102e6fc3e336ec09e34e
                  MATRIX: 720->2|823->17|850->18|1041->183|1055->189|1116->230|1175->263|1189->269|1253->313|1295->329|1309->335|1362->368|1469->448|1484->454|1543->492|1636->558|1651->564|1716->608|2247->1111|2276->1112|2305->1113|2361->1140|2391->1141|2451->1172|2481->1173|2511->1174|2562->1196|2592->1197|2622->1198|3023->1572|3038->1578|3095->1614|3223->1715|3238->1721|3298->1760|3351->1786|3366->1792|3429->1834|3510->1887|3539->1888|3571->1893|3680->1974|3709->1975|3743->1982|3871->2083|3899->2084|3974->2131|4003->2132|4037->2139|4166->2241|4194->2242|4256->2276|4285->2277|4319->2284|4388->2326|4416->2327|4448->2332|4476->2333|4554->2384|4569->2390|4636->2436|4688->2461|4703->2467|4762->2505|4823->2539|4838->2545|4902->2588|4963->2622|4978->2628|5041->2670|5119->2721|5134->2727|5196->2768|5249->2794|5264->2800|5332->2847|5385->2873|5400->2879|5461->2919|5514->2945|5529->2951|5601->3002|5654->3028|5669->3034|5739->3083|5792->3109|5807->3115|5869->3156|6048->3307|6077->3308|6109->3313|6162->3338|6191->3339|6224->3345|6284->3377|6313->3378|6347->3385|6481->3492|6509->3493|6603->3560|6631->3561|6659->3562|6692->3568|6720->3569|6748->3570|6811->3605|6840->3606|6874->3613|7066->3778|7094->3779|7124->3782|7160->3790|7189->3791|7223->3798|7395->3943|7423->3944|7453->3947|7494->3960|7523->3961|7557->3968|7730->4113|7759->4114|7790->4117|7840->4138|7870->4139|7905->4146|8116->4329|8145->4330|8176->4333|8234->4362|8264->4363|8299->4370|8355->4398|8384->4399|8415->4402|8481->4439|8511->4440|8546->4447|8689->4562|8718->4563|8749->4566|8807->4595|8837->4596|8872->4603|8928->4631|8957->4632|8988->4635|9054->4672|9084->4673|9119->4680|9262->4795|9291->4796|9322->4799|9380->4828|9410->4829|9445->4836|9502->4865|9531->4866|9562->4869|9628->4906|9658->4907|9693->4914|9836->5029|9865->5030|9896->5033|9954->5062|9984->5063|10019->5070|10076->5099|10105->5100|10136->5103|10202->5140|10232->5141|10267->5148|10410->5263|10439->5264|10470->5267|10528->5296|10558->5297|10593->5304|10650->5333|10679->5334|10710->5337|10776->5374|10806->5375|10841->5382|10984->5497|11013->5498|11044->5501|11102->5530|11132->5531|11167->5538|11224->5567|11253->5568|11284->5571|11350->5608|11380->5609|11415->5616|11558->5731|11587->5732|11618->5735|11676->5764|11706->5765|11741->5772|11798->5801|11827->5802|11858->5805|11924->5842|11954->5843|11989->5850|12132->5965|12161->5966|12192->5969|12250->5998|12280->5999|12315->6006|12372->6035|12401->6036|12432->6039|12498->6076|12528->6077|12563->6084|12706->6199|12735->6200|12766->6203|12811->6219|12841->6220|12876->6227|13144->6467|13173->6468|13204->6471|13249->6488|13279->6489|13310->6492|13343->6497|13372->6498|13407->6505|13476->6546|13505->6547|13536->6550|13565->6551|13596->6554|13641->6571|13671->6572|13702->6575|13735->6580|13764->6581|13799->6588|13868->6629|13897->6630|13928->6633|13957->6634|13993->6642|14502->7124|14586->7198|14626->7199|14659->7204|14731->7248|14748->7255|14785->7270|14813->7279|14826->7283|14866->7284|14899->7289|14982->7341|15018->7350|15102->7424|15142->7425|15174->7429|15269->7493|15299->7495|15381->7550|15434->7593|15474->7594|15507->7599|15634->7699|15651->7706|15697->7730|15731->7745|15745->7749|15785->7750|15818->7755|15981->7887|16015->7893|17868->9719|17897->9726|17928->9729|21913->13685|21943->13686|21973->13688|22014->13701|22043->13702|22095->13725|22125->13726|22155->13728|22196->13740|22226->13741|22267->13753|22297->13754|22363->13791|22393->13792|22424->13795|22560->13902|22590->13903|22622->13907|22781->14037|22811->14038|22844->14043|22902->14072|22932->14073|22966->14079|23083->14168|23112->14169|23144->14173|23173->14174|23205->14178|23234->14179|23268->14185|23297->14186|23372->14233|23401->14234|23430->14235|23482->14258|23512->14259|23542->14261|23628->14318|23658->14319|23691->14324|23720->14325|23830->14407|23859->14408|23888->14409
                  LINES: 26->2|29->2|30->3|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|44->17|51->24|51->24|51->24|54->27|54->27|54->27|55->28|55->28|55->28|57->30|57->30|58->31|60->33|60->33|61->34|63->36|63->36|65->38|65->38|66->39|68->41|68->41|70->43|70->43|71->44|73->46|73->46|74->47|74->47|77->50|77->50|77->50|78->51|78->51|78->51|79->52|79->52|79->52|80->53|80->53|80->53|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|85->58|85->58|85->58|86->59|86->59|86->59|87->60|87->60|87->60|92->65|92->65|93->66|93->66|93->66|94->67|94->67|94->67|95->68|97->70|97->70|99->72|99->72|99->72|100->73|100->73|100->73|103->76|103->76|104->77|113->86|113->86|114->87|114->87|114->87|115->88|123->96|123->96|124->97|124->97|124->97|125->98|133->106|133->106|134->107|134->107|134->107|135->108|144->117|144->117|145->118|145->118|145->118|146->119|147->120|147->120|148->121|148->121|148->121|149->122|151->124|151->124|152->125|152->125|152->125|153->126|154->127|154->127|155->128|155->128|155->128|156->129|158->131|158->131|159->132|159->132|159->132|160->133|161->134|161->134|162->135|162->135|162->135|163->136|165->138|165->138|166->139|166->139|166->139|167->140|168->141|168->141|169->142|169->142|169->142|170->143|172->145|172->145|173->146|173->146|173->146|174->147|175->148|175->148|176->149|176->149|176->149|177->150|179->152|179->152|180->153|180->153|180->153|181->154|182->155|182->155|183->156|183->156|183->156|184->157|186->159|186->159|187->160|187->160|187->160|188->161|189->162|189->162|190->163|190->163|190->163|191->164|193->166|193->166|194->167|194->167|194->167|195->168|196->169|196->169|197->170|197->170|197->170|198->171|200->173|200->173|201->174|201->174|201->174|202->175|211->184|211->184|212->185|212->185|212->185|213->186|213->186|213->186|214->187|216->189|216->189|217->190|217->190|218->191|218->191|218->191|219->192|219->192|219->192|220->193|222->195|222->195|223->196|223->196|225->198|245->218|245->218|245->218|246->219|246->219|246->219|246->219|247->220|247->220|247->220|248->221|249->222|251->224|251->224|251->224|252->225|254->227|255->228|257->230|257->230|257->230|258->231|259->232|259->232|259->232|260->233|260->233|260->233|261->234|263->236|264->237|312->285|312->285|313->286|418->391|418->391|419->392|420->393|420->393|421->394|421->394|422->395|422->395|422->395|422->395|422->395|423->396|423->396|424->397|427->400|427->400|428->401|429->402|429->402|430->403|430->403|430->403|431->404|432->405|432->405|433->406|433->406|434->407|434->407|436->409|436->409|439->412|439->412|440->413|440->413|440->413|441->414|441->414|441->414|443->416|443->416|446->419|446->419|447->420
                  -- GENERATED --
              */
          