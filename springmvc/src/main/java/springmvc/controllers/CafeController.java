package springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CafeController {
	
	//@ResponseBody
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	//@ResponseBody
	@RequestMapping("/")
	public ModelAndView test() {
		return new ModelAndView("test");
	}
	
	@RequestMapping(value="/order")
	public String order(Model model, HttpServletRequest request){
		String ItemName = request.getParameter("ItemName");
		System.out.println(ItemName);
		model.addAttribute("OrderNo", "1");
		model.addAttribute("ItemName", ItemName);
		return "order";
	}
}
