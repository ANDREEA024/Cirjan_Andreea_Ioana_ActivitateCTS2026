package DP.Creationale.Singleton.ThreadSafe;


public class SingletonThreadSafe {
	// declare a static instance
	private static SingletonThreadSafe instance;

	// private constructor
	private SingletonThreadSafe() {
		
	}

	// public method to return an existing or a new instance
	public static synchronized SingletonThreadSafe getInstance() {
		if(instance==null)
			instance = new SingletonThreadSafe();
		return instance;
	}
}
