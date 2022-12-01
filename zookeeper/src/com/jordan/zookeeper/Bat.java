package com.jordan.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("flap flap flap");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Human screams");
		this.energyLevel += 25;
		}

	public void attackTown() {
		System.out.println("AHHHHHHHHHH");
		this.energyLevel -= 100;
	}
	
}
