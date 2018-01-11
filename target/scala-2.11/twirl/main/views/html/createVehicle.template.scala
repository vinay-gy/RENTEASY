
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
object createVehicle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Vehicles],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Vehicles]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<form id="specific" action="/product/vehicles/save" method="post">
				<input type="hidden" name="product.id" id="productId"/>
				<input type="hidden" name="description" id="description2"/>
                <div>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Vehicles Particulars  </h2>
                        	</div>
							<div class="col-md-6" style="text-align: right;" id="fortherror" class="error">
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Brand Name <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="brand" id="brand">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Model</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="model" id="model" >
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Vehicle Type <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select  style="width:100%" name="vehicleType" id="vehicleType">
                                         <option value="">Vehicle Type</option>
                                         <option value="Mini">Mini</option>
                                         <option value="Sedan">Sedan</option>
                                         <option value="XUV">XUV</option>
                                         <option value="SUV">SUV</option>
                                         <option value="Sports">Sports</option>
                                        
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Year of Vehicle <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select  style="width:100%" name="year" id="year">
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
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">KM's Driven<span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="kmDriven" id="kmDriven">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Search Keywords <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="search_key" id="search_key">
                                </div>
                            </div>
                            
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Additional </label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="pickAndDrop" > Pick & Drop</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="helmet" > Saftey kit</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="" > Helmet</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="rcBook" > RC copy</label>
                                    </div>

                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">With Driver </label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="isWithDriver" value="true"> Yes</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="isWithDriver" value="false"> No</label>
                                    </div>
                                    
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
                    $(document).ready(function()"""),format.raw/*157.49*/("""{"""),format.raw/*157.50*/("""
                		"""),format.raw/*158.19*/("""$('.error').hide();
                		
                	"""),format.raw/*160.18*/("""}"""),format.raw/*160.19*/(""");
                    function formValidation()"""),format.raw/*161.46*/("""{"""),format.raw/*161.47*/("""
                    	"""),format.raw/*162.22*/("""var result = true;
                    	if($("#brand").val() == null || $("#kmDriven").val() == "" || $("#vehicleType").val() == null || $("#year").val() == "" || $('input[name=isWithDriver]:checked').length<=0)
            	        	result = false;
            	    	
                    	return result;
                    """),format.raw/*167.21*/("""}"""),format.raw/*167.22*/("""
                    """),format.raw/*168.21*/("""</script>"""))}
  }

  def render(form:Form[Vehicles]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Vehicles]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createVehicle.scala.html
                  HASH: 2eba72477d4d2bdbcc077ae5ee3b0f4257360693
                  MATRIX: 739->1|849->23|877->25|10811->9930|10841->9931|10890->9951|10977->10009|11007->10010|11085->10059|11115->10060|11167->10083|11526->10413|11556->10414|11607->10436
                  LINES: 26->1|29->1|30->2|185->157|185->157|186->158|188->160|188->160|189->161|189->161|190->162|195->167|195->167|196->168
                  -- GENERATED --
              */
          