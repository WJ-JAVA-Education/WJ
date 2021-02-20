package rc_ps;

public class EmployeeBank {

	
String name ;
int amount = 0;

public EmployeeBank(String name) {
	this.name = name;
}

public void saveMoney(Integer money) {
	this.amount += money;
	//System.out.println("금월 저금금액 + :" + amount);
}


public void spendMoney (Integer money) {
	this.amount -= money;
	//System.out.println("금월 사용금액 "+ amount);
	System.out.println();
}
	
public void getBankinfo() {
	//System.out.println("===========================");
	//System.out.println("이름" + this.name);
	//System.out.println("계좌"+ this.amount);
}


}

