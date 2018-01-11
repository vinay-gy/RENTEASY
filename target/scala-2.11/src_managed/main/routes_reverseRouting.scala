// @SOURCE:D:/NewFolder/RENTEASY/conf/routes
// @HASH:012a3c93606f5f47b264d9dda367f2badc7261c6
// @DATE:Thu Jan 11 15:52:33 IST 2018

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:55
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:5
package controllers {

// @LINE:5
class ReverseAssets {


// @LINE:5
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseRealEstateController {


// @LINE:45
def createResidential(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/residential/create")
}
                        

// @LINE:47
def saveRealEstateResidential(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/residential/save")
}
                        

// @LINE:65
def getproductDetails(productId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getproductDetails" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("productId", productId)))))
}
                        

// @LINE:46
def createCommercial(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/commercial/create")
}
                        

// @LINE:64
def getRealEstateDetails(productTypeId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getRealEstateDetails" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("productTypeId", productTypeId)))))
}
                        

// @LINE:62
def getRealEstate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getrealestate")
}
                        

// @LINE:63
def productDetails(productId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "productDetails" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("productId", productId)))))
}
                        

// @LINE:48
def saveRealEstateCommercial(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/commercial/save")
}
                        

}
                          

// @LINE:38
// @LINE:37
// @LINE:36
class ReverseCustomerController {


// @LINE:37
def validateEmail(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validate/email/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:38
def validateMobile(mobile:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validate/mobile/" + implicitly[PathBindable[String]].unbind("mobile", dynamicString(mobile)))
}
                        

// @LINE:36
def customerInfo(customerId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "customer/" + implicitly[PathBindable[String]].unbind("customerId", dynamicString(customerId)))
}
                        

}
                          

// @LINE:60
class ReversedashboardController {


// @LINE:60
def category(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categories")
}
                        

}
                          

// @LINE:18
// @LINE:17
class ReverseCategoryController {


// @LINE:18
def subCategoryList(categoryId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "subcategory/" + implicitly[PathBindable[String]].unbind("categoryId", dynamicString(categoryId)))
}
                        

// @LINE:17
def categoryList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "category/list")
}
                        

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseloginController {


// @LINE:24
def signUp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:26
def encryptAES(password:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "encryptpass" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                        

// @LINE:23
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:22
def login(message:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login" + queryString(List(if(message == "") None else Some(implicitly[QueryStringBindable[String]].unbind("message", message)))))
}
                        

// @LINE:25
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveSignupDetails")
}
                        

// @LINE:27
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "validate")
}
                        

}
                          

// @LINE:61
// @LINE:49
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:11
// @LINE:10
class ReverseProductController {


// @LINE:49
def successPage(pid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/create/success/" + implicitly[PathBindable[String]].unbind("pid", dynamicString(pid)))
}
                        

// @LINE:43
def productTypeList(subCatId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "producttype/" + implicitly[PathBindable[String]].unbind("subCatId", dynamicString(subCatId)))
}
                        

// @LINE:10
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createAd")
}
                        

// @LINE:61
def getAdDetails(categoryId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getAdDetails" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("categoryId", categoryId)))))
}
                        

// @LINE:44
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/save")
}
                        

// @LINE:42
def productDetails(pid:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/" + implicitly[PathBindable[String]].unbind("pid", dynamicString(pid)))
}
                        

// @LINE:11
def getProductForm(productID:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getForm/" + implicitly[PathBindable[String]].unbind("productID", dynamicString(productID)))
}
                        

}
                          

// @LINE:32
// @LINE:31
// @LINE:9
class ReverseApplication {


// @LINE:31
def locations(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "locations")
}
                        

// @LINE:32
def saveLocation(location:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "user/location/" + implicitly[PathBindable[String]].unbind("location", dynamicString(location)))
}
                        

// @LINE:9
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:55
// @LINE:54
class ReverseComputersController {


// @LINE:55
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/computers/save")
}
                        

