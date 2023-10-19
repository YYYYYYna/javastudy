package com.sist.exception;
/*
 *      270pg 
 *      
 *      다중catch => 에러마다 따로 처리할때 사용
 *      
 *      [다중catch를 사용할때 주의점] : 계층구조가 존재함으로 클수록 아래catch절에 가야함
 *      예1)
 *      try{
 *      
 *      }catch(Exception e)
 *      {
 *        
 *      }catch(NumberFormatException e)
 *      {
 *         
 *      }catch(ArithmeticExeption e)
 *      {
 *         
 *      }
 *      =====> "전체코드가 에러가 나는 코드"
 *             맨처음에 Exception에서 에러가 전부 처리가 되기 때문에
 *             뒤에 나오는 하위에러잡는클래스들이 필요가 없기 때문
 *      
 *      예2)
 *      try{
 *      
 *      }catch(ArithmeticExeption e)
 *      {
 *        
 *      }catch(NumberFormatException e)
 *      {
 *         
 *      }catch(Exception e)
 *      {
 *         
 *      }
 *      =====> 현재는 가장 큰 클래스(Exception)이 가장 마지막에
 *             나왔음으로 문제없이 처리됨
 */

// 문자열을 입력받기 ==> 정수변환 ==> 배열에 첨부하기 ==> 배열에 있는값 나누기
// -----사용자오류예측됨-------   --인덱스번호오류--    --0으로나누는오류--
//   => 따라서 3개의 catch절이 필요함

import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		
		//0.웹상에서는 입력시 input테그를 사용함으로 무조건 String값으로 받아오게됨
		//  따라서 숫자를 적어도 int가 아니라 무조건 String으로 인식됨
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		String s1=scan.next();//그래서 웹이랑 동일한 가정하에 String으로 받은거임
		
		System.out.println("정수를 입력 : ");
		String s2=scan.next();
		
		//1. 정수변환
		try {
			int[] arr=new int[2]; //2개입력받은값배열로저장
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
			
		}
		
		//해당 SQLException catch문이 오류인 이유 => try소스에 SQL관련내용이 없어서 에러 검출할사항이 없기때문
		//catch(SQLException ex)
		//{
			//이 부분 catch는 오류납니다~~~
		//}
		
		catch(NumberFormatException ex)//정수변환오류
		{
			System.out.println("정수변환을 할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException ex)//배열범위오류
		{
			System.out.println("배열의 범위를 벗어났습니다.");
		}catch(ArithmeticException ex)//0으로나누기오류
		{
			System.out.println("0으로 나눌수 없습니다.");
		}
		
		//RuntimeException : Exception위에 RuntimeException의 하위클래스 아래!
		catch(RuntimeException ex)// 위치를 헷갈리면 안됨~~
		{
			System.out.println("실행시 에러...");
		}catch(Exception ex)//그외 기타오류발생시
		{
			System.out.println("그외 기타 오류발생 입니다.");
		}
		//Throwable
		catch(Throwable ex)
		{
			
		}
		System.out.println("프로그램 종료 (=정상종료)");//만약에 오류가 발생해도 해당 문장이 출력되는 이유는
		                                         //try-catch로 오류를 건너뛰어서 정상종료되도록 했으니까
		
		//////따라서 try-다중catch절의 원리는 if-else if문 구도와 같다
		//////try문에서 오류 발생시 catch절을 순서대로 내려오며 해당 에러클래스를 찾음
		
		
		

	}

}
