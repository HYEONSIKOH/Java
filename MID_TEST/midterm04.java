package MID_TEST;

public class midterm04{
	String model;
	String make;
	static int numberOfCar = 0;

	
	public midterm04(String model, String make) {
		this.model = model;
		this.make = make;
		numberOfCar++;
		
		System.out.println("자동차 1대 생산, 생산지 : "+make);
	}
	
	public midterm04(String make) {
		this.model = "NO";
		this.make = make;
		numberOfCar++;
		
		System.out.println("자동차 1대 생산, 생산지 : "+make);
	}
	
	public static void ShowNumberOfCar() {
		System.out.println("누적 생산량 : "+numberOfCar+"대");
	}
	
	public static int getNumberOfCars() {
		return numberOfCar;
	}
}
