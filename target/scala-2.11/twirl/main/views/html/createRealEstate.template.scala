
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
object createRealEstate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[RealEstateResidential],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cityform: Form[RealEstateResidential]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<form id="specific" action="/product/residential/save" method="post">
				<input type="hidden" name="product.id" id="productId"/>
				<input type="hidden" name="description" id="description2"/>
                <div>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Room Particulars  </h2>
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
                                        <option value="">Select Year</option>
                                        <option value="2017">2017</option>
                                        <option value="2016">2016</option>
                                        <option value="2015">2015</option>
                                        <option value="2014">2014</option>
                                        <option value="2013">2013</option>
                                        <option value="2012">2012</option>
                                        <option value="2011">2011</option>
                                        <option value="2010">2010</option>
                                        <option value="2009">2009</option>
                                        <option value="2008">2008</option>
                                        <option value="2007">2007</option>
                                        <option value="2006">2006</option>
                                        <option value="2005">2005</option>
                                        <option value="2004">2004</option>
                                        <option value="2003">2003</option>
                                        <option value="2002">2002</option>
                                        <option value="2001">2001</option>
                                        <option value="2000">2000</option>
                                        <option value="Below 2000">Below 2000</option>
                                        
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Property Type <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select  style="width:100%" name="propertyType" id="property_type">
                                        <option value="">Select type</option>
                                        <option value="Single Occupancy">Single Occupancy</option>
                                        <option value="Double Occupancy">Double Occupancy</option>
                                        <option value="RK">RK</option>
                                        <option value="1 BHK">1 BHK</option>
                                        <option value="2 BHK">2 BHK</option>
                                        <option value="3 BHK">3 BHK</option>
                                        <option value="4 BHK">4 BHK</option>
                                        <option value="5 BHK">5 BHK</option>
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
                    $(document).ready(function()"""),format.raw/*150.49*/("""{"""),format.raw/*150.50*/("""
                		"""),format.raw/*151.19*/("""$('.error').hide();
                		
                	"""),format.raw/*153.18*/("""}"""),format.raw/*153.19*/(""");
                    function formValidation()"""),format.raw/*154.46*/("""{"""),format.raw/*154.47*/("""
                    	"""),format.raw/*155.22*/("""var result = true;
                    	if($("#search_key").val() == null || $("#search_key").val() == "" || $("#sq_ft").val() == null || $("#sq_ft").val() == "" || $("#floor_no").val() == null || $("#floor_no").val() == "" || $("#age_of_property").val() == null || $("#age_of_property").val() == "" || $("#property_type").val() == null || $("#property_type").val() == "" || $('input[name=foodType]:checked').length<=0 || $('input[name=toiletType]:checked').length<=0)
            	        	result = false;
            	    	
                    	return result;
                    """),format.raw/*160.21*/("""}"""),format.raw/*160.22*/("""
                    """),format.raw/*161.21*/("""</script>"""))}
  }

  def render(cityform:Form[RealEstateResidential]): play.twirl.api.HtmlFormat.Appendable = apply(cityform)

  def f:((Form[RealEstateResidential]) => play.twirl.api.HtmlFormat.Appendable) = (cityform) => apply(cityform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createRealEstate.scala.html
                  HASH: 03e0e4a56527c96a5940ffc2a9e5caa81d24e980
                  MATRIX: 755->1|882->40|910->42|10311->9414|10341->9415|10390->9435|10477->9493|10507->9494|10585->9543|10615->9544|10667->9567|11283->10154|11313->10155|11364->10177
                  LINES: 26->1|29->1|30->2|178->150|178->150|179->151|181->153|181->153|182->154|182->154|183->155|188->160|188->160|189->161
                  -- GENERATED --
              */
          