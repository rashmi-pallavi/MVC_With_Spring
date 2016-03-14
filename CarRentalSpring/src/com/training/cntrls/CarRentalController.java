package com.training.cntrls;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.training.entity.CarRental;

@Controller
public class CarRentalController {
	
	@RequestMapping("/")
	public String initApp() {
		return "index";
	}

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private CarRental car; 
	
	@RequestMapping(name="/CarEntry" ,method=RequestMethod.GET)
	public ModelAndView initForm()
	{
		mdl.setViewName("AddCar");
		mdl.addObject("command",car);
		
		return mdl;
	}
	
	@ModelAttribute("carTypes")
	public String[] getCarTypes()
	{
		return new String[]{"Sedan NAC","Sedan AC","HatchBack AC","Luxury Car"};
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("carObj") CarRental car)
	{
		return "success";
	}
	
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("userName") String name,Model mdl)
	{
		mdl.addAttribute("prevBooking", "Your previous booking was on March 13th 2016!");
		return "success";
	}


}
