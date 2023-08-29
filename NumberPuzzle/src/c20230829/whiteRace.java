package c20230829;

public final class whiteRace extends Person {
	int[] skinColor;
	
	whiteRace(){
		super();//상속을 받았으면 기본으로 넣어줘야 함.(부모의 생성자는 무조건 자식의 생성자에 포함이 되어야 함. 상속을 받았다면 디폴트로 들어가야 함)
		skinColor = new int[] {255, 255, 255};
	}

}
