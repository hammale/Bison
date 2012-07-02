package com.echoeight.bison.entity;

import java.util.ArrayList;
import java.util.HashSet;

public class EntityManager {
	
	public EntityManager(){
	}
	
	private HashSet<Integer> ids = new HashSet<Integer>();
	
	ArrayList<Entity> movingEntities = new ArrayList<Entity>();
	ArrayList<Entity> entitiesrem = new ArrayList<Entity>();
	
	public int assignId(Entity entity) {
		if(entity instanceof MoveableEntity){
			movingEntities.add(entity);
		}
		int i = ids.size() + 1;
		ids.add(i);
		entity.setId(i);
		return i;
	}
	
	public HashSet<Integer> getIds(){
		return ids;
	}
	
	public void markForDelete(Entity ent){
		entitiesrem.add(ent);
	}
	
	public void remove(Entity entity){
		ids.remove(entity.getId());
		entitiesrem.add(entity);
		if(entity instanceof MoveableEntity){
			if(movingEntities.contains(entity)){
				movingEntities.remove(entity);
			}
		}
		for(Entity ent : entitiesrem){
			ids.remove(ent.getId());
		}
		entitiesrem.clear();
	}
	
	public boolean isMarked(Entity ent){
		return entitiesrem.contains(ent);
	}
	
	public void flush(){
		for(Entity ent : entitiesrem){
			ids.remove(ent.getId());
		}
		entitiesrem.clear();
	}
	
	public ArrayList<Entity> getMovingEntities(){
		return movingEntities;
	}
	
	public void removeAll(){
		ids.clear();
		entitiesrem.clear();
		movingEntities.clear();
	}
}