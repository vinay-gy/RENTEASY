// @SOURCE:D:/NewFolder/RENTEASY/conf/routes
// @HASH:012a3c93606f5f47b264d9dda367f2badc7261c6
// @DATE:Thu Jan 11 15:52:33 IST 2018


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("",play.crud.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Assets_at0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index1_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page
 Home page""", Routes.prefix + """"""))
        

// @LINE:10
private[this] lazy val controllers_ProductController_create2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createAd"))))
private[this] lazy val controllers_ProductController_create2_invoker = createInvoker(
controllers.ProductController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "create", Nil,"GET", """""", Routes.prefix + """createAd"""))
        

// @LINE:11
private[this] lazy val controllers_ProductController_getProductForm3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getForm/"),DynamicPart("productID", """[^/]+""",true))))
private[this] lazy val controllers_ProductController_getProductForm3_invoker = createInvoker(
controllers.ProductController.getProductForm(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "getProductForm", Seq(classOf[String]),"GET", """""", Routes.prefix + """getForm/$productID<[^/]+>"""))
        

// @LINE:13
lazy val play_crud_Routes4 = Include(play.crud.Routes)
        

// @LINE:17
private[this] lazy val controllers_CategoryController_categoryList5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/list"))))
private[this] lazy val controllers_CategoryController_categoryList5_invoker = createInvoker(
controllers.CategoryController.categoryList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoryController", "categoryList", Nil,"GET", """""", Routes.prefix + """category/list"""))
        

// @LINE:18
private[this] lazy val controllers_CategoryController_subCategoryList6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subcategory/"),DynamicPart("categoryId", """[^/]+""",true))))
private[this] lazy val controllers_CategoryController_subCategoryList6_invoker = createInvoker(
controllers.CategoryController.subCategoryList(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoryController", "subCategoryList", Seq(classOf[String]),"GET", """""", Routes.prefix + """subcategory/$categoryId<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_loginController_login7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_loginController_login7_invoker = createInvoker(
controllers.loginController.login(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "login", Seq(classOf[String]),"GET", """""", Routes.prefix + """login"""))
        

// @LINE:23
private[this] lazy val controllers_loginController_logout8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_loginController_logout8_invoker = createInvoker(
controllers.loginController.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:24
private[this] lazy val controllers_loginController_signUp9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_loginController_signUp9_invoker = createInvoker(
controllers.loginController.signUp(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "signUp", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:25
private[this] lazy val controllers_loginController_save10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveSignupDetails"))))
private[this] lazy val controllers_loginController_save10_invoker = createInvoker(
controllers.loginController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "save", Nil,"POST", """""", Routes.prefix + """saveSignupDetails"""))
        

// @LINE:26
private[this] lazy val controllers_loginController_encryptAES11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("encryptpass"))))
private[this] lazy val controllers_loginController_encryptAES11_invoker = createInvoker(
controllers.loginController.encryptAES(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "encryptAES", Seq(classOf[String]),"GET", """""", Routes.prefix + """encryptpass"""))
        

// @LINE:27
private[this] lazy val controllers_loginController_authenticate12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate"))))
private[this] lazy val controllers_loginController_authenticate12_invoker = createInvoker(
controllers.loginController.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "authenticate", Nil,"POST", """""", Routes.prefix + """validate"""))
        

// @LINE:31
private[this] lazy val controllers_Application_locations13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("locations"))))
private[this] lazy val controllers_Application_locations13_invoker = createInvoker(
controllers.Application.locations(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "locations", Nil,"GET", """""", Routes.prefix + """locations"""))
        

