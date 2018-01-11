
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
object createAd extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cityform: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
"""),format.raw/*4.1*/("""<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/("""
            """),format.raw/*10.13*/("""margin: 0;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        
        """),format.raw/*13.9*/(""".icon-bar """),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
            """),format.raw/*14.13*/("""width: 100%;
            background-color: #01a185;
            overflow: auto;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
        
        """),format.raw/*19.9*/(""".icon-bar a """),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
            """),format.raw/*20.13*/("""float: left;
            width: 20%;
            text-align: center;
            padding: 12px 0;
            transition: all 0.3s ease;
            color: white;
            font-size: 36px;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        
        """),format.raw/*29.9*/(""".icon-bar a:hover """),format.raw/*29.27*/("""{"""),format.raw/*29.28*/("""
            """),format.raw/*30.13*/("""background-color: #000;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        
        """),format.raw/*33.9*/(""".activeBar """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/("""
            """),format.raw/*34.13*/("""background-color: #f3c500 !important;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        
        """),format.raw/*37.9*/(""".collapse """),format.raw/*37.19*/("""{"""),format.raw/*37.20*/("""
            """),format.raw/*38.13*/("""height: 100%;
            animation: 1s ease-out 0s 1 slideInFromLeft;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
        
        """),format.raw/*42.9*/("""@keyframes slideInFromLeft """),format.raw/*42.37*/("""{"""),format.raw/*42.38*/("""
            """),format.raw/*43.13*/("""0% """),format.raw/*43.16*/("""{"""),format.raw/*43.17*/("""
                """),format.raw/*44.17*/("""transform: translateY(-5%);
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""100% """),format.raw/*46.18*/("""{"""),format.raw/*46.19*/("""
                """),format.raw/*47.17*/("""transform: translateY(0);
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        
        """),format.raw/*51.9*/(""".btnN:hover """),format.raw/*51.21*/("""{"""),format.raw/*51.22*/("""
            """),format.raw/*52.13*/("""background-color: #f3c500 !important;
            border: 1px solid #f3c500 !important;
            outline: none;
            transition: all 0.3s ease;
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
        """),format.raw/*57.9*/(""".post-ad-form input[type="email"],input[type="number"] """),format.raw/*57.64*/("""{"""),format.raw/*57.65*/("""
		    """),format.raw/*58.7*/("""padding: 10px 10px 10px 10px;
		    width: 70%;
		    margin-bottom: 25px;
		    border: 1px solid #01a185;
		    outline: none;
		    color: #555;
		    transition: 0.5s all;
		    -webkit-transition: 0.5s all;
		    -moz-transition: 0.5s all;
		    -o-transition: 0.5s all;
		    -ms-transition: 0.5s all;
		    float: left;
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
    """),format.raw/*71.5*/("""</style>
</head>

<div class="submit-ad main-grid-border" style="height:100%;margin-bottom: 5%;border-bottom: none" ng-app="createAd" ng-controller="createAdCtrl">
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
                <form id="common" method="POST" action="/product/save" enctype="multipart/form-data">
                    <div id="first" class="collapse">
                    <div class="row">
                    <div class="col-md-6">
                    	<h2 class="head">Start adding your product</h2>
                    	</div>
						<div class="col-md-6 error" style="text-align: right;" id="firsterror" >
                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
                    	</div>
                    </div>
                    	
                        

                        <label>Select Category <span>*</span></label>
                        <select ng-model="category" ng-change="changeCategory()" name="categories.id">
                            <option value="" selected>Select category</option>
                            <option ng-repeat="x in categoryList" value=""""),format.raw/*102.74*/("""{"""),format.raw/*102.75*/("""{"""),format.raw/*102.76*/("""x.id"""),format.raw/*102.80*/("""}"""),format.raw/*102.81*/("""}"""),format.raw/*102.82*/("""">"""),format.raw/*102.84*/("""{"""),format.raw/*102.85*/("""{"""),format.raw/*102.86*/("""x.category"""),format.raw/*102.96*/("""}"""),format.raw/*102.97*/("""}"""),format.raw/*102.98*/("""</option>
                        </select>
                        <div class="clearfix"></div>
                        <label>Select sub category <span>*</span></label>
                        <select ng-model="sub_category" ng-change="changeSubCategory()" name="subCategories.id">
                            <option value="" selected>Select sub category</option>
                            <option ng-repeat="x in subCategoryList" value=""""),format.raw/*108.77*/("""{"""),format.raw/*108.78*/("""{"""),format.raw/*108.79*/("""x.id"""),format.raw/*108.83*/("""}"""),format.raw/*108.84*/("""}"""),format.raw/*108.85*/("""">"""),format.raw/*108.87*/("""{"""),format.raw/*108.88*/("""{"""),format.raw/*108.89*/("""x.subCategory"""),format.raw/*108.102*/("""}"""),format.raw/*108.103*/("""}"""),format.raw/*108.104*/("""</option>
                        </select>
                        <div class="clearfix"></div>
                        <label>Select Type / Brand <span>*</span></label>
                        <select ng-model="product_type" ng-change="changeProduct()"  id="productType" ng-options="y.productType for (x, y) in productTypeList">
                           <option ng-repeat="x in productTypeList" value=""""),format.raw/*113.76*/("""{"""),format.raw/*113.77*/("""{"""),format.raw/*113.78*/("""x.id"""),format.raw/*113.82*/("""}"""),format.raw/*113.83*/("""}"""),format.raw/*113.84*/("""">"""),format.raw/*113.86*/("""{"""),format.raw/*113.87*/("""{"""),format.raw/*113.88*/("""x.subCategory"""),format.raw/*113.101*/("""}"""),format.raw/*113.102*/("""}"""),format.raw/*113.103*/("""</option> 
                        </select>
                        <input type="text" id="productTypeId" name="productType.id" ng-model="productId" style="display:none"/>
                        <input type="text" id="productRoute" ng-model="productRoute" style="display:none"/>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('second')">Next</button>

                        </div>
                    </div>
                    <div id="second" class="collapse">
                        <label style="float:right;color:red">* Max 5 Images </label>
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Upload Images </h2>
	                    	</div>
							<div class="col-md-6 error" style="text-align: right;" id="seconderror" >
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="col-md-6 col-sm-12">
                            <div class="col-md-4">
                                <label style="width:100%">Ad Title <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <input ng-model="title" type="text" class="phone" placeholder="" style="width:100%" name="title" id="title">
                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Ad Description <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <textarea ng-model="description" name="description" id="description" class="mess" placeholder="Write few lines about your product" style="width:100%"></textarea>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <label>Photos for your ad :</label>
                            <div class="photos-upload-view">

                                <input type="hidden" id="MAX_FILE_SIZE" name="MAX_FILE_SIZE" value="300000" />

                                <div>
                                    <input ng-model="images" type="file" id="fileselect" name="fileselect[]" multiple="multiple" />
                                    <div id="filedrag">or drop files here</div>
                                </div>

                                <div id="submitbutton">
                                    <button type="submit">Upload Files</button>
                                </div>
                                
<!--                                 <div id="messages"> -->
<!-- 									<p>Status Messages</p> -->
<!-- 								</div> -->
<!-- 								<div id="preview"> -->
								
<!-- 								</div> -->


                            </div>
                            
                        </div>
                        <div class="col-md-6">
								
						</div>
						<div class="col-md-6 col-sm-6"  id="preview">
						
						</div>
                        <div class="clearfix"></div>
                        <script src=""""),_display_(/*181.39*/routes/*181.45*/.Assets.at("theme/js/filedrag.js")),format.raw/*181.79*/(""""></script>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('first')">Previous</button>
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('third')">Next</button>

                        </div>
                    </div>
                    <div id="third" class="collapse">
                        
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Price Section </h2>
	                    	</div>
							<div class="col-md-6 error" style="text-align: right;" id="thirderror" >
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="col-md-6 col-sm-12" style="margin-bottom: 1%">
                            <div class="col-md-4">
                                <label style="width:100%">Rent Amount <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <input ng-model="price" type="number" class="phone" placeholder="" style="width:100%" name="price" id="price">
                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Duration <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration" value="Hourly"> Hourly</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration" value="Daily"> Daily</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration" value="Monthly"> Monthly</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="duration" value="Yearly"> Yearly</label>
                                </div>

                            </div>
                            <div class="col-md-4">
                                <label style="width:100%">Is Negotiable <span>*</span></label>
                            </div>
                            <div class="col-md-8">
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isNegotiable" value="Yes"> Yes</label>
                                </div>
                                <div class="col-md-6">
                                    <label style="width:100%;text-align:left">
                                        <input type="radio" name="isNegotiable" value="No"> No</label>
                                </div>
                            </div>
                            <div class="col-md-4" style="padding-left: 0px;">
		                                <label style="width:100%">Deposit Mandatory <span>*</span></label>
		                            </div>
		                            <div class="col-md-8">
		                                <div class="col-md-6">
		                                    <label style="width:100%;text-align:left">
		                                        <input type="radio" name="isDepositOptional" ng-model="showDeposit"  ng-value="true" value="Yes"> Yes</label>
		                                </div>
		                                <div class="col-md-6">
		                                    <label style="width:100%;text-align:left">
		                                        <input type="radio" name="isDepositOptional" ng-model="showDeposit"   ng-value="false" value="No"> No</label>
		                                </div>
		                        </div>
                            

                            

                        </div>
                        <div class="col-md-6 col-sm-12" ng-show="(showDeposit ==true)?true:false" style="margin-bottom: 1%">
	                        
                            <div class="row" >
                            	<div class="col-md-4">
	                                <label style="width:100%">Deposit <span>*</span></label>
	                            </div>
	                            <div class="col-md-8">
	                                <input ng-model="deposit" type="number" class="phone" placeholder="" style="width:100%" name="deposit" id="deposit">
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
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('second')">Previous</button>
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('forth')">Next</button>

                        </div>
                    </div>
                    
                    <div id="fivth" class="collapse">

                        
                        <div class="row">
	                    <div class="col-md-6">
	                    	<h2 class="head">Profile Details</h2>
	                    	</div>
							<div class="col-md-6 error" style="text-align: right;" id="fivtherror" >
	                    	<h3 class="head" style="color:red;">Please fill all the mandatory fields (*)</h3>
	                    	</div>
	                    </div>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Your Name <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input ng-model="name" type="text" class="phone" placeholder="" style="width:100%">
                                </div>
                            </div>
                            <br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Your Email ID <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input ng-model="email" type="email" class="phone" placeholder="" style="width:100%" name="email" id="email">
                                </div>
                            </div>
                            <br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Address <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input ng-model="address" type="text" class="phone" placeholder="" style="width:100%" name="address" id="address">
                                </div>
                            </div><br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Mobile Number <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <input ng-model="mobile" type="number" class="phone" placeholder="" style="width:100%" name="mobile" id="mobile" >
                                </div>
                            </div><br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Select State <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <select  ng-model="state"  name="state.id" style="width:100%" id="state">
									  <option value="" selected>Select State</option>
									  <option value="1">Karnataka</option>
									</select>
                                </div>
                            </div><br>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Select City <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <select  ng-model="city"  name="city.id" style="width:100%" id="city">
									  <option value="" selected>Select City</option>
									  <option value="1">Bangalore</option>
									</select>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="col-md-2">
                                    <label style="width:100%">Select Locality <span>*</span></label>
                                </div>
                                <div class="col-md-4">
                                    <select  ng-model="locality" name="locality.id" style="width:100%" id="locality">
									  <option value="" selected>Select Locality</option>
									  <option value="1">Basaveshwara nagara</option>
									</select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="col-md-4">
                                    <label style="width:100%">Search Keywords <span>*</span></label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="phone" placeholder="" style="width:100%" name="searchKey" id="searchKey">
                                </div>
                            </div>
                        </div>

                        <div style="bottom:0;border-top:1px solid #f3c500;text-align:right;padding:10px">
                            <button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="toggle('forth')">Previous</button>
							<button type="button" class="btnN" style="font-size: 15px;color: #fff;background-color: #01a185;outline: none;padding: 6px 20px;text-decoration: none;border:1px solid #01a185;" onclick="return toggle('final')" >Submit</button>
							<button type="button" class="btnN" style="display:none;" data-toggle="modal" data-target="#verifyOtp" id="sendOtp"></button>
                        </div>
                    </div>

               </form>
                <div id="forth" class="collapse">
                
                </div>
                
                    
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="verifyOtp" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
					aria-hidden="true" data-backdrop="static" data-keyboard="false">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_locations">
										&times;</button>
									<h4 class="modal-title" id="myModalLabel">
										Please Verify Your Mobile Number</h4>
								</div>
								<div class="modal-body">
									 <form class="form-horizontal" role="form">
										<div class="form-group">
											<label> Enter OTP</label>
											<input type="password" name="otp" id="otp">
										</div>
									  </form>    
								</div>
							</div>
						</div>
					</div>
					
 <script src=""""),_display_(/*427.16*/routes/*427.22*/.Assets.at("angularjs/createAd.js")),format.raw/*427.57*/(""""></script>
	<script>
	$(document).ready(function()"""),format.raw/*429.30*/("""{"""),format.raw/*429.31*/("""
		"""),format.raw/*430.3*/("""$("html, body").animate("""),format.raw/*430.27*/("""{"""),format.raw/*430.28*/(""" """),format.raw/*430.29*/("""scrollTop: 450 """),format.raw/*430.44*/("""}"""),format.raw/*430.45*/(""", "slow");
		$('#first').show();
		$('.error').hide();
		$("#productType").change(function()"""),format.raw/*433.38*/("""{"""),format.raw/*433.39*/("""
			"""),format.raw/*434.4*/("""var pid = $("#productTypeId").val();
			var route = $("#productRoute").val();
			
			getProductSpecificForm(route);
		"""),format.raw/*438.3*/("""}"""),format.raw/*438.4*/(""");
		$('#productType option[value="?"]').remove();
		$( '#common' ).submit( function( e ) """),format.raw/*440.40*/("""{"""),format.raw/*440.41*/("""
		    """),format.raw/*441.7*/("""$.ajax( """),format.raw/*441.15*/("""{"""),format.raw/*441.16*/("""
		      """),format.raw/*442.9*/("""type: 'POST',
		      data: new FormData( this ),
		      processData: false,
		      contentType: false,
		      url: "/product/save",
	 			success: function(res) """),format.raw/*447.29*/("""{"""),format.raw/*447.30*/("""
	 	        	
	 	              
	 	        	"""),format.raw/*450.13*/("""if(res!= "0")"""),format.raw/*450.26*/("""{"""),format.raw/*450.27*/("""
	 	        		"""),format.raw/*451.14*/("""submitFormSpecific(res)
	 	            """),format.raw/*452.16*/("""}"""),format.raw/*452.17*/("""else"""),format.raw/*452.21*/("""{"""),format.raw/*452.22*/("""
	 	              """),format.raw/*453.18*/("""alert(res)
	 	            	
	 	            """),format.raw/*455.16*/("""}"""),format.raw/*455.17*/("""
	 	        """),format.raw/*456.12*/("""}"""),format.raw/*456.13*/(""",
	 	        error: function(err) """),format.raw/*457.33*/("""{"""),format.raw/*457.34*/("""
	 	          
	 	        """),format.raw/*459.12*/("""}"""),format.raw/*459.13*/("""
		    """),format.raw/*460.7*/("""}"""),format.raw/*460.8*/(""" """),format.raw/*460.9*/(""");
		    e.preventDefault();
		  """),format.raw/*462.5*/("""}"""),format.raw/*462.6*/(""" """),format.raw/*462.7*/(""");
		
	"""),format.raw/*464.2*/("""}"""),format.raw/*464.3*/(""");
	
	function getProductSpecificForm(route)"""),format.raw/*466.40*/("""{"""),format.raw/*466.41*/("""
		"""),format.raw/*467.3*/("""$.ajaxSetup("""),format.raw/*467.15*/("""{"""),format.raw/*467.16*/("""async: false"""),format.raw/*467.28*/("""}"""),format.raw/*467.29*/(""");
		$('#forth').load(route);
	"""),format.raw/*469.2*/("""}"""),format.raw/*469.3*/("""
	
	"""),format.raw/*471.2*/("""function toggle(id)"""),format.raw/*471.21*/("""{"""),format.raw/*471.22*/("""
		"""),format.raw/*472.3*/("""if(validate(id))"""),format.raw/*472.19*/("""{"""),format.raw/*472.20*/("""
			"""),format.raw/*473.4*/("""$('.collapse').hide();
			$('#'+id).show();
			$('.activeBar').removeClass('activeBar')
			$('#toggle'+id).addClass('activeBar')
		"""),format.raw/*477.3*/("""}"""),format.raw/*477.4*/("""
	"""),format.raw/*478.2*/("""}"""),format.raw/*478.3*/("""
	
	"""),format.raw/*480.2*/("""function validate(id)"""),format.raw/*480.23*/("""{"""),format.raw/*480.24*/("""
		"""),format.raw/*481.3*/("""var result = true;
		switch (id) """),format.raw/*482.15*/("""{"""),format.raw/*482.16*/("""
	    case "first":
	    	result = "true";
	        break; 
	    case "second":
	    	if($("#productTypeId").val() == null || $("#productTypeId").val() == "")"""),format.raw/*487.79*/("""{"""),format.raw/*487.80*/("""
	    		"""),format.raw/*488.8*/("""result = false;
	    		hideError('first')
	    		"""),format.raw/*490.8*/("""}"""),format.raw/*490.9*/("""
	        """),format.raw/*491.10*/("""break; 
	    case "third":
	    	if($("#description").val() == null || $("#description").val() == "" || $("#title").val() == null || $("#title").val() == "" || ($('#common input[type=file]').get(0).files.length < 1))
	        	"""),format.raw/*494.11*/("""{"""),format.raw/*494.12*/("""result = false;
	    		hideError('second')"""),format.raw/*495.27*/("""}"""),format.raw/*495.28*/("""
	        """),format.raw/*496.10*/("""break; 
	    case "forth":
	    	if($("#price").val() == null || $("#price").val() == "" || $('input[name=duration]:checked').length<=0 || $('input[name=isNegotiable]:checked').length<=0 || $('input[name=isDepositOptional]:checked').length<=0)
	        	"""),format.raw/*499.11*/("""{"""),format.raw/*499.12*/("""
	    		"""),format.raw/*500.8*/("""result = false;
    			hideError('third')
	        	"""),format.raw/*502.11*/("""}"""),format.raw/*502.12*/("""
	    	"""),format.raw/*503.7*/("""else"""),format.raw/*503.11*/("""{"""),format.raw/*503.12*/("""
	    		"""),format.raw/*504.8*/("""if($('input[name=isDepositOptional]:checked').val() == "true")"""),format.raw/*504.70*/("""{"""),format.raw/*504.71*/("""
	    			"""),format.raw/*505.9*/("""if($("#deposit").val() == null || $("#deposit").val() == "" || $('input[name=isRefundable]:checked').length<=0)"""),format.raw/*505.120*/("""{"""),format.raw/*505.121*/("""
	    				"""),format.raw/*506.10*/("""result = false;
	    	    		hideError('third')
	    			"""),format.raw/*508.9*/("""}"""),format.raw/*508.10*/("""
	    		"""),format.raw/*509.8*/("""}"""),format.raw/*509.9*/("""
	    	"""),format.raw/*510.7*/("""}"""),format.raw/*510.8*/("""
	        """),format.raw/*511.10*/("""break;
	    case "fivth":
	        if(formValidation())"""),format.raw/*513.30*/("""{"""),format.raw/*513.31*/("""
	        	"""),format.raw/*514.11*/("""result = true;
	        """),format.raw/*515.10*/("""}"""),format.raw/*515.11*/("""else"""),format.raw/*515.15*/("""{"""),format.raw/*515.16*/("""
	        	"""),format.raw/*516.11*/("""result = false;
	        	hideError('forth')
	        """),format.raw/*518.10*/("""}"""),format.raw/*518.11*/("""
	        """),format.raw/*519.10*/("""break;
	    case "final":
	    	if($("#email").val() == null || $("#email").val() == "" || $("#state").val() == null || $("#state").val() == "" || $("#locality").val() == null || $("#locality").val() == "" || $("#city").val() == null || $("#city").val() == "" || $("#mobile").val() == null || $("#mobile").val() == "" || $("#address").val() == null || $("#adress").val() == "")
	    		result = false;
	    	else"""),format.raw/*523.11*/("""{"""),format.raw/*523.12*/("""
	    		"""),format.raw/*524.8*/("""$("#sendOtp").click();
	    		//$("#common").submit();
	    		"""),format.raw/*526.8*/("""}"""),format.raw/*526.9*/("""
	    		"""),format.raw/*527.8*/("""break;
		"""),format.raw/*528.3*/("""}"""),format.raw/*528.4*/("""
		"""),format.raw/*529.3*/("""result = true;
		return result;
	"""),format.raw/*531.2*/("""}"""),format.raw/*531.3*/("""
	
	"""),format.raw/*533.2*/("""function hideError(id)"""),format.raw/*533.24*/("""{"""),format.raw/*533.25*/("""
		
		"""),format.raw/*535.3*/("""$('.error').show()
		setTimeout(function() """),format.raw/*536.25*/("""{"""),format.raw/*536.26*/("""
		    """),format.raw/*537.7*/("""$('.error').fadeOut('fast');
		"""),format.raw/*538.3*/("""}"""),format.raw/*538.4*/(""", 5000);
	"""),format.raw/*539.2*/("""}"""),format.raw/*539.3*/("""
	
	"""),format.raw/*541.2*/("""function submitFormSpecific(pid)"""),format.raw/*541.34*/("""{"""),format.raw/*541.35*/("""
		"""),format.raw/*542.3*/("""$("#productId").val(pid)
		$("#description2").val($("#description").val())
		var action = $('#specific').attr('action'); 
		$.ajax("""),format.raw/*545.10*/("""{"""),format.raw/*545.11*/("""
 	        """),format.raw/*546.11*/("""type: "POST",
 	       data: $("#specific").serialize(),
 	      url: action,
 			success: function(res) """),format.raw/*549.28*/("""{"""),format.raw/*549.29*/("""
 	        	
 	              
 	        	"""),format.raw/*552.12*/("""if(res!= "0")"""),format.raw/*552.25*/("""{"""),format.raw/*552.26*/("""
 	        		"""),format.raw/*553.13*/("""window.location.href = "/product/create/success/"+pid;
 	            """),format.raw/*554.15*/("""}"""),format.raw/*554.16*/("""else"""),format.raw/*554.20*/("""{"""),format.raw/*554.21*/("""
 	              """),format.raw/*555.17*/("""alert(res)
 	            	
 	            """),format.raw/*557.15*/("""}"""),format.raw/*557.16*/("""
 	        """),format.raw/*558.11*/("""}"""),format.raw/*558.12*/(""",
 	        error: function(err) """),format.raw/*559.32*/("""{"""),format.raw/*559.33*/("""
 	          
 	        """),format.raw/*561.11*/("""}"""),format.raw/*561.12*/("""
 	    """),format.raw/*562.7*/("""}"""),format.raw/*562.8*/(""");
	"""),format.raw/*563.2*/("""}"""),format.raw/*563.3*/("""
	"""),format.raw/*564.2*/("""</script>
""")))}),format.raw/*565.2*/("""
"""))}
  }

  def render(cityform:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(cityform)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (cityform) => apply(cityform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/createAd.scala.html
                  HASH: b60f4f15ab5cb5930850d004a66958efc6f07e63
                  MATRIX: 733->1|861->26|889->47|900->51|937->52|965->54|1130->192|1158->193|1200->207|1247->227|1276->228|1323->248|1361->258|1390->259|1432->273|1550->364|1579->365|1626->385|1666->397|1695->398|1737->412|1971->619|2000->620|2047->640|2093->658|2122->659|2164->673|2224->706|2253->707|2300->727|2339->738|2368->739|2410->753|2484->800|2513->801|2560->821|2598->831|2627->832|2669->846|2777->927|2806->928|2853->948|2908->976|2937->977|2979->991|3010->994|3039->995|3085->1013|3154->1054|3183->1055|3225->1069|3258->1074|3287->1075|3333->1093|3400->1132|3429->1133|3466->1143|3495->1144|3542->1164|3582->1176|3611->1177|3653->1191|3846->1357|3875->1358|3912->1368|3995->1423|4024->1424|4059->1432|4427->1773|4455->1774|4488->1780|6496->3759|6526->3760|6556->3761|6589->3765|6619->3766|6649->3767|6680->3769|6710->3770|6740->3771|6779->3781|6809->3782|6839->3783|7317->4232|7347->4233|7377->4234|7410->4238|7440->4239|7470->4240|7501->4242|7531->4243|7561->4244|7604->4257|7635->4258|7666->4259|8106->4670|8136->4671|8166->4672|8199->4676|8229->4677|8259->4678|8290->4680|8320->4681|8350->4682|8393->4695|8424->4696|8455->4697|12071->8285|12087->8291|12143->8325|26454->22608|26470->22614|26527->22649|26609->22702|26639->22703|26671->22707|26724->22731|26754->22732|26784->22733|26828->22748|26858->22749|26982->22844|27012->22845|27045->22850|27195->22972|27224->22973|27345->23065|27375->23066|27411->23074|27448->23082|27478->23083|27516->23093|27714->23262|27744->23263|27820->23310|27862->23323|27892->23324|27936->23339|28005->23379|28035->23380|28068->23384|28098->23385|28146->23404|28220->23449|28250->23450|28292->23463|28322->23464|28386->23499|28416->23500|28473->23528|28503->23529|28539->23537|28568->23538|28597->23539|28660->23574|28689->23575|28718->23576|28755->23585|28784->23586|28859->23632|28889->23633|28921->23637|28962->23649|28992->23650|29033->23662|29063->23663|29124->23696|29153->23697|29187->23703|29235->23722|29265->23723|29297->23727|29342->23743|29372->23744|29405->23749|29568->23884|29597->23885|29628->23888|29657->23889|29691->23895|29741->23916|29771->23917|29803->23921|29866->23955|29896->23956|30088->24119|30118->24120|30155->24129|30234->24180|30263->24181|30303->24192|30562->24422|30592->24423|30664->24466|30694->24467|30734->24478|31020->24735|31050->24736|31087->24745|31170->24799|31200->24800|31236->24808|31269->24812|31299->24813|31336->24822|31427->24884|31457->24885|31495->24895|31636->25006|31667->25007|31707->25018|31792->25075|31822->25076|31859->25085|31888->25086|31924->25094|31953->25095|31993->25106|32079->25163|32109->25164|32150->25176|32204->25201|32234->25202|32267->25206|32297->25207|32338->25219|32423->25275|32453->25276|32493->25287|32937->25702|32967->25703|33004->25712|33096->25776|33125->25777|33162->25786|33200->25796|33229->25797|33261->25801|33324->25836|33353->25837|33387->25843|33438->25865|33468->25866|33504->25874|33577->25918|33607->25919|33643->25927|33703->25959|33732->25960|33771->25971|33800->25972|33834->25978|33895->26010|33925->26011|33957->26015|34120->26149|34150->26150|34191->26162|34328->26270|34358->26271|34431->26315|34473->26328|34503->26329|34546->26343|34645->26413|34675->26414|34708->26418|34738->26419|34785->26437|34857->26480|34887->26481|34928->26493|34958->26494|35021->26528|35051->26529|35106->26555|35136->26556|35172->26564|35201->26565|35234->26570|35263->26571|35294->26574|35337->26586
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|36->9|36->9|37->10|38->11|38->11|40->13|40->13|40->13|41->14|44->17|44->17|46->19|46->19|46->19|47->20|54->27|54->27|56->29|56->29|56->29|57->30|58->31|58->31|60->33|60->33|60->33|61->34|62->35|62->35|64->37|64->37|64->37|65->38|67->40|67->40|69->42|69->42|69->42|70->43|70->43|70->43|71->44|72->45|72->45|73->46|73->46|73->46|74->47|75->48|75->48|76->49|76->49|78->51|78->51|78->51|79->52|83->56|83->56|84->57|84->57|84->57|85->58|97->70|97->70|98->71|129->102|129->102|129->102|129->102|129->102|129->102|129->102|129->102|129->102|129->102|129->102|129->102|135->108|135->108|135->108|135->108|135->108|135->108|135->108|135->108|135->108|135->108|135->108|135->108|140->113|140->113|140->113|140->113|140->113|140->113|140->113|140->113|140->113|140->113|140->113|140->113|208->181|208->181|208->181|454->427|454->427|454->427|456->429|456->429|457->430|457->430|457->430|457->430|457->430|457->430|460->433|460->433|461->434|465->438|465->438|467->440|467->440|468->441|468->441|468->441|469->442|474->447|474->447|477->450|477->450|477->450|478->451|479->452|479->452|479->452|479->452|480->453|482->455|482->455|483->456|483->456|484->457|484->457|486->459|486->459|487->460|487->460|487->460|489->462|489->462|489->462|491->464|491->464|493->466|493->466|494->467|494->467|494->467|494->467|494->467|496->469|496->469|498->471|498->471|498->471|499->472|499->472|499->472|500->473|504->477|504->477|505->478|505->478|507->480|507->480|507->480|508->481|509->482|509->482|514->487|514->487|515->488|517->490|517->490|518->491|521->494|521->494|522->495|522->495|523->496|526->499|526->499|527->500|529->502|529->502|530->503|530->503|530->503|531->504|531->504|531->504|532->505|532->505|532->505|533->506|535->508|535->508|536->509|536->509|537->510|537->510|538->511|540->513|540->513|541->514|542->515|542->515|542->515|542->515|543->516|545->518|545->518|546->519|550->523|550->523|551->524|553->526|553->526|554->527|555->528|555->528|556->529|558->531|558->531|560->533|560->533|560->533|562->535|563->536|563->536|564->537|565->538|565->538|566->539|566->539|568->541|568->541|568->541|569->542|572->545|572->545|573->546|576->549|576->549|579->552|579->552|579->552|580->553|581->554|581->554|581->554|581->554|582->555|584->557|584->557|585->558|585->558|586->559|586->559|588->561|588->561|589->562|589->562|590->563|590->563|591->564|592->565
                  -- GENERATED --
              */
          