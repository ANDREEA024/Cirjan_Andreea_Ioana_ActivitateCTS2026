package DP2025.Creationale.Singleton.StaticBlockInitialization;


public class SingletonStaticBlock {
	// declare a static instance
	private static SingletonStaticBlock instance;

	// private constructor to prevent instantiation from other classes
	private SingletonStaticBlock() {
		
	}

	// static block for initialization
	static {
		System.out.println("Aici este static block");
		try {
			instance=new SingletonStaticBlock();
		} catch(Exception e) {
			throw new RuntimeException("Exceptie aparuta la crearea instantei singleton");
		}
	}

	// public method to provide a global access point
	public static SingletonStaticBlock getInstance() {
		return instance;
	}
	

}
