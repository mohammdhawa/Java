public interface Burger {
	
	public void prepare();

}

class VeggieBurger implements Burger {
	
	public void prepare() {
		System.out.println("Prepare Veggie Burger");
	}
	
}

class BeefBurger implements Burger {
	
	public void prepare() {
		System.out.println("Prepare Beef Burger");
	}
	
}

////////////////////////////////////////////////////////////////////////

public class BurgerFactory {
	
	public Burger createBurger(String type) {
		if(type == "veggie") {
			return new VeggieBurger();
		}
		else if(type=="beef") {
			return new BeefBurger();
		}
		return null;
	}

}

public class Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BurgerFactory bf = new BurgerFactory();
		
		Burger br1 = bf.createBurger("veggie");
		
		Burger br2 = bf.createBurger("beef");
		
		br1.prepare();
		
		br2.prepare();

	}

}