// @LINE:32
private[this] lazy val controllers_Application_saveLocation14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/location/"),DynamicPart("location", """[^/]+""",true))))
private[this] lazy val controllers_Application_saveLocation14_invoker = createInvoker(
controllers.Application.saveLocation(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "saveLocation", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/location/$location<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_CustomerController_customerInfo15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("customer/"),DynamicPart("customerId", """[^/]+""",true))))
private[this] lazy val controllers_CustomerController_customerInfo15_invoker = createInvoker(
controllers.CustomerController.customerInfo(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "customerInfo", Seq(classOf[String]),"GET", """""", Routes.prefix + """customer/$customerId<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_CustomerController_validateEmail16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate/email/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_CustomerController_validateEmail16_invoker = createInvoker(
controllers.CustomerController.validateEmail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "validateEmail", Seq(classOf[String]),"GET", """""", Routes.prefix + """validate/email/$email<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_CustomerController_validateMobile17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate/mobile/"),DynamicPart("mobile", """[^/]+""",true))))
private[this] lazy val controllers_CustomerController_validateMobile17_invoker = createInvoker(
controllers.CustomerController.validateMobile(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "validateMobile", Seq(classOf[String]),"GET", """""", Routes.prefix + """validate/mobile/$mobile<[^/]+>"""))
        

// @LINE:42
private[this] lazy val controllers_ProductController_productDetails18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/"),DynamicPart("pid", """[^/]+""",true))))
private[this] lazy val controllers_ProductController_productDetails18_invoker = createInvoker(
controllers.ProductController.productDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "productDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """product/$pid<[^/]+>"""))
        

// @LINE:43
private[this] lazy val controllers_ProductController_productTypeList19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("producttype/"),DynamicPart("subCatId", """[^/]+""",true))))
private[this] lazy val controllers_ProductController_productTypeList19_invoker = createInvoker(
controllers.ProductController.productTypeList(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "productTypeList", Seq(classOf[String]),"GET", """""", Routes.prefix + """producttype/$subCatId<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_ProductController_save20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/save"))))
private[this] lazy val controllers_ProductController_save20_invoker = createInvoker(
controllers.ProductController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "save", Nil,"POST", """""", Routes.prefix + """product/save"""))
        

// @LINE:45
private[this] lazy val controllers_RealEstateController_createResidential21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/residential/create"))))
private[this] lazy val controllers_RealEstateController_createResidential21_invoker = createInvoker(
controllers.RealEstateController.createResidential(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "createResidential", Nil,"GET", """""", Routes.prefix + """product/residential/create"""))
        

// @LINE:46
private[this] lazy val controllers_RealEstateController_createCommercial22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/commercial/create"))))
private[this] lazy val controllers_RealEstateController_createCommercial22_invoker = createInvoker(
controllers.RealEstateController.createCommercial(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "createCommercial", Nil,"GET", """""", Routes.prefix + """product/commercial/create"""))
        

// @LINE:47
private[this] lazy val controllers_RealEstateController_saveRealEstateResidential23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/residential/save"))))
private[this] lazy val controllers_RealEstateController_saveRealEstateResidential23_invoker = createInvoker(
controllers.RealEstateController.saveRealEstateResidential(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "saveRealEstateResidential", Nil,"POST", """""", Routes.prefix + """product/residential/save"""))
        

// @LINE:48
private[this] lazy val controllers_RealEstateController_saveRealEstateCommercial24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/commercial/save"))))
private[this] lazy val controllers_RealEstateController_saveRealEstateCommercial24_invoker = createInvoker(
controllers.RealEstateController.saveRealEstateCommercial(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "saveRealEstateCommercial", Nil,"POST", """""", Routes.prefix + """product/commercial/save"""))
        

