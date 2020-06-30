/**
 * 
 */
package com.pruebaSpring.springbootweb.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaSpring.springbootweb.app.models.Usuario;

/**
 * @author ITenZangetsuB
 *
 */

@Controller
@RequestMapping("app")
public class IndexController {

	@Value("${texto.IndexController.index.titulo}")
	private String textoIndex;
	@Value("${texto.IndexController.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.IndexController.listar.titulo}")
	private String textoListar;
	
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	@GetMapping("/perfil")
		public String perfil(Model model) {
			Usuario usuario= new Usuario();
			usuario.setNombre("Piter");
			usuario.setApellido("Alcantara");
			usuario.setEmail("piter@micorrreo.com");
			model.addAttribute("usuario", usuario);
			model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
			return "perfil";
		
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario> listaUsuarios= new ArrayList<>();
		listaUsuarios.add(new Usuario("Juanito","Alcantara","juanito@micorreo.com"));
		listaUsuarios.add(new Usuario("Piter","Beep","piter@micorreo.com"));
		listaUsuarios.add(new Usuario("Jhonny","Deep","jhonny@micorreo.com"));
		model.addAttribute("titulo", textoListar);
		model.addAttribute("listaUsuarios", listaUsuarios);
		return "listar";
		
	}
	
}
