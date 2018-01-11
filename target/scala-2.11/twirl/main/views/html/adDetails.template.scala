
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
object adDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categoryId:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<div class="total-ads main-grid-border">
		<div class="container">
			<div class="select-box" style="width:68%">
				
				<div class="browse-category ads-list">
					<label>Sub Categories</label>
					<select class="selectpicker show-tick" data-live-search="true" id="subCategories" onchange="productType()" style="width:85%">
<!-- 					  <option data-tokens="Real Estate">Real Estate</option> -->
<!-- 					  <option data-tokens="Mobiles">Mobiles</option> -->
<!-- 					  <option data-tokens="Electronics & Appliances">Electronics & Appliances</option> -->
<!-- 					  <option data-tokens="Cars">Cars</option> -->
<!-- 					  <option data-tokens="Bikes">Bikes</option> -->
<!-- 					  <option data-tokens="Furniture">Furniture</option> -->
<!-- 					  <option data-tokens="Pets">Pets</option> -->
<!-- 					  <option data-tokens="Books, Sports & Hobbies">Books, Sports & Hobbies</option> -->
<!-- 					  <option data-tokens="Fashion">Fashion</option> -->
<!-- 					  <option data-tokens="Kids">Kids</option> -->
<!-- 					  <option data-tokens="Services">Services</option> -->
<!-- 					  <option data-tokens="Jobs">Jobs</option> -->
					</select>
				</div>
				<div class="search-product ads-list">
					<label>Search for a specific product</label>
					<select class="selectpicker show-tick" data-live-search="true" id="productType" style="width:85%">
					
					</select>
<!-- 					<div class="search"> -->
<!-- 						<div id="custom-search-input"> -->
<!-- 						<div class="input-group"> -->
<!-- 							<input type="text" class="form-control input-lg" placeholder="Buscar" /> -->
<!-- 							<span class="input-group-btn"> -->
<!-- 								<button class="btn btn-info btn-lg" type="button"> -->
<!-- 									<i class="glyphicon glyphicon-search"></i> -->
<!-- 								</button> -->
<!-- 							</span> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 					</div> -->
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="ads-grid">
				
				<div class="ads-display col-md-9">
					<div class="wrapper">					
<!-- 					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs"> -->
<!-- 					  <ul id="myTab" class="nav nav-tabs nav-tabs-responsive" role="tablist"> -->
<!-- 						<li role="presentation" class="active"> -->
<!-- 						  <a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"> -->
<!-- 							<span class="text">All Ads</span> -->
<!-- 						  </a> -->
<!-- 						</li> -->
<!-- 						<li role="presentation" class="active"> -->
<!-- 						  <a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"> -->
<!-- 							<span class="text">Ads with Photos</span> -->
<!-- 						  </a> -->
<!-- 						</li> -->
<!-- 					  </ul> -->
					  <div id="myTabContent" class="tab-content" style="margin-right:9%;">
						
						<div role="tabpanel" class="tab-pane fade in active" id="profile" aria-labelledby="profile-tab">
						 <div>
												<div id="container">
								<div class="view-controls-list" id="viewcontrols">
									<label>view :</label>
									<a class="gridview"><i class="glyphicon glyphicon-th"></i></a>
									<a class="listview active"><i class="glyphicon glyphicon-th-list"></i></a>
								</div>
								<div class="sort">
								   <div class="sort-by">
										<label>Sort By : </label>
										<select>
														<option value="">Most recent</option>
														<option value="">Price: Rs Low to High</option>
														<option value="">Price: Rs High to Low</option>
										</select>
									   </div>
									 </div>
								<div class="clearfix"></div>
							<ul class="list" id="list">
								<a href="single.html">
<!-- 									<li> -->
<!-- 									<img src="images/r1.jpg" title="" alt="" /> -->
<!-- 									<section class="list-left"> -->
<!-- 									<h5 class="title" id="title"></h5> -->
<!-- 									<span class="adprice" id="adprice"></span> -->
<!-- 									<p class="catpath">Real Estate � PG & Roommates</p> -->
<!-- 									</section> -->
<!-- 									<section class="list-right"> -->
<!-- 									<span class="date" id="date"></span> -->
<!-- 									<span class="cityname" id="cityname"></span> -->
<!-- 									</section> -->
<!-- 									<div class="clearfix"></div> -->
<!-- 									</li>  -->
								</a>
								
							</ul>
						</div>
							</div>
						</div>
						<ul class="pagination pagination-sm">
							<li><a href="#">Prev</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">6</a></li>
							<li><a href="#">7</a></li>
							<li><a href="#">8</a></li>
							<li><a href="#">Next</a></li>
						</ul>
					  </div>
					</div>
				</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>	
<!-- 	</div> -->
	
	<script type="text/javascript">
