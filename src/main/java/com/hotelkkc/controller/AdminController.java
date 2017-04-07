package com.hotelkkc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotelkkc.subclass.Criteria;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/")
	public String getinfo(Model model, Criteria cri) {
		return "/admin/info";
	}
	@RequestMapping("/list")
	public String getList(Model model, Criteria cri) {
		return "";
	}
}
