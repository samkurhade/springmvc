package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home page url");
		model.addAttribute("name", "Sam");
		model.addAttribute("id",59);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Sam");
		friends.add("Cena");
		friends.add("Tom");
		friends.add("John");
		
		model.addAttribute("f", friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help( ) {
		System.out.println("This is help page");
		
		// creating object 
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sam");
		modelAndView.addObject("rollNo", 59);
		modelAndView.setViewName("help");
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		
		modelAndView.addObject("time", nowDateTime);
		
		// list of marks
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(78);
		marks.add(45);
		marks.add(98);
		marks.add(99);
		marks.add(100);
		
		
		modelAndView.addObject("marks", marks);
		return modelAndView;
	}

}
		