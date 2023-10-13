
package Stage1;
import deepsleep.StageMaker;
import java.util.Scanner;
import deepsleep.STAGESTATUS;
import deepsleep.SUBSTATUS;
import deepsleep.Narrator;
import deepsleep.STAGE;
public class Stage1Flow{
		Stage1Lines S1Lines = new Stage1Lines();
		STAGE s1;
		STAGESTATUS s1stt;
		SUBSTATUS s1sub;
		Narrator nar = new Narrator();
		StageMaker sm = new StageMaker(s1,s1stt,s1sub);
		public void s1flows() {
			sm.setStage(s1);
			S1Start();
			S1provisoInput1();
			S1ORG();
			S1provisoInput2();
			S1End();
		}
		public void S1Start() {
			sm.setStatus(STAGESTATUS.START);
			nar.Narration(S1Lines.stage1Start);	
		}
		public void S1provisoInput1() {
			sm.setStatus(STAGESTATUS.FIRST);
			sm.setSub(SUBSTATUS.INPUT);
			Scanner scr =new Scanner(System.in);
			ChoiceObject COB = new ChoiceObject();
			Stage1Lines S1Lines = new Stage1Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S1Lines.stage1Proviso1+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "계단" :
//						StairProviso temp = new StairProviso();
						nar.Narration((new StairProviso()).choiceObjectLines);
						break;
					case "형광등":
						LightProviso Lt = new LightProviso();
						nar.Narration(Lt.choiceObjectLines);
						break;
					case "바닥에 떨어진 종이":
						PaperProviso PP = new PaperProviso();
						nar.Narration(PP.choiceObjectLines);
						break;
					case "도어락":
						DoorLockProviso DL = new DoorLockProviso();
						nar.Narration(DL.choiceObjectLines);
						provisocount++;
						break;
					case "빌라 바깥":
						WindowProviso WP = new WindowProviso();
						nar.Narration(WP.choiceObjectLines);
						break;
					case "계단 위쪽":
						UpstairProviso UP = new UpstairProviso();
						nar.Narration(UP.choiceObjectLines);
						break;
					case "현관문":
						FrontDoorProviso FD = new FrontDoorProviso();
						nar.Narration(FD.choiceObjectLines);
						break;
					default :
						System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(provisocount>=1) {
					break;
				}
			}
		}
		public void S1ORG() {
			sm.setStatus(STAGESTATUS.FIRST);
			sm.setSub(SUBSTATUS.ORG);
			Stage1Lines S1Lines = new Stage1Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S1Lines.orgbase[i]);
			}
			nar.Narration(S1Lines.stage1Organize);	
		}
		public void S1provisoInput2() {
			sm.setStatus(STAGESTATUS.SECOND);
			sm.setSub(SUBSTATUS.INPUT);
			Scanner scr =new Scanner(System.in);
			ChoiceObject COB = new ChoiceObject();
			Stage1Lines S1Lines = new Stage1Lines();
			int Pcount =0;
			while(true)
			{
				System.out.print(S1Lines.stage1Proviso2+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "계단" :
					WindowProviso temp = new WindowProviso();
					nar.Narration(temp.choiceObjectLines);
					break;
				case "형광등":
					LightProviso Lt = new LightProviso();
					nar.Narration(Lt.choiceObjectLines);
					break;
				case "도어락":
					DoorLockProviso DL = new DoorLockProviso();
					nar.Narration(DL.choiceObjectLines);
					break;
				case "바닥에 떨어진 종이":
					PaperProviso PP = new PaperProviso();
					nar.Narration(PP.choiceObjectLines);
					break;
				case "빌라 바깥":
					WindowProviso WP = new WindowProviso();
					nar.Narration(WP.choiceObjectLines);
					break;
				case "계단 위쪽":
					UpstairProviso UP = new UpstairProviso();
					nar.Narration(UP.choiceObjectLines);
					break;
				case "현관문":
					FrontDoorProviso FD = new FrontDoorProviso();
					nar.Narration(FD.choiceObjectLines);
					break;
				case "장도리":
					ClawHammerProviso CH = new ClawHammerProviso();
					nar.Narration(CH.choiceObjectLines);
					Pcount++;
					break;
				default :
					System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(Pcount>=1)
				{
					break;
				}
			}
		}
		public void S1End() {
			sm.setStatus(STAGESTATUS.END);
			Stage1Lines S1Lines = new Stage1Lines();
			nar.Narration(S1Lines.S1Ending);	
		}
		
}
	
