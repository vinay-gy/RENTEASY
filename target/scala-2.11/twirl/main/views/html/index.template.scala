
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
"""),format.raw/*2.1*/("""<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body """),format.raw/*7.14*/("""{"""),format.raw/*7.15*/("""
            """),format.raw/*8.13*/("""margin: 0;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
        
        """),format.raw/*11.9*/(""".icon-bar """),format.raw/*11.19*/("""{"""),format.raw/*11.20*/("""
            """),format.raw/*12.13*/("""width: 100%;
            background-color: #01a185;
            overflow: auto;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        
        """),format.raw/*17.9*/(""".icon-bar a """),format.raw/*17.21*/("""{"""),format.raw/*17.22*/("""
            """),format.raw/*18.13*/("""float: left;
            width: 20%;
            text-align: center;
            padding: 12px 0;
            transition: all 0.3s ease;
            color: white;
            font-size: 36px;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        
        """),format.raw/*27.9*/(""".icon-bar a:hover """),format.raw/*27.27*/("""{"""),format.raw/*27.28*/("""
            """),format.raw/*28.13*/("""background-color: #000;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
        
        """),format.raw/*31.9*/(""".activeBar """),format.raw/*31.20*/("""{"""),format.raw/*31.21*/("""
            """),format.raw/*32.13*/("""background-color: #f3c500 !important;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        
        """),format.raw/*35.9*/(""".collapse """),format.raw/*35.19*/("""{"""),format.raw/*35.20*/("""
            """),format.raw/*36.13*/("""height: 100%;
            animation: 1s ease-out 0s 1 slideInFromLeft;
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/("""
        
        """),format.raw/*40.9*/("""@keyframes slideInFromLeft """),format.raw/*40.37*/("""{"""),format.raw/*40.38*/("""
            """),format.raw/*41.13*/("""0% """),format.raw/*41.16*/("""{"""),format.raw/*41.17*/("""
                """),format.raw/*42.17*/("""transform: translateY(-5%);
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""100% """),format.raw/*44.18*/("""{"""),format.raw/*44.19*/("""
                """),format.raw/*45.17*/("""transform: translateY(0);
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/("""
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        
        """),format.raw/*49.9*/(""".btnN:hover """),format.raw/*49.21*/("""{"""),format.raw/*49.22*/("""
            """),format.raw/*50.13*/("""background-color: #f3c500 !important;
            border: 1px solid #f3c500 !important;
            outline: none;
            transition: all 0.3s ease;
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</style>
</head>

<div class="submit-ad main-grid-border" style="height:100%;margin-bottom: 5%;border-bottom: none" ng-app="myApp" ng-controller="createAdCtrl">
    <div class="container">
        <h2 class="head">Post an Ad</h2>
        <div style="border:1px solid #f3c500;height:100%;border-top:none;">
            <div class="icon-bar">
                <a id="togglefirst" class="toggle activeBar" onclick="toggle('first')"><i class="fa fa-bars"></i></a>
                <a id="togglesecond" class="toggle" onclick="toggle('second')"><i class="fa fa-image"></i></a>
                <a id="togglethird" class="toggle" onclick="toggle('third')"><i class="fa fa-inr"></i></a>
                <a id="toggleforth" class="toggle" onclick="toggle('forth')"><i class="fa fa-check-square-o"></i></a>
                <a id="togglefivth" class="toggle" onclick="toggle('fivth')"><i class="fa fa-user"></i></a>
            </div>
            <div class="post-ad-form" style="border:none;margin-bottom: 0px ">
                <form>

                    <div id="first" class="collapse">

                        <h2 class="head">Start adding your product</h2>

                        <label>Select Category <span>*</span></label>
                        <select ng-model="category" ng-change="changeCategory()">
                            <option value="" selected>Select category</option>
                            <option ng-repeat="x in categoryList" value=""""),format.raw/*79.74*/("""{"""),format.raw/*79.75*/("""{"""),format.raw/*79.76*/("""x.id"""),format.raw/*79.80*/("""}"""),format.raw/*79.81*/("""}"""),format.raw/*79.82*/("""">"""),format.raw/*79.84*/("""{"""),format.raw/*79.85*/("""{"""),format.raw/*79.86*/("""x.category"""),format.raw/*79.96*/("""}"""),format.raw/*79.97*/("""}"""),format.raw/*79.98*/("""</option>
                        </select>
                        <div class="clearfix"></div>
                        <label>Select sub category <span>*</span></label>
                        <select ng-model="sub_category" ng-change="changeSubCategory()">
                            <option value="" selected>Select sub category</option>
                            <option ng-repeat="x in subCategoryList" value=""""),format.raw/*85.77*/("""{"""),format.raw/*85.78*/("""{"""),format.raw/*85.79*/("""x.id"""),format.raw/*85.83*/("""}"""),format.raw/*85.84*/("""}"""),format.raw/*85.85*/("""">"""),format.raw/*85.87*/("""{"""),format.raw/*85.88*/("""{"""),format.raw/*85.89*/("""x.subCategory"""),format.raw/*85.102*/("""}"""),format.raw/*85.103*/("""}"""),format.raw/*85.104*/("""</option>
                        </select>
                        <div class="clearfix"></div>
                        <label>Select Product Type <span>*</span></label>
                        <select ng-model="product_type" ng-change="" name="productType.id">
                            <option value="" selected>Select Product Type</option>
                            <option ng-repeat="x in productTypeList" value=""""),format.raw/*91.77*/("""{"""),format.raw/*91.78*/("""{"""),format.raw/*91.79*/("""x.id"""),format.raw/*91.83*/("""}"""),format.raw/*91.84*/("""}"""),format.raw/*91.85*/("""">"""),format.raw/*91.87*/("""{"""),format.raw/*91.88*/("""{"""),format.raw/*91.89*/("""x.productType"""),format.raw/*91.102*/("""}"""),format.raw/*91.103*/("""}"""),format.raw/*91.104*/("""</option>
                        </select>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('second')">Next</button>

                        </div>
                    </div>
                    <div id="second" class="collapse">
                        <h2 class="head">Upload Images </h2>

                        <div class="col-md-6 col-sm-12">
                            <div class="col-md-4">
                                <label style="width:100%">Ad Title <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <input type="text" class="phone" placeholder="" style="width:100%" name="title">
                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Ad Description <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <textarea name="description" class="mess" placeholder="Write few lines about your product" style="width:100%"></textarea>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <label>Photos for your ad :</label>
                            <div class="photos-upload-view">

                                <input type="hidden" id="MAX_FILE_SIZE" name="MAX_FILE_SIZE" value="300000" />

                                <div>
                                    <input type="file" id="fileselect" name="fileselect[]" multiple="multiple" />
                                    <div id="filedrag">or drop files here</div>
                                </div>

                                <div id="submitbutton">
                                    <button type="submit">Upload Files</button>
                                </div>

                                <div id="messages">
                                    <p>Status Messages</p>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                        <script src=""""),_display_(/*137.39*/routes/*137.45*/.Assets.at("theme/js/filedrag.js")),format.raw/*137.79*/(""""></script>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('first')">Previous</button>
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('third')">Next</button>

                        </div>
                    </div>
                    <div id="third" class="collapse">
                        <h2 class="head">Price Section </h2>

                        <div class="col-md-6 col-sm-12" style="margin-bottom: 1%">
                            <div class="col-md-4">
                                <label style="width:100%">Rent Amount <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <input type="text" class="phone" placeholder="" style="width:100%" name="price">
                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Duration <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration"> Hourly</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration"> Daily</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration"> Monthly</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration"> Yearly</label>
                                </div>

                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Is Negotiable <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isNegotiable"> Yes</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isNegotiable"> No</label>
                                </div>
                            </div>
                            <div class="col-md-4" style="padding-left: 0px;">
		                                <label style="width:100%">Deposit Mandatory <span>*</span></label>
		                            </div>
		                            <div class="col-md-8">
		                                <div class="col-md-6">
		                                    <label style="width:100%;text-align:left">
		                                        <input type="radio" name="isDepositOptional" ng-model="showDeposit"  ng-value="true"> Yes</label>
		                                </div>
		                                <div class="col-md-6">
		                                    <label style="width:100%;text-align:left">
		                                        <input type="radio" name="isDepositOptional" ng-model="showDeposit"   ng-value="false"> No</label>
		                                </div>
		                        </div>
                            

                            

                        </div>
                        <div class="col-md-6 col-sm-12" ng-show="(showDeposit ==true)?true:false" style="margin-bottom: 1%">
	                        
                            <div class="row" >
                            	<div class="col-md-4">
	                                <label style="width:100%">Deposit <span>*</span></label>
	                            </div>
	                            <div class="col-md-8">
	                                <input type="text" class="phone" placeholder="" style="width:100%" name="deposit">
	                            </div>
                            </div>

                            <div class="col-md-4">
                                <label style="width:100%">Refundable <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isRefundable"> Yes</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isRefundable"> No</label>
                                </div>

                            </div>

                        </div>

                        <div class="clearfix"></div>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('second')">Previous</button>
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('forth')">Next</button>

                        </div>
                    </div>
                    <div id="forth" class="collapse">
                        <h2 class="head">Room Particulars  </h2>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Square Feet <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Floor No <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Age of Property <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select ng-model="category" ng-change="changeCategory()" style="width:100%">
                                        <option value="" selected>Select category</option>
                                        <option ng-repeat="x in categoryList" value=""""),format.raw/*274.86*/("""{"""),format.raw/*274.87*/("""{"""),format.raw/*274.88*/("""x.id"""),format.raw/*274.92*/("""}"""),format.raw/*274.93*/("""}"""),format.raw/*274.94*/("""">"""),format.raw/*274.96*/("""{"""),format.raw/*274.97*/("""{"""),format.raw/*274.98*/("""x.category"""),format.raw/*274.108*/("""}"""),format.raw/*274.109*/("""}"""),format.raw/*274.110*/("""</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Property Type <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select ng-model="category" ng-change="changeCategory()" style="width:100%">
                                        <option value="" selected>Select category</option>
                                        <option ng-repeat="x in categoryList" value=""""),format.raw/*285.86*/("""{"""),format.raw/*285.87*/("""{"""),format.raw/*285.88*/("""x.id"""),format.raw/*285.92*/("""}"""),format.raw/*285.93*/("""}"""),format.raw/*285.94*/("""">"""),format.raw/*285.96*/("""{"""),format.raw/*285.97*/("""{"""),format.raw/*285.98*/("""x.category"""),format.raw/*285.108*/("""}"""),format.raw/*285.109*/("""}"""),format.raw/*285.110*/("""</option>
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
                                            <input type="radio"> Any</label>
                                    </div>
                                    <div class="col-md-3">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio"> Veg</label>
                                    </div>
                                    <div class="col-md-6">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio"> Non-Veg</label>
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
                                            <input type="radio"> Indian</label>
                                    </div>
                                    <div class="col-md-4">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio"> Western</label>
                                    </div>
                                    <div class="col-md-4">
                                        <label style="width:100%;text-align:left">
                                            <input type="radio"> Both</label>
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
                                    <input type="text" class="phone" placeholder="" style="width:100%">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Address <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="address">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Select Country <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select ng-model="category" ng-change="changeCategory()" style="width:100%">
                                        <option value="" selected>Select category</option>
                                        <option ng-repeat="x in categoryList" value=""""),format.raw/*360.86*/("""{"""),format.raw/*360.87*/("""{"""),format.raw/*360.88*/("""x.id"""),format.raw/*360.92*/("""}"""),format.raw/*360.93*/("""}"""),format.raw/*360.94*/("""">"""),format.raw/*360.96*/("""{"""),format.raw/*360.97*/("""{"""),format.raw/*360.98*/("""x.category"""),format.raw/*360.108*/("""}"""),format.raw/*360.109*/("""}"""),format.raw/*360.110*/("""</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Select State <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select class="form-control" ng-model="state"  name="state" style="width:100%">
									  <option value="" selected>Select State</option>
									  <option value="1">Karnataka</option>
									</select>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Select City <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select class="form-control" ng-model="city"  name="city" style="width:100%">
									  <option value="" selected>Select City</option>
									  <option value="1">Bangalore</option>
									</select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Select Locality <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <select class="form-control" ng-model="locality" name="locality" style="width:100%">
									  <option value="" selected>Select Locality</option>
									  <option value="1">Basaveshwara nagara</option>
									</select>
                                </div>
                            </div>
                        </div>

                        <div class="clearfix"></div>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('third')">Previous</button>
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('fivth')">Next</button>

                        </div>
                    </div>
                    <div id="fivth" class="collapse">

                        <h2 class="head">Profile Details</h2>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Your Name <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input type="text" class="phone" placeholder="" style="width:100%">
                                </div>
                            </div>
                            <br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Your Email ID <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="email">
                                </div>
                            </div>
                            <br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Mobile Number <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="mobile">
                                </div>
                            </div>
                        </div>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('forth')">Previous</button>
							<button class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" >Submit</button>

                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>
	<script>
	$(document).ready(function()"""),format.raw/*456.30*/("""{"""),format.raw/*456.31*/("""
		"""),format.raw/*457.3*/("""$("html, body").animate("""),format.raw/*457.27*/("""{"""),format.raw/*457.28*/(""" """),format.raw/*457.29*/("""scrollTop: 450 """),format.raw/*457.44*/("""}"""),format.raw/*457.45*/(""", "slow");
		$('#first').show();
	"""),format.raw/*459.2*/("""}"""),format.raw/*459.3*/(""");
	
	function toggle(id)"""),format.raw/*461.21*/("""{"""),format.raw/*461.22*/("""
		"""),format.raw/*462.3*/("""$('.collapse').hide();
		$('#'+id).show();
		$('.activeBar').removeClass('activeBar')
		$('#toggle'+id).addClass('activeBar')
	"""),format.raw/*466.2*/("""}"""),format.raw/*466.3*/("""
	
	
	"""),format.raw/*469.2*/("""var app = angular.module('myApp', []);
	app.controller('createAdCtrl', function($scope, $http) """),format.raw/*470.57*/("""{"""),format.raw/*470.58*/("""
		"""),format.raw/*471.3*/("""$scope.showDeposit = true;
		$scope.subCategoryList;
		$scope.sub_category;
		$scope.product_type;
	    $http.get("category/list")
	        .then(function(response) """),format.raw/*476.35*/("""{"""),format.raw/*476.36*/("""
	        	"""),format.raw/*477.11*/("""$scope.categoryList = response.data;
	        """),format.raw/*478.10*/("""}"""),format.raw/*478.11*/(""");
		$scope.changeCategory = function() """),format.raw/*479.38*/("""{"""),format.raw/*479.39*/("""
			"""),format.raw/*480.4*/("""$http.get("subcategory/"+$scope.category)
	        .then(function(response) """),format.raw/*481.35*/("""{"""),format.raw/*481.36*/("""
	        	"""),format.raw/*482.11*/("""$scope.subCategoryList = response.data;
	        """),format.raw/*483.10*/("""}"""),format.raw/*483.11*/(""");
	    """),format.raw/*484.6*/("""}"""),format.raw/*484.7*/("""
		"""),format.raw/*485.3*/("""$scope.changeSubCategory = function() """),format.raw/*485.41*/("""{"""),format.raw/*485.42*/("""
			"""),format.raw/*486.4*/("""$http.get("producttype/"+$scope.sub_category)
	        .then(function(response) """),format.raw/*487.35*/("""{"""),format.raw/*487.36*/("""
	        	"""),format.raw/*488.11*/("""$scope.productTypeList = response.data;
	        """),format.raw/*489.10*/("""}"""),format.raw/*489.11*/(""");
	    """),format.raw/*490.6*/("""}"""),format.raw/*490.7*/("""
	"""),format.raw/*491.2*/("""}"""),format.raw/*491.3*/(""");
	</script>
""")))}),format.raw/*493.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:42 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/index.scala.html
                  HASH: e20030502a899c557ede12d0170b5db59d19e6bf
                  MATRIX: 798->1|809->5|846->6|874->8|1039->146|1067->147|1108->161|1154->181|1182->182|1229->202|1267->212|1296->213|1338->227|1456->318|1485->319|1532->339|1572->351|1601->352|1643->366|1877->573|1906->574|1953->594|1999->612|2028->613|2070->627|2130->660|2159->661|2206->681|2245->692|2274->693|2316->707|2390->754|2419->755|2466->775|2504->785|2533->786|2575->800|2683->881|2712->882|2759->902|2814->930|2843->931|2885->945|2916->948|2945->949|2991->967|3060->1008|3089->1009|3131->1023|3164->1028|3193->1029|3239->1047|3306->1086|3335->1087|3372->1097|3401->1098|3448->1118|3488->1130|3517->1131|3559->1145|3752->1311|3781->1312|3814->1318|5323->2799|5352->2800|5381->2801|5413->2805|5442->2806|5471->2807|5501->2809|5530->2810|5559->2811|5597->2821|5626->2822|5655->2823|6108->3248|6137->3249|6166->3250|6198->3254|6227->3255|6256->3256|6286->3258|6315->3259|6344->3260|6386->3273|6416->3274|6446->3275|6902->3703|6931->3704|6960->3705|6992->3709|7021->3710|7050->3711|7080->3713|7109->3714|7138->3715|7180->3728|7210->3729|7240->3730|9808->6270|9824->6276|9880->6310|18324->14725|18354->14726|18384->14727|18417->14731|18447->14732|18477->14733|18508->14735|18538->14736|18568->14737|18608->14747|18639->14748|18670->14749|19428->15478|19458->15479|19488->15480|19521->15484|19551->15485|19581->15486|19612->15488|19642->15489|19672->15490|19712->15500|19743->15501|19774->15502|24185->19884|24215->19885|24245->19886|24278->19890|24308->19891|24338->19892|24369->19894|24399->19895|24429->19896|24469->19906|24500->19907|24531->19908|29854->25202|29884->25203|29916->25207|29969->25231|29999->25232|30029->25233|30073->25248|30103->25249|30167->25285|30196->25286|30252->25313|30282->25314|30314->25318|30473->25449|30502->25450|30539->25459|30664->25555|30694->25556|30726->25560|30925->25730|30955->25731|30996->25743|31072->25790|31102->25791|31172->25832|31202->25833|31235->25838|31341->25915|31371->25916|31412->25928|31491->25978|31521->25979|31558->25988|31587->25989|31619->25993|31686->26031|31716->26032|31749->26037|31859->26118|31889->26119|31930->26131|32009->26181|32039->26182|32076->26191|32105->26192|32136->26195|32165->26196|32213->26213
                  LINES: 29->1|29->1|29->1|30->2|35->7|35->7|36->8|37->9|37->9|39->11|39->11|39->11|40->12|43->15|43->15|45->17|45->17|45->17|46->18|53->25|53->25|55->27|55->27|55->27|56->28|57->29|57->29|59->31|59->31|59->31|60->32|61->33|61->33|63->35|63->35|63->35|64->36|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|71->43|71->43|72->44|72->44|72->44|73->45|74->46|74->46|75->47|75->47|77->49|77->49|77->49|78->50|82->54|82->54|83->55|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|113->85|113->85|113->85|113->85|113->85|113->85|113->85|113->85|113->85|113->85|113->85|113->85|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|165->137|165->137|165->137|302->274|302->274|302->274|302->274|302->274|302->274|302->274|302->274|302->274|302->274|302->274|302->274|313->285|313->285|313->285|313->285|313->285|313->285|313->285|313->285|313->285|313->285|313->285|313->285|388->360|388->360|388->360|388->360|388->360|388->360|388->360|388->360|388->360|388->360|388->360|388->360|484->456|484->456|485->457|485->457|485->457|485->457|485->457|485->457|487->459|487->459|489->461|489->461|490->462|494->466|494->466|497->469|498->470|498->470|499->471|504->476|504->476|505->477|506->478|506->478|507->479|507->479|508->480|509->481|509->481|510->482|511->483|511->483|512->484|512->484|513->485|513->485|513->485|514->486|515->487|515->487|516->488|517->489|517->489|518->490|518->490|519->491|519->491|521->493
                  -- GENERATED --
              */
          