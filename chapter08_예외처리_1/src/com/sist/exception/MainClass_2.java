package com.sist.exception;
/*
 *    ***예외처리를 하기 위해...무슨 에러인지 확인하는 습관을 들여야한다
 *    
 *    예외처리의 기본 (267page)
 *    
 *    가장 많이 사용됨 => 예외복구 : try~catch~finally
 *                            형식1) try
 *                                  {
 *                                     [에러없이 실행이 가능한 소스]
 *                                      //main에서 작성된 정상수행하는 문장 
 *                                      ==> 그러나 개발자 실수 혹은 사용자의 입력이 잘못될수 있음
 *                                  }catch(Exception e)
 *                                  {
 *                                     [예외를 복구해주는 부분]
 *                                      //다시 입력을 요청하던가? 다음문장으로 이동하던가 복구수행과정을 적어놓음
 *                                      ==> catch는 예상되는 예외를 따라 처리하기 때문에? => 여러개 사용이 가능
 *                                  }
 *                                  
 *                            동작흐름2)
 *                            
 *                                  
 */
/*     [try-catch 문장 수행 구조]
 *     
 *     /////[경우1]
 *     문장1
 *     문장2
 *     try
 *     {
 *        문장3
 *        문장4 => 에러발생문장
 *        문장5
 *     }catch(Exception e)
 *     {
 *        문장6 => 복구위치
 *     }
 *     문장7
 *     문장8
 *     
 *     문장수행순서 : 1 2 3 (catch로이동) 6 7 8 종료 (정상종료)
 *                       ---------        ---
 *                       에러문장부터수행안함    만약 복구해야한다면? 4,5가 아닌 6(catch)부분에 문장3부터 다시수행하라고 해야함
 *                       
 *     /////[경우2]
 *     문장1
 *     문장2 => 에러발생문장
 *     try
 *     {
 *        문장3
 *        문장4 
 *        문장5
 *     }catch(Exception e)
 *     {
 *        문장6
 *     }
 *     문장7
 *     문장8
 *     
 *     문장수행순서 : 1 종료 (비정상종료)
 *     
 *     /////따라서 에러 발생 구간을 예측하여 어느문장에서 try-catch를 써야할지 생각해야함
 *     
 *     
 *     [try-catch 문장의 실행원리]
 *          : 에러가 안나면 try만 쓰면됨 왜냐면 에러가없을경우 catch절은 수행되지 않기때문
 *     
 *     try ==> 정상으로 수행하는 부분
 *             =>개발자의 실수, 사용자의 잘못된 입력값 : 에러발생
 *                                            =======> 프로그램 비정상 종료
 *                                            
 *                                          : 종료 방지를 위해 에러문장을 건너 뛰어서 ==> catch 수행
 *     
 *     *** 수행문장에 이상이 없는 경우 (=에러가 없을때)
 *         try{소스문장}만 수행함
 *         
 *     *** 수행문장중에 이상이 있는 경우 (=에러가 있는 경우)
 *                  --------부분을 무시 => catch 문장 수행
 */
public class MainClass_2 {

	public static void main(String[] args) {
		
		
		System.out.println("문장1");
		System.out.println("문장2");
		
		//에러가 발생할거 같은 부분부터 try를 써야함
		try {
			System.out.println("문장3");
			System.out.println("문장4");
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8=정상종료");
		//해당결과로는 6(catch문)만빼고 나옴
		 
		
		
		//맨 마지막 문장이 수행되어야 : 정상종료
		//그 중간에 문장 수행이 멈추면 : 비정상종료
		
		//근데? 예외처리의 목적은 비정상종료를 막는것 = 에러문장만 건너뛰면? 정상종료가능
		//따라서 예외처리의 궤는 정상종료를 향한 오류해결과 다름을 알아야함
		
		//에러문장이 발생하면 뒤의 문장은 아예 실행이 안됨
		//같은 원리로 HTML위에 링크된 Java가 오류나면...HTML실행안됨...
		
		
		/*
		System.out.println("문장1");
		System.out.println("문장2");
		
		//에러가 발생할거 같은 부분부터 try를 써야함
		try {
			System.out.println("문장3");
			System.out.println(10/0);
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8=정상종료");
		//해당결과로는 4.5만빼고 나옴 : 4에서 오류가 나서 catch문으로 이동
		 */
		
		/*
		System.out.println("문장1");
		System.out.println(10/0); //에러문이 try 밖에있음
		try {
			System.out.println("문장3");
			System.out.println("문장4");
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8=정상종료");
		//해당결과로는 1만 수행하고 비정상종료됨
		 */

	}

}
