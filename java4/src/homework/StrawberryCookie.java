package homework;

public class StrawberryCookie extends Cookies {
	public StrawberryCookie() {}
	private int cookieLV=1;
	private double maxHP=135;
	private String cookieClass ="C";
	private String[] lines = {"나랑 같이 달려줄 거야?","난 외롭지 않아","내 친구가 되어줄래?","여기는 조금 무서운 곳인 거 같아...","인생은 혼자야...","누구든지 작은 딸기맛 쿠키를 건드리면...","뭔일인지 모르겠으니까 그냥 가만히 있어야겠다","이불 밖은 위험해...!"};
	public int hitnum = 0;
	private String krName="딸기맛 쿠키";
	private String jpName="イチゴ味クッキー";
	private String cnName="草莓餅乾";
	private String enName="Strawberry Cookie";
	private String twName="คุกกี้รเบอร์รี่สสตรอ";
	public String getKrName()
	{
		return this.krName;
	}
	public String getJPName()
	{
		return this.jpName;
	}
	public String getCNName()
	{
		return this.cnName;
	}
	public String getENName()
	{
		return this.enName;
	}
	public String getTWName()
	{
		return this.twName;
	}
	public double MAXHP() {
		return  lowestHP +((cookieLV-1)*1.25);
	}
	public double nowHP() {
		return (maxHP - (hitnum * 40));
	}
	public double specialAbility() 
	{
		double bonusTime = 1 +(cookieLV *0.5);
		return bonusTime;
	}
	public void deadpoint()
	{
		if(nowHp<=0) 
		{
			System.out.println("당신의 쿠키가 사망하였습니다! ㅠㅠ");
		}
	}
	public String getCookieClass() {
		return cookieClass;
	}
	public String[] setLines() {
		return lines;
	}
}
	



