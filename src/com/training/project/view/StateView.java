package com.training.project.view;

import java.util.List;

import com.training.project.bean.Area;

public class StateView {

	public void print(List<String> capitals) {
		System.out.println("===========================================");
		for (String str : capitals) {
			System.out.println(str);
		}
	}

	public void print(int amountArea) {
		System.out.println("===========================================");
		System.out.println(" Numbers of Area > " + amountArea);
	}

	public void print(double amountSquare) {
		System.out.println("===========================================");
		System.out.println(" Square of Area > " + amountSquare);
	}

	public void printall(List<Area> capitals) {
		System.out.println("===========================================");
		for (Area str : capitals) {
			System.out.println(str);
			System.out.println();
		}
	}
	
	public void print(String capital) {
		System.out.println("===========================================");
		System.out.println(" Counry Capital > " + capital);
	}
}
