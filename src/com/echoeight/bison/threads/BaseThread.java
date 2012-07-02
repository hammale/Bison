package com.echoeight.bison.threads;


public abstract class BaseThread implements ThreadInterface {
	
	public boolean running = true;
	public boolean paused;
	
	@Override
	 public void kill() {
		running = false;
	}
	
	@Override
	public boolean getPaused(){
		return paused;
	}
	
	@Override
	public void pause(boolean paused) {
		this.paused = paused;
		
	}
	
}