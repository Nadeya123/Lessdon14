package com.training.project.bean;

import java.util.ArrayList;
import java.util.List;

public class District {

	public String nameDistrict;
	public double areaSquare;
	public int populationDistrict;
	private List<Area> district = new ArrayList<Area>();
	
	public District() {
		super();
	}
	
	public District(String nameDistrict, double areaSquare, int populationDistrict, List<Area> district) {
		super();
		this.nameDistrict = nameDistrict;
		this.areaSquare = areaSquare;
		this.populationDistrict = populationDistrict;
		this.district = district;
	}

	public String getNameDistrict() {
		return nameDistrict;
	}
	
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	
	public double getAreaSquare() {
		return areaSquare;
	}
	
	public void setAreaSquare(double areaSquare) {
		this.areaSquare = areaSquare;
	}
	
	public int getPopulationDistrict() {
		return populationDistrict;
	}
	
	public void setPopulationDistrict(int populationDistrict) {
		this.populationDistrict = populationDistrict;
	}
	
	public List<Area> getDistrict() {
		return district;
	}
	
	public void setDistrict(List<Area> district) {
		this.district = district;
	}

	public void set(int index, District district) {
		district.set(index, district);
	}
	
	public void add(Area area) {
		district.add(area);
	}
	
	public int countDistrict() {
		return district.size();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(areaSquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((nameDistrict == null) ? 0 : nameDistrict.hashCode());
		result = prime * result + populationDistrict;
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
		District other = (District) obj;
		if (Double.doubleToLongBits(areaSquare) != Double.doubleToLongBits(other.areaSquare))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (nameDistrict == null) {
			if (other.nameDistrict != null)
				return false;
		} else if (!nameDistrict.equals(other.nameDistrict))
			return false;
		if (populationDistrict != other.populationDistrict)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [nameDistrict=" + nameDistrict + ", areaSquare=" + areaSquare + ", populationDistrict="
				+ populationDistrict + ", district=" + district + "]";
	}
	
}
