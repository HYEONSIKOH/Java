
public class Television {

	private int channel;   //ä�� ��ȣ
	private int volume;    //����
	private boolean onOff; //����
	
	Television(int c,int v,boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
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
