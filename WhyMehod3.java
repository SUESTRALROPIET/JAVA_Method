import java.io.FileWriter;
import java.io.IOException;

public class WhyMehod3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println(twoTimes("a","-"));
		
		//파일에 저장
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","*"));
		fw.close();
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		//out이라고 하는 text를 만들어 줌. 
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	//메소드는 입력값이 있고, 처리해서 출력해준다. 그리고 출력할때 쓰는 핵심 키워드는 return이고, 어떤 데이터타입을 리턴할 것인지 직접 적어줘야한다. :)
	
}