$(document).ready(function () """),format.raw/*124.31*/("""{"""),format.raw/*124.32*/("""    
"""),format.raw/*125.1*/("""var elem=$('#container ul');      
	$('#viewcontrols a').on('click',function(e) """),format.raw/*126.46*/("""{"""),format.raw/*126.47*/("""
		"""),format.raw/*127.3*/("""if ($(this).hasClass('gridview')) """),format.raw/*127.37*/("""{"""),format.raw/*127.38*/("""
			"""),format.raw/*128.4*/("""elem.fadeOut(1000, function () """),format.raw/*128.35*/("""{"""),format.raw/*128.36*/("""
				"""),format.raw/*129.5*/("""$('#container ul').removeClass('list').addClass('grid');
				$('#viewcontrols').removeClass('view-controls-list').addClass('view-controls-grid');
				$('#viewcontrols .gridview').addClass('active');
				$('#viewcontrols .listview').removeClass('active');
				elem.fadeIn(1000);
			"""),format.raw/*134.4*/("""}"""),format.raw/*134.5*/(""");						
		"""),format.raw/*135.3*/("""}"""),format.raw/*135.4*/("""
		"""),format.raw/*136.3*/("""else if($(this).hasClass('listview')) """),format.raw/*136.41*/("""{"""),format.raw/*136.42*/("""
			"""),format.raw/*137.4*/("""elem.fadeOut(1000, function () """),format.raw/*137.35*/("""{"""),format.raw/*137.36*/("""
				"""),format.raw/*138.5*/("""$('#container ul').removeClass('grid').addClass('list');
				$('#viewcontrols').removeClass('view-controls-grid').addClass('view-controls-list');
				$('#viewcontrols .gridview').removeClass('active');
				$('#viewcontrols .listview').addClass('active');
				elem.fadeIn(1000);
			"""),format.raw/*143.4*/("""}"""),format.raw/*143.5*/(""");									
		"""),format.raw/*144.3*/("""}"""),format.raw/*144.4*/("""
	"""),format.raw/*145.2*/("""}"""),format.raw/*145.3*/(""");
	subcategory();
	adDetails();
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/(""");

function subcategory() """),format.raw/*150.24*/("""{"""),format.raw/*150.25*/("""
	"""),format.raw/*151.2*/("""$("#subCategories").empty();
	$.get("/subcategory/"""),_display_(/*152.23*/categoryId),format.raw/*152.33*/("""", function(data,status,xhr) """),format.raw/*152.62*/("""{"""),format.raw/*152.63*/("""
		"""),format.raw/*153.3*/("""$("#subCategories").append("<option value=''>Select Subcategory</option>");
		$.each(data, function(i, item) """),format.raw/*154.34*/("""{"""),format.raw/*154.35*/("""
			"""),format.raw/*155.4*/("""//alert(item.subCategory);
			$("#subCategories").append("<option data-tokens='"+item.subCategory+"' value='"+item.id+"'>"+item.subCategory+"</option>");
			//$("#sub-categories").append("<div><div class='sub-categories'><ul><li><a href='javascript:getDetails()'>"+item.subCategory+"</a></li></ul></div></div>")
			
		"""),format.raw/*159.3*/("""}"""),format.raw/*159.4*/(""");
		
		 
	"""),format.raw/*162.2*/("""}"""),format.raw/*162.3*/(""");
    
"""),format.raw/*164.1*/("""}"""),format.raw/*164.2*/("""

"""),format.raw/*166.1*/("""function productType() """),format.raw/*166.24*/("""{"""),format.raw/*166.25*/("""
	"""),format.raw/*167.2*/("""var id = $("#subCategories").val();
	$("#productType").empty();
	$("#productType").append("<option value=''>Select ProductType</option>");
	$.get("/producttype/"+id, function(data,status,xhr) """),format.raw/*170.54*/("""{"""),format.raw/*170.55*/("""
		
		"""),format.raw/*172.3*/("""$.each(data, function(i, item) """),format.raw/*172.34*/("""{"""),format.raw/*172.35*/("""
			"""),format.raw/*173.4*/("""//alert(item.subCategory);
			$("#productType").append("<option data-tokens='"+item.subCategory+"'>"+item.productType+"</option>");
			//$("#sub-categories").append("<div><div class='sub-categories'><ul><li><a href='javascript:getDetails()'>"+item.subCategory+"</a></li></ul></div></div>")
			
		"""),format.raw/*177.3*/("""}"""),format.raw/*177.4*/(""");
		
		 
	"""),format.raw/*180.2*/("""}"""),format.raw/*180.3*/(""");
    
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/("""

"""),format.raw/*184.1*/("""function adDetails()"""),format.raw/*184.21*/("""{"""),format.raw/*184.22*/("""
	"""),format.raw/*185.2*/("""$.get("/getRealEstateDetails?productTypeId="""),_display_(/*185.46*/categoryId),format.raw/*185.56*/("""", function(data,status,xhr) """),format.raw/*185.85*/("""{"""),format.raw/*185.86*/("""
		
   		"""),format.raw/*187.6*/("""$.each(data, function(i, item) """),format.raw/*187.37*/("""{"""),format.raw/*187.38*/("""
   			"""),format.raw/*188.7*/("""//alert(item.title);
   			//document.getElementById("title").value=item.title;
   			//alert(item.title)
   			//for(int j=0;j<=i)
    			var date=convert(item.postedDate);
//    			$("#title").text(item.title);
//    			$("#adprice").text(item.price);
//    			$("#date").text(date);
//    			$("#cityname").text(item.city);
   			//var id=1;
   			//var cat="hii ";
   			$("#list").append("<a href=javascript:getProductDetails("+item.id+","+item.categories.id+")><li><img src='"+item.imagePath+"' title='' alt=''' /><section class='list-left'><h5 class='title'>"+item.title+"</h5><span class='adprice'>"+item.price+"</span><p class='catpath'>Real Estate � PG & Roommates</p></section><section class='list-right'><span class='date'>"+date+"</span><span class='cityname'></span></section><div class='clearfix'></div></li></a>");
   			
   		"""),format.raw/*201.6*/("""}"""),format.raw/*201.7*/(""");
   		
	"""),format.raw/*203.2*/("""}"""),format.raw/*203.3*/(""");
	
"""),format.raw/*205.1*/("""}"""),format.raw/*205.2*/("""
"""),format.raw/*206.1*/("""function getProductDetails(Id,category)"""),format.raw/*206.40*/("""{"""),format.raw/*206.41*/("""
	
	"""),format.raw/*208.2*/("""if(category =="10")"""),format.raw/*208.21*/("""{"""),format.raw/*208.22*/("""
		"""),format.raw/*209.3*/("""alert(category =="10");
	window.location.href ="/productDetails?productId=" + Id;
	"""),format.raw/*211.2*/("""}"""),format.raw/*211.3*/("""
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""
"""),format.raw/*213.1*/("""function convert(str) """),format.raw/*213.23*/("""{"""),format.raw/*213.24*/("""

	"""),format.raw/*215.2*/("""var datePosted = new Date(str);
	var dd = datePosted.getDate();
	var mm = datePosted.getMonth() + 1;
	var y = datePosted.getFullYear();
	var retVal = y + '-' + mm + '-' + dd;
	var posted = retVal + datePosted.getHours() + ":"
			+ datePosted.getMinutes() + ":" + datePosted.getSeconds();
	return posted;

"""),format.raw/*224.1*/("""}"""),format.raw/*224.2*/("""
"""),format.raw/*225.1*/("""</script>
"""))}
  }

  def render(categoryId:String): play.twirl.api.HtmlFormat.Appendable = apply(categoryId)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (categoryId) => apply(categoryId)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:40 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/adDetails.scala.html
                  HASH: efb07ee2b9d3f921d67afc4187dc3f50e02cf90b
                  MATRIX: 727->1|834->20|862->22|6006->5137|6036->5138|6070->5144|6180->5225|6210->5226|6242->5230|6305->5264|6335->5265|6368->5270|6428->5301|6458->5302|6492->5308|6806->5594|6835->5595|6875->5607|6904->5608|6936->5612|7003->5650|7033->5651|7066->5656|7126->5687|7156->5688|7190->5694|7504->5980|7533->5981|7576->5996|7605->5997|7636->6000|7665->6001|7729->6037|7758->6038|7816->6067|7846->6068|7877->6071|7957->6123|7989->6133|8047->6162|8077->6163|8109->6167|8248->6277|8278->6278|8311->6283|8661->6605|8690->6606|8732->6620|8761->6621|8799->6631|8828->6632|8860->6636|8912->6659|8942->6660|8973->6663|9197->6858|9227->6859|9263->6867|9323->6898|9353->6899|9386->6904|9714->7204|9743->7205|9785->7219|9814->7220|9852->7230|9881->7231|9913->7235|9962->7255|9992->7256|10023->7259|10095->7303|10127->7313|10185->7342|10215->7343|10254->7354|10314->7385|10344->7386|10380->7394|11264->8250|11293->8251|11333->8263|11362->8264|11397->8271|11426->8272|11456->8274|11524->8313|11554->8314|11588->8320|11636->8339|11666->8340|11698->8344|11811->8429|11840->8430|11870->8432|11899->8433|11929->8435|11980->8457|12010->8458|12043->8463|12385->8777|12414->8778|12444->8780
                  LINES: 26->1|29->1|30->2|152->124|152->124|153->125|154->126|154->126|155->127|155->127|155->127|156->128|156->128|156->128|157->129|162->134|162->134|163->135|163->135|164->136|164->136|164->136|165->137|165->137|165->137|166->138|171->143|171->143|172->144|172->144|173->145|173->145|176->148|176->148|178->150|178->150|179->151|180->152|180->152|180->152|180->152|181->153|182->154|182->154|183->155|187->159|187->159|190->162|190->162|192->164|192->164|194->166|194->166|194->166|195->167|198->170|198->170|200->172|200->172|200->172|201->173|205->177|205->177|208->180|208->180|210->182|210->182|212->184|212->184|212->184|213->185|213->185|213->185|213->185|213->185|215->187|215->187|215->187|216->188|229->201|229->201|231->203|231->203|233->205|233->205|234->206|234->206|234->206|236->208|236->208|236->208|237->209|239->211|239->211|240->212|240->212|241->213|241->213|241->213|243->215|252->224|252->224|253->225
                  -- GENERATED --
              */
          