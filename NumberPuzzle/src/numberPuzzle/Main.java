package numberPuzzle;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[][] arr1 =new int[5][5];
		int playerX= 4;
		int playerY = 4;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr1[i][j] =i *5 + j +1;
			}
		}
		
		arr1[playerX][playerY]=0;
		
		for(int i =0; i<1000; ++i)
		{
			int temp= ((int)(Math.random()*4)+1)*2;
			int[] playerPosition = Main.move(arr1, playerY, playerX, temp);
			playerX = playerPosition[0];
			playerY = playerPosition[1];
		}
		while(true) {
		Scanner scr = new Scanner(System.in);
		int input = scr.nextInt();
		int[] playerPosition = Main.move(arr1, playerY, playerX, input);
		playerX = playerPosition[0];
		playerY = playerPosition[1];
	/*	boolean isShuffle = Main.shuffle(arr1,playerY,playerX,input);
		if(isShuffle) {
			switch(input) {
			case 2 :
				playerY = playerY+1;
			case 4 :
				playerX-=1;
			case 6 :
				playerX++;
			case 8 :
				--playerY;
			}
		}
		
	}*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(arr1[i][j] ==0)
					System.out.print("p\t");
				else
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.print("\n");
	}
		}
	}
	
	public static boolean shuffle(int[][] arr1,int idx1,int idx2,int direction) {
		//dirction : 8 상 4 좌 6 우 2 하
		int temp= arr1[idx1][idx2];
		
		switch(direction) {
		case 2 :
			if(idx1 ==4) return false;
		arr1[idx1][idx2] = arr1[idx1 + 1][idx2];
		arr1[idx1 + 1][idx2] = temp;
			return true;
		case 4 : 
			if(idx2==0) return false;
		arr1[idx1][idx2] = arr1[idx1][idx2-1];
		arr1[idx1][idx2-1] = temp;
			return true;
		case 6 :
			if(idx2 ==4) return false;
		arr1[idx1][idx2] = arr1[idx1][idx2+1];
		arr1[idx1][idx2+1] = temp;
			return true;
		case 8 :
			if(idx1 ==0) return false;
		arr1[idx1][idx2] = arr1[idx1 -1][idx2];
		arr1[idx1-1][idx2] = temp;
			return true;
		default : return false;
		}
		
}
public static int[] move(int[][] arr1, int playerY, int playerX, int temp) {
		boolean isShuffle = Main.shuffle(arr1, playerY, playerX, temp);
		if(isShuffle) {
			switch(temp) {
			// input => 8 : 상 / 4 : 좌 / 6 : 우 / 2 : 하 
				case 2:
					playerY = playerY + 1;
					break; 
				case 4:
					playerX -= 1;
					break; 
				case 6:
					playerX++;
					break; 
				case 8:
					--playerY;
					break;
				default:
					break;
			
			}
		}
		return new int[] { playerX, playerY };
	}

}


	
