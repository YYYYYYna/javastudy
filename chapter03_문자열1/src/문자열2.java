/*
 *    문자열
 *    ----- String 기능이 많다
 *    1. 문자의 갯수 확인 (ex. 비밀번호확인, SNS글자수제한) : length()
 *    
 *    2. 검색
 *       ---
 *       startWith : 시작하는 문자열이 같은 경우
 *       endWith : 끝나는 문자열이 동일 (ex. cookie)
 *     **contains : 포함된 문자가 있는지
 *       -------- 추천프로그램에서 많이쓰임
 *     **equals : 같은 값 ==> (ex. ID,PW)
 *       ------ 대소문자구분함
 *       
 *    3. 문자열 제어
 *       = 변경 : replace(), replaceAll()
 *               replace('a','b')
 *               replaceAll("[가-힣]","") => 한글을 바꿀때
 *               replaceAll("[0-9A-Za-z]","") => 숫자와 영문을 바꿀때
 *               
 *       = 문자 자르기 : substring() => 해당번째수 "부터" 문자를 잘라옴
 *                     substring(4,7) => 4번부터 6번까지 문자를 가져옴
 *                     substring(n,m) => n번부터 m-1번까지 문자를 가져옴
 *                     
 *       = 대문자 : toUpperCase
 *       = 소문자 : toLowerCase
 *       
 *    4. 모든 데이터형을 문자열로 변경
 *       = valueOf(1) => "1" ==> 윈도우, 웹에서 주로쓰임
 *    5. 분리 : split() => Spring[]
 *       charAt(index)
 *       "Hello java" => charAt(0) => 'H'
 *       ** index번호가 자바는 무조건 0부터 시작 (오라클 1번)
 *    
 *    String => 일반형 => 
 *    --------------- Call By Value / Call By Reference
 *                    => String       => 배열/클래스
 *                      :변경이안됨
 *                      
 *    형식1) String s=""; => 일반형
 *    형식2) String s=new String("") => 메모리할당형
 *       
 */
public class 문자열2 {

	public static void main(String[] args) {
		String s="Hello Java!!"; //=>12자로 처리됨(공백도계산함)
		System.out.println(s.length()); //문자 갯수 계산 => 공백포함
		if(s.startsWith("hello"))
	     //s.의 뜻은 "s의 String이 가지고 있는~" 이라는뜻
		 //startsWith("hello")의 뜻은 "hello"로 시작하는지 물어보는기능
		{
			System.out.println("포함됨");
		}

	}

}
