package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home");
		
		String string = null;
		System.out.println(string.length());
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querrybox") String query) {
		
		if (query.isEmpty()) {
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("http://localhost:8080/springmvcsearch/home");
			return redirectView;
		}
		  
		String url = "https://google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,
			@PathVariable("userName") String userName) {
		
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}
	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value =  NullPointerException.class)
//	public String exceptionHandler(Model m) {
//		
//		m.addAttribute("msg" , "Null pointer exception");
//		return "null_page";
//	}
//	
//	@ExceptionHandler(value =  Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//		
//		m.addAttribute("msg" , "exception has occured");
//		return "null_page";
//	}
	
	
}
