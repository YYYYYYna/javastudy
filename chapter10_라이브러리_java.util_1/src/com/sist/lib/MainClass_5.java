package com.sist.lib;
/*
 *     StringTokenizer
 *     
 */
import java.util.*;
public class MainClass_5 {
	
	// StringTokenizer 실습
	public static void main(String[] args) {
		
		//경우1
		/*
		String data="red|green|blue";
		
		// |로 나눠봄
		 StringTokenizer st=new StringTokenizer(data,"|");
		 System.out.println("컬러의 갯수:"+st.countTokens());
		 
		// 잘라진 갯수만큼 만들어야함
		 String color1=st.nextToken();
		 String color2=st.nextToken();
		 String color3=st.nextToken();
		 //st.nextToken()의 갯수가 배열범위를 초과하면 오류남(이하는 가능)
		 
		 System.out.println(color1);
		 System.out.println(color2);
		 System.out.println(color3);
		 */
		 
		//경우2
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		
		StringTokenizer st2=new StringTokenizer(data,"|");
		
		//for(int i=1;i<=9;i++) 인줄 알앗는데 아니네용
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		/*
		 *     hasMoreTokens
		 *     1) cursor 위치
		 *     -----------------
		 *       -> before First
		 *     -----------------
		 *       red => st.nextToken() ==> true일경우 값을 가져옴
		 *     -----------------
		 *       blue => st.nextToken() ==> true일경우 값을 가져옴
		 *     -----------------
		 *       green => st.nextToken() ==> true일경우 값을 가져옴
		 *     -----------------
		 *       -> after Last ==> st.nextToken() ==> false일경우 값가져오는걸 멈춤 ===> 그래서 while의 반복문에 쓰이는듯 true일 경우에 반복이니까
		 *     -----------------
		 */

	}

}
