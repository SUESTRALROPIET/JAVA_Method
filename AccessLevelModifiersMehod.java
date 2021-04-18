class Greeting{
	//public, protected, default(생략), private(같은 클래스 안에서 사용할 수 있음)
	private static void hi() {
		System.out.println("Hi");
	}
}
public class AccessLevelModifiersMehod {


	public static void main(String[] args) {
		Greeting.hi();

	}

}
