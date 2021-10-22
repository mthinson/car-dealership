package com.claim.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.BuyerInfo;
import com.claim.entity.CarList;
import com.claim.entity.Cars;




@Controller
public class CarController{
	
	private int counter = 0;
	private Cars savedCar;

	@Autowired
	CarList carLists;
	
	
	@GetMapping("/")
	public String welcome(Model model) {
		System.out.println("this is line 12");
		return "index";
	}
	  @GetMapping("/about")
	    public String about(Model model) {
		  System.out.println("about mapping");
	        return "about";
	    }
	@GetMapping("/inventory")
	public String home(Model model) {
		System.out.println("inventory");
		if(counter == 0) {
			carLists.carList();
			counter++;
		}
		
		model.addAttribute("arr", carLists.inventory);
		return "inventory";
	}
	@GetMapping("/inventory-data")
	public ModelAndView moreInfo(Model model, Integer info , HttpSession session) {
		Cars clickedCar = carLists.carFinder(info);
		Cars savedCar = clickedCar;
		System.out.println("postMappingController");
		System.out.println(clickedCar);
		if(clickedCar.getDays() >= 120) {
			model.addAttribute("carInfo", clickedCar);
			System.out.println("make bid " + clickedCar.getVin());
			return new ModelAndView("makeBid", "buyer", new BuyerInfo());
		}
		model.addAttribute("carInfo", clickedCar);
		System.out.println("buyfullPrice " + clickedCar.getVin());
		return new ModelAndView("buyFullPrice", "buyer", new BuyerInfo());
		
	}
	
	@PostMapping("/thankYou")
	//The Model Attribute will map to the html model attribute 
	public String handleSave(Model model, @ModelAttribute("buyer")BuyerInfo buyer, HttpSession session) {
		System.out.println("vin number: " + buyer.getCars().getVin());
	
		carLists.saveBuyer(buyer);
		model.addAttribute("buyer", buyer);
	
		return "thankYou";
		
	}
		
	@PostMapping("/thankYouBid")
	//The Model Attribute will map to the html model attribute 
	public String handleSaveBid(Model model, @ModelAttribute("buyer")BuyerInfo buyer, HttpSession session) {
		System.out.println("vin number: " + buyer.getCars().getVin());
	
		carLists.saveBuyer(buyer);
		model.addAttribute("buyer", buyer);
	
		return "thankYouBid";
		
	}
	@GetMapping("/report")
	public String report(Model model) {
		System.out.println("reports page");
		model.addAttribute("arr_sold", carLists.buyers);
		model.addAttribute("arr", carLists.inventory);
		return "report";
	}
	  @GetMapping("/search")
	    public String search(Model model) {
		  System.out.println("search mapping");
		  model.addAttribute("searchVehicle", new Cars());
	        return "search";
	    
	  }
		@PostMapping("/search")
		//The Model Attribute will map to the html model attribute 
		public String search(Model model, @ModelAttribute("searchVehicle")Cars searchCar, HttpSession session) {
			
			ArrayList<Cars> searchList = carLists.search(searchCar.getMake());
			
			model.addAttribute("searchList", searchList);
		
			return "search";
			
		}
	  
	 

}
