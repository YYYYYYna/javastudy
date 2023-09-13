// <<=  , >>= 쉬프트연산자 (비트이동연산자)
/*
 *    << : 비트를 왼쪽으로 이동
 *    >> : 비트를 오른쪽으로 이동
 *    
 *    int a=27;
 *    a=a<<3  ===>  a<<=3  //왼쪽으로 3칸이동하면 0을채움
 *    -------------------  //반대로 오른쪽으로 3칸이동하면 3칸을 자름
 *    16+8+2+1
 *    11011
 *    11011(0)(0)(0) ===> 11011000 ===> 216
 */
public class 복합대입연산자_3 {

	public static void main(String[] args) {
		 int a=27;
		 a<<=3;
		 System.out.println("a="+a);
		 
		 a=27;
		 a>>=3;
	     System.out.println("a="+a);
	     
	     int b=33;
		 b<<=2;
		 System.out.println("b="+b);
		 b=33;
		 b>>=2;
		 System.out.println("b="+b);
		 
	}

}
