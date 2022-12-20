package com.training.project.main;

import java.util.List;

import com.training.project.bean.Area;
import com.training.project.bean.District;
import com.training.project.bean.State;
import com.training.project.bean.Town;
import com.training.project.logic.StateLogic;
import com.training.project.view.StateView;

public class MainState {

	public static void main(String[] args) {

		Town town1 = new Town("Edmonton", 684, 999233);
		Town town2 = new Town("Calgary", 820, 1306784);
		Town town3 = new Town("Voncouver", 310, 710000);
		Town town4 = new Town("Kamloops", 114, 299000);
		Town town5 = new Town("Winnipeg", 705, 705244);
		Town town6 = new Town("Toronto", 841, 2615060);
		Town town7 = new Town("Montreal", 365, 1643519);
		Town town8 = new Town("Otawa", 2778, 945438);

		Area area1 = new Area();
		area1.add(town1);
		area1.add(town2);
		area1.population = 4262635;
		area1.CapitalArea = town1.getTownName();
		area1.areaSquare = 640081;
		area1.nameArea = "Alberta";
		
		Area area2 = new Area();
		area2.add(town3);
		area2.add(town4);
		area2.population = 5000879;
		area2.CapitalArea = town3.getTownName();
		area2.areaSquare = 944735;
		area2.nameArea = "British Columbia";

		Area area3 = new Area();
		area3.add(town5);
		area3.population = 1342153;
		area3.CapitalArea = town5.getTownName();
		area3.areaSquare = 649950;
		area3.nameArea = "Manitoba";
		
		Area area4 = new Area();
		area4.add(town6);
		area4.population = 13448494;
		area4.CapitalArea = town6.getTownName();
		area4.areaSquare = 1076395;
		area4.nameArea = "Ontario";
		
		Area area5 = new Area();
		area5.add(town7);
		area5.add(town8);
		area5.population = 8214700;
		area5.CapitalArea = town8.getTownName();
		area5.areaSquare = 1542056;
		area5.nameArea = "Quebec";

		District dis1 = new District();
		dis1.add(area1);
		dis1.add(area2);
		dis1.nameDistrict = "Western Provinces";

		District dis2 = new District();
		dis2.add(area3);
		dis2.add(area4);
		dis2.add(area5);
		dis2.nameDistrict = "Eastern Provinces";

		State canada = new State();
		canada.add(dis1);
		canada.add(dis2);
		canada.setCapitalState("Otawa");

		
		StateLogic st = new StateLogic();
		StateView vw = new StateView();
		
		List<Area> listArea = st.gottaAllArea(canada);
		vw.printall(listArea);
		
		
		List<String> listCapitals = st.gottaCapitals(canada);
		vw.print(listCapitals);
		
		String capital = canada.getCapitalState();
		vw.print(capital);
		
		int count = st.gottaCountArea(canada);
		vw.print(count);
		
		double square = st.gottaStateSquaere(canada);
		vw.print(square);
		
	}
	
}
