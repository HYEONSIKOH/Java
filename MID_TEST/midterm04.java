package MID_TEST;

public class midterm04{
	String model;
	String make;
	static int numberOfCar = 0;

	
	public midterm04(String model, String make) {
		this.model = model;
		this.make = make;
		numberOfCar++;
		
		System.out.println("�ڵ��� 1�� ����, ������ : "+make);
	}
	
	public midterm04(String make) {
		this.model = "NO";
		this.make = make;
		numberOfCar++;
		
		System.out.println("�ڵ��� 1�� ����, ������ : "+make);
	}
	
	public static void ShowNumberOfCar() {
		System.out.println("���� ���귮 : "+numberOfCar+"��");
	}
	
	public static int getNumberOfCars() {
		return numberOfCar;
	}
}