// @LINE:49
private[this] lazy val controllers_ProductController_successPage25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/create/success/"),DynamicPart("pid", """[^/]+""",true))))
private[this] lazy val controllers_ProductController_successPage25_invoker = createInvoker(
controllers.ProductController.successPage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "successPage", Seq(classOf[String]),"GET", """""", Routes.prefix + """product/create/success/$pid<[^/]+>"""))
        

// @LINE:51
private[this] lazy val controllers_VehicleController_create26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/vehicles/create"))))
private[this] lazy val controllers_VehicleController_create26_invoker = createInvoker(
controllers.VehicleController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VehicleController", "create", Nil,"GET", """""", Routes.prefix + """product/vehicles/create"""))
        

// @LINE:52
private[this] lazy val controllers_VehicleController_save27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/vehicles/save"))))
private[this] lazy val controllers_VehicleController_save27_invoker = createInvoker(
controllers.VehicleController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.VehicleController", "save", Nil,"POST", """""", Routes.prefix + """product/vehicles/save"""))
        

// @LINE:54
private[this] lazy val controllers_ComputersController_create28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/computers/create"))))
private[this] lazy val controllers_ComputersController_create28_invoker = createInvoker(
controllers.ComputersController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ComputersController", "create", Nil,"GET", """""", Routes.prefix + """product/computers/create"""))
        

// @LINE:55
private[this] lazy val controllers_ComputersController_save29_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/computers/save"))))
private[this] lazy val controllers_ComputersController_save29_invoker = createInvoker(
controllers.ComputersController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ComputersController", "save", Nil,"POST", """""", Routes.prefix + """product/computers/save"""))
        

// @LINE:57
private[this] lazy val controllers_CameraController_create30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/cameras/create"))))
private[this] lazy val controllers_CameraController_create30_invoker = createInvoker(
controllers.CameraController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CameraController", "create", Nil,"GET", """""", Routes.prefix + """product/cameras/create"""))
        

// @LINE:58
private[this] lazy val controllers_CameraController_save31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/cameras/save"))))
private[this] lazy val controllers_CameraController_save31_invoker = createInvoker(
controllers.CameraController.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CameraController", "save", Nil,"POST", """""", Routes.prefix + """product/cameras/save"""))
        

// @LINE:60
private[this] lazy val controllers_dashboardController_category32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categories"))))
private[this] lazy val controllers_dashboardController_category32_invoker = createInvoker(
controllers.dashboardController.category(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.dashboardController", "category", Nil,"GET", """""", Routes.prefix + """categories"""))
        

// @LINE:61
private[this] lazy val controllers_ProductController_getAdDetails33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getAdDetails"))))
private[this] lazy val controllers_ProductController_getAdDetails33_invoker = createInvoker(
controllers.ProductController.getAdDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "getAdDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """getAdDetails"""))
        

// @LINE:62
private[this] lazy val controllers_RealEstateController_getRealEstate34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getrealestate"))))
private[this] lazy val controllers_RealEstateController_getRealEstate34_invoker = createInvoker(
controllers.RealEstateController.getRealEstate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getRealEstate", Nil,"GET", """""", Routes.prefix + """getrealestate"""))
        

// @LINE:63
private[this] lazy val controllers_RealEstateController_productDetails35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("productDetails"))))
private[this] lazy val controllers_RealEstateController_productDetails35_invoker = createInvoker(
controllers.RealEstateController.productDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "productDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """productDetails"""))
        

// @LINE:64
private[this] lazy val controllers_RealEstateController_getRealEstateDetails36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getRealEstateDetails"))))
private[this] lazy val controllers_RealEstateController_getRealEstateDetails36_invoker = createInvoker(
controllers.RealEstateController.getRealEstateDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getRealEstateDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """getRealEstateDetails"""))
        

// @LINE:65
private[this] lazy val controllers_RealEstateController_getproductDetails37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getproductDetails"))))
private[this] lazy val controllers_RealEstateController_getproductDetails37_invoker = createInvoker(
controllers.RealEstateController.getproductDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getproductDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """getproductDetails"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createAd""","""controllers.ProductController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getForm/$productID<[^/]+>""","""controllers.ProductController.getProductForm(productID:String)"""),play.crud.Routes.documentation,("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/list""","""controllers.CategoryController.categoryList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subcategory/$categoryId<[^/]+>""","""controllers.CategoryController.subCategoryList(categoryId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.loginController.login(message:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.loginController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.loginController.signUp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveSignupDetails""","""controllers.loginController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """encryptpass""","""controllers.loginController.encryptAES(password:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate""","""controllers.loginController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """locations""","""controllers.Application.locations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/location/$location<[^/]+>""","""controllers.Application.saveLocation(location:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """customer/$customerId<[^/]+>""","""controllers.CustomerController.customerInfo(customerId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate/email/$email<[^/]+>""","""controllers.CustomerController.validateEmail(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate/mobile/$mobile<[^/]+>""","""controllers.CustomerController.validateMobile(mobile:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/$pid<[^/]+>""","""controllers.ProductController.productDetails(pid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """producttype/$subCatId<[^/]+>""","""controllers.ProductController.productTypeList(subCatId:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/save""","""controllers.ProductController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/residential/create""","""controllers.RealEstateController.createResidential()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/commercial/create""","""controllers.RealEstateController.createCommercial()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/residential/save""","""controllers.RealEstateController.saveRealEstateResidential()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/commercial/save""","""controllers.RealEstateController.saveRealEstateCommercial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/create/success/$pid<[^/]+>""","""controllers.ProductController.successPage(pid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/vehicles/create""","""controllers.VehicleController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/vehicles/save""","""controllers.VehicleController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/computers/create""","""controllers.ComputersController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/computers/save""","""controllers.ComputersController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/cameras/create""","""controllers.CameraController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/cameras/save""","""controllers.CameraController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categories""","""controllers.dashboardController.category()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getAdDetails""","""controllers.ProductController.getAdDetails(categoryId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getrealestate""","""controllers.RealEstateController.getRealEstate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """productDetails""","""controllers.RealEstateController.productDetails(productId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getRealEstateDetails""","""controllers.RealEstateController.getRealEstateDetails(productTypeId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getproductDetails""","""controllers.RealEstateController.getproductDetails(productId:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Assets_at0_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:9
case controllers_Application_index1_route(params) => {
   call { 
        controllers_Application_index1_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:10
case controllers_ProductController_create2_route(params) => {
   call { 
        controllers_ProductController_create2_invoker.call(controllers.ProductController.create())
   }
}
        

// @LINE:11
case controllers_ProductController_getProductForm3_route(params) => {
   call(params.fromPath[String]("productID", None)) { (productID) =>
        controllers_ProductController_getProductForm3_invoker.call(controllers.ProductController.getProductForm(productID))
   }
}
        

// @LINE:13
case play_crud_Routes4(handler) => handler
        

// @LINE:17
case controllers_CategoryController_categoryList5_route(params) => {
   call { 
        controllers_CategoryController_categoryList5_invoker.call(controllers.CategoryController.categoryList())
   }
}
        

// @LINE:18
case controllers_CategoryController_subCategoryList6_route(params) => {
   call(params.fromPath[String]("categoryId", None)) { (categoryId) =>
        controllers_CategoryController_subCategoryList6_invoker.call(controllers.CategoryController.subCategoryList(categoryId))
   }
}
        

// @LINE:22
case controllers_loginController_login7_route(params) => {
   call(params.fromQuery[String]("message", Some(""))) { (message) =>
        controllers_loginController_login7_invoker.call(controllers.loginController.login(message))
   }
}
        

// @LINE:23
case controllers_loginController_logout8_route(params) => {
   call { 
        controllers_loginController_logout8_invoker.call(controllers.loginController.logout())
   }
}
        

// @LINE:24
case controllers_loginController_signUp9_route(params) => {
   call { 
        controllers_loginController_signUp9_invoker.call(controllers.loginController.signUp())
   }
}
        

// @LINE:25
case controllers_loginController_save10_route(params) => {
   call { 
        controllers_loginController_save10_invoker.call(controllers.loginController.save())
   }
}
        

// @LINE:26
case controllers_loginController_encryptAES11_route(params) => {
   call(params.fromQuery[String]("password", None)) { (password) =>
        controllers_loginController_encryptAES11_invoker.call(controllers.loginController.encryptAES(password))
   }
}
        

// @LINE:27
case controllers_loginController_authenticate12_route(params) => {
   call { 
        controllers_loginController_authenticate12_invoker.call(controllers.loginController.authenticate())
   }
}
        

// @LINE:31
case controllers_Application_locations13_route(params) => {
   call { 
        controllers_Application_locations13_invoker.call(controllers.Application.locations())
   }
}
        

// @LINE:32
case controllers_Application_saveLocation14_route(params) => {
   call(params.fromPath[String]("location", None)) { (location) =>
        controllers_Application_saveLocation14_invoker.call(controllers.Application.saveLocation(location))
   }
}
        

// @LINE:36
case controllers_CustomerController_customerInfo15_route(params) => {
   call(params.fromPath[String]("customerId", None)) { (customerId) =>
        controllers_CustomerController_customerInfo15_invoker.call(controllers.CustomerController.customerInfo(customerId))
   }
}
        

// @LINE:37
case controllers_CustomerController_validateEmail16_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_CustomerController_validateEmail16_invoker.call(controllers.CustomerController.validateEmail(email))
   }
}
        

// @LINE:38
case controllers_CustomerController_validateMobile17_route(params) => {
   call(params.fromPath[String]("mobile", None)) { (mobile) =>
        controllers_CustomerController_validateMobile17_invoker.call(controllers.CustomerController.validateMobile(mobile))
   }
}
        

// @LINE:42
case controllers_ProductController_productDetails18_route(params) => {
   call(params.fromPath[String]("pid", None)) { (pid) =>
        controllers_ProductController_productDetails18_invoker.call(controllers.ProductController.productDetails(pid))
   }
}
        

// @LINE:43
case controllers_ProductController_productTypeList19_route(params) => {
   call(params.fromPath[String]("subCatId", None)) { (subCatId) =>
        controllers_ProductController_productTypeList19_invoker.call(controllers.ProductController.productTypeList(subCatId))
   }
}
        

// @LINE:44
case controllers_ProductController_save20_route(params) => {
   call { 
        controllers_ProductController_save20_invoker.call(controllers.ProductController.save())
   }
}
        

// @LINE:45
case controllers_RealEstateController_createResidential21_route(params) => {
   call { 
        controllers_RealEstateController_createResidential21_invoker.call(controllers.RealEstateController.createResidential())
   }
}
        

// @LINE:46
case controllers_RealEstateController_createCommercial22_route(params) => {
   call { 
        controllers_RealEstateController_createCommercial22_invoker.call(controllers.RealEstateController.createCommercial())
   }
}
        

// @LINE:47
case controllers_RealEstateController_saveRealEstateResidential23_route(params) => {
   call { 
        controllers_RealEstateController_saveRealEstateResidential23_invoker.call(controllers.RealEstateController.saveRealEstateResidential())
   }
}
        

// @LINE:48
case controllers_RealEstateController_saveRealEstateCommercial24_route(params) => {
   call { 
        controllers_RealEstateController_saveRealEstateCommercial24_invoker.call(controllers.RealEstateController.saveRealEstateCommercial())
   }
}
        

// @LINE:49
case controllers_ProductController_successPage25_route(params) => {
   call(params.fromPath[String]("pid", None)) { (pid) =>
        controllers_ProductController_successPage25_invoker.call(controllers.ProductController.successPage(pid))
   }
}
        

// @LINE:51
case controllers_VehicleController_create26_route(params) => {
   call { 
        controllers_VehicleController_create26_invoker.call(controllers.VehicleController.create())
   }
}
        

// @LINE:52
case controllers_VehicleController_save27_route(params) => {
   call { 
        controllers_VehicleController_save27_invoker.call(controllers.VehicleController.save())
   }
}
        

// @LINE:54
case controllers_ComputersController_create28_route(params) => {
   call { 
        controllers_ComputersController_create28_invoker.call(controllers.ComputersController.create())
   }
}
        

// @LINE:55
case controllers_ComputersController_save29_route(params) => {
   call { 
        controllers_ComputersController_save29_invoker.call(controllers.ComputersController.save())
   }
}
        

// @LINE:57
case controllers_CameraController_create30_route(params) => {
   call { 
        controllers_CameraController_create30_invoker.call(controllers.CameraController.create())
   }
}
        

// @LINE:58
case controllers_CameraController_save31_route(params) => {
   call { 
        controllers_CameraController_save31_invoker.call(controllers.CameraController.save())
   }
}
        

// @LINE:60
case controllers_dashboardController_category32_route(params) => {
   call { 
        controllers_dashboardController_category32_invoker.call(controllers.dashboardController.category())
   }
}
        

// @LINE:61
case controllers_ProductController_getAdDetails33_route(params) => {
   call(params.fromQuery[String]("categoryId", None)) { (categoryId) =>
        controllers_ProductController_getAdDetails33_invoker.call(controllers.ProductController.getAdDetails(categoryId))
   }
}
        

// @LINE:62
case controllers_RealEstateController_getRealEstate34_route(params) => {
   call { 
        controllers_RealEstateController_getRealEstate34_invoker.call(controllers.RealEstateController.getRealEstate())
   }
}
        

// @LINE:63
case controllers_RealEstateController_productDetails35_route(params) => {
   call(params.fromQuery[String]("productId", None)) { (productId) =>
        controllers_RealEstateController_productDetails35_invoker.call(controllers.RealEstateController.productDetails(productId))
   }
}
        

// @LINE:64
case controllers_RealEstateController_getRealEstateDetails36_route(params) => {
   call(params.fromQuery[String]("productTypeId", None)) { (productTypeId) =>
        controllers_RealEstateController_getRealEstateDetails36_invoker.call(controllers.RealEstateController.getRealEstateDetails(productTypeId))
   }
}
        

// @LINE:65
case controllers_RealEstateController_getproductDetails37_route(params) => {
   call(params.fromQuery[String]("productId", None)) { (productId) =>
        controllers_RealEstateController_getproductDetails37_invoker.call(controllers.RealEstateController.getproductDetails(productId))
   }
}
        
}

}
     