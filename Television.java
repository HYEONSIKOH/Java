
public class Television {

	int channel;   //ä�� ��ȣ
	int volume;    //����
	boolean onOff; //����
	
	void print() {
		System.out.println("�ڷ������� ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	
	int getChannel() {
		return channel;
	}
	
	int setChannel(int ch) {
		channel = ch;
	}
	
}
