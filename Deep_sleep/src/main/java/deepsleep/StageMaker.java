package deepsleep;

public class StageMaker {
	private STAGE st;
	private STAGESTATUS stt;
	private SUBSTATUS sub;
	public StageMaker(STAGE st, STAGESTATUS stt, SUBSTATUS sub) {
		this.st=st;
		this.stt=stt;
		this.sub=sub;
	}
	public StageMaker(STAGE st, STAGESTATUS stt) {
		this.st=st;
		this.stt=stt;
	}
	public StageMaker(STAGE st, SUBSTATUS sub) {
		this.st=st;
		this.sub=sub;
	}
	public void setStage(STAGE st) {
		this.st=st;
	}
	public void setStatus(STAGESTATUS stt) {
		this.stt=stt;
	}
	public void setSub(SUBSTATUS sub) {
		this.sub=sub;
	}
	public STAGE getSTAGE() {
		return st;
	}
	public STAGESTATUS getStatus() {
		return stt;
	}
	public SUBSTATUS getsub() {
		return sub;
	}
}
