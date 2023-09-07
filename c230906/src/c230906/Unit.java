package c230906;

import java.util.Random;

public class Unit {
	private String name;
	private int health;
	private int attackPower;
	public Unit(String name, int health, int attackPower) {
		this.name=name;
		this.health=health;
		this.attackPower= attackPower;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getattackPower() {
		return attackPower;
	}
	public boolean isAllive() {
		return health>0;
	}
	public int attack() {
		Random ran = new Random();
		int damage=ran.nextInt(attackPower)+1;
		return damage;
	}
	public void takeDamage(int dagame) {
		
	}

}
