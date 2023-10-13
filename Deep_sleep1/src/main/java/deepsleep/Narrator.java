package deepsleep;
import java.util.Scanner;
import deepsleep.EndingLines;
import deepsleep.STAGE;
import deepsleep.STAGESTATUS;
import deepsleep.SUBSTATUS;
public class Narrator {
	private static long starttime = System.currentTimeMillis();
	private static long endtime = starttime+ 300000;
	public void setEndtime(long temp) {
		this.endtime=temp;
	}
	public long getTime() {
		return starttime;
	}
//	private STAGE st;
//	private STAGESTATUS stt;
//	private SUBSTATUS sub;
//	
//	public Narrator(STAGE st,STAGESTATUS stt, SUBSTATUS sub) {
//		this.st=st;
//		this.stt=stt;
//		this.sub=sub;
//	}
//	public void setStage(STAGE st) {
//		this.st=st;
//	}
//	public STAGE getStage() {
//		return st;
//	}
//	public void setStagestatus(STAGESTATUS stt) {
//		this.stt=stt;
//	}
//	public STAGESTATUS getStagestatus() {
//		return stt;
//	}
//	public void setSub(SUBSTATUS sub) {
//		this.sub=sub;
//	}
//	public SUBSTATUS getsub() {
//		return sub;
//	}
//	
	public void noTimeOutNarration(String[] a) {
			for(int i=0; i<a.length; i++) {
				Scanner scr =new Scanner(System.in);
				scr.nextLine();
				System.out.println(a[i]);
				System.out.println("\r\n");
					 }
				}
public void Narration(String[] a) {
			EndingLines ed=new EndingLines();
			for(int i=0; i<a.length; i++) {
				long timecheck = System.currentTimeMillis();
				if(timecheck>=endtime) {
					noTimeOutNarration(ed.badEnding);
					System.exit(0);
				}
				else {
				Scanner scr =new Scanner(System.in);
				scr.nextLine();
				System.out.println(a[i]);
				System.out.println("\r\n");
					 }
				}

		}
	public void PlayerNarration(String[] a) {
		EndingLines ed=new EndingLines();
			for(int i=0; i<a.length; i++) {
				long timecheck = System.currentTimeMillis();
				if(timecheck>=endtime) {
					noTimeOutNarration(ed.badEnding);
					System.exit(0);
				}
				else {
					Scanner scr =new Scanner(System.in);
					scr.nextLine();
					System.out.println("???    :  " +a[i]);
					System.out.println("\r\n");
				}
			}

		}
	public void NameNarration(String[] a) {
		EndingLines ed=new EndingLines();
		for(int i=0; i<a.length; i++) {
			long timecheck = System.currentTimeMillis();
			if(timecheck>=endtime) {
				noTimeOutNarration(ed.badEnding);
				System.exit(0);
			}
			else {
			Scanner scr =new Scanner(System.in);
			scr.nextLine();
			System.out.println("한수연  : " +a[i]);
			System.out.println("\r\n");
			}
		}
	}
}

	

