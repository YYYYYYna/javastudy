package com.sist.lib;
/*
 *       java.lang => 자바 소스의 기본 => 많이 사용이 되는 패키지
 *                 => import를 생략할 수 있다
 *                 => java.lang에 있는 대부분의 클래스는 final클래스가 많다
 *                                               ----------
 *                                               확장이불가능=변경X,있는그대로사용해야함 ==> 암기하면됨!!!
 *                                               종류) String, StringBuffer, Math, System, Wrapper
 *                                               예외) Object클래스
 *                                                    
 *       Object => 최상위 클래스 : 모든 클래스의 상위 클래스
 *                 (사용저정의,라이브러리 => 모든클래스는 Object로부터 상속을 받는다)
 *                 
 *              종류) **toString() : 객체를 문자열화 / 기본은 메모리 주소 출력(=필요시 오버라이딩:멤버변수값확인할때)
 *                   **clone() : 메모리 주소를 복제 => 새로운 메모리 생성 / 게임의 아바타의 디자인패턴 혹은 알고리즘에 사용됨
 *                   **finalize : 소멸자 (자동호출) => 메모리 해제시 자동호출
 *                   
 *       System : 출력
 *                = ***println : 도스창에서사용됨(에러출력/멤버변수값확인/전송값확인)
 *                = 윈도우/브라우저의 출력시에는 자체출력으로 println을 사용잘 안함 디버깅역할을 할때 많이 사용함
 *              : 메모리해제
 *                = gc() : 가비지컬렉션을 호출해서 메모리를 비워준다. => 멀티미디어/애니메이션 ==> 실시간 도로 cctv
 *              : 프로그램 종료
 *                = exit() : 종료 => 괄호안에 0을 넣으면 정상종료
 *       
 *       Math : 수학 => 모든 메모리가 static
 *             => 메모리 할당을 하지 않는다
 *             => Math.메소드명()
 *             => *** random() => 리턴형(double)
 *             => *** ceil() => 올림 => 총페이지 구하기
 *             
 *       StringBuffer : String을 보완 => 문자열 결합시 최적화
 *                    => ***append()
 *       
 *       String : 문자열 관리하는 클래스
 *       
 *       --------------------------------------------------------------------------------------------------
 *       객체생성시 모든 값을 저장할 수 없음
 *       따라서 모든 값을 저장하기 위해 => 메모리를 모아서 저장 (Heap)
 *       객체에는 Heap에 저장되어 있는 메모리 주소를 가지고 있다.
 *                              -------(=참조변수)
 *                              
 *       오버로딩(다형성)
 *       : 한 클래스에서 만들어 진다
 *       : 같은 메소드명 이용
 *         버스 => 버스(좌석) , 버스(마을) , 버스(고속)
 *       : 매개변수의 갯수나 데이터형이 다른 경우
 *       : 리턴형은 관계없다
 *       : 접근지정어도 관계없다 (예) 생성자, println()
 *       : 중복메소드 정의 --> 오버라이딩(재정의)
 *       
 *       
 *       length가 오라클에서 중요한 이유
 *       오라클은 문자의 개수가 지정되어 있음
 *       한글은 3byte기 때문에 => title VARCHAR2(1000) => 한글은 300자만 사용가능
 *       
 *       
 *       오라클에서 &는 Scanner 역할
 *       오라클에서 ||는 문자열 결합 역할
 *       
 *       크롤링의 목적 => 화면출력을하기위해 => 그리고 기능추가를 통해 프로젝트 완성
 *       --------------------------------------------------------------------------------------------------
 *       String 클래스의 주요 메소드 문제 (다음 설명에 맞는 메소드의 원형을 작성하시오)
 * 
 *       1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
 *                           -------
 *       A. StartsWith
 *          public boolean startsWith(String s)
 *
 *
 *       2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
 *               -----
 *       A. EndsWith
 *          public boolean endsWith(String s)
 *
 *
 *       3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
 *                       --
 *       A. equals(주소 비교시에는 == / 실제 저장된 값을 비교할때는 equals)
 *          public boolean equals(String s)
 *          => 웹 : 로그인,아이디찾기,아이디중복
 *          => equals는 대소문자 비교함!!
 * 
 * 
 *       4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
 *                    ---------- String=char[]을 이용한 클래스임
 *                                      ------0번부터 시작함
 *       A. charAt()
 *          String s="Hello Java";
 *                  ={'H','e','l','l','o'...}
 *          public char charAt(int index)
 * 
 * 
 *       5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
 *                ------------------
 *       A. lastIndexOf()
 *          ***public int lastIndexOf(char c)
 *          public int lastIndexOf(String)
 * 
 * 
 *       6. 문자열의 길이를 반환한다.
 *                ---
 *       A. length
 *          ***public int length()    
 *          => 비밀번호/글쓰기에서 주로 쓰임
 *       
 *       
 *       7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
 *                                  -------------------------
 *       A. replace() : 변경
 *          public String replace(char c)
 *          public String replace(String s)
 *          => 오라클에 값(이미지 주소값에 &와 |를 바꿔서 저장하기 위해)을 저장할때 주로 사용
 * 
 * 
 *       8. 정규표현식을 지정한 문자로 바꿔서 출력한다.
 *                            
 *       A. replaceAll(String regexp, String bbb)
 *                            ------이게 정규식이라는 뜻
 *          => 패턴(문자열의 형태를 알아볼때 사용)
 *          => 맛집인 경우 => 짜다, 싱겁다, 맵다..등등 텍스트를 통해 어떤 음식을 만드는지 통계
 *          => 기호(+,*,^,$,.,|) ==> 자체
 * 
 * 
 *       9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
 *       
 *       A. split()
 *          public String[] split(String regexp) => 정규식 이용
 *          => java.util => StringTokenizer
 * 
 *  
 *       10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
 * 
 *       A. subString()
 *          public String subString(int b)
 *           => b부터 전체반환
 *          public String subString(int b, int e)
 *           => b부터 시작 e-1까지 반환
 *          
 *          ***원본은 변경되지 않는다(값복사:객체생성은아닌)
 * 
 *       11.  문자열에 대문자를 소문자로 변환한다.
 *       
 *       A. toLowerCase()
 * 
 * 
 * 
 *       12. 문자열에 소문자를 대문자로 변환한다.
 *       
 *       A. toUpperCase()
 *       
 *       
 *       13. 문자열을 그대로 반환해준다.
 * 
 * 
 *       14. 문자열에 공백을 제거해 준다.
 * 
 *       A. ***trim()
 *          public String trim() => 좌우에 있는 공백만 제거
 *          
 *           
 *       15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
 *       
 *       A. toString() : Object가 가지고 있는 toString() 오버라이딩
 *          => 문자열 반환 데이터형을 문자형으로 변환
 * 
 * 
 *       16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
 *       
 *       ***검색시 주로 사용
 *       A. contains()
 *          public String contains(String s)
 * 
 * 
 *       17. 지정한 index번째에 문자를 반환한다.
 *       
 *          => public char charAt(int index) => 0
 *          
 * 
 *       18. 문자와 문자를 결합해준다.
 *       
 *       A. concat() : MySQL에서 주로 사용
 *          public String concat(String s) => +역할
 *          String s='A';
 *          String s1='B';
 *          s.concat(s1) => "AB"
 * 
 * 
 *       19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.   
 *       
 *       A. formet()    
 *          String.formet("%d%d%d",10,20,30)
 *          ...static
 *          => printf랑 역할이 비슷함
 *          public static String format(String s, Object...obj)
 *          ...가변매개변수
 *          
 *          
 *      --------------------------------------------------------------------------------------------\
 *      
 *      Object 클래스의 주요 메소드
 *      1. 객체의 복사본을 만들어 리턴한다.
 *      clone()
 *      
 *      2. 현재 객체와 매개 변수로 넘겨 받은 객체가 같은지 확인하다. 같으면 true를 다르면 false를 리턴한다.
 *      equals()
 *      
 *      3. 현재 객체가 더 이상 쓸모가 없어졌을 때 가비지 컬렉터에 의해서 이 메소드가 호출된다.
 *      finalize()
 *      
 *      4. 객체를 문자열로 표현하는 값을 리턴한다. 
 *      toString()
 *             
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
