package com.Atoms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Slf4j
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		log.info(">>>> Index 페이지");
		
		return "index";
	}
}
