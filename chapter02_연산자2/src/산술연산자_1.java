// % => 배수 ==> 화폐매수 구하기
/*
 * +
 * => 덧셈, 문자열 결합
 *         "" => 문자열
 *         => 웹, 윈도우(네트워크) => 데이터형이 없다(문자열)
 *         
 *  몫나눗셈부호=/
 *  =>나눗셈, 0으로 나눌수 없다, 정수/정수=정수
 * 
 *  %
 *  =>나머지 : 부호(왼쪽부호)
 *    
 *  형변환 : 자동, 강제
 *         ----연산처리 : 연산같은 데이터형만 가능
 *         
 */
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
