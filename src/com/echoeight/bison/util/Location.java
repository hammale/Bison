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
	
	public void addX(double amnt){
		this.x += amnt;
	}
	
	public void addY(double amnt){
		this.y += amnt;
	}
	
	public Location getAddX(double amnt){
		return new Location(this.x+=amnt,this.y);
	}
	
	public Location getAddY(double amnt){
		return new Location(this.x,this.y+=amnt);
	}
	
	public Location getAddBoth(double xamnt, double yamnt){
		return new Location(this.x+=xamnt,this.y+=yamnt);
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
