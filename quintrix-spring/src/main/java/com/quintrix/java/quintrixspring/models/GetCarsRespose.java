package com.quintrix.java.quintrixspring.models;

import java.util.List;

public class GetCarsRespose {
	
	private String availableWarranty;
	
	List<ClientCar>availableCarsList;

	public String getAvailableWarranty() {
		return availableWarranty;
	}

	public void setAvailableWarranty(String availableWarranty) {
		this.availableWarranty = availableWarranty;
	}

	public List<ClientCar> getAvailableCarsList() {
		return availableCarsList;
	}

	public void setAvailableCarsList(List<ClientCar> availableCarsList) {
		this.availableCarsList = availableCarsList;
	}
	
	
}
