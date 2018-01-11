
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Resale a Business Category Flat Bootstrap Responsive Website Template | Register :: w3layouts</title>
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("theme/css/bootstrap.min.css")),format.raw/*11.78*/("""">
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("theme/css/bootstrap-select.css")),format.raw/*12.81*/("""">
<link href=""""),_display_(/*13.14*/routes/*13.20*/.Assets.at("theme/css/style.css")),format.raw/*13.53*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*19.78*/("""{"""),format.raw/*19.79*/(""" """),format.raw/*19.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*19.107*/("""}"""),format.raw/*19.108*/(""", false); function hideURLbar()"""),format.raw/*19.139*/("""{"""),format.raw/*19.140*/(""" """),format.raw/*19.141*/("""window.scrollTo(0,1); """),format.raw/*19.163*/("""}"""),format.raw/*19.164*/(""" """),format.raw/*19.165*/("""</script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src=""""),_display_(/*26.38*/routes/*26.44*/.Assets.at("theme/js/jquery.min.js")),format.raw/*26.80*/(""""></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(/*29.15*/routes/*29.21*/.Assets.at("theme/js/bootstrap.min.js")),format.raw/*29.60*/(""""></script>
<script src=""""),_display_(/*30.15*/routes/*30.21*/.Assets.at("theme/js/bootstrap-select.js")),format.raw/*30.63*/(""""></script>
<script>
  $(document).ready(function () """),format.raw/*32.33*/("""{"""),format.raw/*32.34*/("""
    """),format.raw/*33.5*/("""var mySelect = $('#first-disabled2');

    $('#special').on('click', function () """),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
      """),format.raw/*36.7*/("""mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/(""");

    $('#special2').on('click', function () """),format.raw/*40.44*/("""{"""),format.raw/*40.45*/("""
      """),format.raw/*41.7*/("""mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""");

    $('#basic2').selectpicker("""),format.raw/*45.31*/("""{"""),format.raw/*45.32*/("""
      """),format.raw/*46.7*/("""liveSearch: true,
      maxOptions: 1
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/(""");
  """),format.raw/*49.3*/("""}"""),format.raw/*49.4*/(""");
</script>
<script type="text/javascript" src=""""),_display_(/*51.38*/routes/*51.44*/.Assets.at("theme/js/jquery.leanModal.min.js")),format.raw/*51.90*/(""""></script>
<link href=""""),_display_(/*52.14*/routes/*52.20*/.Assets.at("theme/css/jquery.uls.css")),format.raw/*52.58*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*53.14*/routes/*53.20*/.Assets.at("theme/css/jquery.uls.grid.css")),format.raw/*53.63*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*54.14*/routes/*54.20*/.Assets.at("theme/css/jquery.uls.lcd.css")),format.raw/*54.62*/("""" rel="stylesheet"/>
<!-- Source -->
<script src=""""),_display_(/*56.15*/routes/*56.21*/.Assets.at("theme/js/jquery.uls.data.js")),format.raw/*56.62*/(""""></script>
<script src=""""),_display_(/*57.15*/routes/*57.21*/.Assets.at("theme/js/jquery.uls.data.utils.js")),format.raw/*57.68*/(""""></script>
<script src=""""),_display_(/*58.15*/routes/*58.21*/.Assets.at("theme/js/jquery.uls.lcd.js")),format.raw/*58.61*/(""""></script>
<script src=""""),_display_(/*59.15*/routes/*59.21*/.Assets.at("theme/js/jquery.uls.languagefilter.js")),format.raw/*59.72*/(""""></script>
<script src=""""),_display_(/*60.15*/routes/*60.21*/.Assets.at("theme/js/jquery.uls.regionfilter.js")),format.raw/*60.70*/(""""></script>
<script src=""""),_display_(/*61.15*/routes/*61.21*/.Assets.at("theme/js/jquery.uls.core.js")),format.raw/*61.62*/(""""></script>
<script src=""""),_display_(/*62.15*/routes/*62.21*/.Assets.at("theme/js/jquery.validate-1.14.0.min.js")),format.raw/*62.73*/(""""></script>
<script src=""""),_display_(/*63.15*/routes/*63.21*/.Assets.at("theme/js/jquery-validate.bootstrap-tooltip.min.js")),format.raw/*63.84*/(""""></script>
 <script src=""""),_display_(/*64.16*/routes/*64.22*/.Assets.at("theme/js/intlTelInput.min.js")),format.raw/*64.64*/(""""></script>
 <script src=""""),_display_(/*65.16*/routes/*65.22*/.Assets.at("theme/js/additional-methods.min.js")),format.raw/*65.70*/(""""></script>
<script>
			$( document ).ready( function() """),format.raw/*67.36*/("""{"""),format.raw/*67.37*/("""
				"""),format.raw/*68.5*/("""$( '.uls-trigger' ).uls( """),format.raw/*68.30*/("""{"""),format.raw/*68.31*/("""
					"""),format.raw/*69.6*/("""onSelect : function( language ) """),format.raw/*69.38*/("""{"""),format.raw/*69.39*/("""
						"""),format.raw/*70.7*/("""var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					"""),format.raw/*72.6*/("""}"""),format.raw/*72.7*/(""",
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				"""),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""" """),format.raw/*74.7*/(""");
			"""),format.raw/*75.4*/("""}"""),format.raw/*75.5*/(""" """),format.raw/*75.6*/(""");
		</script>
</head>
<body>
<div class="header">
		<div class="container">
			<div class="logo">
				<a href="/"><span>Rent</span>Easy</a>
			</div>
			<div class="header-right">
			<a class="account" href="/login">My Account</a>
			<span class="active uls-trigger">Select language</span>
	<!-- Large modal -->
			<div class="selectregion">
				<button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
				Select Your Region</button>
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
					aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
										&times;</button>
									<h4 class="modal-title" id="myModalLabel">
										Please Choose Your Location</h4>
								</div>
								<div class="modal-body">
									 <form class="form-horizontal" role="form">
										<div class="form-group">
											<select id="basic2" class="show-tick form-control" multiple>
												<optgroup label="Popular Cities">
													<option selected style="display:none;color:#eee;">Select City</option>
													<option>Birmingham</option>
													<option>Anchorage</option>
													<option>Phoenix</option>
													<option>Little Rock</option>
													<option>Los Angeles</option>
													<option>Denver</option>
													<option>Bridgeport</option>
													<option>Wilmington</option>
													<option>Jacksonville</option>
													<option>Atlanta</option>
													<option>Honolulu</option>
													<option>Boise</option>
													<option>Chicago</option>
													<option>Indianapolis</option>
												</optgroup>
												<optgroup label="More Cities">
													<optgroup label="Alabama">
														<option>Birmingham</option>
														<option>Montgomery</option>
														<option>Mobile</option>
														<option>Huntsville</option>
														<option>Tuscaloosa</option>
													</optgroup>
													<optgroup label="Alaska">
														<option>Anchorage</option>
														<option>Fairbanks</option>
														<option>Juneau</option>
														<option>Sitka</option>
														<option>Ketchikan</option>
													</optgroup>
													<optgroup label="Arizona">
														<option>Phoenix</option>
														<option>Tucson</option>
														<option>Mesa</option>
														<option>Chandler</option>
														<option>Glendale</option>
													</optgroup>
													<optgroup label="Arkansas">
														<option>Little Rock</option>
														<option>Fort Smith</option>
														<option>Fayetteville</option>
														<option>Springdale</option>
														<option>Jonesboro</option>
													</optgroup>
													<optgroup label="California">
														<option>Los Angeles</option>
														<option>San Diego</option>
														<option>San Jose</option>
														<option>San Francisco</option>
														<option>Fresno</option>
													</optgroup>
													<optgroup label="Colorado">
														<option>Denver</option>
														<option>Colorado</option>
														<option>Aurora</option>
														<option>Fort Collins</option>
														<option>Lakewood</option>
													</optgroup>
													<optgroup label="Connecticut">
														<option>Bridgeport</option>
														<option>New Haven</option>
														<option>Hartford</option>
														<option>Stamford</option>
														<option>Waterbury</option>
													</optgroup>
													<optgroup label="Delaware">
														<option>Wilmington</option>
														<option>Dover</option>
														<option>Newark</option>
														<option>Bear</option>
														<option>Middletown</option>
													</optgroup>
													<optgroup label="Florida">
														<option>Jacksonville</option>
														<option>Miami</option>
														<option>Tampa</option>
														<option>St. Petersburg</option>
														<option>Orlando</option>
													</optgroup>
													<optgroup label="Georgia">
														<option>Atlanta</option>
														<option>Augusta</option>
														<option>Columbus</option>
														<option>Savannah</option>
														<option>Athens</option>
													</optgroup>
													<optgroup label="Hawaii">
														<option>Honolulu</option>
														<option>Pearl City</option>
														<option>Hilo</option>
														<option>Kailua</option>
														<option>Waipahu</option>
													</optgroup>
													<optgroup label="Idaho">
														<option>Boise</option>
														<option>Nampa</option>
														<option>Meridian</option>
														<option>Idaho Falls</option>
														<option>Pocatello</option>
													</optgroup>
													<optgroup label="Illinois">
														<option>Chicago</option>
														<option>Aurora</option>
														<option>Rockford</option>
														<option>Joliet</option>
														<option>Naperville</option>
													</optgroup>
													<optgroup label="Indiana">
														<option>Indianapolis</option>
														<option>Fort Wayne</option>
														<option>Evansville</option>
														<option>South Bend</option>
														<option>Hammond</option>														       
													</optgroup>
													<optgroup label="Iowa">
														<option>Des Moines</option>
														<option>Cedar Rapids</option>
														<option>Davenport</option>
														<option>Sioux City</option>
														<option>Waterloo</option>       													
													</optgroup>
													<optgroup label="Kansas">
														<option>Wichita</option>
														<option>Overland Park</option>
														<option>Kansas City</option>
														<option>Topeka</option>
														<option>Olathe  </option>            													
													</optgroup>
													<optgroup label="Kentucky">
														<option>Louisville</option>
														<option>Lexington</option>
														<option>Bowling Green</option>
														<option>Owensboro</option>
														<option>Covington</option>        														
													</optgroup>
													<optgroup label="Louisiana">
														<option>New Orleans</option>
														<option>Baton Rouge</option>
														<option>Shreveport</option>
														<option>Metairie</option>
														<option>Lafayette</option>          														
													</optgroup>
													<optgroup label="Maine">
														<option>Portland</option>
														<option>Lewiston</option>
														<option>Bangor</option>
														<option>South Portland</option>
														<option>Auburn</option>         														
													</optgroup>
													<optgroup label="Maryland">
														<option>Baltimore</option>
														<option>Frederick</option>
														<option>Rockville</option>
														<option>Gaithersburg</option>
														<option>Bowie</option>         														
													</optgroup>
													<optgroup label="Massachusetts">
														<option>Boston</option>
														<option>Worcester</option>
														<option>Springfield</option>
														<option>Lowell</option>
														<option>Cambridge</option>  
													</optgroup>
													<optgroup label="Michigan">
														<option>Detroit</option>
														<option>Grand Rapids</option>
														<option>Warren</option>
														<option>Sterling Heights</option>
														<option>Lansing</option> 
													</optgroup>
													<optgroup label="Minnesota">
														<option>Minneapolis</option>
														<option>St. Paul</option>
														<option>Rochester</option>
														<option>Duluth</option>
														<option>Bloomington</option>      														
													</optgroup>
													<optgroup label="Mississippi">
														<option>Jackson</option>
														<option>Gulfport</option>
														<option>Southaven</option>
														<option>Hattiesburg</option>
														<option>Biloxi</option>         														
													</optgroup>
													<optgroup label="Missouri">
														<option>Kansas City</option>
														<option>St. Louis</option>
														<option>Springfield</option>
														<option>Independence</option>
														<option>Columbia</option>            														
													</optgroup>
													<optgroup label="Montana">
														<option>Billings</option>
														<option>Missoula</option>
														<option>Great Falls</option>
														<option>Bozeman</option>
														<option>Butte-Silver Bow</option>         														
													</optgroup>
													<optgroup label="Nebraska">
														<option>Omaha</option>
														<option>Lincoln</option>
														<option>Bellevue</option>
														<option>Grand Island</option>
														<option>Kearney</option>        													
													</optgroup>
													<optgroup label="Nevada">
														<option>Las Vegas</option>
														<option>Henderson</option>
														<option>North Las Vegas</option>
														<option>Reno</option>
														<option>Sunrise Manor</option>            													
													</optgroup>
													<optgroup label="New Hampshire">
														<option>Manchesters</option>
														<option>Nashua</option>
														<option>Concord</option>
														<option>Dover</option>
														<option>Rochester</option>              													
													</optgroup>
													<optgroup label="New Jersey">
														<option>Newark</option>
														<option>Jersey City</option>
														<option>Paterson</option>
														<option>Elizabeth</option>
														<option>Edison</option> 
													</optgroup>
													<optgroup label="New Mexico">
														<option>Albuquerque</option>
														<option>Las Cruces</option>
														<option>Rio Rancho</option>
														<option>Santa Fe</option>
														<option>Roswell</option>       
													</optgroup>
													<optgroup label="New York">
														<option>New York</option>
														<option>Buffalo</option>
														<option>Rochester</option>
														<option>Yonkers</option>
														<option>Syracuse</option>        														
													</optgroup>
													<optgroup label="North Carolina">
														<option>Charlotte</option>
														<option>Raleigh</option>
														<option>Greensboro</option>
														<option>Winston-Salem</option>
														<option>Durham</option>          														
													</optgroup>
													<optgroup label="North Dakota">
														<option>Fargo</option>
														<option>Bismarck</option>
														<option>Grand Forks</option>
														<option>Minot</option>
														<option>West Fargo</option>
													</optgroup>
													<optgroup label="Ohio">
														<option>Columbus</option>
														<option>Cleveland</option>
														<option>Cincinnati</option>
														<option>Toledo</option>
														<option>Akron</option>      
													</optgroup>
													<optgroup label="Oklahoma">
														<option>Oklahoma City</option>
														<option>Tulsa</option>
														<option>Norman</option>
														<option>Broken Arrow</option>
														<option>Lawton</option>        														
													</optgroup>
													<optgroup label="Oregon">
														<option>Portland</option>
														<option>Eugene</option>
														<option>Salem</option>
														<option>Gresham</option>
														<option>Hillsboro</option>          														
													</optgroup>
													<optgroup label="Pennsylvania">
														<option>Philadelphia</option>
														<option>Pittsburgh</option>
														<option>Allentown</option>
														<option>Erie</option>
														<option>Reading</option>         														
													</optgroup>
													<optgroup label="Rhode Island">
														<option>Providence</option>
														<option>Warwick</option>
														<option>Cranston</option>
														<option>Pawtucket</option>
														<option>East Providence</option>   
													</optgroup>
													<optgroup label="South Carolina">
														<option>Columbia</option>
														<option>Charleston</option>
														<option>North Charleston</option>
														<option>Mount Pleasant</option>
														<option>Rock Hill</option> 
													</optgroup>
													<optgroup label="South Dakota">
														<option>Sioux Falls</option>
														<option>Rapid City</option>
														<option>Aberdeen</option>
														<option>Brookings</option>
														<option>Watertown</option> 
													</optgroup>
													<optgroup label="Tennessee">
														<option>Memphis</option>
														<option>Nashville</option>
														<option>Knoxville</option>
														<option>Chattanooga</option>
														<option>Clarksville</option>       
													</optgroup>
													<optgroup label="Texas">
														<option>Houston</option>
														<option>San Antonio</option>
														<option>Dallas</option>
														<option>Austin</option>
														<option>Fort Worth</option>   
													</optgroup>
													<optgroup label="Utah">
														<option>Salt Lake City</option>
														<option>West Valley City</option>
														<option>Provo</option>
														<option>West Jordan</option>
														<option>Orem</option>   
													</optgroup>	
													<optgroup label="Vermont">
														<option>Burlington</option>
														<option>Essex</option>
														<option>South Burlington</option>
														<option>Colchester</option>
														<option>Rutland</option>   
													</optgroup>
													<optgroup label="Virginia">
														<option>Virginia Beach</option>
														<option>Norfolk</option>
														<option>Chesapeake</option>
														<option>Arlington</option>
														<option>Richmond</option> 
													</optgroup>	
													<optgroup label="Washington">
														<option>Seattle</option>
														<option>Spokane</option>
														<option>Tacoma</option>
														<option>Vancouver</option>
														<option>Bellevue</option> 
													</optgroup>	
													<optgroup label="West Virginia">
														<option>Charleston</option>
														<option>Huntington</option>
														<option>Parkersburg</option>
														<option>Morgantown</option>
														<option>Wheeling</option> 
													</optgroup>	
													<optgroup label="Wisconsin">
														<option>Milwaukee</option>
														<option>Madison</option>
														<option>Green Bay</option>
														<option>Kenosha</option>
														<option>Racine</option>
													</optgroup>
													<optgroup label="Wyoming">
														<option>Cheyenne</option>
														<option>Casper</option>
														<option>Laramie</option>
														<option>Gillette</option>
														<option>Rock Springs</option>
													</optgroup>			
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
	 <section>
	 <form  method="POST" id="myform" enctype="multipart/form-data">
			<div id="page-wrapper" class="sign-in-wrapper">
				<div class="graphs">
					<div class="sign-up">
						<h1>Create an account</h1>
						<p class="creating">Having hands on experience in creating innovative designs,I do offer design 
							solutions which harness.</p>
						<h2>Personal Information</h2>
						<div id="error" style="color:red;margin-top: 10px;text-align:center"></div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>User Name* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" id="name" name="name" placeholder=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Email Address* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" id="email" name="email" placeholder=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Mobile* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" id="mobile" name="mobile" placeholder=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Password* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="password" id="password" name="password" placeholder=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Confirm Password* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="password" id="confirmpassword" name="confirmpassword" placeholder=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sub_home">
							<div class="sub_home_left">
								
									<input type="submit" value="Create" onclick="return validation()">
								
							</div>
							<div class="sub_home_right">
								<p>Go Back to <a href="index.html">Home</a></p>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
			</div>
			<input type="hidden" id="customerType" name="customerType.id" value="1" placeholder=" "/>
			</form>
		<!--footer section start-->
			<footer class="diff">
			   <p class="text-center">&copy 2016 Resale. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">w3layouts.</a></p>
			</footer>
        <!--footer section end-->
	</section>
	<script type="text/javascript">
	$("html, body").animate("""),format.raw/*576.26*/("""{"""),format.raw/*576.27*/(""" """),format.raw/*576.28*/("""scrollTop: 100 """),format.raw/*576.43*/("""}"""),format.raw/*576.44*/(""", "slow");
	function validation()"""),format.raw/*577.23*/("""{"""),format.raw/*577.24*/("""
		"""),format.raw/*578.3*/("""var pass = document.getElementById("password").value;
   		var verifypass = document.getElementById("confirmpassword").value;
   		
		if(pass != verifypass)"""),format.raw/*581.25*/("""{"""),format.raw/*581.26*/("""
			"""),format.raw/*582.4*/("""$("#error").empty();
			$("#error").append("Password must match confirm password");
			return false;
		"""),format.raw/*585.3*/("""}"""),format.raw/*585.4*/("""
		"""),format.raw/*586.3*/("""if(!validateCustomer())"""),format.raw/*586.26*/("""{"""),format.raw/*586.27*/("""
   			"""),format.raw/*587.7*/("""return false;
   		"""),format.raw/*588.6*/("""}"""),format.raw/*588.7*/(""";
	"""),format.raw/*589.2*/("""}"""),format.raw/*589.3*/("""
	"""),format.raw/*590.2*/("""$.validator.addMethod("regxp", function(value, element, regexpr) """),format.raw/*590.67*/("""{"""),format.raw/*590.68*/("""          
	     """),format.raw/*591.7*/("""return regexpr.test(value);
	 """),format.raw/*592.3*/("""}"""),format.raw/*592.4*/(""", "Enter only digits");
	
	 $.validator.addMethod("accept", function(value, element, param) """),format.raw/*594.67*/("""{"""),format.raw/*594.68*/("""
	        """),format.raw/*595.10*/("""return value.match(new RegExp("^" + param + "$"));
	    """),format.raw/*596.6*/("""}"""),format.raw/*596.7*/(""",'please enter a valid email');
	$("#myform").validate("""),format.raw/*597.24*/("""{"""),format.raw/*597.25*/("""
  	  
        """),format.raw/*599.9*/("""rules: """),format.raw/*599.16*/("""{"""),format.raw/*599.17*/("""
        	"""),format.raw/*600.10*/("""name: """),format.raw/*600.16*/("""{"""),format.raw/*600.17*/("""required: true"""),format.raw/*600.31*/("""}"""),format.raw/*600.32*/(""",
        	email: """),format.raw/*601.17*/("""{"""),format.raw/*601.18*/("""required: true,email:true"""),format.raw/*601.43*/("""}"""),format.raw/*601.44*/(""",
			mobile: """),format.raw/*602.12*/("""{"""),format.raw/*602.13*/("""required: true,regxp:/^[0-9\-\(\)\+]*$/,minlength:10"""),format.raw/*602.65*/("""}"""),format.raw/*602.66*/(""",
			password: """),format.raw/*603.14*/("""{"""),format.raw/*603.15*/("""required: true"""),format.raw/*603.29*/("""}"""),format.raw/*603.30*/(""",
			confirmpassword: """),format.raw/*604.21*/("""{"""),format.raw/*604.22*/("""required: true"""),format.raw/*604.36*/("""}"""),format.raw/*604.37*/("""
		"""),format.raw/*605.3*/("""}"""),format.raw/*605.4*/(""",
		messages: """),format.raw/*606.13*/("""{"""),format.raw/*606.14*/("""
			"""),format.raw/*607.4*/("""name:"""),format.raw/*607.9*/("""{"""),format.raw/*607.10*/("""
				"""),format.raw/*608.5*/("""required:"Please enter USer name",
			"""),format.raw/*609.4*/("""}"""),format.raw/*609.5*/(""" """),format.raw/*609.6*/(""",
			email:"""),format.raw/*610.10*/("""{"""),format.raw/*610.11*/("""
				"""),format.raw/*611.5*/("""required:"Please enter your email",
			"""),format.raw/*612.4*/("""}"""),format.raw/*612.5*/(""" """),format.raw/*612.6*/(""",
			mobile:"""),format.raw/*613.11*/("""{"""),format.raw/*613.12*/("""
				"""),format.raw/*614.5*/("""required:"Please enter your Mobile number",
				regxp:"Please enter valid mobile number",
				minlength:"Please enter a valid 10 digit Indian mobile number"
			"""),format.raw/*617.4*/("""}"""),format.raw/*617.5*/(""" """),format.raw/*617.6*/(""",
			password:"""),format.raw/*618.13*/("""{"""),format.raw/*618.14*/("""
				"""),format.raw/*619.5*/("""required:"Please enter your password",
			"""),format.raw/*620.4*/("""}"""),format.raw/*620.5*/(""" """),format.raw/*620.6*/(""",
			email:"""),format.raw/*621.10*/("""{"""),format.raw/*621.11*/("""
				"""),format.raw/*622.5*/("""confirmpassword:"Please enter your confirmpassword",
			"""),format.raw/*623.4*/("""}"""),format.raw/*623.5*/(""" """),format.raw/*623.6*/(""",
		"""),format.raw/*624.3*/("""}"""),format.raw/*624.4*/(""",
		tooltip_options: """),format.raw/*625.20*/("""{"""),format.raw/*625.21*/("""
			"""),format.raw/*626.4*/("""name: """),format.raw/*626.10*/("""{"""),format.raw/*626.11*/("""trigger:'focus'"""),format.raw/*626.26*/("""}"""),format.raw/*626.27*/(""",
			email: """),format.raw/*627.11*/("""{"""),format.raw/*627.12*/("""trigger:'focus'"""),format.raw/*627.27*/("""}"""),format.raw/*627.28*/(""",
			mobile: """),format.raw/*628.12*/("""{"""),format.raw/*628.13*/("""trigger:'focus'"""),format.raw/*628.28*/("""}"""),format.raw/*628.29*/(""",
			password: """),format.raw/*629.14*/("""{"""),format.raw/*629.15*/("""trigger:'focus'"""),format.raw/*629.30*/("""}"""),format.raw/*629.31*/(""",
			confirmpassword: """),format.raw/*630.21*/("""{"""),format.raw/*630.22*/("""trigger:'focus'"""),format.raw/*630.37*/("""}"""),format.raw/*630.38*/("""
		"""),format.raw/*631.3*/("""}"""),format.raw/*631.4*/(""",
		submitHandler: function(form)
		"""),format.raw/*633.3*/("""{"""),format.raw/*633.4*/("""
    	   """),format.raw/*634.9*/("""$.ajax("""),format.raw/*634.16*/("""{"""),format.raw/*634.17*/("""
                        """),format.raw/*635.25*/("""type: "POST",
                        data: $("#myform").serialize(),
                        url: "/saveSignupDetails",
                        success: function(data) """),format.raw/*638.49*/("""{"""),format.raw/*638.50*/("""
                           """),format.raw/*639.28*/("""window.location = "/login?message=success"
                        """),format.raw/*640.25*/("""}"""),format.raw/*640.26*/("""
                    """),format.raw/*641.21*/("""}"""),format.raw/*641.22*/(""");
                  //  ev.preventDefault();
	    """),format.raw/*643.6*/("""}"""),format.raw/*643.7*/("""
	  """),format.raw/*644.4*/("""}"""),format.raw/*644.5*/(""");
	
		function validateCustomer()"""),format.raw/*646.30*/("""{"""),format.raw/*646.31*/("""
			"""),format.raw/*647.4*/("""$("#error").empty();
			var result = true;
			$.ajaxSetup("""),format.raw/*649.16*/("""{"""),format.raw/*649.17*/("""async: false"""),format.raw/*649.29*/("""}"""),format.raw/*649.30*/(""");
			var email = $("#email").val();
			var mobile = $("#mobile").val();
			$.get("/validate/email/"+email,function(data)"""),format.raw/*652.49*/("""{"""),format.raw/*652.50*/("""
				"""),format.raw/*653.5*/("""if(data == "duplicated")"""),format.raw/*653.29*/("""{"""),format.raw/*653.30*/("""
					"""),format.raw/*654.6*/("""result = false;
					$("#error").append("Email id is duplicated");
				"""),format.raw/*656.5*/("""}"""),format.raw/*656.6*/("""
			"""),format.raw/*657.4*/("""}"""),format.raw/*657.5*/(""")
			$.get("/validate/mobile/"+mobile,function(data)"""),format.raw/*658.51*/("""{"""),format.raw/*658.52*/("""
				"""),format.raw/*659.5*/("""if(data == "duplicated")"""),format.raw/*659.29*/("""{"""),format.raw/*659.30*/("""
					"""),format.raw/*660.6*/("""if(!result)"""),format.raw/*660.17*/("""{"""),format.raw/*660.18*/("""
						"""),format.raw/*661.7*/("""$("#error").empty();
						$("#error").append("Email and Mobile no are duplicated");
					"""),format.raw/*663.6*/("""}"""),format.raw/*663.7*/("""else"""),format.raw/*663.11*/("""{"""),format.raw/*663.12*/("""
						"""),format.raw/*664.7*/("""$("#error").append("Mobile number is duplicated");
						result = false;
					"""),format.raw/*666.6*/("""}"""),format.raw/*666.7*/("""
					
				"""),format.raw/*668.5*/("""}"""),format.raw/*668.6*/("""
			"""),format.raw/*669.4*/("""}"""),format.raw/*669.5*/(""")
			
			 return result;
		"""),format.raw/*672.3*/("""}"""),format.raw/*672.4*/("""
	"""),format.raw/*673.2*/("""</script>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/signup.scala.html
                  HASH: cf193a0f8e3566e817f8fc8b3219855026bc99bc
                  MATRIX: 799->0|1163->337|1178->343|1240->384|1300->417|1315->423|1380->467|1423->483|1438->489|1492->522|2068->1070|2097->1071|2126->1072|2182->1099|2212->1100|2272->1131|2302->1132|2332->1133|2383->1155|2413->1156|2443->1157|2844->1531|2859->1537|2916->1573|3044->1674|3059->1680|3119->1719|3172->1745|3187->1751|3250->1793|3331->1846|3360->1847|3392->1852|3501->1933|3530->1934|3564->1941|3692->2042|3720->2043|3795->2090|3824->2091|3858->2098|3987->2200|4015->2201|4077->2235|4106->2236|4140->2243|4209->2285|4237->2286|4269->2291|4297->2292|4374->2342|4389->2348|4456->2394|4508->2419|4523->2425|4582->2463|4643->2497|4658->2503|4722->2546|4783->2580|4798->2586|4861->2628|4939->2679|4954->2685|5016->2726|5069->2752|5084->2758|5152->2805|5205->2831|5220->2837|5281->2877|5334->2903|5349->2909|5421->2960|5474->2986|5489->2992|5559->3041|5612->3067|5627->3073|5689->3114|5742->3140|5757->3146|5830->3198|5883->3224|5898->3230|5982->3293|6036->3320|6051->3326|6114->3368|6168->3395|6183->3401|6252->3449|6336->3505|6365->3506|6397->3511|6450->3536|6479->3537|6512->3543|6572->3575|6601->3576|6635->3583|6769->3690|6797->3691|6891->3758|6919->3759|6947->3760|6980->3766|7008->3767|7036->3768|25858->22561|25888->22562|25918->22563|25962->22578|25992->22579|26054->22612|26084->22613|26115->22616|26300->22772|26330->22773|26362->22777|26493->22880|26522->22881|26553->22884|26605->22907|26635->22908|26670->22915|26717->22934|26746->22935|26777->22938|26806->22939|26836->22941|26930->23006|26960->23007|27005->23024|27063->23054|27092->23055|27213->23147|27243->23148|27282->23158|27366->23214|27395->23215|27479->23270|27509->23271|27552->23286|27588->23293|27618->23294|27657->23304|27692->23310|27722->23311|27765->23325|27795->23326|27842->23344|27872->23345|27926->23370|27956->23371|27998->23384|28028->23385|28109->23437|28139->23438|28183->23453|28213->23454|28256->23468|28286->23469|28337->23491|28367->23492|28410->23506|28440->23507|28471->23510|28500->23511|28543->23525|28573->23526|28605->23530|28638->23535|28668->23536|28701->23541|28767->23579|28796->23580|28825->23581|28865->23592|28895->23593|28928->23598|28995->23637|29024->23638|29053->23639|29094->23651|29124->23652|29157->23657|29345->23817|29374->23818|29403->23819|29446->23833|29476->23834|29509->23839|29579->23881|29608->23882|29637->23883|29677->23894|29707->23895|29740->23900|29824->23956|29853->23957|29882->23958|29914->23962|29943->23963|29993->23984|30023->23985|30055->23989|30090->23995|30120->23996|30164->24011|30194->24012|30235->24024|30265->24025|30309->24040|30339->24041|30381->24054|30411->24055|30455->24070|30485->24071|30529->24086|30559->24087|30603->24102|30633->24103|30684->24125|30714->24126|30758->24141|30788->24142|30819->24145|30848->24146|30912->24182|30941->24183|30978->24192|31014->24199|31044->24200|31098->24225|31296->24394|31326->24395|31383->24423|31479->24490|31509->24491|31559->24512|31589->24513|31668->24564|31697->24565|31729->24569|31758->24570|31821->24604|31851->24605|31883->24609|31970->24667|32000->24668|32041->24680|32071->24681|32221->24802|32251->24803|32284->24808|32337->24832|32367->24833|32401->24839|32500->24910|32529->24911|32561->24915|32590->24916|32671->24968|32701->24969|32734->24974|32787->24998|32817->24999|32851->25005|32891->25016|32921->25017|32956->25024|33074->25114|33103->25115|33136->25119|33166->25120|33201->25127|33307->25205|33336->25206|33375->25217|33404->25218|33436->25222|33465->25223|33520->25250|33549->25251|33579->25253
                  LINES: 29->1|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|54->26|54->26|54->26|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|61->33|63->35|63->35|64->36|66->38|66->38|68->40|68->40|69->41|71->43|71->43|73->45|73->45|74->46|76->48|76->48|77->49|77->49|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|100->72|100->72|102->74|102->74|102->74|103->75|103->75|103->75|604->576|604->576|604->576|604->576|604->576|605->577|605->577|606->578|609->581|609->581|610->582|613->585|613->585|614->586|614->586|614->586|615->587|616->588|616->588|617->589|617->589|618->590|618->590|618->590|619->591|620->592|620->592|622->594|622->594|623->595|624->596|624->596|625->597|625->597|627->599|627->599|627->599|628->600|628->600|628->600|628->600|628->600|629->601|629->601|629->601|629->601|630->602|630->602|630->602|630->602|631->603|631->603|631->603|631->603|632->604|632->604|632->604|632->604|633->605|633->605|634->606|634->606|635->607|635->607|635->607|636->608|637->609|637->609|637->609|638->610|638->610|639->611|640->612|640->612|640->612|641->613|641->613|642->614|645->617|645->617|645->617|646->618|646->618|647->619|648->620|648->620|648->620|649->621|649->621|650->622|651->623|651->623|651->623|652->624|652->624|653->625|653->625|654->626|654->626|654->626|654->626|654->626|655->627|655->627|655->627|655->627|656->628|656->628|656->628|656->628|657->629|657->629|657->629|657->629|658->630|658->630|658->630|658->630|659->631|659->631|661->633|661->633|662->634|662->634|662->634|663->635|666->638|666->638|667->639|668->640|668->640|669->641|669->641|671->643|671->643|672->644|672->644|674->646|674->646|675->647|677->649|677->649|677->649|677->649|680->652|680->652|681->653|681->653|681->653|682->654|684->656|684->656|685->657|685->657|686->658|686->658|687->659|687->659|687->659|688->660|688->660|688->660|689->661|691->663|691->663|691->663|691->663|692->664|694->666|694->666|696->668|696->668|697->669|697->669|700->672|700->672|701->673
                  -- GENERATED --
              */
          