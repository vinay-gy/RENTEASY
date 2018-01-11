
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
object successPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pid: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.15*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
"""),format.raw/*4.1*/("""<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/("""
            """),format.raw/*10.13*/("""margin: 0;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        
        """),format.raw/*13.9*/(""".icon-bar """),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
            """),format.raw/*14.13*/("""width: 100%;
            background-color: #01a185;
            overflow: auto;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
        
        """),format.raw/*19.9*/(""".icon-bar a """),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
            """),format.raw/*20.13*/("""float: left;
            width: 20%;
            text-align: center;
            padding: 12px 0;
            transition: all 0.3s ease;
            color: white;
            font-size: 36px;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        
        """),format.raw/*29.9*/(""".icon-bar a:hover """),format.raw/*29.27*/("""{"""),format.raw/*29.28*/("""
            """),format.raw/*30.13*/("""background-color: #000;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        
        """),format.raw/*33.9*/(""".activeBar """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/("""
            """),format.raw/*34.13*/("""background-color: #f3c500 !important;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        
        """),format.raw/*37.9*/(""".collapse """),format.raw/*37.19*/("""{"""),format.raw/*37.20*/("""
            """),format.raw/*38.13*/("""height: 100%;
            animation: 1s ease-out 0s 1 slideInFromLeft;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
        
        """),format.raw/*42.9*/("""@keyframes slideInFromLeft """),format.raw/*42.37*/("""{"""),format.raw/*42.38*/("""
            """),format.raw/*43.13*/("""0% """),format.raw/*43.16*/("""{"""),format.raw/*43.17*/("""
                """),format.raw/*44.17*/("""transform: translateY(-5%);
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""100% """),format.raw/*46.18*/("""{"""),format.raw/*46.19*/("""
                """),format.raw/*47.17*/("""transform: translateY(0);
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        
        """),format.raw/*51.9*/(""".btnN:hover """),format.raw/*51.21*/("""{"""),format.raw/*51.22*/("""
            """),format.raw/*52.13*/("""background-color: #f3c500 !important;
            border: 1px solid #f3c500 !important;
            outline: none;
            transition: all 0.3s ease;
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
        """),format.raw/*57.9*/(""".post-ad-form input[type="email"],input[type="number"] """),format.raw/*57.64*/("""{"""),format.raw/*57.65*/("""
		    """),format.raw/*58.7*/("""padding: 10px 10px 10px 10px;
		    width: 70%;
		    margin-bottom: 25px;
		    border: 1px solid #01a185;
		    outline: none;
		    color: #555;
		    transition: 0.5s all;
		    -webkit-transition: 0.5s all;
		    -moz-transition: 0.5s all;
		    -o-transition: 0.5s all;
		    -ms-transition: 0.5s all;
		    float: left;
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
    """),format.raw/*71.5*/("""</style>
</head>

<div class="submit-ad main-grid-border" style="height:100%;margin-bottom: 5%;border-bottom: none" >
    <div class="container" ng-app="successPage" ng-controller="adDetails">
        <h2 class="head">Post an Ad</h2>
        <div style="border:1px solid #f3c500;height:100%;border-top:none;">
            <div class="icon-bar" style="text-align: right;">
                <a class="toggle activeBar" ><i class="fa fa-check-circle-o "></i></a>
            </div>
            <div class="post-ad-form" style="border:none;margin-bottom: 0px ">
                    <div id="first" class="collapse">
                    <div class="row">
                    <div class="col-md-6">
                    	<h2 class="head" style="color:#01a185;margin-top: 0px;">Ad Created Successfully <i class="fa fa-check fa-1x"></i></h2>
                    	</div>
						
                    </div>
                    <div class="row" style="padding:20px">
                    	<div class="col-md-4" style="border-right:2px dashed #01a185;min-height:250px">
                    	
                    	<div class="row">
                    		<div class="col-md-12" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Ad Title</label>
                    		</div>
                    		<div class="col-md-12" style="text-align: left;padding-bottom: 20px">
                    			<label style="width:100%;color:#01a185;font-size: large;">"""),format.raw/*97.82*/("""{"""),format.raw/*97.83*/("""{"""),format.raw/*97.84*/("""adDetails[0].title"""),format.raw/*97.102*/("""}"""),format.raw/*97.103*/("""}"""),format.raw/*97.104*/("""</label>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-md-12" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Ad Type</label>
                    		</div>
                    		<div class="col-md-12" style="text-align: left;padding-bottom: 20px">
                    			<label style="width:100%;color:#01a185;font-size: large;">"""),format.raw/*105.82*/("""{"""),format.raw/*105.83*/("""{"""),format.raw/*105.84*/("""adDetails[0].productType.subCategory.category.category"""),format.raw/*105.138*/("""}"""),format.raw/*105.139*/("""}"""),format.raw/*105.140*/("""</label>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-md-12" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Description</label>
                    		</div>
                    		<div class="col-md-12" style="text-align: left;padding-bottom: 20px">
                    			<p style="width:100%;color:#01a185;font-size: large; ">
                   					"""),format.raw/*114.25*/("""{"""),format.raw/*114.26*/("""{"""),format.raw/*114.27*/("""adDetails[0].description"""),format.raw/*114.51*/("""}"""),format.raw/*114.52*/("""}"""),format.raw/*114.53*/(""" 	
                    			"""),format.raw/*115.24*/("""</p>
                    		</div>
                    	</div>
                    		
                    		
                    	</div>
                    	<div class="col-md-4" style="border-right:2px dashed #01a185;min-height:250px">
                    		<div class="row">
                    		<div class="col-md-6" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Rent Amount</label>
                    		</div>
                    		<div class="col-md-6" style="text-align: left;padding-bottom: 20px">
                    			<label style="width:100%;color:#01a185;font-size: large;">"""),format.raw/*127.82*/("""{"""),format.raw/*127.83*/("""{"""),format.raw/*127.84*/("""adDetails[0].price"""),format.raw/*127.102*/("""}"""),format.raw/*127.103*/("""}"""),format.raw/*127.104*/("""  """),format.raw/*127.106*/("""<span>₹</span></label>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-md-6" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Deposit</label>
                    		</div>
                    		<div class="col-md-6" style="text-align: left;padding-bottom: 20px">
                    			<label style="width:100%;color:#01a185;font-size: large;">"""),format.raw/*135.82*/("""{"""),format.raw/*135.83*/("""{"""),format.raw/*135.84*/("""adDetails[0].deposit"""),format.raw/*135.104*/("""}"""),format.raw/*135.105*/("""}"""),format.raw/*135.106*/(""" """),format.raw/*135.107*/("""<span>₹</span></label>
                    		</div>
                    	</div>
                    	<div class="row">
                    		<div class="col-md-6" style="text-align: left;">
                    			<label style="width:100%;color:#f3c500;font-size: large; ">Duration</label>
                    		</div>
                    		<div class="col-md-6" style="text-align: left;padding-bottom: 20px">
                    			<label style="width:100%;color:#01a185;font-size: large;">"""),format.raw/*143.82*/("""{"""),format.raw/*143.83*/("""{"""),format.raw/*143.84*/("""adDetails[0].duration"""),format.raw/*143.105*/("""}"""),format.raw/*143.106*/("""}"""),format.raw/*143.107*/(""" """),format.raw/*143.108*/("""</label>
                    		</div>
                    	</div>
                    	</div>
                    	<div class="col-md-4">
                    		<div class="col-md-12" style="padding-bottom: 5px">
                    			<img src="" style="height: 150px;width:100%" id="adPreview">
                    		</div>
                    		<div class="col-md-12" style="height: 100px;padding:0px">
	                    		<div class="col-md-3" >
	                    			<img src="" style="height: 90px;width:100%;padding-right:0px" onclick="readURL(this)" onerror="handleError(this)"  id="adPreview1">
                    			</div>
                    			<div class="col-md-3" >
	                    			<img src="" style="height: 90px;width:100%;padding-right:0px" onclick="readURL(this)" onerror="handleError(this)" id="adPreview2">
                    			</div>
                    			<div class="col-md-3" >
	                    			<img src="" style="height: 90px;width:100%;padding-right:0px" onclick="readURL(this)" onerror="handleError(this)" id="adPreview3">
                    			</div>
                    			<div class="col-md-3" >
	                    			<img src="" style="height: 90px;width:100%;padding-right:0px" onclick="readURL(this)" onerror="handleError(this)" id="adPreview4">
                    			</div>
                    		</div>
                    	</div>
                    </div>
                    	
                        

                        

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:20px;">
                            <a href="/" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;">Close</a>

                        </div>
                    </div>
                    
                    

                
                    
            </div>
        </div>
    </div>
</div>


<!--  <script src=""""),_display_(/*188.21*/routes/*188.27*/.Assets.at("angularjs/createAd.js")),format.raw/*188.62*/(""""></script> -->
	<script>
	$(document).ready(function()"""),format.raw/*190.30*/("""{"""),format.raw/*190.31*/("""
		"""),format.raw/*191.3*/("""$("html, body").animate("""),format.raw/*191.27*/("""{"""),format.raw/*191.28*/(""" """),format.raw/*191.29*/("""scrollTop: 450 """),format.raw/*191.44*/("""}"""),format.raw/*191.45*/(""", "slow");
		$('#first').show();
		$('.error').hide();
		
		
	"""),format.raw/*196.2*/("""}"""),format.raw/*196.3*/(""");
	var app = angular.module('successPage', []);
	app.controller('adDetails', function($scope, $http) """),format.raw/*198.54*/("""{"""),format.raw/*198.55*/("""
"""),format.raw/*199.1*/("""// 		$scope.imagePath = ["/assets/images/ad1.jpg","/assets/images/ad1.jpg","/assets/images/ad1.jpg","/assets/images/ad1.jpg","/assets/images/ad1.jpg"]
		$http.get("/product/"+"""),_display_(/*200.26*/pid),format.raw/*200.29*/(""")
	        .then(function(response) """),format.raw/*201.35*/("""{"""),format.raw/*201.36*/("""
	        	"""),format.raw/*202.11*/("""$scope.adDetails = response.data;
	        	$scope.imagePath = $scope.adDetails[1].images;

	        	$("#adPreview").attr('src',$scope.imagePath[0])
	        	$("#adPreview1").attr('src',$scope.imagePath[1])
	        	$("#adPreview2").attr('src',$scope.imagePath[2])
	        	$("#adPreview3").attr('src',$scope.imagePath[3])
	        	$("#adPreview4").attr('src',$scope.imagePath[4])
	        """),format.raw/*210.10*/("""}"""),format.raw/*210.11*/(""");
		
	"""),format.raw/*212.2*/("""}"""),format.raw/*212.3*/(""");
	
	function getProductSpecificForm(route)"""),format.raw/*214.40*/("""{"""),format.raw/*214.41*/("""
		"""),format.raw/*215.3*/("""$.ajaxSetup("""),format.raw/*215.15*/("""{"""),format.raw/*215.16*/("""async: false"""),format.raw/*215.28*/("""}"""),format.raw/*215.29*/(""");
		$('#forth').load(route);
	"""),format.raw/*217.2*/("""}"""),format.raw/*217.3*/("""
	
	
	
	
	
	"""),format.raw/*223.2*/("""function hideError(id)"""),format.raw/*223.24*/("""{"""),format.raw/*223.25*/("""
		
		"""),format.raw/*225.3*/("""$('.error').show()
		setTimeout(function() """),format.raw/*226.25*/("""{"""),format.raw/*226.26*/("""
		    """),format.raw/*227.7*/("""$('.error').fadeOut('fast');
		"""),format.raw/*228.3*/("""}"""),format.raw/*228.4*/(""", 5000);
	"""),format.raw/*229.2*/("""}"""),format.raw/*229.3*/("""
	
	"""),format.raw/*231.2*/("""function submitFormSpecific()"""),format.raw/*231.31*/("""{"""),format.raw/*231.32*/("""
		"""),format.raw/*232.3*/("""$("#productId").val(pid)
		$("#description2").val($("#description").val())
		var action = $('#specific').attr('action'); 
		$.ajax("""),format.raw/*235.10*/("""{"""),format.raw/*235.11*/("""
 	        """),format.raw/*236.11*/("""type: "POST",
 	       data: $("#specific").serialize(),
 	      url: action,
 			success: function(res) """),format.raw/*239.28*/("""{"""),format.raw/*239.29*/("""
 	        	
 	              
 	        	"""),format.raw/*242.12*/("""if(res!= "0")"""),format.raw/*242.25*/("""{"""),format.raw/*242.26*/("""
 	        		
 	        		"""),format.raw/*244.13*/("""alert(res)
 	            """),format.raw/*245.15*/("""}"""),format.raw/*245.16*/("""else"""),format.raw/*245.20*/("""{"""),format.raw/*245.21*/("""
 	              """),format.raw/*246.17*/("""alert(res)
 	            	
 	            """),format.raw/*248.15*/("""}"""),format.raw/*248.16*/("""
 	        """),format.raw/*249.11*/("""}"""),format.raw/*249.12*/(""",
 	        error: function(err) """),format.raw/*250.32*/("""{"""),format.raw/*250.33*/("""
 	          
 	        """),format.raw/*252.11*/("""}"""),format.raw/*252.12*/("""
 	    """),format.raw/*253.7*/("""}"""),format.raw/*253.8*/(""");
	"""),format.raw/*254.2*/("""}"""),format.raw/*254.3*/("""
	
	"""),format.raw/*256.2*/("""function readURL(input) """),format.raw/*256.26*/("""{"""),format.raw/*256.27*/("""
		"""),format.raw/*257.3*/("""var url = $('#adPreview').attr('src');
		$('#adPreview').attr('src', $(input).attr('src'));
		$(input).attr('src', url);
	"""),format.raw/*260.2*/("""}"""),format.raw/*260.3*/("""
	"""),format.raw/*261.2*/("""function handleError(input)"""),format.raw/*261.29*/("""{"""),format.raw/*261.30*/("""
		"""),format.raw/*262.3*/("""$(input).attr('src','/assets/images/ad1.jpg')
	"""),format.raw/*263.2*/("""}"""),format.raw/*263.3*/("""
	"""),format.raw/*264.2*/("""</script>
""")))}),format.raw/*265.2*/("""
"""))}
  }

  def render(pid:String): play.twirl.api.HtmlFormat.Appendable = apply(pid)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (pid) => apply(pid)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/successPage.scala.html
                  HASH: 4cc62f25db890bea8702a74a970e79dadd3a58eb
                  MATRIX: 729->1|845->14|873->35|884->39|921->40|949->42|1114->180|1142->181|1184->195|1231->215|1260->216|1307->236|1345->246|1374->247|1416->261|1534->352|1563->353|1610->373|1650->385|1679->386|1721->400|1955->607|1984->608|2031->628|2077->646|2106->647|2148->661|2208->694|2237->695|2284->715|2323->726|2352->727|2394->741|2468->788|2497->789|2544->809|2582->819|2611->820|2653->834|2761->915|2790->916|2837->936|2892->964|2921->965|2963->979|2994->982|3023->983|3069->1001|3138->1042|3167->1043|3209->1057|3242->1062|3271->1063|3317->1081|3384->1120|3413->1121|3450->1131|3479->1132|3526->1152|3566->1164|3595->1165|3637->1179|3830->1345|3859->1346|3896->1356|3979->1411|4008->1412|4043->1420|4411->1761|4439->1762|4472->1768|6014->3282|6043->3283|6072->3284|6119->3302|6149->3303|6179->3304|6693->3789|6723->3790|6753->3791|6837->3845|6868->3846|6899->3847|7440->4359|7470->4360|7500->4361|7553->4385|7583->4386|7613->4387|7669->4414|8361->5077|8391->5078|8421->5079|8469->5097|8500->5098|8531->5099|8563->5101|9089->5598|9119->5599|9149->5600|9199->5620|9230->5621|9261->5622|9292->5623|9819->6121|9849->6122|9879->6123|9930->6144|9961->6145|9992->6146|10023->6147|12114->8210|12130->8216|12187->8251|12273->8308|12303->8309|12335->8313|12388->8337|12418->8338|12448->8339|12492->8354|12522->8355|12617->8422|12646->8423|12779->8527|12809->8528|12839->8530|13044->8707|13069->8710|13135->8747|13165->8748|13206->8760|13638->9163|13668->9164|13705->9173|13734->9174|13809->9220|13839->9221|13871->9225|13912->9237|13942->9238|13983->9250|14013->9251|14074->9284|14103->9285|14149->9303|14200->9325|14230->9326|14266->9334|14339->9378|14369->9379|14405->9387|14465->9419|14494->9420|14533->9431|14562->9432|14596->9438|14654->9467|14684->9468|14716->9472|14879->9606|14909->9607|14950->9619|15087->9727|15117->9728|15190->9772|15232->9785|15262->9786|15319->9814|15374->9840|15404->9841|15437->9845|15467->9846|15514->9864|15586->9907|15616->9908|15657->9920|15687->9921|15750->9955|15780->9956|15835->9982|15865->9983|15901->9991|15930->9992|15963->9997|15992->9998|16026->10004|16079->10028|16109->10029|16141->10033|16294->10158|16323->10159|16354->10162|16410->10189|16440->10190|16472->10194|16548->10242|16577->10243|16608->10246|16651->10258
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|36->9|36->9|37->10|38->11|38->11|40->13|40->13|40->13|41->14|44->17|44->17|46->19|46->19|46->19|47->20|54->27|54->27|56->29|56->29|56->29|57->30|58->31|58->31|60->33|60->33|60->33|61->34|62->35|62->35|64->37|64->37|64->37|65->38|67->40|67->40|69->42|69->42|69->42|70->43|70->43|70->43|71->44|72->45|72->45|73->46|73->46|73->46|74->47|75->48|75->48|76->49|76->49|78->51|78->51|78->51|79->52|83->56|83->56|84->57|84->57|84->57|85->58|97->70|97->70|98->71|124->97|124->97|124->97|124->97|124->97|124->97|132->105|132->105|132->105|132->105|132->105|132->105|141->114|141->114|141->114|141->114|141->114|141->114|142->115|154->127|154->127|154->127|154->127|154->127|154->127|154->127|162->135|162->135|162->135|162->135|162->135|162->135|162->135|170->143|170->143|170->143|170->143|170->143|170->143|170->143|215->188|215->188|215->188|217->190|217->190|218->191|218->191|218->191|218->191|218->191|218->191|223->196|223->196|225->198|225->198|226->199|227->200|227->200|228->201|228->201|229->202|237->210|237->210|239->212|239->212|241->214|241->214|242->215|242->215|242->215|242->215|242->215|244->217|244->217|250->223|250->223|250->223|252->225|253->226|253->226|254->227|255->228|255->228|256->229|256->229|258->231|258->231|258->231|259->232|262->235|262->235|263->236|266->239|266->239|269->242|269->242|269->242|271->244|272->245|272->245|272->245|272->245|273->246|275->248|275->248|276->249|276->249|277->250|277->250|279->252|279->252|280->253|280->253|281->254|281->254|283->256|283->256|283->256|284->257|287->260|287->260|288->261|288->261|288->261|289->262|290->263|290->263|291->264|292->265
                  -- GENERATED --
              */
          