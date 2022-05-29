public interface Burger {
	
	public void prepare();

}

class BeefBurger implements Burger {
	
	public void prepare() {
		System.out.println("Prepare Beef Burger");
	}
	
}

class VeggieBurger implements Burger {
	
	public void prepare() {
		System.out.println("Prepare Veggie Burger");
	}
	
}

////////////////////////////////////////////////

abstract class BurgerFactory {
	
	public Burger orderBurger() {
		Burger burger = createBurger();
		burger.prepare();
		return burger;
	}
	
	public abstract Burger createBurger();
	
}

class BeefBurgerCreator extends BurgerFactory {
	
	@Override
	public Burger createBurger() {
		return new BeefBurger();
	}
	
}

class VeggieBurgerCreator extends BurgerFactory {
	
	@Override
	public Burger createBurger() {
		return new VeggieBurger();
	}
	
}

/////////////////////////////////////////////////

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BurgerFactory bf = new BeefBurgerCreator();
		
		Burger beef_burger = bf.orderBurger();
		
		BurgerFactory vf = new VeggieBurgerCreator();
		
		Burger veggie_burger = vf.orderBurger();
		
		
	}

}
