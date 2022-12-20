package com.training.project.bean;

public class Town {

	private String townName;
	private double townSquare;
	private int population;
	
	public Town() {
	}
	
	public Town(String townName, double townSquare, int population) {
		super();
		this.townName = townName;
		this.townSquare = townSquare;
		this.population = population;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public double getTownSquare() {
		return townSquare;
	}

	public void setTownSquare(double townSquare) {
		this.townSquare = townSquare;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Town [\ntownName=" + townName + ", \ntownSquare=" + townSquare + ", \npopulation=" + population + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + population;
		result = prime * result + ((townName == null) ? 0 : townName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(townSquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Town other = (Town) obj;
		if (population != other.population)
			return false;
		if (townName == null) {
			if (other.townName != null)
				return false;
		} else if (!townName.equals(other.townName))
			return false;
		if (Double.doubleToLongBits(townSquare) != Double.doubleToLongBits(other.townSquare))
			return false;
		return true;
	}
	
}
