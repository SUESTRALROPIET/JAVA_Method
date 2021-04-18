
public class AccountingApp {
	//공급가액
	public static double valueOfSupply = 10000.0;
	//부가가치세
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {
		

		//부가
		//double vat = valueOfSupply * vatRate;
		//->double vat = getVAT(); --> 메소드 getVAT가 필요.
		//double vat = getVAT(); --> 굳이 변수를 정의하지않아도 됨, 메소드에 이름을 붙여서 
		
		//합계(공급가액 + 부가세) 
		//double total = valueOfSupply + getVAT();
		//double total = getTotal(); --> 굳이 변수를 정의하지않아도 됨, 메소드에 이름을 붙여서 
		
		System.out.println("Value of Supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
				
	}

}
