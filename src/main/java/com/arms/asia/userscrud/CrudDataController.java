package com.arms.asia.userscrud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/list")
public class CrudDataController {
	
	@Autowired
	private CrudDataRepository repository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String list(Model model){
				List<CrudData> users = repository.findAll();
				model.addAttribute("msg", "Displaying All Users");
				model.addAttribute("users", users);
					return "list";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
		public String delete(@PathVariable Integer id){
				repository.delete(id);
					return "redirect:/list";
		}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
		public String add(Model model){
				model.addAttribute("msg","Please enter a user name");
					return "add";
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
		public String create(Model model, @RequestParam("name") String name){
				CrudData user = new CrudData(name);
				repository.save(user);
					return "redirect:/list";
		
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
		public String update(Model model,@PathVariable Integer id){
				CrudData user = repository.findOne(id);
				model.addAttribute("user", user);
				model.addAttribute("msg","Please modify the username");
					return "edit";
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String update(Model model, @RequestParam("id") Integer id, @RequestParam("name") String name){
				CrudData user = new CrudData(id, name);
				repository.save(user);
					return "redirect:/list";
	}

}
