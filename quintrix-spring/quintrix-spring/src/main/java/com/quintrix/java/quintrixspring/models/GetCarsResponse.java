package com.quintrix.java.quintrixspring.models;

import java.util.List;

import com.quintrix.java.quintrixspring.models.agent.Agent;

public class GetCarsResponse {
	
	private String availableWarranty;
	
	List<ClientCar>availableCarsList;
	
	List<Agent> agentsList;

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

	public List<Agent> getAgentsList() {
		return agentsList;
	}

	public void setAgentsList(List<Agent> agentsList) {
		this.agentsList = agentsList;
	}
	
	
}