// @LINE:54
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/computers/create")
}
                        

}
                          

// @LINE:58
// @LINE:57
class ReverseCameraController {


// @LINE:58
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/cameras/save")
}
                        

// @LINE:57
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/cameras/create")
}
                        

}
                          

// @LINE:52
// @LINE:51
class ReverseVehicleController {


// @LINE:52
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product/vehicles/save")
}
                        

// @LINE:51
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/vehicles/create")
}
                        

}
                          
}
                  


// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:55
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:5
class ReverseAssets {


// @LINE:5
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseRealEstateController {


// @LINE:45
def createResidential : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.createResidential",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/residential/create"})
      }
   """
)
                        

// @LINE:47
def saveRealEstateResidential : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.saveRealEstateResidential",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/residential/save"})
      }
   """
)
                        

// @LINE:65
def getproductDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.getproductDetails",
   """
      function(productId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getproductDetails" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("productId", productId)])})
      }
   """
)
                        

// @LINE:46
def createCommercial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.createCommercial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/commercial/create"})
      }
   """
)
                        

// @LINE:64
def getRealEstateDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.getRealEstateDetails",
   """
      function(productTypeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getRealEstateDetails" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("productTypeId", productTypeId)])})
      }
   """
)
                        

// @LINE:62
def getRealEstate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.getRealEstate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getrealestate"})
      }
   """
)
                        

// @LINE:63
def productDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.productDetails",
   """
      function(productId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productDetails" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("productId", productId)])})
      }
   """
)
                        

// @LINE:48
def saveRealEstateCommercial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RealEstateController.saveRealEstateCommercial",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/commercial/save"})
      }
   """
)
                        

}
              

// @LINE:38
// @LINE:37
// @LINE:36
class ReverseCustomerController {


// @LINE:37
def validateEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerController.validateEmail",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate/email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:38
def validateMobile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerController.validateMobile",
   """
      function(mobile) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate/mobile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mobile", encodeURIComponent(mobile))})
      }
   """
)
                        

// @LINE:36
def customerInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CustomerController.customerInfo",
   """
      function(customerId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("customerId", encodeURIComponent(customerId))})
      }
   """
)
                        

}
              

// @LINE:60
class ReversedashboardController {


// @LINE:60
def category : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.dashboardController.category",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:17
class ReverseCategoryController {


// @LINE:18
def subCategoryList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.subCategoryList",
   """
      function(categoryId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subcategory/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("categoryId", encodeURIComponent(categoryId))})
      }
   """
)
                        

// @LINE:17
def categoryList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.categoryList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/list"})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseloginController {


// @LINE:24
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:26
def encryptAES : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.encryptAES",
   """
      function(password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "encryptpass" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        

// @LINE:23
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:22
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.login",
   """
      function(message) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(message == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("message", message))])})
      }
   """
)
                        

// @LINE:25
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveSignupDetails"})
      }
   """
)
                        

// @LINE:27
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.loginController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
      }
   """
)
                        

}
              

// @LINE:61
// @LINE:49
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:11
// @LINE:10
class ReverseProductController {


// @LINE:49
def successPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.successPage",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/create/success/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pid", encodeURIComponent(pid))})
      }
   """
)
                        

// @LINE:43
def productTypeList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.productTypeList",
   """
      function(subCatId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "producttype/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subCatId", encodeURIComponent(subCatId))})
      }
   """
)
                        

// @LINE:10
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createAd"})
      }
   """
)
                        

// @LINE:61
def getAdDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.getAdDetails",
   """
      function(categoryId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAdDetails" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("categoryId", categoryId)])})
      }
   """
)
                        

// @LINE:44
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/save"})
      }
   """
)
                        

// @LINE:42
def productDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.productDetails",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pid", encodeURIComponent(pid))})
      }
   """
)
                        

// @LINE:11
def getProductForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.getProductForm",
   """
      function(productID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getForm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("productID", encodeURIComponent(productID))})
      }
   """
)
                        

}
              

