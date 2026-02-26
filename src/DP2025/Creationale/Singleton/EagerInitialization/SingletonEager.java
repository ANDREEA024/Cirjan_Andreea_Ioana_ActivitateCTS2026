package DP2025.Creationale.Singleton.EagerInitialization;

public class SingletonEager {
	// declare a static instance
	private static final SingletonEager instance 
	= new SingletonEager();
	//info despre mese

	// private constructor to prevent instantiation
	private SingletonEager() {
		
	}

	// public method to return the single instance
	public static SingletonEager getInstance() {
		//instance = new SingletonEager();
		return instance;
	}

	// alte metode care gestioneaza info centralizat
}
