package site.metacoding.yellow1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/yellow")
	public String index() {
		return "index";
	}
}
