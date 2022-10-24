package com.nttdata.bootcamp.productservice.controller;

import javax.servlet.ServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private ServletRequest request;
	
	@GetMapping("/port")
	public String getPort() {
		String port = String.valueOf(request.getServerPort());
		System.out.println(port);
		return "El puerto del micro es "+port;
	}
}
