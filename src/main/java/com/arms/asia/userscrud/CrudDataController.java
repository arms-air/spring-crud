package com.arms.asia.userscrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CrudDataController {
	
	@Autowired
	private CrudDataRepository repository;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<CrudData> users = repository.findAll();
		model.addAttribute("msg", "Displaying All Users");
		model.addAttribute("users", users);
		return "list";
	}

}
