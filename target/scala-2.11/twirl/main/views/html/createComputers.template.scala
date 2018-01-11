
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
object createComputers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Computers],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Computers]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.1*/("""<form id="specific" action="/product/computers/save" method="post">
				<input type="hidden" name="product.id" id="productId"/>
				<input type="hidden" name="description" id="description2"/>
                <div>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Computers Particulars  </h2>
                        	</div>
							<div class="col-md-6" style="text-align: right;" id="fortherror" class="error">
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="row">
                            <div class="col-md-6" style="display:none">
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
                            
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Processor<span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="processor" id="processor">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Ram Size <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="ram" id="ram" >
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Hard Disk Capacity <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="hardDisk" id="hardDisk" >
                                </div>
                            </div>
                        </div>
<!--                         <div class="row"> -->
                            
                            
                            
<!--                         </div> -->

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
                                            <input type="checkbox" name="accessories" > accessories</label>
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
                    $(document).ready(function()"""),format.raw/*127.49*/("""{"""),format.raw/*127.50*/("""
                		"""),format.raw/*128.19*/("""$('.error').hide();
                		
                	"""),format.raw/*130.18*/("""}"""),format.raw/*130.19*/(""");
                    function formValidation()"""),format.raw/*131.46*/("""{"""),format.raw/*131.47*/("""
                    	"""),format.raw/*132.22*/("""var result = true;
                    	//$("#brand").val() == null || 
                    	if($("#model").val() == "" || $("#ram").val() == null || $("#hardDisk").val() == "" || $("#processor").val() == "" || $('input[name=isWithDriver]:checked').length<=0)
            	        	result = false;
            	    	
                    	return result;
                    """),format.raw/*138.21*/("""}"""),format.raw/*138.22*/("""
                    """),format.raw/*139.21*/("""</script>"""))}
  }

  def render(form:Form[Computers]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Computers]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createComputers.scala.html
                  HASH: 5927569cb98ef4ea1d83eeb4dbd1c7a394561e7d
                  MATRIX: 742->1|853->24|881->26|8254->7370|8284->7371|8333->7391|8420->7449|8450->7450|8528->7499|8558->7500|8610->7523|9018->7902|9048->7903|9099->7925
                  LINES: 26->1|29->1|30->2|155->127|155->127|156->128|158->130|158->130|159->131|159->131|160->132|166->138|166->138|167->139
                  -- GENERATED --
              */
          