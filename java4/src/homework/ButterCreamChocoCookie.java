package homework;

public class ButterCreamChocoCookie extends Cookies {
	public ButterCreamChocoCookie() {
	}
	private int coincost = 13500;
	private int crystalcost = 15;
	private int cookieLV=1;
	private double maxHP=135;
	private String cookieClass ="";
	private String[] lines = {"난 코인이 많아.","커다란 금화를 본 적 있나?","코인을 벌고 싶으면 나를 따라와.","허리가 잘록한 쿠키가 좋아...","울...ㅊㅣ즈 딸램 넘 이쁘지요..?^^","코인 한 움큼 놓고 갑니다..^^"};
	public int hitnum = 0;
	private String krName="버터크림 초코쿠키";
	private String jpName="バタークリームチョコクッキー";
	private String enName="ButterCream ChocoCookie";
	public String getKrName()
	{
		return this.krName;
	}
	public String getJPName()
	{
		return this.jpName;
	}
	public String getENName()
	{
		return this.enName;
	}
	public double MAXHP() {
		return  lowestHP +((cookieLV-1)*1.25);
	}
	public double nowHP() {
		return (maxHP - (hitnum * 40));
	}
	public double specialAbility() 
	{
		double coinbonus = 5+ ((cookieLV-1)*2.5);
		return coinbonus;
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
	public int getCost() {
		return coincost;
	}
	public int getcrystalCost() {
		return crystalcost;			
	}

}
