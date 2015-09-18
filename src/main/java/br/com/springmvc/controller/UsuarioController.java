package br.com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.springmvc.modelo.Usuario;
import br.com.springmvc.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String page() {
		return "cadastro";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String cadastro(@Valid Usuario usuario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "cadastro";
		}
		usuarioService.cadastra(usuario);
		return "login";
	}
	
	@RequestMapping("/cadastro/ativacao")
	public String ativacao(String email, String chave) {
		usuarioService.ativacao(email, chave);
		return "ativacao";
	}
}