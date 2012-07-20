package com.echoeight.bison.util;

import com.echoeight.bison.entity.Entity;

public class Cuboid {
	
    public Location a, b, c, d;
    private int length, width;
    public Cuboid(Location a, Location b, double width, double height) {
    	this.a = a;
    	this.b = b;
    	this.c = a.getAddX(width*-1);
    	this.d = b.getAddX(height);
    	this.length = (int) height;
    	this.width = (int) width;
    }
    
    public int getWidth(){
    	return this.width;
    }
    
    public int getLenght(){
    	return this.length;
    }
    
	public Location getCenter() {
		return new Location((this.a.getX() + this.b.getX()) / 2D,
				(this.a.getY() + this.b.getY()) / 2D);
	}
	
	public void rotate(double dx, double dy, double angle){
		a.setX(a.getX() - dx*Math.cos(angle) + dy*Math.sin(angle));
		a.setY(a.getY() - dx*Math.sin(angle) - dy*Math.cos(angle));
		b.setX(b.getX() - dx*Math.cos(angle) + dy*Math.sin(angle));
		b.setY(b.getY() - dx*Math.sin(angle) - dy*Math.cos(angle));
		c.setX(c.getX() - dx*Math.cos(angle) + dy*Math.sin(angle));
		c.setY(c.getY() - dx*Math.sin(angle) - dy*Math.cos(angle));
		d.setX(d.getX() - dx*Math.cos(angle) + dy*Math.sin(angle));
		d.setY(d.getY() - dx*Math.sin(angle) - dy*Math.cos(angle));
	}
	
    public boolean intersects(Cuboid cub) {
    		if (c.getX() >= cub.d.getX() || 
    			d.getX() <= cub.c.getX() || 
    			c.getY() <= cub.d.getY() || 
    			d.getY() >= cub.c.getY()) 
    		return false;
    		return true;
     }
    
    public void setA(Location a) {
        this.a = a;
    }

    public void setB(Location b) {
        this.b = b;
    }

    public Location getA() {
        return this.a;
    }

    public Location getB() {
        return this.b;
    }

    public double getMaxX() {
        return Math.max(a.getX(), b.getX());
    }

    public double getMinX() {
        return Math.min(a.getX(), b.getX());
    }

    public double getMaxY() {
        return Math.max(a.getY(), b.getY());
    }

    public double getMinY() {
        return Math.min(a.getY(), b.getY());
    }
    
    public boolean isInCuboid(Location location) {
        return location.getX() >= this.getMinX()
                && location.getX() <= this.getMaxX()
                && location.getY() >= this.getMinY()
                && location.getY() <= this.getMaxY();
    }
    public boolean isInCuboid(Entity e) {
        return e.getLocation().getX() >= this.getMinX()
                && e.getLocation().getX() <= this.getMaxX()
                && e.getLocation().getY() >= this.getMinY()
                && e.getLocation().getY() <= this.getMaxY();
    }
}
