package ch.allianz.lehrlingsausbildung.springsecuritydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

	@RequestMapping("/")
	public String index() {
		return "You are logged in now";
	}
	
}
