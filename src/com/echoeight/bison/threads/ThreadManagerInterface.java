package com.echoeight.bison.threads;

public interface ThreadManagerInterface {
	
	public void startThread();
	public boolean isActive();
	public void pauseThread(boolean pause);	
	public void stopThread();
	
}
