/*
 *    문자열
 *    ----- String 기능이 많다
 *    1. 문자의 갯수 확인 (ex. 비밀번호확인, SNS글자수제한) : length()
 *    2. 
 */
public class 문자열2 {

	public static void main(String[] args) {
		String s="Hello Java!!"; //=>12자로 처리됨(공백도계산함)
		System.out.println(s.length()); //문자 갯수 계산 => 공백포함
		if(s.startsWith("hello"))
	     //s.의 뜻은 "s의 String이 가지고 있는~" 이라는뜻
		 //startsWith("hello")의 뜻은 "hello"로 시작하는지 물어보는기능
		{
			
		}

	}

}
