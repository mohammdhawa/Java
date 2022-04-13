public class Math {
	
	int val;
	
	public Math() {
		
	}
	
	public Math(int val) {
		this.val = val;
	}
	
	static Math add(Math n1, Math n2) {
		Math n3 = new Math();
		n3.val = n1.val + n2.val;
		
		return n3;
	}
	
	Math Add(Math m) {
		Math n = new Math();
		n.val = this.val + m.val;
		return n;
	}

}


public class CallByReference {
	
	int number;
	

}

class Swap_ {
	
	int x;
	int y;
}

class Test {
	
	static void fun(CallByReference n) {
		n.number++;
	}
	
	static void swap(Swap_ x) {
		int temp = x.x;
		x.x = x.y;
		x.y = temp;
	}
	
	public static void main(String[] args) {
		
		Swap_ obj = new Swap_();
		
		obj.x = 5;
		obj.y = 7;
		
		swap(obj);
		
		System.out.println("x => " + obj.x);
		System.out.println("y => " + obj.y);
		
		System.out.println("\n----------------------------------");
		
		Math n1 = new Math(2);
		Math n2 = new Math(5);
		Math n3 = Math.add(n1, n2);
		
		System.out.println("n3 = " + n3.val);
		
		Math m1 = new Math(7);
		Math m2 = new Math(9);
		Math m3 = m1.Add(m2);
		
		System.out.println("m3 = " + m3.val);
	}

}

// In java there is no call by reference so to solve 
// this we will wrap the primitive data type in an
// object


