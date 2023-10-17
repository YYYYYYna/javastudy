package com.sist.main;
/*
 *       패키지는 관련된 클래스를 모아서 관리
 *       다른 패키지의 경우 => import를 이용해서 클래스를 불러서 사용
 *       
 *       import 패키지명.클래스명; ==> 해당클래스만불러옴
 *       import 패키지명.*;  ==> 모든클래스불러옴
 *       import static 패키지명.클래스명; ==> static으로 불러올수도 있음
 *       import static 패키지명.클래스명.메소드명; ==> static은 메소드까지 지정할수도 있음
 *       
 *       => 패키지는 사용자 정의도 import를 이용해야함
 *       
 *       
 */
import static java.lang.Math.random;
//Math(static) , String(ValueOf()) , 
import static java.lang.System.out;
import static java.lang.String.valueOf;
public class MainClass {

	public static void main(String[] args) {
		int a=(int)(random()*100+1);
		out.println(valueOf(a));
		//위에서 import를 함으로써 system을 줄일수가 있음
		
		
		
		

	}

}
