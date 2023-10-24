package com.sist.lib;
import java.util.HashSet;
//Random클래스 실습 : 메소드가 nextInt만 외우면됨
import java.util.Random;
import java.util.Set;
/*
 *    Random => 임의의 수 추출시 사용함
 *              ------JVM에서 해줌
 *              Math.random()에서도 가능하지만 double을 항상 형변환 해야하기 때문에 보완된 Random을 사용함
 *    => int nextInt(int bound)
 *                   --범위지정--
 *                   예)nextInt(100)+1
 *                      100 => 0~99+1
 */
public class MainClass_3 {

	public static void main(String[] args) {
		//A~Z 알파벳을 임의로 10개 출력
		Random r=new Random();
		
		/*
		for(int i=1;i<=10;i++)
		{
			char c=(char)(r.nextInt(26)+65); //0~25 => 65A~90Z
			System.out.print(c+" ");
		}
		*/
		/*
		for(int i=1;i<=6;i++) {
			int lotto=r.nextInt(45)+1; //0~44 => 1~45
			System.out.print(lotto+" ");
		}
		*/
		//예약가능한날 갯수
		int day=r.nextInt(7)+7; //0~6 => 7~13
		
		//[날짜에서 중복까지 없앨때 : set 사용]
		Set set=new HashSet();
		
		//예약가능한 날짜 [if문사용시 중복발생함]
		for(int i=1;i<=day;i++){
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" ");
			set.add(rr);
			/*
			if(rr>=24) {
				System.out.print(rr+" ");
			}
			*/
		}
		System.out.println("=====최종결과=====");
		for(Object obj:set) {
			System.out.print(obj+" ");
		}

	}

}
