package com.training.cntrls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.entity.CarRental;

@Controller
public class ShowRequestController {
	
	@RequestMapping("/showAll")
	public String getAllRequests(Model model)
	{
		List<CarRental> reqData = new ArrayList<CarRental>();
		
		reqData.add(new CarRental("Ram",98898998,"ram@gmail.com","Innova"));
		reqData.add(new CarRental("Shyam",98895998,"shyam@gmail.com","Indica"));
		reqData.add(new CarRental("Mohan",98898598,"mohan@gmail.com","i10"));
		reqData.add(new CarRental("Sohan",98598998,"sohan@gmail.com","i20"));
		
		model.addAttribute("reqList", reqData);
		return "showAllRequest";
	}

	
	@RequestMapping(value="/findRequest/{name}",method=RequestMethod.GET)
	public String viewCustomerAddress(@PathVariable("name") String name , Model model)
	{
		String msg ="10 bookings of "+name;
		if(name.equals("Ram"))
		{
			msg="20 bookings of "+name;
		}
		
		model.addAttribute("data", msg);
		
		return "Display";
	}
}
