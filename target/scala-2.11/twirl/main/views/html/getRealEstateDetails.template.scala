
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
object getRealEstateDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
"""),format.raw/*2.1*/("""<div class="total-ads main-grid-border">
		<div class="container">
			<div class="select-box">
				<div class="select-city-for-local-ads ads-list">
					<label>Select your city to see local ads</label>
						<select>
												<optgroup label="Popular Cities">
													<option selected style="display:none;color:#eee;">Entire USA</option>
													<option>Birmingham</option>
													<option>Anchorage</option>
													<option>Phoenix</option>
													<option>Little Rock</option>
													<option>Los Angeles</option>
													<option>Denver</option>
													<option>Bridgeport</option>
													<option>Wilmington</option>
													<option>Jacksonville</option>
													<option>Atlanta</option>
													<option>Honolulu</option>
													<option>Boise</option>
													<option>Chicago</option>
													<option>Indianapolis</option>
												</optgroup>
												<optgroup label="More Cities">
													<optgroup label="Alabama">
														<option>Birmingham</option>
														<option>Montgomery</option>
														<option>Mobile</option>
														<option>Huntsville</option>
														<option>Tuscaloosa</option>
													</optgroup>
													<optgroup label="Alaska">
														<option>Anchorage</option>
														<option>Fairbanks</option>
														<option>Juneau</option>
														<option>Sitka</option>
														<option>Ketchikan</option>
													</optgroup>
													<optgroup label="Arizona">
														<option>Phoenix</option>
														<option>Tucson</option>
														<option>Mesa</option>
														<option>Chandler</option>
														<option>Glendale</option>
													</optgroup>
													<optgroup label="Arkansas">
														<option>Little Rock</option>
														<option>Fort Smith</option>
														<option>Fayetteville</option>
														<option>Springdale</option>
														<option>Jonesboro</option>
													</optgroup>
													<optgroup label="California">
														<option>Los Angeles</option>
														<option>San Diego</option>
														<option>San Jose</option>
														<option>San Francisco</option>
														<option>Fresno</option>
													</optgroup>
													<optgroup label="Colorado">
														<option>Denver</option>
														<option>Colorado</option>
														<option>Aurora</option>
														<option>Fort Collins</option>
														<option>Lakewood</option>
													</optgroup>
													<optgroup label="Connecticut">
														<option>Bridgeport</option>
														<option>New Haven</option>
														<option>Hartford</option>
														<option>Stamford</option>
														<option>Waterbury</option>
													</optgroup>
													<optgroup label="Delaware">
														<option>Wilmington</option>
														<option>Dover</option>
														<option>Newark</option>
														<option>Bear</option>
														<option>Middletown</option>
													</optgroup>
													<optgroup label="Florida">
														<option>Jacksonville</option>
														<option>Miami</option>
														<option>Tampa</option>
														<option>St. Petersburg</option>
														<option>Orlando</option>
													</optgroup>
													<optgroup label="Georgia">
														<option>Atlanta</option>
														<option>Augusta</option>
														<option>Columbus</option>
														<option>Savannah</option>
														<option>Athens</option>
													</optgroup>
													<optgroup label="Hawaii">
														<option>Honolulu</option>
														<option>Pearl City</option>
														<option>Hilo</option>
														<option>Kailua</option>
														<option>Waipahu</option>
													</optgroup>
													<optgroup label="Idaho">
														<option>Boise</option>
														<option>Nampa</option>
														<option>Meridian</option>
														<option>Idaho Falls</option>
														<option>Pocatello</option>
													</optgroup>
													<optgroup label="Illinois">
														<option>Chicago</option>
														<option>Aurora</option>
														<option>Rockford</option>
														<option>Joliet</option>
														<option>Naperville</option>
													</optgroup>
													<optgroup label="Indiana">
														<option>Indianapolis</option>
														<option>Fort Wayne</option>
														<option>Evansville</option>
														<option>South Bend</option>
														<option>Hammond</option>														       
													</optgroup>
													<optgroup label="Iowa">
														<option>Des Moines</option>
														<option>Cedar Rapids</option>
														<option>Davenport</option>
														<option>Sioux City</option>
														<option>Waterloo</option>       													
													</optgroup>
													<optgroup label="Kansas">
														<option>Wichita</option>
														<option>Overland Park</option>
														<option>Kansas City</option>
														<option>Topeka</option>
														<option>Olathe  </option>            													
													</optgroup>
													<optgroup label="Kentucky">
														<option>Louisville</option>
														<option>Lexington</option>
														<option>Bowling Green</option>
														<option>Owensboro</option>
														<option>Covington</option>        														
													</optgroup>
													<optgroup label="Louisiana">
														<option>New Orleans</option>
														<option>Baton Rouge</option>
														<option>Shreveport</option>
														<option>Metairie</option>
														<option>Lafayette</option>          														
													</optgroup>
													<optgroup label="Maine">
														<option>Portland</option>
														<option>Lewiston</option>
														<option>Bangor</option>
														<option>South Portland</option>
														<option>Auburn</option>         														
													</optgroup>
													<optgroup label="Maryland">
														<option>Baltimore</option>
														<option>Frederick</option>
														<option>Rockville</option>
														<option>Gaithersburg</option>
														<option>Bowie</option>         														
													</optgroup>
													<optgroup label="Massachusetts">
														<option>Boston</option>
														<option>Worcester</option>
														<option>Springfield</option>
														<option>Lowell</option>
														<option>Cambridge</option>  
													</optgroup>
													<optgroup label="Michigan">
														<option>Detroit</option>
														<option>Grand Rapids</option>
														<option>Warren</option>
														<option>Sterling Heights</option>
														<option>Lansing</option> 
													</optgroup>
													<optgroup label="Minnesota">
														<option>Minneapolis</option>
														<option>St. Paul</option>
														<option>Rochester</option>
														<option>Duluth</option>
														<option>Bloomington</option>      														
													</optgroup>
													<optgroup label="Mississippi">
														<option>Jackson</option>
														<option>Gulfport</option>
														<option>Southaven</option>
														<option>Hattiesburg</option>
														<option>Biloxi</option>         														
													</optgroup>
													<optgroup label="Missouri">
														<option>Kansas City</option>
														<option>St. Louis</option>
														<option>Springfield</option>
														<option>Independence</option>
														<option>Columbia</option>            														
													</optgroup>
													<optgroup label="Montana">
														<option>Billings</option>
														<option>Missoula</option>
														<option>Great Falls</option>
														<option>Bozeman</option>
														<option>Butte-Silver Bow</option>         														
													</optgroup>
													<optgroup label="Nebraska">
														<option>Omaha</option>
														<option>Lincoln</option>
														<option>Bellevue</option>
														<option>Grand Island</option>
														<option>Kearney</option>        													
													</optgroup>
													<optgroup label="Nevada">
														<option>Las Vegas</option>
														<option>Henderson</option>
														<option>North Las Vegas</option>
														<option>Reno</option>
														<option>Sunrise Manor</option>            													
													</optgroup>
													<optgroup label="New Hampshire">
														<option>Manchesters</option>
														<option>Nashua</option>
														<option>Concord</option>
														<option>Dover</option>
														<option>Rochester</option>              													
													</optgroup>
													<optgroup label="New Jersey">
														<option>Newark</option>
														<option>Jersey City</option>
														<option>Paterson</option>
														<option>Elizabeth</option>
														<option>Edison</option> 
													</optgroup>
													<optgroup label="New Mexico">
														<option>Albuquerque</option>
														<option>Las Cruces</option>
														<option>Rio Rancho</option>
														<option>Santa Fe</option>
														<option>Roswell</option>       
													</optgroup>
													<optgroup label="New York">
														<option>New York</option>
														<option>Buffalo</option>
														<option>Rochester</option>
														<option>Yonkers</option>
														<option>Syracuse</option>        														
													</optgroup>
													<optgroup label="North Carolina">
														<option>Charlotte</option>
														<option>Raleigh</option>
														<option>Greensboro</option>
														<option>Winston-Salem</option>
														<option>Durham</option>          														
													</optgroup>
													<optgroup label="North Dakota">
														<option>Fargo</option>
														<option>Bismarck</option>
														<option>Grand Forks</option>
														<option>Minot</option>
														<option>West Fargo</option>
													</optgroup>
													<optgroup label="Ohio">
														<option>Columbus</option>
														<option>Cleveland</option>
														<option>Cincinnati</option>
														<option>Toledo</option>
														<option>Akron</option>      
													</optgroup>
													<optgroup label="Oklahoma">
														<option>Oklahoma City</option>
														<option>Tulsa</option>
														<option>Norman</option>
														<option>Broken Arrow</option>
														<option>Lawton</option>        														
													</optgroup>
													<optgroup label="Oregon">
														<option>Portland</option>
														<option>Eugene</option>
														<option>Salem</option>
														<option>Gresham</option>
														<option>Hillsboro</option>          														
													</optgroup>
													<optgroup label="Pennsylvania">
														<option>Philadelphia</option>
														<option>Pittsburgh</option>
														<option>Allentown</option>
														<option>Erie</option>
														<option>Reading</option>         														
													</optgroup>
													<optgroup label="Rhode Island">
														<option>Providence</option>
														<option>Warwick</option>
														<option>Cranston</option>
														<option>Pawtucket</option>
														<option>East Providence</option>   
													</optgroup>
													<optgroup label="South Carolina">
														<option>Columbia</option>
														<option>Charleston</option>
														<option>North Charleston</option>
														<option>Mount Pleasant</option>
														<option>Rock Hill</option> 
													</optgroup>
													<optgroup label="South Dakota">
														<option>Sioux Falls</option>
														<option>Rapid City</option>
														<option>Aberdeen</option>
														<option>Brookings</option>
														<option>Watertown</option> 
													</optgroup>
													<optgroup label="Tennessee">
														<option>Memphis</option>
														<option>Nashville</option>
														<option>Knoxville</option>
														<option>Chattanooga</option>
														<option>Clarksville</option>       
													</optgroup>
													<optgroup label="Texas">
														<option>Houston</option>
														<option>San Antonio</option>
														<option>Dallas</option>
														<option>Austin</option>
														<option>Fort Worth</option>   
													</optgroup>
													<optgroup label="Utah">
														<option>Salt Lake City</option>
														<option>West Valley City</option>
														<option>Provo</option>
														<option>West Jordan</option>
														<option>Orem</option>   
													</optgroup>	
													<optgroup label="Vermont">
														<option>Burlington</option>
														<option>Essex</option>
														<option>South Burlington</option>
														<option>Colchester</option>
														<option>Rutland</option>   
													</optgroup>
													<optgroup label="Virginia">
														<option>Virginia Beach</option>
														<option>Norfolk</option>
														<option>Chesapeake</option>
														<option>Arlington</option>
														<option>Richmond</option> 
													</optgroup>	
													<optgroup label="Washington">
														<option>Seattle</option>
														<option>Spokane</option>
														<option>Tacoma</option>
														<option>Vancouver</option>
														<option>Bellevue</option> 
													</optgroup>	
													<optgroup label="West Virginia">
														<option>Charleston</option>
														<option>Huntington</option>
														<option>Parkersburg</option>
														<option>Morgantown</option>
														<option>Wheeling</option> 
													</optgroup>	
													<optgroup label="Wisconsin">
														<option>Milwaukee</option>
														<option>Madison</option>
														<option>Green Bay</option>
														<option>Kenosha</option>
														<option>Racine</option>
													</optgroup>
													<optgroup label="Wyoming">
														<option>Cheyenne</option>
														<option>Casper</option>
														<option>Laramie</option>
														<option>Gillette</option>
														<option>Rock Springs</option>
													</optgroup>			
												</optgroup>
			            </select>
				</div>
				<div class="browse-category ads-list">
					<label>Browse Categories</label>
					<select class="selectpicker show-tick" data-live-search="true">
					  <option data-tokens="Real Estate">Real Estate</option>
					  <option data-tokens="Mobiles">Mobiles</option>
					  <option data-tokens="Electronics & Appliances">Electronics & Appliances</option>
					  <option data-tokens="Cars">Cars</option>
					  <option data-tokens="Bikes">Bikes</option>
					  <option data-tokens="Furniture">Furniture</option>
					  <option data-tokens="Pets">Pets</option>
					  <option data-tokens="Books, Sports & Hobbies">Books, Sports & Hobbies</option>
					  <option data-tokens="Fashion">Fashion</option>
					  <option data-tokens="Kids">Kids</option>
					  <option data-tokens="Services">Services</option>
					  <option data-tokens="Jobs">Jobs</option>
					</select>
				</div>
				<div class="search-product ads-list">
					<label>Search for a specific product</label>
					<div class="search">
						<div id="custom-search-input">
						<div class="input-group">
							<input type="text" class="form-control input-lg" placeholder="Buscar" />
							<span class="input-group-btn">
								<button class="btn btn-info btn-lg" type="button">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</span>
						</div>
					</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<ol class="breadcrumb" style="margin-bottom: 5px;">
			  <li><a href="/dashboard">Home</a></li>
			  <li><a href="/categories">Categories</a></li>
			  <li class="active">Real Estate</li>
			</ol>
			<div class="ads-grid">
				<div class="side-bar col-md-3">
					<div class="search-hotel">
					<h3 class="sear-head">Name contains</h3>
					<form>
						<input type="text" value="Product name..." onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*423.107*/("""{"""),format.raw/*423.108*/("""this.value = 'Product name...';"""),format.raw/*423.139*/("""}"""),format.raw/*423.140*/("""" required="">
						<input type="submit" value=" ">
					</form>
				</div>
				
				<div class="range">
					<h3 class="sear-head">Price range</h3>
							<ul class="dropdown-menu6">
								<li>
									                
									<div id="slider-range"></div>							
										<input type="text" id="amount" style="border: 0; color: #ffffff; font-weight: normal;" />
									</li>			
							</ul>
							<!---->
							<script type="text/javascript" src="js/jquery-ui.js"></script>
							<script type='text/javascript'>//<![CDATA[ 
							$(window).load(function()"""),format.raw/*440.33*/("""{"""),format.raw/*440.34*/("""
							 """),format.raw/*441.9*/("""$( "#slider-range" ).slider("""),format.raw/*441.37*/("""{"""),format.raw/*441.38*/("""
										"""),format.raw/*442.11*/("""range: true,
										min: 0,
										max: 9000,
										values: [ 50, 6000 ],
										slide: function( event, ui ) """),format.raw/*446.40*/("""{"""),format.raw/*446.41*/("""  """),format.raw/*446.43*/("""$( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
										"""),format.raw/*447.11*/("""}"""),format.raw/*447.12*/("""
							 """),format.raw/*448.9*/("""}"""),format.raw/*448.10*/(""");
							$( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) + " - $" + $( "#slider-range" ).slider( "values", 1 ) );

							"""),format.raw/*451.8*/("""}"""),format.raw/*451.9*/(""");//]]>  

							</script>
							
				</div>
				<div class="brand-select">
					<h3 class="sear-head">Category</h3>
					  <select class="selectpicker" data-live-search="">
					  <option data-tokens="All">All</option>
					  <option data-tokens="Rent">Rent</option>
					  <option data-tokens="Sale">Sale</option>
					</select>
				</div>
				<div class="featured-ads">
					<h2 class="sear-head fer">Featured Ads</h2>
					<div class="featured-ad">
						<a href="single.html">
							<div class="featured-ad-left">
								<img src="images/f1.jpg" title="ad image" alt="" />
							</div>
							<div class="featured-ad-right">
								<h4>Lorem Ipsum is simply dummy text of the printing industry</h4>
								<p>$ 450</p>
							</div>
							<div class="clearfix"></div>
						</a>
					</div>
					<div class="featured-ad">
						<a href="single.html">
							<div class="featured-ad-left">
								<img src="images/f2.jpg" title="ad image" alt="" />
							</div>
							<div class="featured-ad-right">
								<h4>Lorem Ipsum is simply dummy text of the printing industry</h4>
								<p>$ 380</p>
							</div>
							<div class="clearfix"></div>
						</a>
					</div>
					<div class="featured-ad">
						<a href="single.html">
							<div class="featured-ad-left">
								<img src="images/f3.jpg" title="ad image" alt="" />
							</div>
							<div class="featured-ad-right">
								<h4>Lorem Ipsum is simply dummy text of the printing industry</h4>
								<p>$ 560</p>
							</div>
							<div class="clearfix"></div>
						</a>
					</div>
					<div class="clearfix"></div>
				</div>
				</div>
				<div class="ads-display col-md-9">
					<div class="wrapper">					
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
					  <ul id="myTab" class="nav nav-tabs nav-tabs-responsive" role="tablist">
						<li role="presentation" class="active">
						  <a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">
							<span class="text">All Ads</span>
						  </a>
						</li>
						<li role="presentation" class="next">
						  <a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">
							<span class="text">Ads with Photos</span>
						  </a>
						</li>
					  </ul>
					  <div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
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
							<ul class="list">
								<a href="single.html">
									<li>
									<img src="images/r1.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$290</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:55</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r2.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">It is a long established fact that a reader</h5>
									<span class="adprice">$310</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:45</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r3.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">Contrary to popular belief, Lorem Ipsum is not</h5>
									<span class="adprice">$190</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:30</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r4.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">The standard chunk of Lorem Ipsum used since the</h5>
									<span class="adprice">$480</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:25</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r5.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">Sed ut perspiciatis unde omnis iste natus error sit voluptatem</h5>
									<span class="adprice">$859</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:24</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r6.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">But I must explain to you how all this mistaken idea of denouncing</h5>
									<span class="adprice">$1299</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:22</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r1.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis</h5>
									<span class="adprice">$1099</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:21</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r7.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">On the other hand, we denounce with righteous dislike men</h5>
									<span class="adprice">$290</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:20</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r8.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$899</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:05</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r9.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et qua</h5>
									<span class="adprice">$199</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:04</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r10.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">There are many variations of passages of Lorem Ipsum</h5>
									<span class="adprice">$250</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:03</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r11.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">who are so beguiled and demoralized by the charms of pleasure of the moment</h5>
									<span class="adprice">$189</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:03</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r12.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">you need to be sure there isn't anything embarrassing hidden</h5>
									<span class="adprice">$1090</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:03</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								</a>
								<a href="single.html">
									<li>
									<img src="images/r13.jpg" title="" alt="" />
									<section class="list-left">
									<h5 class="title">looked up one of the more obscure Latin words</h5>
									<span class="adprice">$599</span>
									<p class="catpath">Real Estate � PG & Roommates</p>
									</section>
									<section class="list-right">
									<span class="date">Today, 17:02</span>
									<span class="cityname">City name</span>
									</section>
									<div class="clearfix"></div>
									</li> 
								<div class="clearfix"></div>
								</a>
							</ul>
						</div>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
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
	</div>
	
	<script type="text/javascript">
$(document).ready(function () """),format.raw/*818.31*/("""{"""),format.raw/*818.32*/("""    
"""),format.raw/*819.1*/("""var elem=$('#container ul');      
	$('#viewcontrols a').on('click',function(e) """),format.raw/*820.46*/("""{"""),format.raw/*820.47*/("""
		"""),format.raw/*821.3*/("""if ($(this).hasClass('gridview')) """),format.raw/*821.37*/("""{"""),format.raw/*821.38*/("""
			"""),format.raw/*822.4*/("""elem.fadeOut(1000, function () """),format.raw/*822.35*/("""{"""),format.raw/*822.36*/("""
				"""),format.raw/*823.5*/("""$('#container ul').removeClass('list').addClass('grid');
				$('#viewcontrols').removeClass('view-controls-list').addClass('view-controls-grid');
				$('#viewcontrols .gridview').addClass('active');
				$('#viewcontrols .listview').removeClass('active');
				elem.fadeIn(1000);
			"""),format.raw/*828.4*/("""}"""),format.raw/*828.5*/(""");						
		"""),format.raw/*829.3*/("""}"""),format.raw/*829.4*/("""
		"""),format.raw/*830.3*/("""else if($(this).hasClass('listview')) """),format.raw/*830.41*/("""{"""),format.raw/*830.42*/("""
			"""),format.raw/*831.4*/("""elem.fadeOut(1000, function () """),format.raw/*831.35*/("""{"""),format.raw/*831.36*/("""
				"""),format.raw/*832.5*/("""$('#container ul').removeClass('grid').addClass('list');
				$('#viewcontrols').removeClass('view-controls-grid').addClass('view-controls-list');
				$('#viewcontrols .gridview').removeClass('active');
				$('#viewcontrols .listview').addClass('active');
				elem.fadeIn(1000);
			"""),format.raw/*837.4*/("""}"""),format.raw/*837.5*/(""");									
		"""),format.raw/*838.3*/("""}"""),format.raw/*838.4*/("""
	"""),format.raw/*839.2*/("""}"""),format.raw/*839.3*/(""");
	getRealEstateDetails();
"""),format.raw/*841.1*/("""}"""),format.raw/*841.2*/(""");

function getRealEstateDetails()"""),format.raw/*843.32*/("""{"""),format.raw/*843.33*/("""
	"""),format.raw/*844.2*/("""$.get("/getRealEstateDetails?productTypeId=1", function(data,status,xhr) """),format.raw/*844.75*/("""{"""),format.raw/*844.76*/("""
		
   		"""),format.raw/*846.6*/("""$.each(data, function(i, item) """),format.raw/*846.37*/("""{"""),format.raw/*846.38*/("""
   			"""),format.raw/*847.7*/("""//alert(item.title);
   			//document.getElementById("title").value=item.title;
   			//alert(item.title)
   			//for(int j=0;j<=i)
    			var date=convert(item.postedDate);
//    			$("#title").text(item.title);
//    			$("#adprice").text(item.price);
//    			$("#date").text(date);
//    			$("#cityname").text(item.city);
   			var id=1;
   			$("#list").append("<a href=javascript:getProductDetails("+id+")><li><img src='"+item.imagePath+"' title='' alt=''' /><section class='list-left'><h5 class='title'>"+item.title+"</h5><span class='adprice'>"+item.price+"</span><p class='catpath'>Real Estate � PG & Roommates</p></section><section class='list-right'><span class='date'>"+date+"</span><span class='cityname'></span></section><div class='clearfix'></div></li></a>");
   			
   		"""),format.raw/*859.6*/("""}"""),format.raw/*859.7*/(""");
   		
	"""),format.raw/*861.2*/("""}"""),format.raw/*861.3*/(""");
	
"""),format.raw/*863.1*/("""}"""),format.raw/*863.2*/("""
"""),format.raw/*864.1*/("""function getProductDetails(Id)"""),format.raw/*864.31*/("""{"""),format.raw/*864.32*/("""
	
	"""),format.raw/*866.2*/("""window.location.href ="/productDetails?productId=" + Id;
"""),format.raw/*867.1*/("""}"""),format.raw/*867.2*/("""
"""),format.raw/*868.1*/("""function convert(str) """),format.raw/*868.23*/("""{"""),format.raw/*868.24*/("""

	"""),format.raw/*870.2*/("""var datePosted = new Date(str);
	var dd = datePosted.getDate();
	var mm = datePosted.getMonth() + 1;
	var y = datePosted.getFullYear();
	var retVal = y + '-' + mm + '-' + dd;
	var posted = retVal + datePosted.getHours() + ":"
			+ datePosted.getMinutes() + ":" + datePosted.getSeconds();
	return posted;

"""),format.raw/*879.1*/("""}"""),format.raw/*879.2*/("""
"""),format.raw/*880.1*/("""</script>
	""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:52:41 IST 2018
                  SOURCE: D:/NewFolder/RENTEASY/app/views/getRealEstateDetails.scala.html
                  HASH: 9086a489978838c41fad9084fa715f80527e38d8
                  MATRIX: 813->1|824->5|861->6|889->8|18226->17315|18257->17316|18318->17347|18349->17348|18964->17934|18994->17935|19032->17945|19089->17973|19119->17974|19160->17986|19316->18113|19346->18114|19377->18116|19487->18197|19517->18198|19555->18208|19585->18209|19760->18356|19789->18357|33591->32130|33621->32131|33655->32137|33765->32218|33795->32219|33827->32223|33890->32257|33920->32258|33953->32263|34013->32294|34043->32295|34077->32301|34391->32587|34420->32588|34460->32600|34489->32601|34521->32605|34588->32643|34618->32644|34651->32649|34711->32680|34741->32681|34775->32687|35089->32973|35118->32974|35161->32989|35190->32990|35221->32993|35250->32994|35308->33024|35337->33025|35403->33062|35433->33063|35464->33066|35566->33139|35596->33140|35635->33151|35695->33182|35725->33183|35761->33191|36590->33992|36619->33993|36659->34005|36688->34006|36723->34013|36752->34014|36782->34016|36841->34046|36871->34047|36905->34053|36991->34111|37020->34112|37050->34114|37101->34136|37131->34137|37164->34142|37506->34456|37535->34457|37565->34459
                  LINES: 29->1|29->1|29->1|30->2|451->423|451->423|451->423|451->423|468->440|468->440|469->441|469->441|469->441|470->442|474->446|474->446|474->446|475->447|475->447|476->448|476->448|479->451|479->451|846->818|846->818|847->819|848->820|848->820|849->821|849->821|849->821|850->822|850->822|850->822|851->823|856->828|856->828|857->829|857->829|858->830|858->830|858->830|859->831|859->831|859->831|860->832|865->837|865->837|866->838|866->838|867->839|867->839|869->841|869->841|871->843|871->843|872->844|872->844|872->844|874->846|874->846|874->846|875->847|887->859|887->859|889->861|889->861|891->863|891->863|892->864|892->864|892->864|894->866|895->867|895->867|896->868|896->868|896->868|898->870|907->879|907->879|908->880
                  -- GENERATED --
              */
          