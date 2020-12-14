package model;

public class Mask {
	String KFType;
	int stock;
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
	public Mask(String kFType, int stock) {
		KFType = kFType;
		this.stock = stock;
	}


}