
// 형변환연산자
/*
 *    ()값
 *    
 *    ==>크기
 *    byte < char < int < long < float < double
 */
public class 단항연산자_2 {

	public static void main(String[] args) {
		int a=65;
		double d=(double)a;
		// 생략이 가능
		char c=(char)a;
		// 특수한 경우 => 생략이 가능
		// 연산처리가 되면 생략할 수 없다.
		int i=10;
		int j=55;
	  //char c1=i; //오류남 i가 변수이기 때문에
		System.out.println("a="+a); //a=65
		System.out.println("d="+d); //d=65.0
		System.out.println("c="+c); //c=A
		
		//A=65 '0'=48
		
		c=10000;
		System.out.println("c="+c); //c=✐
		
		c=20000;
		System.out.println("c="+c); //c=丠
		
		c=30000;
		System.out.println("c="+c); //c=田
		
		c='0';
		System.out.println("c="+(int)c); //c=48

	}

}
