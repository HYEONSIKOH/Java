
public class TelevisionTest {
	public static void main(String args[]) {
		Television mytv = new Television(10,5,false);
		
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOff = true;
		mytv.setChannel(15);
		mytv.print();
		int ch = mytv.getChannel();
		
		
		
		Television yourTv = new Television(10,5,false);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		
	}
}
