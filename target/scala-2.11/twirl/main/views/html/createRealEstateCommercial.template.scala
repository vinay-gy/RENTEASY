
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
object createRealEstateCommercial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[RealEstateCommercial],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cityform: Form[RealEstateCommercial]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<form id="specific" action="/product/commercial/save" method="post">
				<input type="hidden" name="product.id" id="productId"/>
				<input type="hidden" name="description" id="description2"/>
                <div>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Shop Particulars  </h2>
                        	</div>
							<div class="col-md-6" style="text-align: right;" id="fortherror" class="error">
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Square Feet <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="squreFeets" id="sq_ft">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Floor No <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="floorNo" id="floor_no" >
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Age of Property <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select  style="width:100%" name="propertyAge" id="age_of_property">
                                        <option value="one" selected>Select category</option>
                                        
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Property Type <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select  style="width:100%" name="propertyType" id="property_type">
                                        <option value="one" selected>Select category</option>
                                        
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Food allowed <span>*</span></label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-3">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="foodType" value="Any"> Any</label>
                                    </div>
                                    <div class="col-md-3">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="foodType" value="Veg"> Veg</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="foodType" value="NonVeg"> Non-Veg</label>
                                    </div>

                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Toilet <span>*</span></label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-4">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="toiletType" value="Indian"> Indian</label>
                                    </div>
                                    <div class="col-md-4">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="toiletType" value="Western" > Western</label>
                                    </div>
                                    <div class="col-md-4">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="toiletType" value="Both"> Both</label>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Search Keywords <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="search_key" id="search_key">
                                </div>
                            </div>
                            
                        </div>
                       

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('third')">Previous</button>
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('fivth')">Next</button>

                        </div>
                    </div>
                    </form>
                    
                    <script>
                    $(document).ready(function()"""),format.raw/*124.49*/("""{"""),format.raw/*124.50*/("""
                		"""),format.raw/*125.19*/("""$('.error').hide();
                		
                	"""),format.raw/*127.18*/("""}"""),format.raw/*127.19*/(""");
                    function formValidation()"""),format.raw/*128.46*/("""{"""),format.raw/*128.47*/("""
                    	"""),format.raw/*129.22*/("""var result = true;
                    	if($("#search_key").val() == null || $("#search_key").val() == "" || $("#sq_ft").val() == null || $("#sq_ft").val() == "" || $("#floor_no").val() == null || $("#floor_no").val() == "" || $("#age_of_property").val() == null || $("#age_of_property").val() == "" || $("#property_type").val() == null || $("#property_type").val() == "" || $('input[name=foodType]:checked').length<=0 || $('input[name=toiletType]:checked').length<=0)
            	        	result = false;
            	    	
                    	return result;
                    """),format.raw/*134.21*/("""}"""),format.raw/*134.22*/("""
                    """),format.raw/*135.21*/("""</script>"""))}
  }

  def render(cityform:Form[RealEstateCommercial]): play.twirl.api.HtmlFormat.Appendable = apply(cityform)

  def f:((Form[RealEstateCommercial]) => play.twirl.api.HtmlFormat.Appendable) = (cityform) => apply(cityform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createRealEstateCommercial.scala.html
                  HASH: 9df2fad933c97c4f2cbe0b15fd94c8ce219dce7d
                  MATRIX: 764->1|890->39|918->41|8274->7368|8304->7369|8353->7389|8440->7447|8470->7448|8548->7497|8578->7498|8630->7521|9246->8108|9276->8109|9327->8131
                  LINES: 26->1|29->1|30->2|152->124|152->124|153->125|155->127|155->127|156->128|156->128|157->129|162->134|162->134|163->135
                  -- GENERATED --
              */
          