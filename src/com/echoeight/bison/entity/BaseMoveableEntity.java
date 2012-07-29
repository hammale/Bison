package com.echoeight.bison.entity;

public abstract class BaseMoveableEntity extends BaseEntity implements MoveableEntity {
	
	protected double dx ,dy,lastx,lasty;
	
	public BaseMoveableEntity(EntityManager em, double x, double y, double width, double height) {
		super(em, x, y, width, height);
        this.dx = 0;
        this.dy = 0;
	}

    @Override
    public void update(int delta) {
            x += delta * dx;
            y += delta * dy;
            lastx = x;
            lasty = y;
    }
    
    public double getLastX(){
    	return lastx;
    }
    
    public double getLastY(){
    	return lasty;
    }
    
    public double getDX() {
            return dx;
    }
    
    public double getDY() {
            return dy;
    }
    
    public void setDX(double dx) {
            this.dx = dx;
    }
    
    public void setDY(double dy) {
            this.dy = dy;
    }
	
    @Override
    public boolean intersects(Entity other) {
    	hitbox.setBounds((int) x, (int) y, (int) width, (int) height);
    	
    	if(hitbox.intersects(other.getX(), other.getY(), other.getWidth(), other.getHeight())){
    		return true;
    	}
    	return false;   	
    }
    
}