package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() throws UnknownHostException {
		return "Hello from "
		+ InetAddress.getLocalHost().getHostName();
	}

}
