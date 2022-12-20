package com.training.project.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Area {
 
	public String nameArea;
	public String CapitalArea;
	public double areaSquare;
	public int population;
	private List<Town> area = new ArrayList<Town>();
	
	public Area() {
	}
	
	public Area(String nameArea, String capitalArea, double areaSquare, int population, List<Town> area) {
		super();
		this.nameArea = nameArea;
		CapitalArea = capitalArea;
		this.areaSquare = areaSquare;
		this.population = population;
		this.area = area;
	}
	
	public int setPopulation() {
		return population;
	}
	
	public int getPopulation() {
		return population;
	}

	public List<Town> getArea() {
		return area;
	}

	public void setArea(List<Town> area) {
		this.area = area;
	}
	
	public Town getArea(int index) {
		return area.get(index);
	}
	
	public void set(int index, Area area) {
		area.set(index, area);
	}
	
	public void add(Town town) {
		area.add(town);
	}
	
	public int countArea() {
		return area.size();
	}

	public String getNameArea() {
		return nameArea;
	}


	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}


	public String getCapitalArea() {
		return CapitalArea;
	}


	public void setCapitalArea(String capitalArea) {
		CapitalArea = capitalArea;
	}


	public double getAreaSquare() {
		return areaSquare;
	}


	public void setAreaSquare(double areaSquare) {
		this.areaSquare = areaSquare;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CapitalArea == null) ? 0 : CapitalArea.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		long temp;
		temp = Double.doubleToLongBits(areaSquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameArea == null) ? 0 : nameArea.hashCode());
		result = prime * result + population;
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
		Area other = (Area) obj;
		if (CapitalArea == null) {
			if (other.CapitalArea != null)
				return false;
		} else if (!CapitalArea.equals(other.CapitalArea))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (Double.doubleToLongBits(areaSquare) != Double.doubleToLongBits(other.areaSquare))
			return false;
		if (nameArea == null) {
			if (other.nameArea != null)
				return false;
		} else if (!nameArea.equals(other.nameArea))
			return false;
		if (population != other.population)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area \n[nameArea=" + nameArea + ", \nCapitalArea=" + CapitalArea + ", \nareaSquare=" + areaSquare + " km2"
				+ ", \npopulation=" + population + "]";
	}
	

}

