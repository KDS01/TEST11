package Item;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
enum SELECT 
{
	INVENTORY,
	EQUIP_ITEM,
	UNEQUIP_ITEM,
	EXIT,INVALID
}

public class Main {
	public static void main(String[] args) {
		
		Player player =new Player(0,0);
		item item1 = new item("집행검",0,10);
		item item2 = new item("누더기 갑옷" ,5,0);
		
		player.AddItem(item1);
		player.AddItem(item1);
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1. 인벤토리 보기");
			System.out.println("2. 인벤토리 보기");
			System.out.println("3. 인벤토리 보기");
			System.out.println("4. 인벤토리 보기");
			System.out.println("5. 인벤토리 보기");
		}
		SELECT userSelect =select(choice);
		private static SELECT select(int select) 
		{
			switch(select) {
			case 1 :return SELECT.INVENTORY;
			case 2 :return SELECT.EQUIP_ITEM;
			case 3 :return SELECT.UNEQUIP_ITEM;
			case 4 :return SELECT.EXIT;
			case 5 :return SELECT.INVALID;
			}


}
	}
}
	