// @LINE:32
// @LINE:31
// @LINE:9
class ReverseApplication {


// @LINE:31
def locations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.locations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "locations"})
      }
   """
)
                        

// @LINE:32
def saveLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveLocation",
   """
      function(location) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/location/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("location", encodeURIComponent(location))})
      }
   """
)
                        

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:55
// @LINE:54
class ReverseComputersController {


// @LINE:55
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputersController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/computers/save"})
      }
   """
)
                        

// @LINE:54
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ComputersController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/computers/create"})
      }
   """
)
                        

}
              

// @LINE:58
// @LINE:57
class ReverseCameraController {


// @LINE:58
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CameraController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/cameras/save"})
      }
   """
)
                        

// @LINE:57
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CameraController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/cameras/create"})
      }
   """
)
                        

}
              

// @LINE:52
// @LINE:51
class ReverseVehicleController {


// @LINE:52
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VehicleController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/vehicles/save"})
      }
   """
)
                        

// @LINE:51
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.VehicleController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/vehicles/create"})
      }
   """
)
                        

}
              
}
        


// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:55
// @LINE:54
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:5
package controllers.ref {


// @LINE:5
class ReverseAssets {


// @LINE:5
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseRealEstateController {


// @LINE:45
def createResidential(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.createResidential(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "createResidential", Seq(), "GET", """""", _prefix + """product/residential/create""")
)
                      

// @LINE:47
def saveRealEstateResidential(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.saveRealEstateResidential(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "saveRealEstateResidential", Seq(), "POST", """""", _prefix + """product/residential/save""")
)
                      

// @LINE:65
def getproductDetails(productId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.getproductDetails(productId), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getproductDetails", Seq(classOf[String]), "GET", """""", _prefix + """getproductDetails""")
)
                      

// @LINE:46
def createCommercial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.createCommercial(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "createCommercial", Seq(), "GET", """""", _prefix + """product/commercial/create""")
)
                      

// @LINE:64
def getRealEstateDetails(productTypeId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.getRealEstateDetails(productTypeId), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getRealEstateDetails", Seq(classOf[String]), "GET", """""", _prefix + """getRealEstateDetails""")
)
                      

// @LINE:62
def getRealEstate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.getRealEstate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "getRealEstate", Seq(), "GET", """""", _prefix + """getrealestate""")
)
                      

// @LINE:63
def productDetails(productId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.productDetails(productId), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "productDetails", Seq(classOf[String]), "GET", """""", _prefix + """productDetails""")
)
                      

// @LINE:48
def saveRealEstateCommercial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RealEstateController.saveRealEstateCommercial(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RealEstateController", "saveRealEstateCommercial", Seq(), "POST", """""", _prefix + """product/commercial/save""")
)
                      

}
                          

// @LINE:38
// @LINE:37
// @LINE:36
class ReverseCustomerController {


// @LINE:37
def validateEmail(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerController.validateEmail(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "validateEmail", Seq(classOf[String]), "GET", """""", _prefix + """validate/email/$email<[^/]+>""")
)
                      

// @LINE:38
def validateMobile(mobile:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerController.validateMobile(mobile), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "validateMobile", Seq(classOf[String]), "GET", """""", _prefix + """validate/mobile/$mobile<[^/]+>""")
)
                      

// @LINE:36
def customerInfo(customerId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CustomerController.customerInfo(customerId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CustomerController", "customerInfo", Seq(classOf[String]), "GET", """""", _prefix + """customer/$customerId<[^/]+>""")
)
                      

}
                          

// @LINE:60
class ReversedashboardController {


// @LINE:60
def category(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.dashboardController.category(), HandlerDef(this.getClass.getClassLoader, "", "controllers.dashboardController", "category", Seq(), "GET", """""", _prefix + """categories""")
)
                      

}
                          

// @LINE:18
// @LINE:17
class ReverseCategoryController {


// @LINE:18
def subCategoryList(categoryId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.subCategoryList(categoryId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoryController", "subCategoryList", Seq(classOf[String]), "GET", """""", _prefix + """subcategory/$categoryId<[^/]+>""")
)
                      

// @LINE:17
def categoryList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.categoryList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoryController", "categoryList", Seq(), "GET", """""", _prefix + """category/list""")
)
                      

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseloginController {


// @LINE:24
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.signUp(), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "signUp", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:26
def encryptAES(password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.encryptAES(password), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "encryptAES", Seq(classOf[String]), "GET", """""", _prefix + """encryptpass""")
)
                      

// @LINE:23
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:22
def login(message:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.login(message), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "login", Seq(classOf[String]), "GET", """""", _prefix + """login""")
)
                      

// @LINE:25
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "save", Seq(), "POST", """""", _prefix + """saveSignupDetails""")
)
                      

// @LINE:27
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.loginController.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.loginController", "authenticate", Seq(), "POST", """""", _prefix + """validate""")
)
                      

}
                          

// @LINE:61
// @LINE:49
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:11
// @LINE:10
class ReverseProductController {


// @LINE:49
def successPage(pid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.successPage(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "successPage", Seq(classOf[String]), "GET", """""", _prefix + """product/create/success/$pid<[^/]+>""")
)
                      

// @LINE:43
def productTypeList(subCatId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.productTypeList(subCatId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "productTypeList", Seq(classOf[String]), "GET", """""", _prefix + """producttype/$subCatId<[^/]+>""")
)
                      

// @LINE:10
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "create", Seq(), "GET", """""", _prefix + """createAd""")
)
                      

// @LINE:61
def getAdDetails(categoryId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.getAdDetails(categoryId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "getAdDetails", Seq(classOf[String]), "GET", """""", _prefix + """getAdDetails""")
)
                      

// @LINE:44
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "save", Seq(), "POST", """""", _prefix + """product/save""")
)
                      

// @LINE:42
def productDetails(pid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.productDetails(pid), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "productDetails", Seq(classOf[String]), "GET", """""", _prefix + """product/$pid<[^/]+>""")
)
                      

// @LINE:11
def getProductForm(productID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.getProductForm(productID), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProductController", "getProductForm", Seq(classOf[String]), "GET", """""", _prefix + """getForm/$productID<[^/]+>""")
)
                      

}
                          

// @LINE:32
// @LINE:31
// @LINE:9
class ReverseApplication {


// @LINE:31
def locations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.locations(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "locations", Seq(), "GET", """""", _prefix + """locations""")
)
                      

// @LINE:32
def saveLocation(location:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveLocation(location), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "saveLocation", Seq(classOf[String]), "GET", """""", _prefix + """user/location/$location<[^/]+>""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page
 Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:55
// @LINE:54
class ReverseComputersController {


// @LINE:55
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputersController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ComputersController", "save", Seq(), "POST", """""", _prefix + """product/computers/save""")
)
                      

// @LINE:54
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ComputersController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ComputersController", "create", Seq(), "GET", """""", _prefix + """product/computers/create""")
)
                      

}
                          

// @LINE:58
// @LINE:57
class ReverseCameraController {


// @LINE:58
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CameraController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CameraController", "save", Seq(), "POST", """""", _prefix + """product/cameras/save""")
)
                      

// @LINE:57
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CameraController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CameraController", "create", Seq(), "GET", """""", _prefix + """product/cameras/create""")
)
                      

}
                          

// @LINE:52
// @LINE:51
class ReverseVehicleController {


// @LINE:52
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VehicleController.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VehicleController", "save", Seq(), "POST", """""", _prefix + """product/vehicles/save""")
)
                      

// @LINE:51
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.VehicleController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.VehicleController", "create", Seq(), "GET", """""", _prefix + """product/vehicles/create""")
)
                      

}
                          
}
        
    