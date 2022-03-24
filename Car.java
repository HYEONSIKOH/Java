
public class Car {
	int speed;
	int gear;
	String color;
	
	void changeGear (int gr) {
		gear = gr;
		System.out.println("기어가 "+gear+"단으로 변경되었습니다.");
	}
	
	void speedUp(int Up) {
		speed = Up;
		System.out.println("속도를 "+speed+"km/h로 올렸습니다.");
	}
	
	void speedDown (int Dn) {
		speed = Dn;
		System.out.println("속도를 "+speed+"km/h로 내렸습니다.");
	}
	
	void showColor () {
		System.out.println("이 차의 색상은 "+color+" 입니다.");
	}
	
}
