package com.BMS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.BMS.Entity.*;
import com.BMS.Service.DataService;

@Controller
public class Mcontrol {

	
	@Autowired
private DataService obj;


	@RequestMapping("/Bakery")
	public String Bakery() {
		return "JSP";
	}
	
	
	@RequestMapping("/saveData")
	public String saveData(Bakery bekka) {
		obj.saverOrder(bekka);
		return "JSP" ;
	}
	
	@RequestMapping("/update")
	public String updateById(Bakery buk,Model model) {
		obj.updateById(buk);
		
		return"Update";
	}
	@RequestMapping("/LIST")
	public String getAllData(Model model) {
	List<Bakery> s=	obj.getAllData();
	model.addAttribute("msg", s);
		return "LIST";
	}
	
}

