package homework;

public class BraveCookie extends Cookies {
	public BraveCookie() {}
	private double maxHP=100;
	private String cookieClass ="C";
	private String[] lines = {"달리기 하면 나지!","마녀는 보이지 않는군… 이때다!","안 돼! 난 여기에서 빠져나가야겠어!","이대로 먹힐 수는 없어!","쿠키라고 무시하지 마!","너! 내 동료가 돼라!","용감한 쿠키가 튀어오르기를 사용했다! 아무일도 일어나지 않았다","탕수육은 부먹이지!"};
	private String[] accLv= {"용감함","조금 더 용감함","더 용감함","꽤 용감함","제법 용감함","최고 용감함","용감한데다 멋져","짱짱 용감함"};	
	public int hitnum = 0;
	public String getKrName()
	{
		return ("용감한 쿠키");
	}
	public String getJPName()
	{
		return ("勇敢なクッキー君");
	}
	public String getCNName()
	{
		return ("勇敢饼干");
	}
	public String getENName()
	{
		return ("Brave Cookie");
	}
	public String getTWName()
	{
		return ("คุกกี้ผู้กล้าหาญ");
	}
	public double MAXHP() {
		return  lowestHP +((cookieLV-1)*1.25);
	}
	public double nowHP() {
		return (maxHP - (hitnum * 40));
	}
	public void deadpoint()
	{
		if(nowHp<=0) 
		{
			System.out.println("당신의 쿠키가 사망하였습니다! ㅠㅠ");
		}
	}
	String specialAbility(int cookieLV) 
	{
		return accLv[cookieLV-1];
	}
	public String[] getCookieLines()
	{
		return lines;
	}
	public String getCookieClass() {
		return cookieClass;
	}
	public int getHitNum() {
		return hitnum;
	}
}


