package br.com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springmvc.modelo.Usuario;
import br.com.springmvc.repository.UsuarioRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@RequestMapping
	public String home(Model model, Authentication authentication) {
		Usuario usuario = usuarioRepository.findByNomeUsuario(authentication.getName());
		model.addAttribute("usuario", usuario.getNome());
		return "home";
	}

}