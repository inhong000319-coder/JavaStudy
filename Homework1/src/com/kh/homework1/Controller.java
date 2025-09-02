package com.kh.homework1;

import java.util.Scanner;


public class Controller extends Model{
	
	private Buyer buy = null;
	
	private Model[] mList = new Model[5];
	
	{
		mList[0] = new Model("lambo", "레부엘토", "v12", 1015);
		mList[1] = new Model("porsche", "911", "f6", 541);
		mList[2] = new Model("ferrari", "라페라리", "v12", 963);
		mList[3] = new Model("mclaren", "720s", "v8", 740);
		mList[4] = new Model("bugatti", "시론", "w16", 1500);
	}
	
	private Scanner sc = new Scanner(System.in);
	
	public void insertBuyer(Buyer buy) {
		this.buy = buy;
			
			
		}
	public Model[] modelInfo() {
		return mList;
	}
	
	public Model modelInfo(int index) {
		return mList[index];
	}
	
	}
