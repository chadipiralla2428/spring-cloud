package com.example.springawsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class DevopsController {
	@RequestMapping("/devopstools")
	public String devopsdemo() {
		return "hellodemo";
	}

}
