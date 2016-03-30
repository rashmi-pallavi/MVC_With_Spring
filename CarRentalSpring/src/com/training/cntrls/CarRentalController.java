package com.training.cntrls;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	@RequestMapping(name="/CarEntry" , method=RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental car , BindingResult result)
	{
		String nextStep="success";
		
		if(result.hasErrors())
		{
			nextStep="AddCar";
		}
		
		return nextStep;
	}
	
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("userName") String name,Model mdl)
	{
		mdl.addAttribute("prevBooking", "Your previous booking was on March 13th 2016!");
		return "success";
	}


}
