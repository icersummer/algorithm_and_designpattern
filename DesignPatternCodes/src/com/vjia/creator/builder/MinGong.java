package com.vjia.creator.builder;

public class MinGong implements Builder {

	private String window="";
	private String floor="";
	
	@Override
	public void makeWindow() {
		// TODO Auto-generated method stub
		window= "Window";
	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		floor= "Floor";
	}

	@Override
	public Room getRoom() {
		// TODO Auto-generated method stub
		if(!window.equals("") && !floor.equals("")){
			Room r= new Room();
			r.setFloor(floor);
			r.setWindow(window);
			return r;
		} else
			return null;
	}

}
