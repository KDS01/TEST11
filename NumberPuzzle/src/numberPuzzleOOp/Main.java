package numberPuzzleOOp;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		puzzle puzzle = new puzzle();
		Player player = new Player();
		Scanner scr = new Scanner(System.in);
		System.out.println("몇자리 퍼즐 맞출래? 가로");
		int countX = scr.nextInt();
		System.out.println("몇자리 퍼즐 맞출래? 세로");
		int countY = scr.nextInt();
		puzzle.setPlayer(player);
		puzzle.setPuzzle(countX, countY);
		puzzle.print();
		while(true) {
			if(puzzle.getIsEnd()) break;
			System.out.println("p를 옮겨서 1~"+(countX * countY-1)+"순서로 맞춰라");
			System.out.println("상/하/좌/우");
			String direction = scr.nextLine();
			if(direction=="종료") break;
			if(direction=="리셋") puzzle.shuffle();
			else puzzle.movePlayer(direction);
			puzzle.print();
		}
		System.out.println("끝");
	}
}
