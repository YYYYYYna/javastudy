// % => 배수 ==> 화폐매수 구하기
public class 산술연산자_1 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(a%b));
		System.out.println(a+"%"+-b+"="+(a%b));
		System.out.println(-a+"%"+-b+"="+(a%b));
		
		System.out.println("===========");
		
		int c=369;
		//백단위 : 3, 십단위 : 6, 단단위 : 9
		int 백단위=c/100;
		System.out.println("백단위:"+백단위);
		int 십단위=(c%100)/10;
		System.out.println("십단위:"+십단위);
		int 단단위=c%10;
		System.out.println("단단위:"+단단위);
		System.out.println(c);
		System.out.println("백단위:"+백단위+",십단위:"+십단위+",단단위:"+단단위);
		
	}

}
