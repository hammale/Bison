package com.echoeight.bison.util;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Transform;

import com.echoeight.bison.entity.Entity;

public class Cuboid {
	
    public Location loc;
    private double length, width;
    Rectangle rect;
    
    public Cuboid(Location loc, double width, double height) {
    	this.loc = loc;
    	this.length = height;
    	this.width = width;
    	this.rect = new Rectangle((float) loc.getX(), (float) loc.getY(), (float) width, (float) height);
    }
    
    public double getWidth(){
    	return this.width;
    }
    
    public double getLenght(){
    	return this.length;
    }
    
	public Location getCenter() {
		return new Location(rect.getCenterX(), rect.getCenterY());
	}
	
	public void rotate(double angle){
		rect.transform(Transform.createRotateTransform((float) angle));
	}

	public Rectangle getRectangle(){
		return this.rect;
	}
	
	public void setRectangle(Rectangle rect){
		this.rect = rect;
	}
	
    public boolean intersects(Cuboid cub) {
    		return rect.intersects(cub.getRectangle());
     }
    
    public void setLocation(Location loc) {
        this.loc = loc;
        rect.setLocation((float) loc.getX(), (float) loc.getY());
    }

    public Location getLocation() {
        return this.loc;
    }

    
    public boolean isInCuboid(Location loc) {
        return rect.includes((float) loc.getX(), (float) loc.getY());
    }
    public boolean isInCuboid(Entity e) {
        return rect.includes((float) e.getX(), (float) e.getY());
    }
}
