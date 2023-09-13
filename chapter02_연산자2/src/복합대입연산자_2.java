// *= , /=
/*
 *   int a=10;
 *   a*=20; => a=a*20 => a=10*20=200 => a=200
 *   
 *   int a=10;
 *   a/=3; => a=a/3 => a=10/3=3 => a=3
 *   
 *   상수는 연산처리 혹은 값변경이 안됨
 *   변수와 상수를 헷갈리지 않기위해 상수는 대문자로 처리함
 */
public class 복합대입연산자_2 {

	public static void main(String[] args) {
		 int a=10;
		 a*=20;
		 System.out.println("a="+a);
		 
		 //변화된 초기값으로 연산
		 a/=3;
		 System.out.println("a="+a);
		
		 //초기값변화
		 a=10;
		 a/=3;
		 System.out.println("a="+a);
		 
		 //상수(ex.final)는 연산처리 혹은 값변경이 안됨
		 final int A=10; //변수와 상수를 헷갈리지 않기위해 상수는 대문자로 처리함
		 int b=A*20;
		 System.out.println("b="+A);

	}

}
