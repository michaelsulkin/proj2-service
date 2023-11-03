package hello;

import hello.model.Coordinates;
import hello.model.PointOfInterest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello World";
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(
			value = "/poi/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public PointOfInterest getPoi(@PathVariable Integer id) {
		System.out.println("POI ID: " + id);
		PointOfInterest poi = new PointOfInterest();
		poi.setPageid(id);
		poi.setTitle("Aruba");
		poi.setCoordinates(new Coordinates());
		poi.getCoordinates().setLat(12.5);
		poi.getCoordinates().setLon(-69.96666667);
		poi.getCoordinates().setGlobe("earth");
		poi.description = "Description of POI Aruba";
		return poi;
	}

}
