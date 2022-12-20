package com.training.project.bean;

import java.util.ArrayList;
import java.util.List;

public class State {

	public String nameCountry;
	public double countrySquare;
	public String CapitalState;
	public int totalPopulation;
	private List<District> state = new ArrayList<District>();
	
	public State() {
		super();
	}

	public State(String nameCountry, double countrySquare, int totalPopulation, List<District> state, String CapitalState) {
		super();
		this.nameCountry = nameCountry;
		this.countrySquare = countrySquare;
		this.CapitalState = CapitalState;
		this.totalPopulation = totalPopulation;
		this.state = state;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public double getCountrySquare() {
		return countrySquare;
	}

	public void setCountrySquare(double countrySquare) {
		this.countrySquare = countrySquare;
	}
	
	public String getCapitalState() {
		return CapitalState;
	}

	public void setCapitalState(String CapitalState) {
		this.CapitalState = CapitalState;
	}

	public int getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(int totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public List<District> getState() {
		return state;
	}

	public void setState(List<District> state) {
		this.state = state;
	}

	public void set(int index, State state) {
		state.set(index, state);
	}
	
	public void add(District district) {
		state.add(district);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(countrySquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameCountry == null) ? 0 : nameCountry.hashCode());
		result = prime * result + ((CapitalState == null) ? 0 : CapitalState.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + totalPopulation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (Double.doubleToLongBits(countrySquare) != Double.doubleToLongBits(other.countrySquare))
			return false;
		if (nameCountry == null) {
			if (other.nameCountry != null)
				return false;
		} else if (!nameCountry.equals(other.nameCountry))
			return false;
		if (CapitalState == null) {
			if (other.CapitalState != null)
				return false;
		} else if (!CapitalState.equals(other.CapitalState))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (totalPopulation != other.totalPopulation)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [nameCountry=" + nameCountry + ", countrySquare=" + countrySquare + ", totalPopulation="
				+ totalPopulation + ", state=" + state + "]";
	}
	
}




