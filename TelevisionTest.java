
public class TelevisionTest {
	public static void main(String args[]) {
		Television mytv = new Television();
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOff = true;
		mytv.setChannel(15);
		mytv.print();
		int ch = mytv.getChannel();
		
		System.out.println("현재 체널은 "+ch+"입니다.");
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		
	}
}
