/**
 * 
 */
package com.pruebaSpring.springbootweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ITenZangetsuB
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "redirect:/app/index";
	}
	
}
