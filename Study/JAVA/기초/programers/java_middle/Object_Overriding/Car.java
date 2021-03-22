package Object_Overriding;

public class Car {
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}

	String name;
	int number;
	
	@Override
	public String toString() {
		return "name: "+this.name+", number: "+this.number;
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("car",1234);
		System.out.println(c1);
		
		
		
	}

}
