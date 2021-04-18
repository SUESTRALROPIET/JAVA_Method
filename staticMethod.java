class Print{
	//t1이라는 인스턴스에 delimiter라는 변수의 값을 지정하려면! 
	public String delimiter;
	//a라고 하는 메소드는 지금 t1이라는 인스턴스의 소속으로서 실행되고 있음.
	//but, Print.a("-");은 class인 Print의 소속으로서 실행됨. 
	//메소드가 인스턴스의 소속일때는 static을 빼줘야함. 
	//메소드가 클래스의 소속일때는 static이 있어야함. 
	public void a() {
							//t1인스턴스의 변수의 값으로 지정한 값이됨!  
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class staticMethod {
	
	public static void main(String[] args) {
		//Print.a("-");
		//Print.b("-");
		
		//Print라는 클래스의 인스턴스인 t1
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		Print.c("$");
				
		//Print.a("*");
		//Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}
}
