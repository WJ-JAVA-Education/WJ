package rc_ps;

public class EmployeeBank {

	
String name ;
int amount = 0;

public EmployeeBank(String name) {
	this.name = name;
}

public void saveMoney(Integer money) {
	this.amount += money;
	//System.out.println("�ݿ� ���ݱݾ� + :" + amount);
}


public void spendMoney (Integer money) {
	this.amount -= money;
	//System.out.println("�ݿ� ���ݾ� "+ amount);
	System.out.println();
}
	
public void getBankinfo() {
	//System.out.println("===========================");
	//System.out.println("�̸�" + this.name);
	//System.out.println("����"+ this.amount);
}


}

