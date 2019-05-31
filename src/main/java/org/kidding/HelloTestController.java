package org.kidding;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

	@RequestMapping("/")
	public String Hello() {
		return "Hello World!";
	}
}
