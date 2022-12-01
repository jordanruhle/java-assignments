package com.jordan.zookeeper;

public class Mammal {
	protected int energyLevel;
	
	
	public Mammal() {
		super();
		this.energyLevel = 100;
	}

	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}


	public int displayEnergyLevel() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	


	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
