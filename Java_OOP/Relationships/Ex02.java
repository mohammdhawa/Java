
interface RemoteControlInterface {
	
	public void on();
	public void off();
	
}

class TV implements RemoteControlInterface {
	
	@Override 
	public void on() {
		System.out.println("TV opened");
	}
	
	@Override 
	public void off() {
		System.out.println("TV closed");
	}
	
}

class Radio implements RemoteControlInterface {
	
	@Override 
	public void on() {
		System.out.println("Radio opened");
	}
	
	@Override 
	public void off() {
		System.out.println("Radio closed");
	}
	
}

class CDPlayer implements RemoteControlInterface {
	
	@Override 
	public void on() {
		System.out.println("CDPlayer opened");
	}
	
	@Override 
	public void off() {
		System.out.println("CDPlayer closed");
	}
	
}

class RemoteControl {
	
	private RemoteControlInterface rcf;
	
	public RemoteControl(RemoteControlInterface rcf) {
		this.rcf = rcf;
	}
	
	public void on() {
		rcf.on();
	}
	
	public void off() {
		rcf.off();
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl(new TV());
		
		remote.on();
		remote.off();
		
		remote = new RemoteControl(new Radio());
		
		remote.on();
		remote.off();
		
		remote = new RemoteControl(new CDPlayer());
		
		remote.on();
		remote.off();
		
		
	}

}
