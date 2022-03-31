
public class Cartest {
	public static void main(String args[]) {
		Car c1 = new Car("s600","white",80);
		Car c2 = new Car("e500","blue",80);
		
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = "+n);
	}

}
