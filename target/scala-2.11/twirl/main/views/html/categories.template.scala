
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
object categories extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*3.47*/routes/*3.53*/.Assets.at("theme/css/easy-responsive-tabs.css")),format.raw/*3.101*/("""" />
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.at("theme/js/easyResponsiveTabs.js")),format.raw/*4.65*/(""""></script>	
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js"></script> -->
<div class="categories-section main-grid-border" ng-app="createAd" ng-controller="createAdCtrl">
		<div class="container">
		
			<h2 class="head">Main Categories</h2>
			<div class="category-list">
				<div id="parentVerticalTab" >
					<ul class="resp-tabs-list hor_1" id="categories">
					
<!-- 					<li ng-repeat="x in categoryList">"""),format.raw/*14.45*/("""{"""),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""x.category"""),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""}"""),format.raw/*14.59*/("""</li> -->
<!-- 						<li>Mobiles</li> -->
<!-- 						<li>Electronics & Appliances</li> -->
<!-- 						<li>Cars</li> -->
<!-- 						<li>Bikes</li> -->
<!-- 						<li>Furniture</li> -->
<!-- 						<li>Pets</li> -->
<!-- 						<li>Books, Sports & Hobbies</li> -->
<!-- 						<li>Fashion</li> -->
<!-- 						<li>Kids</li> -->
<!-- 						<li>Services</li> -->
<!-- 						<li>Jobs</li> -->
<!-- 						<li>Real Estate</li> -->
<!-- 						<a href="all-classifieds.html">All Ads</a> -->
					</ul>
					<div class="resp-tabs-container hor_1" id="sub-categories">
<!-- 						<span class="active total" style="display:block;" data-toggle="modal" data-target="#myModal"><strong>All USA</strong> (Select your city to see local ads)</span> -->
						
