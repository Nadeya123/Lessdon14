package com.training.project.logic;

import java.util.ArrayList;
import java.util.List;
import com.training.project.bean.Area;
import com.training.project.bean.District;
import com.training.project.bean.State;

public class StateLogic {

	public int gottaCountArea(State state) {
		return gottaAllArea(state).size();
	}

	public double gottaStateSquaere(State state) {
		double amountSquare = 0;
		List<Area> list = gottaAllArea(state);
		for (Area area : list) {
			amountSquare += area.areaSquare;
		}
		return amountSquare;
	}

	public List<Area> gottaAllArea(State state) {
		List<Area> list = new ArrayList<>();
		for (District district : state.getState()) {
			for (Area area : district.getDistrict()) {
				list.add(area);
			}
		}
		return list;
	}
	
	public List<String> gottaCapitals(State state) {
		List<String> capitals = new ArrayList<>();
		List<Area> list = gottaAllArea(state);
		for (Area area : list) {
			capitals.add(area.getCapitalArea());
		}
		return capitals;
	}
}
