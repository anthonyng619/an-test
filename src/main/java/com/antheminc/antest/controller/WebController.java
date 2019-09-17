package com.antheminc.antest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@RequestMapping(value = "/random", method = RequestMethod.GET)
	@ResponseBody
	public String getRandom() {
		return "blahblah";
	}
}
