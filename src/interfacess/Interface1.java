package interfacess;

public interface Interface1 {

	public static final int A = 10;
    String S="Hello";

	public abstract void m1();

	void m2();

	default void m3() {
		System.out.println("default method");
	}

	public static void m4() {
		System.out.println("static method");

	}

	private static void m5() {
		System.out.println("private method");
	}

}
