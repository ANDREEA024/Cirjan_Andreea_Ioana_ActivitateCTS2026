package DP2025.Creationale.Singleton.InnerStaticHelper;

public class SingletonInnerStaticHelper {
	// private constructor
	private SingletonInnerStaticHelper() {
	}

	// inner static class that contains the single instance
	private static class SingletonHelper {
		private static final SingletonInnerStaticHelper instance =
				new SingletonInnerStaticHelper();
	}

	// public method to return the single instance
	public static SingletonInnerStaticHelper getInstance() {
		return SingletonHelper.instance;
	}
}
