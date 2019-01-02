package com.mk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	//=====================================| INDEX/HOME
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("sendData")
	public ModelAndView sendData(@RequestParam("username") String username, @RequestParam("password") String password) {
		return new ModelAndView("welcome");
	}

	@RequestMapping("403")
	public ModelAndView sendData(Exception e) {
		return new ModelAndView("403");
	}

}
