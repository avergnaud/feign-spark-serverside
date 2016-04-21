package sparkjava;

import model.SomeBean;
import spark.Request;
import spark.Response;

public class Route {
	public static SomeBean handleGetByName(Request request, Response response) {
		String name = request.params("name");
		int any = (int)(Math.random()*10);
		return new SomeBean(any, name);
	}
}
