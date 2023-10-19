package com.sist.exception;
/*
 *     8장 => 예외처리에 대하여...
 *           ------
 *           사전에 에러를 방지하는 목적
 *           비정상 종료를 방지하고 정상상태를 유지하는 목적
 *           예외처리 => 에러발생시 에러를 건너뛴다
 *           
 *     에러발생의 원인
 *     ----------
 *     => 사용자 = 잘못된입력 
 *     => 개발자 = 실수 :배열 인덱스, 정수변환, 형변환...
 *     ------------------따라서 에러를 막기위해선
 *                       1) 사전에 차단 (if) => 예외처리 : 사용자가 잘못입력한 경우를 대비함
 *                                        => 유효성 검색 (주로 JavaScript로 실행함)
 *                                        
 *                       2) 예외처리를 못하는경우 : 에러가났을때
 *                          = 에러(Error) : 소스상에서 수정이 불가능
 *                                        예) 변수를 너무 많이 설정해서 메모리가 부족한 상태는 오류
 *                                            정상작동실행상태로 돌아갈 수 없는 경우
 *                                           
 *                          = 예외(Exception) : 소스상에서 수정이 가능
 *                                            예)파일 경로명이 틀렸을때/0을 잘못 기입햇거나
 *                                               배열의 인덱스번호가 틀렸다거나.. 고치면 되는경우 
 *    
 *    예외처리 방법)
 *       1) 예외복구 : try-catch
 *       2) 예외회피 : throws
 *       3) 임의발생(견고성테스트) : throws
 *       4) 지원하지 않는 예외 : 사용자 정의 예외 처리
 *       
 *    예외의 종류(상속도)
 *       **Object : 모든클래스의 상위클래스
 *         |
 *      Throwable : 에러의 최상위 클래스(2번째로큰클래스임)
 *         |
 *    --------------------
 *    |                  |
 *    Error              Exception ==========================> 위의 1~4 예외처리 방법중 선택해서 해결하면됨
 *    : 처리가 불가능        : 처리가 가능(우리가 소스변경시 처리가능!)
 *    = 메모리 부족          = 0으로 나누는 경우
 *    = 윈도우 충돌          = 배열의 인덱스 범위를 벗어난경우(번호틀린경우)
 *    = 톰캣이 작동이 안됨     = 형변환, 파일명, IP주소...틀렸을때
 *    = 오라클에 연결이 안됨   : 예외처리의 최상위 클래스 => 무슨에러인지 잘 모르겟으면 이거쓰면됨
 *                            |
 *                            |
 *                            |
 *                            |
 *    -----------------------------------------
 *    |                                       |
 *    CheckException                          UnCheckException
 *    : 컴파일시에 예외처리를 했는지 확인해야함           : 확인이 없기 때문에 필요시 확인하면됨
 *    = 예외처리를 해야하는 라이브러리 기억하기           ♠ RuntimeException : 예외를 확인할수가 없음
 *      java.io => 파일명 틀리면 문제발생                               : 실행시 에러확인이 가능한거임 예를들어 1~10중에
 *              ♠ FileNotFoundException                             하나 입력하라 했을때 그외 숫자를 입력해야 발생하는 오류의 종류임
 *              ♠ IOException
 *      java.net => URL,IP주소 틀리면 문제발생      ♠ NumberFormatException : 문자열로 받아서 정수로 변경시 웹에서 가장 많이 발생하는 오류
 *               ♠ MalformedURLException                              : http://localhost/main/main.jsp?page=10
 *      java.sql => 오라클,URL주소 틀리면 문제발생                              => 웹에서는 데이터 전송할때 URL로 전송함
 *               => 오라클 URL : SQLException                                자바는 메소드의 매개변수를 이용해서 전송
 *                  특히 오라클의 경우 연결포트번호!   => 실수중에가장큰일 : 33대란(3월3일모든은행권이모두멈춤..보안업체신입사원1명이실수해서..)
 *                  연결시마다 번호가 증가함으로                       String s="100,00" 이 문자열 하나로 10만원입금시 100만원으로 인식됨..
 *                  계속 확인해줘야함....
 *                  그래서 선생님의 오라클주소와      ♠ ArrayIndexOfOutBoundsException : 배열이 인덱스 범위를 벗어나는 경우
 *                  몇번실패한..나의 오라클주소가
 *                  다를수가 있음....            ♠ NullPointerException : null인 클래스를 사용한 경우
 *      ♠ ClassNotFoundException                                      ----주소가 없는 경우
 *    = 충돌의 위험이 있기 때문에 스레드는 예외처리 해줘야함                       : new로 주소배정이 안되었는데 가져다 쓴경우도 포함임
 *      ♠ ~~필기놓침~~                          
 *                                           ♠ ArithmeticExeption : 0으로 나눈 경우
 *                                           
 *                                           ♠ ClassCastException : 형변환오류
 *     
 *      ======> 당연한 이야기지만 에러 예상을 하는 능력을 키워야함
 *      
 *      예) 에러 예상 : 
 *         문자열로 정수를 받아서 배열에 저장한 다음 나누기를 한다
 *         ---------       --------      ----  예측되는 에러는 3개
 *         NumberFormatException  |      ArithmeticExeption
 *                         ArrayIndexOfOutBoundsException
 *         따라서 사전에 에러를 방지하는 것 => 예측
 *                       
 */
//형변환 오류 예제
class A{
	public void aaa() {
		System.out.println("A:aaa()");
	}
}
class B extends A{
	public void aaa() {
		System.out.println("B:aaa()");
	}
}
public class MainClass_1 {

	public static void main(String[] args) {
		
		/*
		A a=new A();
		B b=(B)a; //형변환
		
		b.aaa(); //오류남.....왜냐면 생성자A()에서 오버라이징값을 가져와야한다는 말이안되는상황이 벌어져서
		*/
		
		//System.out.println(Interger.parseInt(" 10")); //띄어쓰기 때문에 NumberFormatException 오류남
		//System.out.println(Interger.parseInt("10"));
		
		

	}

}
