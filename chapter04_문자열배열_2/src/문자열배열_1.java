/*
 *    문자열 저장은 => String => ""
 *    한개 저장
 *      String 변수명=""
 *    여러개 저장
 *      String[] 배열명={"","",""}
 *      String[] 배열명=new String[5]
 *      
 *    String은 클래스=>메소드(기능)
 *                  --------
 *                  1. 메소드명 : 기능
 *                  2. 결과값 확인
 *                  3. () => 매개변수
 *    => length()
 *       => 원형 : int length() => 문자갯수
 *               ----이부분이중요:어떤결과값이 나오는지 ==> "리턴형"
 *               String s="Hello";
 *               s.length() => Hello의 문자 갯수가 얼마인가?
 *               ----------
 *               int len=s.length(); ->이렇게 int로 받아야함
 *               
 *    => toUpperCase()
 *       => 원형 : String toUpperCase() => 대문자변환
 *               -------이부분이중요:어떤결과값이 나오는지
 *               String s="Hello";
 *               s.toUpperCase() => 대문자로 바꿔야함
 *               ---------------
 *               String ss=s.toUpperCase(); ->String으로 받아야함!
 *               
 *    => toLowerCase()
 *       => 원형 : String toLowerCase() => 소문자변환
 *               -------이부분이중요:어떤결과값이 나오는지
 *    => substring() : 문자를 자른다
 *       => 원형 : String substring(int begin, int end)
 *                String substring(int begin)
 *                -----=리턴형      ---=매개변수
 *                     =요청처리결과     =사용자요청
 *                예) 로그인
 *                   ----요청 : ID/PW => 결과값 : boolean
 *                   boolean isLogin(String ID, String PW)
 *                => String ss=s.substring(1);
 *    
 *    => startsWith() : 시작문자열이 같은지 확인
 *       => 원형 : boolean startsWith(String msg)
 *               => if문에서 주로 처리
 *               String s="Hello Java"
 *               if(s.startsWith("H"))
 *               => 서제스트(자동완성기) 에 주로쓰임
 *               -> 오라클의 경우 : LIKE 'A%'
 *               
 *    => endsWith() : 끝나는 문자열이 같은지 확인
 *       => 원형 : boolean endsWith(String msg)
 *               => 확장자(jpg,png,gif)에 주로쓰임 (=갤러리게시판)
 *               -> 오라클의 경우 : LIKE '%A'
 *    
 *    => contains() : 문자열 포함 여부 확인
 *       => 원형 : boolean constains(String msg)
 *              => 검색에 가장 많이 쓰임
 *              -> 오라클의 경우 : LIKE '%A%'
 *              
 *    => trim() : 좌우 공백 제거
 *       => 원형 : String trim()
 *              => 로그인 검색, 검색어 입력, 회원가입 에 주로쓰임
 *              => 유효성 검사 에 주로쓰임
 *    
 *    => equals() : 같은 문자여부를 확인할때 (대소문자를 구분)
 *       => 원형 : boolean equals(String msg)
 *              => 로그인 (아이디, 비밀번호)에 주로쓰임
 *              
 *    => replace() : 문자,문자열 변경
 *              -> 오라클에선 ||(문자열결합역할), &(입력값받는역할) 자바와 역할이 달라서 쓰면 안됨... 
 *                 이미지를 저장하는게 아닌 URL을 사용해서 적용하기 때문에 위의 사항 기억하기...
 *              => 데이터베이스에서 주로 쓰임
 *       => 원형 : String replace(char c, char c1)
 *                              -------  -------
 *                              before    After
 *                String replace(String s, String s1)
 *                               --------  ----------
 *                                before     After
 *                                
 *    => valueOf() : 모든 데이터형을 문자열로 변환
 *       => 원형 : String valueOf(int a) => boolean b
 *       => 클래스.메소드의 형식 = static : 자동 메모리 할당이 됨
 *          String.valueOf() : 다른 메소드와 다르게 변수.메소드의 형태를 띄지않음
 *    
 *    => toString() : 생략이 가능 => 객체의 주소값 출력(원시값반환)
 *       문자열_1 a=new 문자열_1();//=클래스저장
		 System.out.println(a);//toString이 생략되도 아래와 같은 결과가 나옴
		 System.out.println(a.toStirng);
		 
      => indexOf() : 지정된 문자위치값 확인 (문자index 0번부터)
         => 원형 : int indexOf(char)
                  int indexOf(String s)
      
      => lastIndexOf() : 지정된 문자위치값 확인 (문자index length()-1번부터)
         => 원형 : int lastIndexOf(char)
                  int lastIndexOf(String s)
          
 *    => concat() : 문자열결합(+) 주로 오라클에서 쓰임
 *       => 원형 : String concat(String s)
 *       
 *    => split() : 특정 문자를 중심으로 잘라서 배열에 저장
 *    
 *    
 *    
 *              
 *              
 *                  
 *    
 *                
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		문자열_1 a=new 문자열_1();//=클래스저장
		System.out.println(a);//toString이 생략되도 아래와 같은 결과가 나옴
		System.out.println(a.toStirng);

	}

}
