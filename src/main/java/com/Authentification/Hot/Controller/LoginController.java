package com.Authentification.Hot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String index() {
		return "login";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		return "Yooooo!!!!!!!!";
	}

}
