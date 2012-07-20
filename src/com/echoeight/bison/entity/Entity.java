package com.echoeight.bison.entity;

import com.echoeight.bison.util.Cuboid;
import com.echoeight.bison.util.Location;

public interface Entity {
	
	public void update(int delta);
	public void destroy();
    public int getId();
    public void setId(int id);
    public void draw();
    public void setLocation(double x, double y);
    public void setX(double x);
    public void setY(double y);
    public void setWidth(double width);
    public void setHeight(double height);
    public double getX();
    public double getY();
    public double getHeight();
    public double getWidth();
    public boolean intersects(Entity other);
	public float getMouseAngle();
	public void setLocation(Location loc);
	public Location getLocation();
	public Cuboid getCuboid();
	public void setCuboid(Cuboid cuboid);
}
