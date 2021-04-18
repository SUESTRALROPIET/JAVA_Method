
public class WhyMehod2 {

	public static void main(String[] args) {

		printTwoTimes1("a");
		printTwoTimes1("a");
		printTwoTimes1("b");
		
		System.out.println("============");
		
		printTwoTimes2("a", "*");
		printTwoTimes2("a", "&");
		printTwoTimes2("b", "-");
		
	}

	public static void printTwoTimes1(String text) {
		System.out.println("-");
		System.out.println(text);
		System.out.println(text);
	}
	public static void printTwoTimes2(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}
	
	//text, delimeter : 매개변수(parameter), 메소드 밖에서 주입한 값을 메소드 안으로 흘려보내주는 매개자다. 
	//printTwoTies1("__?__") : 함수안에 입력한 값 : 인자(argument)

}
