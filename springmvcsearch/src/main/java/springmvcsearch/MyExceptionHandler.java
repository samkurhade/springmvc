package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler(Model m) {

		m.addAttribute("msg", "Null pointer exception");
		return "null_page";
	}

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m) {

		m.addAttribute("msg", "exception has occured");
		return "null_page";
	}
}
