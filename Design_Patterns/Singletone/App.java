public class App {
	
	private static App app = null;
	
	private static Object lock = new Object();
	
	private App() {
		
	}
	
	public static App getApp() {
		if(app==null) {
			synchronized(lock) {
				if(app==null) {
					app = new App();
				}
			}
		}
		return app;
	}

}

//////////////////////////////////////////////////////////

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App app1 = App.getApp();
		
		App app2 = App.getApp();
		
		boolean isEqual = app1 == app2;
		
		if(isEqual) {
			System.out.println("App1 and App2 are equal");
		}
		else {
			System.out.println("App1 and App2 are equal");
		}
		
	}

}
