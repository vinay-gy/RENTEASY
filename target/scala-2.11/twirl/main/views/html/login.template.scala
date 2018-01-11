
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<title>RentEasy</title>
<link rel="stylesheet" href=""""),_display_(/*6.31*/routes/*6.37*/.Assets.at("theme/css/bootstrap.min.css")),format.raw/*6.78*/("""">
<link rel="stylesheet" href=""""),_display_(/*7.31*/routes/*7.37*/.Assets.at("theme/css/bootstrap-select.css")),format.raw/*7.81*/("""">
<link href=""""),_display_(/*8.14*/routes/*8.20*/.Assets.at("theme/css/style.css")),format.raw/*8.53*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*14.78*/("""{"""),format.raw/*14.79*/(""" """),format.raw/*14.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*14.107*/("""}"""),format.raw/*14.108*/(""", false); function hideURLbar()"""),format.raw/*14.139*/("""{"""),format.raw/*14.140*/(""" """),format.raw/*14.141*/("""window.scrollTo(0,1); """),format.raw/*14.163*/("""}"""),format.raw/*14.164*/(""" """),format.raw/*14.165*/("""</script>
<!-- //for-mobile-apps -->
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--//fonts-->	
<!-- js -->
<script type="text/javascript" src=""""),_display_(/*21.38*/routes/*21.44*/.Assets.at("theme/js/jquery.min.js")),format.raw/*21.80*/(""""></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.at("theme/js/bootstrap.min.js")),format.raw/*24.60*/(""""></script>
<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.at("theme/js/bootstrap-select.js")),format.raw/*25.63*/(""""></script>
<script>
  $(document).ready(function () """),format.raw/*27.33*/("""{"""),format.raw/*27.34*/("""
    """),format.raw/*28.5*/("""var mySelect = $('#first-disabled2');

    $('#special').on('click', function () """),format.raw/*30.43*/("""{"""),format.raw/*30.44*/("""
      """),format.raw/*31.7*/("""mySelect.find('option:selected').prop('disabled', true);
      mySelect.selectpicker('refresh');
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""");

    $('#special2').on('click', function () """),format.raw/*35.44*/("""{"""),format.raw/*35.45*/("""
      """),format.raw/*36.7*/("""mySelect.find('option:disabled').prop('disabled', false);
      mySelect.selectpicker('refresh');
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/(""");

    $('#basic2').selectpicker("""),format.raw/*40.31*/("""{"""),format.raw/*40.32*/("""
      """),format.raw/*41.7*/("""liveSearch: true,
      maxOptions: 1
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""");
  """),format.raw/*44.3*/("""}"""),format.raw/*44.4*/(""");
</script>

<script type="text/javascript" src=""""),_display_(/*47.38*/routes/*47.44*/.Assets.at("theme/js/jquery.leanModal.min.js")),format.raw/*47.90*/(""""></script>
<link href=""""),_display_(/*48.14*/routes/*48.20*/.Assets.at("theme/css/jquery.uls.css")),format.raw/*48.58*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*49.14*/routes/*49.20*/.Assets.at("theme/css/jquery.uls.grid.css")),format.raw/*49.63*/("""" rel="stylesheet"/>
<link href=""""),_display_(/*50.14*/routes/*50.20*/.Assets.at("theme/css/jquery.uls.lcd.css")),format.raw/*50.62*/("""" rel="stylesheet"/>
<!-- Source -->
<script src=""""),_display_(/*52.15*/routes/*52.21*/.Assets.at("theme/js/jquery.uls.data.js")),format.raw/*52.62*/(""""></script>
<script src=""""),_display_(/*53.15*/routes/*53.21*/.Assets.at("theme/js/jquery.uls.data.utils.js")),format.raw/*53.68*/(""""></script>
<script src=""""),_display_(/*54.15*/routes/*54.21*/.Assets.at("theme/js/jquery.uls.lcd.js")),format.raw/*54.61*/(""""></script>
<script src=""""),_display_(/*55.15*/routes/*55.21*/.Assets.at("theme/js/jquery.uls.languagefilter.js")),format.raw/*55.72*/(""""></script>
<script src=""""),_display_(/*56.15*/routes/*56.21*/.Assets.at("theme/js/jquery.uls.regionfilter.js")),format.raw/*56.70*/(""""></script>
<script src=""""),_display_(/*57.15*/routes/*57.21*/.Assets.at("theme/js/jquery.uls.core.js")),format.raw/*57.62*/(""""></script>
<script src=""""),_display_(/*58.15*/routes/*58.21*/.Assets.at("theme/js/jquery.validate-1.14.0.min.js")),format.raw/*58.73*/(""""></script>
<script src=""""),_display_(/*59.15*/routes/*59.21*/.Assets.at("theme/js/jquery-validate.bootstrap-tooltip.min.js")),format.raw/*59.84*/(""""></script>
 <script src=""""),_display_(/*60.16*/routes/*60.22*/.Assets.at("theme/js/intlTelInput.min.js")),format.raw/*60.64*/(""""></script>
<script>
			$( document ).ready( function() """),format.raw/*62.36*/("""{"""),format.raw/*62.37*/("""
				"""),format.raw/*63.5*/("""$( '.uls-trigger' ).uls( """),format.raw/*63.30*/("""{"""),format.raw/*63.31*/("""
					"""),format.raw/*64.6*/("""onSelect : function( language ) """),format.raw/*64.38*/("""{"""),format.raw/*64.39*/("""
						"""),format.raw/*65.7*/("""var languageName = $.uls.data.getAutonym( language );
						$( '.uls-trigger' ).text( languageName );
					"""),format.raw/*67.6*/("""}"""),format.raw/*67.7*/(""",
					quickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME
				"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""" """),format.raw/*69.7*/(""");
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""" """),format.raw/*70.6*/(""");
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
	<!-- Large modal -->
			<div class="selectregion">
			"""),_display_(/*83.5*/if(session.get("re_user_location") != null)/*83.48*/{_display_(Seq[Any](format.raw/*83.49*/("""
				"""),format.raw/*84.5*/("""<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" id="user_location">
				"""),_display_(/*85.6*/session/*85.13*/.get("re_user_location")),format.raw/*85.37*/("""</button>
				""")))}/*86.6*/else/*86.10*/{_display_(Seq[Any](format.raw/*86.11*/("""
				"""),format.raw/*87.5*/("""<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" id="user_location">
				Select Your Region</button>
				""")))}),format.raw/*89.6*/("""
					"""),format.raw/*90.6*/("""<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
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
	 <section>
<!-- 	 <div class="alert alert-danger" role="alert" id="error"> -->
<!--         <strong>Oh snap!</strong> Change a few things up and try submitting again. -->
<!--        </div> -->
			
			<div id="page-wrapper" class="sign-in-wrapper">
			"""),_display_(/*137.5*/if(message != "")/*137.22*/{_display_(Seq[Any](format.raw/*137.23*/("""
			"""),format.raw/*138.4*/("""<div class="alert alert-success" role="alert">
		        <strong>Well done!</strong> You successfully signed up with RentEasy.
		       </div>
		       """)))}),format.raw/*141.11*/("""
				"""),format.raw/*142.5*/("""<div class="graphs">
					<div class="sign-in-form">
						<div class="sign-in-form-top">
							<h1>Log in</h1>
						</div>
						<div class="signin">
							<div class="signin-rit">
								<span class="checkbox1">
									 <label class="checkbox"><input type="checkbox" name="checkbox" checked="">Forgot Password ?</label>
								</span>
								<p><a href="#">Click Here</a> </p>
								<div class="clearfix"> </div>
							</div>
							<form id="myform" method="post">
							<div class="log-input">
								<div class="log-input-left">
								   <input type="text" class="user" id="email" name="email" placeholder="Your Email"/>
								</div>
<!-- 								<span class="checkbox2"> -->
<!-- 									 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i></label> -->
<!-- 								</span> -->
								<div class="clearfix"> </div>
							</div>
							<div class="log-input">
								<div class="log-input-left">
								   <input type="password" class="lock" id="password" name="password" placeholder="password"/>
								</div>
<!-- 								<span class="checkbox2"> -->
<!-- 									 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i></label> -->
<!-- 								</span> -->
								<div class="clearfix"> </div>
							</div>
							<input type="submit" value="Log in">
							 <div id="error" style="color:red;margin-top: 10px;text-align:center"></div>
						</form>	 
						</div>
						<div class="new_people">
							<h2>For New People</h2>
							<p>Having hands on experience in creating innovative designs,I do offer design 
								solutions which harness.</p>
							<a href="/signup">Register Now!</a>
						</div>
					</div>
				</div>
			</div>
		<!--footer section start-->
			<footer class="diff">
			   <p class="text-center"> <a href="" target="_blank"></a></p>
			</footer>
        <!--footer section end-->
	</section>
</body>
<script type="text/javascript">
$(document).ready(function()
"""),format.raw/*196.1*/("""{"""),format.raw/*196.2*/("""	  
	"""),format.raw/*197.2*/("""//document.getElementById("email").value = "";
	//document.getElementById("password").value = "";
	$(".alert").fadeOut(10000);
	 $("#myform").validate("""),format.raw/*200.25*/("""{"""),format.raw/*200.26*/("""
             
               """),format.raw/*202.16*/("""rules: """),format.raw/*202.23*/("""{"""),format.raw/*202.24*/("""
           	    """),format.raw/*203.17*/("""email: """),format.raw/*203.24*/("""{"""),format.raw/*203.25*/("""required: true"""),format.raw/*203.39*/("""}"""),format.raw/*203.40*/(""",
				password: """),format.raw/*204.15*/("""{"""),format.raw/*204.16*/("""required: true"""),format.raw/*204.30*/("""}"""),format.raw/*204.31*/("""
			"""),format.raw/*205.4*/("""}"""),format.raw/*205.5*/(""",
			messages: """),format.raw/*206.14*/("""{"""),format.raw/*206.15*/("""
				"""),format.raw/*207.5*/("""email:"""),format.raw/*207.11*/("""{"""),format.raw/*207.12*/("""
					"""),format.raw/*208.6*/("""required:"Please enter your email",
				"""),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""" """),format.raw/*209.7*/(""",
				password: "Enter your password"
			"""),format.raw/*211.4*/("""}"""),format.raw/*211.5*/(""",
			tooltip_options: """),format.raw/*212.21*/("""{"""),format.raw/*212.22*/("""
				"""),format.raw/*213.5*/("""email: """),format.raw/*213.12*/("""{"""),format.raw/*213.13*/("""trigger:'focus'"""),format.raw/*213.28*/("""}"""),format.raw/*213.29*/(""",
				password: """),format.raw/*214.15*/("""{"""),format.raw/*214.16*/("""trigger:'focus'"""),format.raw/*214.31*/("""}"""),format.raw/*214.32*/("""
			"""),format.raw/*215.4*/("""}"""),format.raw/*215.5*/(""",
			
	   submitHandler: function(form) """),format.raw/*217.35*/("""{"""),format.raw/*217.36*/("""
		"""),format.raw/*218.3*/("""$.ajax("""),format.raw/*218.10*/("""{"""),format.raw/*218.11*/("""
			"""),format.raw/*219.4*/("""type:"POST",
			data: $("#myform").serialize(),
			url: "/validate",
			
			success: function (data) """),format.raw/*223.29*/("""{"""),format.raw/*223.30*/("""
				"""),format.raw/*224.5*/("""//alert(data);
				if(data == "Invalid")"""),format.raw/*225.26*/("""{"""),format.raw/*225.27*/("""
"""),format.raw/*226.1*/("""// 					document.getElementById("username").value = "";
// 					document.getElementById("passwordhash").value = "";
// 					document.getElementById("username").focus();
// 					$("#displayErrorMsg").append("Invalid Username or Password");
// 					ev.preventDefault();
				$("#error").empty();
                $("#error").append("Invalid Username or password");
				"""),format.raw/*233.5*/("""}"""),format.raw/*233.6*/(""" """),format.raw/*233.7*/("""else"""),format.raw/*233.11*/("""{"""),format.raw/*233.12*/("""
"""),format.raw/*234.1*/("""// 					alert("success")
					window.location.href = "/";
				"""),format.raw/*236.5*/("""}"""),format.raw/*236.6*/("""
				
			"""),format.raw/*238.4*/("""}"""),format.raw/*238.5*/("""
		"""),format.raw/*239.3*/("""}"""),format.raw/*239.4*/("""); 
		
		//ev.preventDefault();
	"""),format.raw/*242.2*/("""}"""),format.raw/*242.3*/("""
"""),format.raw/*243.1*/("""}"""),format.raw/*243.2*/(""");
"""),format.raw/*244.1*/("""}"""),format.raw/*244.2*/(""");
</script>
<script type="text/javascript">
$( document ).ready( function() """),format.raw/*247.33*/("""{"""),format.raw/*247.34*/("""
	"""),format.raw/*248.2*/("""locations();
"""),format.raw/*249.1*/("""}"""),format.raw/*249.2*/(""");
function locations()"""),format.raw/*250.21*/("""{"""),format.raw/*250.22*/("""
	"""),format.raw/*251.2*/("""$.ajaxSetup("""),format.raw/*251.14*/("""{"""),format.raw/*251.15*/("""async: false"""),format.raw/*251.27*/("""}"""),format.raw/*251.28*/(""");
	$.get("/locations",function(data)"""),format.raw/*252.35*/("""{"""),format.raw/*252.36*/("""
		"""),format.raw/*253.3*/("""var state_list = data.state_list;
		var city_list = data.city_list;
		
		$.each(state_list,function(i,item)"""),format.raw/*256.37*/("""{"""),format.raw/*256.38*/("""
			"""),format.raw/*257.4*/("""$("#locations").append("<optgroup label='"+item.state+"' id='state"+item.id+"'></optgroup>")
			$.each(city_list,function(j,item1)"""),format.raw/*258.38*/("""{"""),format.raw/*258.39*/("""
				"""),format.raw/*259.5*/("""if(item.id == item1.state.id)"""),format.raw/*259.34*/("""{"""),format.raw/*259.35*/("""
					"""),format.raw/*260.6*/("""$("#state"+item.id).append("<option value='"+item1.city+"'>"+item1.city+"</option>")
				"""),format.raw/*261.5*/("""}"""),format.raw/*261.6*/("""
			"""),format.raw/*262.4*/("""}"""),format.raw/*262.5*/(""")
		"""),format.raw/*263.3*/("""}"""),format.raw/*263.4*/(""")
		
	"""),format.raw/*265.2*/("""}"""),format.raw/*265.3*/(""");
	
    $('#basic2').selectpicker('refresh');
"""),format.raw/*268.1*/("""}"""),format.raw/*268.2*/("""
"""),format.raw/*269.1*/("""function userLocation()"""),format.raw/*269.24*/("""{"""),format.raw/*269.25*/("""
	"""),format.raw/*270.2*/("""$.get("/user/location/"+$("#basic2").val(),function(data)"""),format.raw/*270.59*/("""{"""),format.raw/*270.60*/("""
		
	"""),format.raw/*272.2*/("""}"""),format.raw/*272.3*/(""");
	$("#user_location").html($("#basic2").val());
	$("#close_locations").click();
"""),format.raw/*275.1*/("""}"""),format.raw/*275.2*/("""
"""),format.raw/*276.1*/("""</script>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/login.scala.html
                  HASH: d5ba6bf785c7fe13d6e7c2860c12fc5ad17a942a
                  MATRIX: 723->1|827->17|854->18|964->102|978->108|1039->149|1098->182|1112->188|1176->232|1218->248|1232->254|1285->287|1861->835|1890->836|1919->837|1975->864|2005->865|2065->896|2095->897|2125->898|2176->920|2206->921|2236->922|2637->1296|2652->1302|2709->1338|2837->1439|2852->1445|2912->1484|2965->1510|2980->1516|3043->1558|3124->1611|3153->1612|3185->1617|3294->1698|3323->1699|3357->1706|3485->1807|3513->1808|3588->1855|3617->1856|3651->1863|3780->1965|3808->1966|3870->2000|3899->2001|3933->2008|4002->2050|4030->2051|4062->2056|4090->2057|4168->2108|4183->2114|4250->2160|4302->2185|4317->2191|4376->2229|4437->2263|4452->2269|4516->2312|4577->2346|4592->2352|4655->2394|4733->2445|4748->2451|4810->2492|4863->2518|4878->2524|4946->2571|4999->2597|5014->2603|5075->2643|5128->2669|5143->2675|5215->2726|5268->2752|5283->2758|5353->2807|5406->2833|5421->2839|5483->2880|5536->2906|5551->2912|5624->2964|5677->2990|5692->2996|5776->3059|5830->3086|5845->3092|5908->3134|5992->3190|6021->3191|6053->3196|6106->3221|6135->3222|6168->3228|6228->3260|6257->3261|6291->3268|6425->3375|6453->3376|6547->3443|6575->3444|6603->3445|6636->3451|6664->3452|6692->3453|7006->3741|7058->3784|7097->3785|7129->3790|7255->3890|7271->3897|7316->3921|7349->3936|7362->3940|7401->3941|7433->3946|7595->4078|7628->4084|9398->5827|9425->5844|9465->5845|9497->5849|9682->6002|9715->6007|11723->7987|11752->7988|11785->7993|11965->8144|11995->8145|12054->8175|12090->8182|12120->8183|12166->8200|12202->8207|12232->8208|12275->8222|12305->8223|12350->8239|12380->8240|12423->8254|12453->8255|12485->8259|12514->8260|12558->8275|12588->8276|12621->8281|12656->8287|12686->8288|12720->8294|12788->8334|12817->8335|12846->8336|12915->8377|12944->8378|12995->8400|13025->8401|13058->8406|13094->8413|13124->8414|13168->8429|13198->8430|13243->8446|13273->8447|13317->8462|13347->8463|13379->8467|13408->8468|13477->8508|13507->8509|13538->8512|13574->8519|13604->8520|13636->8524|13766->8625|13796->8626|13829->8631|13898->8671|13928->8672|13957->8673|14350->9038|14379->9039|14408->9040|14441->9044|14471->9045|14500->9046|14590->9108|14619->9109|14656->9118|14685->9119|14716->9122|14745->9123|14806->9156|14835->9157|14864->9158|14893->9159|14924->9162|14953->9163|15059->9240|15089->9241|15119->9243|15160->9256|15189->9257|15241->9280|15271->9281|15301->9283|15342->9295|15372->9296|15413->9308|15443->9309|15509->9346|15539->9347|15570->9350|15706->9457|15736->9458|15768->9462|15927->9592|15957->9593|15990->9598|16048->9627|16078->9628|16112->9634|16229->9723|16258->9724|16290->9728|16319->9729|16351->9733|16380->9734|16414->9740|16443->9741|16518->9788|16547->9789|16576->9790|16628->9813|16658->9814|16688->9816|16774->9873|16804->9874|16837->9879|16866->9880|16976->9962|17005->9963|17034->9964
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|42->14|42->14|42->14|42->14|42->14|42->14|42->14|42->14|49->21|49->21|49->21|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|56->28|58->30|58->30|59->31|61->33|61->33|63->35|63->35|64->36|66->38|66->38|68->40|68->40|69->41|71->43|71->43|72->44|72->44|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|95->67|95->67|97->69|97->69|97->69|98->70|98->70|98->70|111->83|111->83|111->83|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|117->89|118->90|165->137|165->137|165->137|166->138|169->141|170->142|224->196|224->196|225->197|228->200|228->200|230->202|230->202|230->202|231->203|231->203|231->203|231->203|231->203|232->204|232->204|232->204|232->204|233->205|233->205|234->206|234->206|235->207|235->207|235->207|236->208|237->209|237->209|237->209|239->211|239->211|240->212|240->212|241->213|241->213|241->213|241->213|241->213|242->214|242->214|242->214|242->214|243->215|243->215|245->217|245->217|246->218|246->218|246->218|247->219|251->223|251->223|252->224|253->225|253->225|254->226|261->233|261->233|261->233|261->233|261->233|262->234|264->236|264->236|266->238|266->238|267->239|267->239|270->242|270->242|271->243|271->243|272->244|272->244|275->247|275->247|276->248|277->249|277->249|278->250|278->250|279->251|279->251|279->251|279->251|279->251|280->252|280->252|281->253|284->256|284->256|285->257|286->258|286->258|287->259|287->259|287->259|288->260|289->261|289->261|290->262|290->262|291->263|291->263|293->265|293->265|296->268|296->268|297->269|297->269|297->269|298->270|298->270|298->270|300->272|300->272|303->275|303->275|304->276
                  -- GENERATED --
              */
          