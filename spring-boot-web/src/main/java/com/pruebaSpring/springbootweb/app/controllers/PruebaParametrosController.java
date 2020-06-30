package com.pruebaSpring.springbootweb.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ITenZangetsuB
 *
 */

@Controller
@RequestMapping("/params")
public class PruebaParametrosController {
	@RequestMapping("/")
	public String index() {
		
		
		return "/params/index";
		
	}
	
	@RequestMapping("/string")
	public String param(@RequestParam(name = "texto" , required = false, defaultValue = "algun valor") String texto, Model model) {
		
		model.addAttribute("resultado", "El resultado del Parametro es: "+texto);
		return "params/ver";
		
	}
	@RequestMapping("/mix-params")
	public String mixParams(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "El Saludo es: "+saludo+" y tu numero es: "+numero);
		
		return "params/ver";
		
	}
	@RequestMapping("/mix-params-request")
	public String mixParamsRequest(HttpServletRequest request, Model model) {
		String saludo=request.getParameter("saludo");
		Integer numero=null; 
		try {
		numero=Integer.parseInt(request.getParameter("numero"));
		
		}catch(NumberFormatException e) {
			numero=0;
		}
		
		model.addAttribute("resultado", "El saludo es: "+saludo+" y el numero es "+numero);
		
		return "params/ver";
		
	}
}
