
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
object createCameras extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Cameras],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Cameras]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<form id="specific" action="/product/cameras/save" method="post">
				<input type="hidden" name="product.id" id="productId"/>
				<input type="hidden" name="description" id="description2"/>
                <div>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Camera Particulars  </h2>
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
                                    <select  style="width:100%" name="brand" id="brand">
                                        <option value="one" selected>Select Brand</option>
                                        
                                    </select>
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
                                    <label style="width:100%">Additional </label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="pickUpDrop" > Pick & Drop</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="checkbox" name="anyAccessories" > accessories</label>
                                    </div>
                                    

                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Any Damages </label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="anyDamages" value="true"> Yes</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio" name="anyDamages" value="false"> No</label>
                                    </div>
                                    
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Damages Details</label>
                                </div>
                                <div class="col-md-8" style="padding-left:0px">
                                    <textarea ng-model="damageDetails" name="damageDetails" id="damageDetails" class="mess" placeholder="Mention clearly about damages" style="width:100%"></textarea>
                                    
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
                    $(document).ready(function()"""),format.raw/*97.49*/("""{"""),format.raw/*97.50*/("""
                		"""),format.raw/*98.19*/("""$('.error').hide();
                		
                	"""),format.raw/*100.18*/("""}"""),format.raw/*100.19*/(""");
                    function formValidation()"""),format.raw/*101.46*/("""{"""),format.raw/*101.47*/("""
                    	"""),format.raw/*102.22*/("""var result = true;
                    	if($("#brand").val() == null || $("#model").val() == "" || $("#ram").val() == null || $("#hardDisk").val() == "" || $("#processor").val() == "" || $('input[name=isWithDriver]:checked').length<=0)
            	        	result = false;
            	    	
                    	return result;
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                    """),format.raw/*108.21*/("""</script>"""))}
  }

  def render(form:Form[Cameras]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Cameras]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createCameras.scala.html
                  HASH: 237b326a811b05bd8dda479af785204f22115a52
                  MATRIX: 738->1|847->22|875->24|6441->5562|6470->5563|6518->5583|6605->5641|6635->5642|6713->5691|6743->5692|6795->5715|7178->6069|7208->6070|7259->6092
                  LINES: 26->1|29->1|30->2|125->97|125->97|126->98|128->100|128->100|129->101|129->101|130->102|135->107|135->107|136->108
                  -- GENERATED --
              */
          