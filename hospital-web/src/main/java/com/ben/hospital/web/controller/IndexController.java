package com.ben.hospital.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{

	@RequestMapping("index")
	public Model index(Model model) {
		List<String> data = new ArrayList<String>();
		data.add("ben");
		model.addAttribute("data", data);
		return model;
	}
}
