package com.echoeight.bison.util;

public class Location {
	
	double x,y;
	
	public Location(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public void setLocation(Location loc){
		this.x = loc.getX();
		this.y = loc.getY();
	}
}
