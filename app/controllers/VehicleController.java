package controllers;

import static play.data.Form.form;
import java.io.PrintWriter;
import java.io.StringWriter;
import models.Vehicles;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class VehicleController extends Controller {

	public static Result create() {
		final play.Logger.ALogger log = Logger.of("productlog");
		try {
			log.info("Inside VehicleController - create() started");
			session("re_login_user", "1");
			Form<Vehicles> model = form(Vehicles.class);
			return ok(views.html.createVehicle.render(model));
		}catch(Exception e) {
			StringWriter errors = new StringWriter();
    		e.printStackTrace(new PrintWriter(errors));
    		log.error(errors.toString());
    		e.printStackTrace();
		}
		return notFound();
	}
	
	public static Result save() {
		final play.Logger.ALogger log = Logger.of("productlog");
		try {
			log.info("Inside VehicleController - save() started");
			Form<Vehicles> data = form(Vehicles.class).bindFromRequest();
			if(data.hasErrors()) {
				log.error("The form has errors");
				return ok("failure");
	        }
			System.out.println(data);
	        data.get().save();
			return ok("success");
		}catch(Exception e) {
			StringWriter errors = new StringWriter();
    		e.printStackTrace(new PrintWriter(errors));
    		log.error(errors.toString());
    		e.printStackTrace();
		}
		return notFound();
	}
}
