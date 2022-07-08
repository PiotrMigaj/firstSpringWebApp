package pl.migibud.springboot002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class HomeController {

	private final String title = "Test page";
	private LocalDateTime localDateTime;

	@GetMapping("/home")
	public String home(Model model,
					   @RequestParam(value = "name",
							   required = false,
							   defaultValue = "Guest") String name){
		model.addAttribute("name",name);
		model.addAttribute("title",title);
		model.addAttribute("date",localDateTime.toString());
		return "home";
	}


}
