
public class Box {
	private int width,length,height;
	
	Box(int a,int b,int c){
		this.width = a;
		this.length = b;
		this.height = c;
	}
	
	
	boolean isSameBox(Box obj2){
		if(this.width == obj2.width && this.length == obj2.length && this.height == obj2.height)
			return true;
		
		else
			return false;
		
	}
}
