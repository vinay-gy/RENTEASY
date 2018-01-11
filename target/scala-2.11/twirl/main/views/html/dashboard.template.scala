
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
"""),format.raw/*3.1*/("""<style>
.ripple-container """),format.raw/*4.19*/("""{"""),format.raw/*4.20*/("""
    """),format.raw/*5.5*/("""position: absolute;
    top: 0;
    left: 0;
    z-index: 1;
    width: 100%;
    height: 100%;
    overflow: hidden;
    border-radius: inherit;
    pointer-events: none;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
"""),format.raw/*15.1*/(""".card .card-image img """),format.raw/*15.23*/("""{"""),format.raw/*15.24*/("""
    """),format.raw/*16.5*/("""width: 100%;
    border-radius: 6px;
    pointer-events: none;
    box-shadow: 0 5px 15px -8px rgba(0, 0, 0, 0.24), 0 8px 10px -5px rgba(0, 0, 0, 0.2);
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/(""".card img """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""
    """),format.raw/*22.5*/("""width: 100%;
    height: auto;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""),format.raw/*25.1*/("""img """),format.raw/*25.5*/("""{"""),format.raw/*25.6*/("""
    """),format.raw/*26.5*/("""vertical-align: middle;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/("""img """),format.raw/*29.5*/("""{"""),format.raw/*29.6*/("""
    """),format.raw/*30.5*/("""border: 0;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/(""".product-page .related-products """),format.raw/*32.33*/("""{"""),format.raw/*32.34*/("""
    """),format.raw/*33.5*/("""margin-top: 50px;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".card-product """),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""
    """),format.raw/*37.5*/("""margin-top: 30px;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
"""),format.raw/*39.1*/(""".card """),format.raw/*39.7*/("""{"""),format.raw/*39.8*/("""
    """),format.raw/*40.5*/("""display: inline-block;
    position: relative;
    width: 100%;
    margin-bottom: 30px;
    border-radius: 6px;
    color: rgba(0,0,0, 0.87);
    background: #fff;
    box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.14), 0 3px 1px -2px rgba(0, 0, 0, 0.2), 0 1px 5px 0 rgba(0, 0, 0, 0.12);
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
"""),format.raw/*49.1*/(""".card .card-image """),format.raw/*49.19*/("""{"""),format.raw/*49.20*/("""
    """),format.raw/*50.5*/("""height: 60%;
    position: relative;
    z-index: 1;
    margin-left: 15px;
    margin-right: 15px;
    margin-top: -30px;
    border-radius: 6px;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
"""),format.raw/*58.1*/(""".card .card-image .colored-shadow """),format.raw/*58.35*/("""{"""),format.raw/*58.36*/("""
    """),format.raw/*59.5*/("""transform: scale(0.94);
    top: 12px;
    filter: blur(12px);
    position: absolute;
    width: 100%;
    height: 100%;
    background-size: cover;
    z-index: -1;
    transition: opacity .45s;
    opacity: 0;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""
"""),format.raw/*70.1*/(""".card .card-content """),format.raw/*70.21*/("""{"""),format.raw/*70.22*/("""
    """),format.raw/*71.5*/("""padding: 15px 30px;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
"""),format.raw/*73.1*/(""".card-product .category """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
    """),format.raw/*74.5*/("""margin-bottom: 0;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/(""".card-product .card-title, .card-product .category, .card-product .card-description """),format.raw/*76.85*/("""{"""),format.raw/*76.86*/("""
    """),format.raw/*77.5*/("""text-align: center;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""
"""),format.raw/*79.1*/(""".text-rose """),format.raw/*79.12*/("""{"""),format.raw/*79.13*/("""
    """),format.raw/*80.5*/("""color: #e91e63;
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""

"""),format.raw/*83.1*/(""".card-product .category ~ .card-title """),format.raw/*83.39*/("""{"""),format.raw/*83.40*/("""
    """),format.raw/*84.5*/("""margin-top: 0;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""
"""),format.raw/*86.1*/(""".card-product .card-title, .card-product .category, .card-product .card-description """),format.raw/*86.85*/("""{"""),format.raw/*86.86*/("""
    """),format.raw/*87.5*/("""text-align: center;
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
"""),format.raw/*89.1*/(""".card-product .card-title, .card-product .category, .card-product .card-description """),format.raw/*89.85*/("""{"""),format.raw/*89.86*/("""
    """),format.raw/*90.5*/("""text-align: center;
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""
"""),format.raw/*92.1*/(""".description, .card-description, .footer-big p """),format.raw/*92.48*/("""{"""),format.raw/*92.49*/("""
    """),format.raw/*93.5*/("""color: #999999;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""
"""),format.raw/*95.1*/(""".card-product .footer """),format.raw/*95.23*/("""{"""),format.raw/*95.24*/("""
    """),format.raw/*96.5*/("""margin-top: 5px;
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""



"""),format.raw/*101.1*/("""</style>
<script type = "text/javascript" >
         history.pushState(null, null, '/');
         window.addEventListener('popstate', function(event) """),format.raw/*104.62*/("""{"""),format.raw/*104.63*/("""
         """),format.raw/*105.10*/("""history.pushState(null, null, '/');
         """),format.raw/*106.10*/("""}"""),format.raw/*106.11*/(""");
      </script>
      
			<div class="categories">
				<div class="container">
					<div class="col-md-2 focus-grid">
						<a href="/categories">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-mobile"></i></div>
									<h4 class="clrchg">Mobiles</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab2">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-laptop"></i></div>
									<h4 class="clrchg"> Electronics & Appliances</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab3">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-car"></i></div>
									<h4 class="clrchg">Cars</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab4">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-motorcycle"></i></div>
									<h4 class="clrchg">Bikes</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab5">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-wheelchair"></i></div>
									<h4 class="clrchg">Furnitures</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab6">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-paw"></i></div>
									<h4 class="clrchg">Pets</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab7">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-book"></i></div>
									<h4 class="clrchg">Books, Sports & Hobbies</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab8">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-asterisk"></i></div>
									<h4 class="clrchg">Fashion</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab9">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-gamepad"></i></div>
									<h4 class="clrchg">Kids</h4>
								</div>
							</div>
						</a>
					</div>	
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab10">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-shield"></i></div>
									<h4 class="clrchg">Services</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab11">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-at"></i></div>
									<h4 class="clrchg">Jobs</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="col-md-2 focus-grid">
						<a href="categories.html#parentVerticalTab12">
							<div class="focus-border">
								<div class="focus-layout">
									<div class="focus-image"><i class="fa fa-home"></i></div>
									<h4 class="clrchg">Real Estate</h4>
								</div>
							</div>
						</a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="trending-ads">
				<div class="container">
				<!-- slider -->
				<div class="trend-ads">
					<h2>Trending Ads</h2>
							<div class="related-products">
				

				<div class="row">
					<div class="col-sm-6 col-md-3">
						<div class="card card-product">
							<div class="card-image">
								<a href="#pablo">
									<img class="img" src=""""),_display_(/*247.33*/routes/*247.39*/.Assets.at("theme/images/bk1.jpg")),format.raw/*247.73*/("""">
								</a>
							<div class="colored-shadow" style="background-image: url("""),_display_(/*249.66*/routes/*249.72*/.Assets.at("theme/img/bk1.jpg")),format.raw/*249.103*/("""); opacity: 1;"></div></div>
                            <div class="ripple-container"></div>
							<div class="card-content">
								<h6 class="category text-rose">Trending</h6>
								<h4 class="card-title">
									<a href="#pablo">Dolce &amp; Gabbana</a>
								</h4>
								<div class="card-description">
									Dolce &amp; Gabbana's 'Greta' tote has been crafted in Italy from hard-wearing red textured-leather.
								</div>
								<div class="footer">
	                                <div class="price">
										<h4>$1,459</h4>
									</div>
	                            	<div class="stats">
										<button type="button" rel="tooltip" title="" class="btn btn-just-icon btn-simple btn-rose" data-original-title="Saved to Wishlist">
											<i class="material-icons">favorite</i>
										</button>
	                            	</div>
	                            </div>

							</div>

						</div>
					</div>

					<div class="col-sm-6 col-md-3">
						<div class="card card-product">
							<div class="card-image">
								<a href="#pablo">
									<img class="img" src=""""),_display_(/*279.33*/routes/*279.39*/.Assets.at("theme/images/m4.jpg")),format.raw/*279.72*/("""">
								</a>
							<div class="colored-shadow" style="background-image: url("""),_display_(/*281.66*/routes/*281.72*/.Assets.at("theme/images/m4.jpg")),format.raw/*281.105*/("""); opacity: 1;"></div></div>

							<div class="card-content">
								<h6 class="category text-muted">Popular</h6>
								<h4 class="card-title">
									<a href="#pablo">Balmain</a>
								</h4>
								<div class="card-description">
									Balmain's mid-rise skinny jeans are cut with stretch to ensure they retain their second-skin fit but move comfortably.
								</div>
								<div class="footer">
	                                <div class="price">
										<h4>$459</h4>
									</div>
	                            	<div class="stats">
										<button type="button" rel="tooltip" title="" class="btn btn-just-icon btn-simple btn-default" data-original-title="Save to Wishlist">
											<i class="material-icons">favorite</i>
										</button>
	                            	</div>
	                            </div>

							</div>

						</div>
					</div>

					<div class="col-sm-6 col-md-3">
						<div class="card card-product">
							<div class="card-image">
								<a href="#pablo">
									<img class="img" src=""""),_display_(/*311.33*/routes/*311.39*/.Assets.at("theme/images/bk1.jpg")),format.raw/*311.73*/("""">
								</a>
							<div class="colored-shadow" style="background-image: url("""),_display_(/*313.66*/routes/*313.72*/.Assets.at("theme/images/bk1.jpg")),format.raw/*313.106*/("""); opacity: 1;"></div></div>

							<div class="card-content">
								<h6 class="category text-muted">Popular</h6>
								<h4 class="card-title">
									<a href="#pablo">Balenciaga</a>
								</h4>
								<div class="card-description">
									Balenciaga's black textured-leather wallet is finished with the label's iconic 'Giant' studs. This is where you can...
								</div>
								<div class="footer">
	                                <div class="price">
										<h4>$590</h4>
									</div>
	                            	<div class="stats">
										<button type="button" rel="tooltip" title="" class="btn btn-just-icon btn-simple btn-rose" data-original-title="Saved to Wishlist">
											<i class="material-icons">favorite</i>
										</button>
	                            	</div>
	                            </div>
							</div>
						</div>
					</div>

					<div class="col-sm-6 col-md-3">
						<div class="card card-product">
							<div class="card-image">
								<a href="#pablo">
									<img class="img" src=""""),_display_(/*341.33*/routes/*341.39*/.Assets.at("theme/images/bk1.jpg")),format.raw/*341.73*/("""">
								</a>
							<div class="colored-shadow" style="background-image: url("""),_display_(/*343.66*/routes/*343.72*/.Assets.at("theme/images/bk1.jpg")),format.raw/*343.106*/("""); opacity: 1;"></div></div>

							<div class="card-content">
								<h6 class="category text-rose">Trending</h6>
								<h4 class="card-title">
									<a href="#pablo">Dolce &amp; Gabbana</a>
								</h4>
								<div class="card-description">
									Dolce &amp; Gabbana's 'Greta' tote has been crafted in Italy from hard-wearing red textured-leather.
								</div>
								<div class="footer">
	                                <div class="price">
										<h4>$1,459</h4>
									</div>
	                            	<div class="stats">
										<button type="button" rel="tooltip" title="" class="btn btn-just-icon btn-simple btn-default" data-original-title="Save to Wishlist">
											<i class="material-icons">favorite</i>
										</button>
	                            	</div>
	                            </div>

							</div>

						</div>
					</div>

				</div>
			</div>
						 <script type="text/javascript" src=""""),_display_(/*371.45*/routes/*371.51*/.Assets.at("theme/js/jquery.flexisel.js")),format.raw/*371.92*/(""""></script>
					<script type="text/javascript">
					
					 $(window).load(function() """),format.raw/*374.33*/("""{"""),format.raw/*374.34*/("""
						"""),format.raw/*375.7*/("""$("#flexiselDemo3").flexisel("""),format.raw/*375.36*/("""{"""),format.raw/*375.37*/("""
							"""),format.raw/*376.8*/("""visibleItems:1,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 5000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
							responsiveBreakpoints: """),format.raw/*382.31*/("""{"""),format.raw/*382.32*/(""" 
								"""),format.raw/*383.9*/("""portrait: """),format.raw/*383.19*/("""{"""),format.raw/*383.20*/(""" 
									"""),format.raw/*384.10*/("""changePoint:480,
									visibleItems:1
								"""),format.raw/*386.9*/("""}"""),format.raw/*386.10*/(""", 
								landscape: """),format.raw/*387.20*/("""{"""),format.raw/*387.21*/(""" 
									"""),format.raw/*388.10*/("""changePoint:640,
									visibleItems:1
								"""),format.raw/*390.9*/("""}"""),format.raw/*390.10*/(""",
								tablet: """),format.raw/*391.17*/("""{"""),format.raw/*391.18*/(""" 
									"""),format.raw/*392.10*/("""changePoint:768,
									visibleItems:1
								"""),format.raw/*394.9*/("""}"""),format.raw/*394.10*/("""
							"""),format.raw/*395.8*/("""}"""),format.raw/*395.9*/("""
						"""),format.raw/*396.7*/("""}"""),format.raw/*396.8*/(""");
						
					"""),format.raw/*398.6*/("""}"""),format.raw/*398.7*/(""");
				   </script>
					  
					</div>   
			</div>
			<!-- slider				 -->
			</div>


""")))}),format.raw/*407.2*/("""

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/dashboard.scala.html
                  HASH: b046ae0cd0cac78d13bc3a9cebef907f7fcf1743
                  MATRIX: 802->3|813->7|850->8|878->10|932->37|960->38|992->44|1200->225|1228->226|1257->228|1307->250|1336->251|1369->257|1552->413|1580->414|1609->416|1647->426|1676->427|1709->433|1769->466|1797->467|1826->469|1857->473|1885->474|1918->480|1970->505|1998->506|2029->510|2060->514|2088->515|2121->521|2160->533|2188->534|2217->536|2277->568|2306->569|2339->575|2385->594|2413->595|2444->599|2486->613|2515->614|2548->620|2594->639|2622->640|2651->642|2684->648|2712->649|2745->655|3062->945|3090->946|3119->948|3165->966|3194->967|3227->973|3408->1127|3436->1128|3465->1130|3527->1164|3556->1165|3589->1171|3839->1394|3867->1395|3896->1397|3944->1417|3973->1418|4006->1424|4054->1445|4082->1446|4111->1448|4163->1472|4192->1473|4225->1479|4271->1498|4299->1499|4328->1501|4440->1585|4469->1586|4502->1592|4550->1613|4578->1614|4607->1616|4646->1627|4675->1628|4708->1634|4752->1651|4780->1652|4811->1656|4877->1694|4906->1695|4939->1701|4982->1717|5010->1718|5039->1720|5151->1804|5180->1805|5213->1811|5261->1832|5289->1833|5318->1835|5430->1919|5459->1920|5492->1926|5540->1947|5568->1948|5597->1950|5672->1997|5701->1998|5734->2004|5778->2021|5806->2022|5835->2024|5885->2046|5914->2047|5947->2053|5992->2071|6020->2072|6056->2080|6238->2233|6268->2234|6308->2245|6383->2291|6413->2292|10958->6809|10974->6815|11030->6849|11141->6932|11157->6938|11211->6969|12376->8106|12392->8112|12447->8145|12558->8228|12574->8234|12630->8267|13737->9346|13753->9352|13809->9386|13920->9469|13936->9475|13993->9509|15097->10585|15113->10591|15169->10625|15280->10708|15296->10714|15353->10748|16354->11721|16370->11727|16433->11768|16552->11858|16582->11859|16618->11867|16676->11896|16706->11897|16743->11906|16979->12113|17009->12114|17048->12125|17087->12135|17117->12136|17158->12148|17237->12199|17267->12200|17319->12223|17349->12224|17390->12236|17469->12287|17499->12288|17547->12307|17577->12308|17618->12320|17697->12371|17727->12372|17764->12381|17793->12382|17829->12390|17858->12391|17903->12408|17932->12409|18061->12507
                  LINES: 29->2|29->2|29->2|30->3|31->4|31->4|32->5|41->14|41->14|42->15|42->15|42->15|43->16|47->20|47->20|48->21|48->21|48->21|49->22|51->24|51->24|52->25|52->25|52->25|53->26|54->27|54->27|56->29|56->29|56->29|57->30|58->31|58->31|59->32|59->32|59->32|60->33|61->34|61->34|63->36|63->36|63->36|64->37|65->38|65->38|66->39|66->39|66->39|67->40|75->48|75->48|76->49|76->49|76->49|77->50|84->57|84->57|85->58|85->58|85->58|86->59|96->69|96->69|97->70|97->70|97->70|98->71|99->72|99->72|100->73|100->73|100->73|101->74|102->75|102->75|103->76|103->76|103->76|104->77|105->78|105->78|106->79|106->79|106->79|107->80|108->81|108->81|110->83|110->83|110->83|111->84|112->85|112->85|113->86|113->86|113->86|114->87|115->88|115->88|116->89|116->89|116->89|117->90|118->91|118->91|119->92|119->92|119->92|120->93|121->94|121->94|122->95|122->95|122->95|123->96|124->97|124->97|128->101|131->104|131->104|132->105|133->106|133->106|274->247|274->247|274->247|276->249|276->249|276->249|306->279|306->279|306->279|308->281|308->281|308->281|338->311|338->311|338->311|340->313|340->313|340->313|368->341|368->341|368->341|370->343|370->343|370->343|398->371|398->371|398->371|401->374|401->374|402->375|402->375|402->375|403->376|409->382|409->382|410->383|410->383|410->383|411->384|413->386|413->386|414->387|414->387|415->388|417->390|417->390|418->391|418->391|419->392|421->394|421->394|422->395|422->395|423->396|423->396|425->398|425->398|434->407
                  -- GENERATED --
              */
          