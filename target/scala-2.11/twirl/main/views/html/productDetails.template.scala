
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
object productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productId:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*3.1*/("""<script type="text/javascript">alert(productId)</script>
"""),_display_(/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
  """),format.raw/*5.3*/("""<div class="single-page main-grid-border">
		<div class="container">
			<ol class="breadcrumb" style="margin-bottom: 5px;">
				<li><a href="index.html">Home</a></li>
				<li><a href="all-classifieds.html">All Ads</a></li>
				<li class="active"><a href="mobiles.html">Mobiles</a></li>
				<li class="active">Mobile Phone</li>
			</ol>
			<div class="product-desc">
				<div class="col-md-7 product-view">
					<h2>Lorem Ipsum is simply dummy text of the printing and typesetting industry</h2>
					<p> <i class="glyphicon glyphicon-map-marker"></i><a href="#">state</a>, <a href="#">city</a>| Added at 06:55 pm, Ad ID: 987654321</p>
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="images/ss1.jpg">
								<img src="images/ss1.jpg" />
							</li>
							<li data-thumb="images/ss2.jpg">
								<img src="images/ss2.jpg" />
							</li>
							<li data-thumb="images/ss3.jpg">
								<img src="images/ss3.jpg" />
							</li>
						</ul>
					</div>
					<!-- FlexSlider -->
					  <script defer src="js/jquery.flexslider.js"></script>
					<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

						<script>
					// Can also be used with $(document).ready()
					$(window).load(function() """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
					  """),format.raw/*37.8*/("""$('.flexslider').flexslider("""),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""
						"""),format.raw/*38.7*/("""animation: "slide",
						controlNav: "thumbnails"
					  """),format.raw/*40.8*/("""}"""),format.raw/*40.9*/(""");
					"""),format.raw/*41.6*/("""}"""),format.raw/*41.7*/(""");
					</script>
					<!-- //FlexSlider -->
					<div class="product-details" id="product-details">
<!-- 						<h4>Brand : <a href="#">Company name</a></h4> -->
<!-- 						<h4>Views : <strong>150</strong></h4> -->
<!-- 						<p><strong>Display </strong>: 1.5 inch HD LCD Touch Screen</p> -->
<!-- 						<p><strong>Summary</strong> : It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.</p> -->
					
					</div>
				</div>
				<div class="col-md-5 product-details-grid">
					<div class="item-price" id="item-price">
<!-- 						<div class="product-price"> -->
<!-- 							<p class="p-price">Price</p> -->
<!-- 							<h3 class="rate">$ 259</h3> -->
<!-- 							<div class="clearfix"></div> -->
<!-- 						</div> -->
<!-- 						<div class="condition"> -->
<!-- 							<p class="p-price">Condition</p> -->
<!-- 							<h4>Good</h4> -->
<!-- 							<div class="clearfix"></div> -->
<!-- 						</div> -->
<!-- 						<div class="itemtype"> -->
<!-- 							<p class="p-price">Item Type</p> -->
<!-- 							<h4>Phones</h4> -->
<!-- 							<div class="clearfix"></div> -->
<!-- 						</div> -->
					</div>
					<div class="interested text-center">
						<h4>Interested in this Ad?<small> Contact the Seller!</small></h4>
						<p><i class="glyphicon glyphicon-earphone"></i>00-85-9875462655</p>
					</div>
						<div class="tips">
						<h4>Safety Tips for Buyers</h4>
							<ol>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
								<li><a href="#">Contrary to popular belief.</a></li>
							</ol>
						</div>
				</div>
			<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(document).ready(function () """),format.raw/*94.32*/("""{"""),format.raw/*94.33*/(""" 
		"""),format.raw/*95.3*/("""getRealEstateDetails();
	"""),format.raw/*96.2*/("""}"""),format.raw/*96.3*/(""");
	function getRealEstateDetails()"""),format.raw/*97.33*/("""{"""),format.raw/*97.34*/("""
		
		"""),format.raw/*99.3*/("""$.get("/getproductDetails?productId="""),_display_(/*99.40*/productId),format.raw/*99.49*/("""", function(data,status,xhr) """),format.raw/*99.78*/("""{"""),format.raw/*99.79*/("""
			
	   		"""),format.raw/*101.7*/("""$.each(data, function(i, item) """),format.raw/*101.38*/("""{"""),format.raw/*101.39*/("""
	   			"""),format.raw/*102.8*/("""$("#product-details").append("<h4>SqureFeet : <p>"+item.squreFeets+" </p></h4><h4>Floor No : <p>"+item.floorNo+"</p></h4><p><strong>Age of Property </strong>: "+item.propertyAge+"</p><p><strong>Food Allowed</strong> :"+item.foodType+"</p><p><strong>Toilet</strong> :"+item.toiletType+"</p><p><strong>Additional</strong> :"+item.product.price+"</p>")
	   			$("#item-price").append("<div class='product-price'><p class='p-price'>Price</p><h3 class='rate'>"+item.product.price+"</h3><div class='clearfix'></div></div><div class='condition'><p class='p-price'>Condition</p><h4>Good</h4><div class='clearfix'></div></div><div class='itemtype'><p class='p-price'>Item Type</p><h4>"+item.product.productType.productType+"</h4><div class='clearfix'></div></div>");
	   			
	   		"""),format.raw/*105.7*/("""}"""),format.raw/*105.8*/(""");
	   		
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""");
		
	"""),format.raw/*109.2*/("""}"""),format.raw/*109.3*/("""
	"""),format.raw/*110.2*/("""</script>
	""")))}))}
  }

  def render(productId:String): play.twirl.api.HtmlFormat.Appendable = apply(productId)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (productId) => apply(productId)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/productDetails.scala.html
                  HASH: 788546fe36c0ea2c6321a2f43c64029e2da87b08
                  MATRIX: 732->1|853->19|881->39|965->98|976->102|1013->103|1043->107|2357->1393|2386->1394|2422->1403|2478->1431|2507->1432|2542->1440|2629->1500|2657->1501|2693->1510|2721->1511|5140->3902|5169->3903|5201->3908|5254->3934|5282->3935|5346->3971|5375->3972|5410->3980|5474->4017|5504->4026|5561->4055|5590->4056|5631->4069|5691->4100|5721->4101|5758->4110|6561->4885|6590->4886|6632->4900|6661->4901|6698->4910|6727->4911|6758->4914
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|63->36|63->36|64->37|64->37|64->37|65->38|67->40|67->40|68->41|68->41|121->94|121->94|122->95|123->96|123->96|124->97|124->97|126->99|126->99|126->99|126->99|126->99|128->101|128->101|128->101|129->102|132->105|132->105|134->107|134->107|136->109|136->109|137->110
                  -- GENERATED --
              */
          