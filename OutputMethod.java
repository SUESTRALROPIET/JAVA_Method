
public class OutputMethod {
	
	public static String a() {
		
		return "a";
	}
	
	//메소드 a는 return값이 String 결과값이다.
	
	//메소드의 리턴값 뒤에 있는 값이 메소드의 실행결과 값이 됨. 
	//return은 메소드를 종료하는 역할도 함.
	//메소드는 리턴값이 어떤 데이터타입인지 정해줘야함. 
		//->void는 리턴값이 없는 경우. 
		
	public static int one() {
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
		
	}

}
