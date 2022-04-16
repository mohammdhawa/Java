class TV {
	
	public void on() {
		System.out.println("TV opened");
	}
	
	public void off() {
		System.out.println("TV closed");
	}
	
}

class RemoteControl {
	
	private TV tv = new TV();
	
	public void tvOn() {
		tv.on();
	}
	
	public void tvOff() {
		tv.off();
	}
}

public class Test {

	public static void main(String[] args) {
		
		RemoteControl r1 = new RemoteControl();
		
		r1.tvOn();
		r1.tvOff();
		
		
	}

}
