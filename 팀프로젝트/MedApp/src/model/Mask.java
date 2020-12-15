package model;

public class Mask {
	String KFType;
	int stock;
	String RRnumber;
	int count;

	public String getKFType() {
		return KFType;
	}

	public void setKFType(String kFType) {
		KFType = kFType;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getRRnumber() {
		return RRnumber;
	}

	public void setRRnumber(String rRnumber) {
		RRnumber = rRnumber;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Mask(String kFType, int stock, String rRnumber, int count) {
		KFType = kFType;
		this.stock = stock;
		RRnumber = rRnumber;
		this.count = count;
	}

	public Mask(String kFType, int stock) {
		KFType = kFType;
		this.stock = stock;
	}

}
