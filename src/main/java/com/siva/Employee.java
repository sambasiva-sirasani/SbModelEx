package com.siva;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {
	
	@RequestMapping(value = "/")
	public String show(Model model) {
		model.addAttribute("eid", 101);
		model.addAttribute("ename", "siva");
		model.addAttribute("eaddr", "Gnt");
		return "EmployeeData";
		
	}

}
