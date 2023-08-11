package springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name", "Shubham Diddi");  //model object wraped with attribute and value
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is sbout url");
		return "about";
	}
	
	
	
}
