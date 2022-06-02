public class Counter {
	
	private int c = 0;
	
	private static Counter count = null;
	
	private static Object lock = new Object();
	
	private Counter() {
		
	}
	
	public static Counter getCount() {
		if(count==null) {
			synchronized(lock){
				if(count==null) {
					count = new Counter();
				}
			}
		}
		return count;
	}
	
	public void increase() {
		c++;
	}
	
	public int getC() {
		return c;
	}
}

//////////////////////////////////////////////////////////////////////

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
		
		System.out.println(obj2.getC());
		
		obj2.increase();
		
		
		System.out.println(obj2.getC());
		
		
		System.out.println(obj.getC());
		
	}

}
