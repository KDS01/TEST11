package c230906;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

enum STATE{
	ATTACK,
	USE_ITEM,
	RUN
}

public class Player extends Unit {
	Scanner scr =new Scanner(System.in);
	private int attackPowerModifier;
	private LinkedList<Item> inventory = new LinkedList<>();
	private String[] itemNames = {
			"검", "방패" , "물약", "고대 마법서","절대반지",
	};
	public Player(String name, int health, int attackPower) {
		super(name,health,attackPower);
	}
	//아이템 랜덤 생성
	private void randomItem() {
		Random random = new Random();
		//1~3개의 랜덤한 아이템 획득
		int numItem =random.nextInt(3)+1;
		//랜덤한 아이템 이름이랑 공격력
		for(int i =0; i<numItem; i++) 
		{
			String itemName=itemNames[random.nextInt(itemNames.length)];
			int itemPower = random.nextInt(10)+1;
			Item item = new Item(itemName, itemPower);
			inventory.add(item);
		}
	}
		
		private void randomItems() {
			Random random = new Random();
		}
		
		public STATE selectAction() {
			
			System.out.println("공격");
			System.out.println("2. 아이템 사용");
			System.out.println("3. 도망");
			System.out.println("선택해 : ");
			int select =scr.nextInt();
			switch(select) {
			case 1:
				return STATE.ATTACK;
			case 2:
				return STATE.USE_ITEM;
			case 3:
				return STATE.RUN;
			default:
				return null;
			}
		}
		public void useItem() {
			System.out.println("사용할 아이템을 선택해라");
			int index = 1;
			for(Item item : inventory) {
				System.out.println(index + ". " + item.getItemName());
				index++;
			}
			int choice=scr.nextInt();
			if(choice>=1 && choice<=inventory.size()) {
				Item selected = inventory.get(choice-1);
				
				System.out.println(getName()+ "가" + selected.getItemName() +"을 사용함! 공격력이"+ selected.getItemPower()+ "만큼 증가!!!");
				
				increasesAttackPower(selected.getItemPower());
				inventory.remove(selected);
			}
			else {
				System.out.println("잘못된 선택이었다.");
			}
		}
		
		public void addItem(Item item) {
			inventory.add(item);
			System.out.println(getName()+ "가"+ item.getItemName() +" 을 획득하셨습니다");
		}
		public void increasesAttackPower(int power) {
			attackPowerModifier+=power;
		}
		
		
		@Override
		public int attack() {
			return super.attack()+attackPowerModifier;
		}

		
		
	}


