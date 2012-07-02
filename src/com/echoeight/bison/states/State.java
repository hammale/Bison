package com.echoeight.bison.states;

public interface State {
	public void init();
	public void update();
	public int getDelta();
}
