package c230906;

public class Item {
	private String name;
	private int power;
	public Item(String name, int power) 
	{
		this.name=name;
		this.power=power;
	}
	public String getItemName() {
		return name;
	}
	public int getItemPower() {
		return power;
	}
}
