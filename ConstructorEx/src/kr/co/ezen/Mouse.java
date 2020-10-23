package kr.co.ezen;

public class Mouse {

	
	private int zzz;
	private int xxx;
	private int ccc;
	private int fff;
	private Dongki dongki;
	
	public Mouse() {
		
	}

	public Mouse(int zzz, int xxx, int ccc, int fff, Dongki dongki) {
		super();
		this.zzz = zzz;
		this.xxx = xxx;
		this.ccc = ccc;
		this.fff = fff;
		this.dongki = dongki;
	}

	public Dongki getDongki() {
		return dongki;
	}

	public void setDongki(Dongki dongki) {
		this.dongki = dongki;
	}

	public int getZzz() {
		return zzz;
	}

	public void setZzz(int zzz) {
		this.zzz = zzz;
	}

	public int getXxx() {
		return xxx;
	}

	public void setXxx(int xxx) {
		this.xxx = xxx;
	}

	public int getCcc() {
		return ccc;
	}

	public void setCcc(int ccc) {
		this.ccc = ccc;
	}

	public int getFff() {
		return fff;
	}

	public void setFff(int fff) {
		this.fff = fff;
	}
	
	
}
