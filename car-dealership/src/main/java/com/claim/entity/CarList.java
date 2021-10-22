package com.claim.entity;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class CarList {

	public List<BuyerInfo> buyers = new ArrayList<BuyerInfo>();
	public ArrayList<Cars> inventory = new ArrayList<Cars>();

	public void carList() {
		inventory.add(new Cars("Ford", "Mustang", "$22,500", "Rare color mustang, 5.0 manual.", 2020, "Orange", 54,
				"image/mustang.jpg", 1, 25, true));
		inventory.add(new Cars("Honda", "Civic", "$2,000", "Reliable and previously owned by Jeff Bezos.", 1996, "Blue",
				325000, "image/civic.jpg", 2, 60, true));
		inventory.add(new Cars("Ford", "Cobra", "$105,000", "Rare original Shelby cobra 427.", 1960, "Blue", 125000,
				"image/cobra.jpg", 3, 55, true));
		inventory.add(new Cars("Tyke", "Big Wheel", "$105", "Affordable and reliable for our smaller clients.", 1999,
				"Red", 1000000, "image/bigWheel.png", 4, 2, true));
		inventory.add(new Cars("Ford", "Raptor", "$77,000", "Its cool, but is it worth it?", 2021, "Black", 20,
				"image/raptor.jpg", 5, 150, true));
		inventory.add(new Cars("Normal", "Truck", "$3,000", "'Not' an FBI watch van.", 1987, "Black", 326584,
				"image/normal.jpg", 6, 96, true));
		inventory.add(new Cars("Tesla", "Roadster", "$110,000", "All electric roadster, new!", 2016, "White", 236,
				"image/tesla.jpg", 7, 121, true));
		inventory
				.add(new Cars("Nuclear", "Sub", "$1.5 Million", "Working sub.",
						2000, "Grey", 369258154, "image/sub.jpg", 8, 500, true));
		inventory.add(new Cars("Auston Martin", "Vulcan", "$225,000", "The fastest car Auston Martin has to date.",
				2009, "Burnt Orange", 254, "image/vulcan.jpg", 9, 20, true));
		inventory.add(new Cars("Auston Martin", "Valhalla", "1 Million", "Only one in existance. Might be stolen.",
				2024, "Sea Blue", 0, "image/valhalla.jpg", 10, 1, true));

		System.out.println("inside carList");

		System.out.println(inventory.get(0).getMake());

	}

	public ArrayList<Cars> search(String make) {
		        ArrayList<Cars> searchResults = new ArrayList<>();
		        System.out.println("inside search method");
		        for (Cars vehicle : inventory) {
		            if (vehicle.getMake().contains(make)) {
		            	if(vehicle.isForSale() == true) {
		            		searchResults.add(vehicle);
		            		System.out.println("car added");
		            	}
		            }
		        }

		        return searchResults;
		    }
		
	public void saveBuyer(BuyerInfo buyer) {
		for (Cars search : inventory) {
			if (buyer.getCars().getVin() == search.getVin()) {
				
				BuyerInfo soldCar = new BuyerInfo();
				soldCar.setCars(search);
				soldCar.setFirstName(buyer.getFirstName());
				soldCar.setLastName(buyer.getLastName());
				soldCar.setEmail(buyer.getEmail());
				soldCar.setAmount(buyer.getAmount());
				
			
				buyer = soldCar;
				
				System.out.println("this is sold car: " + buyer);
				buyers.add(buyer);
			}
		}
//		for(Cars search : inventory) {
//			if(buyer.getCars().getVin() == search.getVin()) {
//				inventory.remove(search);
//			}
//		}
		
	}

	public Cars carFinder(int vin) {
		for (Cars selected : inventory) {
			if (vin == selected.getVin()) {
				System.out.println("carfinder");

				return selected;
			}
		}
		return inventory.get(0);
	}

	public ArrayList<Cars> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Cars> inventory) {
		this.inventory = inventory;
	}

	public List<BuyerInfo> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<BuyerInfo> buyers) {
		this.buyers = buyers;
	}

}
