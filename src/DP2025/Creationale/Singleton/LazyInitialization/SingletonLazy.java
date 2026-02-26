package DP2025.Creationale.Singleton.LazyInitialization;

public class SingletonLazy {
	// declare a static instance
	private static SingletonLazy instance;
	//mese

	// private constructor to prevent instantiation from other classes
	private SingletonLazy() {
		
	}

	// public method to return an existing or a new instance
	public static SingletonLazy getInstance() {
		if(instance == null)
			instance = new SingletonLazy();
		return instance;
	}
	
	//metode de prelucrare mese
}
