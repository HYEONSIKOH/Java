
public class Car {
	int speed;
	int gear;
	String color;
	
	void changeGear (int gr) {
		gear = gr;
		System.out.println("�� "+gear+"������ ����Ǿ����ϴ�.");
	}
	
	void speedUp(int Up) {
		speed = Up;
		System.out.println("�ӵ��� "+speed+"km/h�� �÷Ƚ��ϴ�.");
	}
	
	void speedDown (int Dn) {
		speed = Dn;
		System.out.println("�ӵ��� "+speed+"km/h�� ���Ƚ��ϴ�.");
	}
	
	void showColor () {
		System.out.println("�� ���� ������ "+color+" �Դϴ�.");
	}
	
}
