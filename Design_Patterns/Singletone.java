
public class Counter {
	private int c = 0;
	private static Counter count = null;
	
	private Counter() {
		
	}
	
	public void increase() {
		c++;
	}

	public static Counter getCount() {
		if(count==null)
			count = new Counter();
		return count;
	}
	
	public int getC() {
		return c;
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter obj = Counter.getCount();
		
		obj.increase();
		
		System.out.println(obj.getC());
		
		obj.increase();
		
		obj.increase();
		
		obj.increase();
		
		System.out.println(obj.getC());
		
		Counter obj2 = Counter.getCount();
		
		obj2.increase();
		
		System.out.println(obj.getC());
		
		
		
	}

}
