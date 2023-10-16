package deepsleep_web;

public class LinesBean {
	private int id;
	private String linesName;
	private String[] lines;
	public LinesBean() {};
	public LinesBean(int id,String linesName,String[] lines) {};
	public void setLinesName(String linesName) {
		this.linesName=linesName;
	}
	public void setLines(String[] lines) {
		this.lines=lines;
	}
	public int getId() {
		return id;
	}
	public String getLinesName() {
		return linesName;
	}
	public String[] getLines() {
		return lines;
	}
	

}
