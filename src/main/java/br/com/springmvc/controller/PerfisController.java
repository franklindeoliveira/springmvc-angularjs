package br.com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/perfis")
public class PerfisController {

	@RequestMapping
	public String page() {
		return "perfis";
	}
	
	@RequestMapping("/1")
	public String perfil1() {
		return "perfil1";
	}
	
	@RequestMapping("/2")
	public String perfil2() {
		return "perfil2";
	}
	
	@RequestMapping("/3")
	public String perfil3() {
		return "perfil3";
	}
	
}
