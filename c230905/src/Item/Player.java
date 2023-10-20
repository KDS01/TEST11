package Item;
import java.util.List;
import java.util.ArrayList;




public class Player {
	private List<item> inventory;
	private int defense;
	private int attack;
	public Player(int defense, int attack) {
		inventory =  new ArrayList<>();
		this.defense=defense;
		this.attack=attack;
	}
	public void AddItem(item item) {
		inventory.add(item);
	}
	public void listInventory() {
		System.out.println("인벤토리 아이템 목록 :");
		for(item item : inventory) {
			System.out.println(item.getName()+ "(장착 여부 : "+(item.isEquipped() ? "장착" : "탈착" +")"));
		}
	}
	public void equipItem(int index) {
		//내가 장착하려는 인덱스의 아이템이 0 이상일 경우와, 인벤토리 크기보다 작은 경우에만 장착할 수 있음
		if(index>=0 && index<inventory.size()) {
			 item item =inventory.get(index);
			 //선택된 아이템이 장착되어 있지 않다면
			 if(!item.isEquipped())
			 {
				 item.equip();// 장착한다
				 defense = item.getDefense();// 아이템의 방어력 수치만큼 올라간다
				 attack = item.getAttack();
			 
			
			System.out.println("방어력이 "+defense+"만큼 올라감");
			System.out.println("공격력이 "+attack+"만큼 올라감");
			 }
			else {
				System.out.println(item.getName()+ "은 이미 장착중임");
				}
		}
			 else { 
				 System.out.println("벗어남");
			 }		
	}
}