<!-- 						<div> 
<!-- 							<div class="category"> -->
<!-- 								<div class="category-img"> -->
<!-- 									<img src="images/cat12.png" title="image" alt="" /> -->
<!-- 								</div> -->
<!-- 								<div class="category-info"> -->
<!-- 									<h4>Real Estate</h4> -->
<!-- 									<span>98,156 Ads</span> -->
<!-- 									<a href="all-classifieds.html">View all Ads</a> -->
<!-- 								</div> -->
<!-- 								<div class="clearfix"></div> -->
<!-- 							</div> -->
<!-- 							<div class="sub-categories" > -->
<!-- 								<ul> -->
<!-- 									<li><a href="/getrealestate">Houses</a></li> --> 
<!--  									<li><a href="real-estate.html">Apartments</a></li> --> 
<!--  									<li><a href="real-estate.html">PG & Roommates</a></li> --> 
<!--  									<li><a href="real-estate.html">Land & Plots</a></li> --> 
<!-- 									<li><a href="real-estate.html">Shops - Offices - Commercial Space</a></li> --> 
<!--  									<li><a href="real-estate.html">Vacation Rentals - Guest Houses</a></li> --> 
<!-- 									<div class="clearfix"></div> -->
<!-- 								</ul> -->
<!-- 							</div> -->
 						</div> 
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>

	 <script src=""""),_display_(/*63.17*/routes/*63.23*/.Assets.at("angularjs/createAd.js")),format.raw/*63.58*/(""""></script>
	<script type="text/javascript">
    $(document).ready(function() """),format.raw/*65.34*/("""{"""),format.raw/*65.35*/("""
    	"""),format.raw/*66.6*/("""loadCategory();
        //Vertical Tab
//         $('#parentVerticalTab').easyResponsiveTabs("""),format.raw/*68.55*/("""{"""),format.raw/*68.56*/("""
"""),format.raw/*69.1*/("""//             type: 'vertical', //Types: default, vertical, accordion
//             width: 'auto', //auto or any width like 600px
//             fit: true, // 100% fit in a container
//             closed: 'accordion', // Start closed if in accordion view
//             tabidentify: 'hor_1', // The tab groups identifier
//             activate: function(event) """),format.raw/*74.42*/("""{"""),format.raw/*74.43*/(""" """),format.raw/*74.44*/("""// Callback function if tab is switched
//                 var $tab = $(this);
//                 var $info = $('#nested-tabInfo2');
//                 var $name = $('span', $info);
//                 $name.text($tab.text());
//                 $info.show();
//             """),format.raw/*80.16*/("""}"""),format.raw/*80.17*/("""
"""),format.raw/*81.1*/("""//         """),format.raw/*81.12*/("""}"""),format.raw/*81.13*/(""");
       
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""");
   
    function loadCategory()"""),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
    	
    	"""),format.raw/*87.6*/("""$.get("/category/list", function(data,status,xhr) """),format.raw/*87.56*/("""{"""),format.raw/*87.57*/("""
    		
    		
    			 """),format.raw/*90.9*/("""$.each(data, function(i, item) """),format.raw/*90.40*/("""{"""),format.raw/*90.41*/("""
    	       	     """),format.raw/*91.19*/("""$("#categories").append("<li value='"+item.id+"' onclick='getAdDetails("+item.id+")'>"+item.category+"</li>");
    	       	  
    	       		"""),format.raw/*93.15*/("""}"""),format.raw/*93.16*/(""");
    	    	
       		
    			   $('#parentVerticalTab').easyResponsiveTabs("""),format.raw/*96.54*/("""{"""),format.raw/*96.55*/("""
    		            """),format.raw/*97.19*/("""type: 'vertical', //Types: default, vertical, accordion
    		            width: 'auto', //auto or any width like 600px
    		            fit: true, // 100% fit in a container
    		            closed: 'accordion', // Start closed if in accordion view
    		            tabidentify: 'hor_1', // The tab groups identifier
    		            activate: function(event) """),format.raw/*102.45*/("""{"""),format.raw/*102.46*/(""" """),format.raw/*102.47*/("""// Callback function if tab is switched
    		                var $tab = $(this);
    		                var $info = $('#nested-tabInfo2');
    		                var $name = $('span', $info);
    		                $name.text($tab.text());
    		                $info.show();
    		            """),format.raw/*108.19*/("""}"""),format.raw/*108.20*/("""
    		        """),format.raw/*109.15*/("""}"""),format.raw/*109.16*/(""");
    			   
    			   
    	"""),format.raw/*112.6*/("""}"""),format.raw/*112.7*/(""");
    	
    """),format.raw/*114.5*/("""}"""),format.raw/*114.6*/("""
    
    
    
    """),format.raw/*118.5*/("""function getAdDetails(id)"""),format.raw/*118.30*/("""{"""),format.raw/*118.31*/("""
    	"""),format.raw/*119.6*/("""$("#sub-categories").load("/getAdDetails?categoryId="+id);
    	//window.location.href ="/getrealestate?productId=" + Id;
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""
"""),format.raw/*122.1*/("""</script>
""")))}),format.raw/*123.2*/("""

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:40 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/categories.scala.html
                  HASH: 74ed251691abd286571a34502f18f3d9f7a4cd3d
                  MATRIX: 803->3|814->7|851->8|879->10|951->56|965->62|1034->110|1080->130|1094->136|1158->180|1645->639|1674->640|1703->641|1741->651|1770->652|1799->653|3838->2665|3853->2671|3909->2706|4017->2786|4046->2787|4080->2794|4203->2889|4232->2890|4261->2892|4659->3262|4688->3263|4717->3264|5025->3544|5054->3545|5083->3547|5122->3558|5151->3559|5195->3576|5223->3577|5287->3613|5316->3614|5357->3628|5435->3678|5464->3679|5517->3705|5576->3736|5605->3737|5653->3757|5824->3900|5853->3901|5961->3981|5990->3982|6038->4002|6437->4372|6467->4373|6497->4374|6824->4672|6854->4673|6899->4689|6929->4690|6990->4723|7019->4724|7062->4739|7091->4740|7143->4764|7197->4789|7227->4790|7262->4797|7418->4925|7447->4926|7477->4928|7520->4940
                  LINES: 29->2|29->2|29->2|30->3|30->3|30->3|30->3|31->4|31->4|31->4|41->14|41->14|41->14|41->14|41->14|41->14|90->63|90->63|90->63|92->65|92->65|93->66|95->68|95->68|96->69|101->74|101->74|101->74|107->80|107->80|108->81|108->81|108->81|110->83|110->83|112->85|112->85|114->87|114->87|114->87|117->90|117->90|117->90|118->91|120->93|120->93|123->96|123->96|124->97|129->102|129->102|129->102|135->108|135->108|136->109|136->109|139->112|139->112|141->114|141->114|145->118|145->118|145->118|146->119|148->121|148->121|149->122|150->123
                  -- GENERATED --
              */
          