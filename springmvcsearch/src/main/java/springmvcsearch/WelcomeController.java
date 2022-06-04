package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return "welcome";
		
	}
	
	// handler for request
	@RequestMapping("/welcomeprocess")
	public String handleWelcome(@RequestParam("user") String name , Model m) {
		
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome-show";       
	}

}
