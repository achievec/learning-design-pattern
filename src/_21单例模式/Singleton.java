package _21单例模式;

public class Singleton {
	private Singleton() {
	}

	/*
	 * 在加载Singleton类时不会加载内部类对象，只有在getInstance()执行的时候才会去加载该静态内部类
	 */
	private static class Holder {
		private static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		System.out.println(a == b);

	}
}

/*
 * 带双重检查的单例模式
 */
class DoubleCheckSingleton {
	private static DoubleCheckSingleton INSTANCE;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
