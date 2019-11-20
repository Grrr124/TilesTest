package com.edu.TilesTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.TilesTest.service.TestService;

@Controller
@RequestMapping(value= "/TC")
public class TestController {

@Autowired
private TestService TS;

@RequestMapping(value="/Menu")
public String StartMenu() {
	return "/views/WelcomeMenu";
	}
}
