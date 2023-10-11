/*
 *      => 자바 기본 문법 
 *         ----------
 *         데이터형 (메모리크기)
 *         = 기본형
 *         = 참조형 => 클래스 / 배열
 *         
 *         [클래스]
 *         1) 데이터만 모아서 관리 => 변수
 *            --------------
 *            => 초기화가 필요
 *               ---- ① 명시적초기화
 *                    ② 초기화 블록
 *                    ③ 생성자 =====> 가장많이 사용
 *                    
 *         2) 메소드만 모아서 관리 => 
 *         
 *         [클래스의 구성요소]
 *         class ClassName
 *         {
 *            --------------
 *             데이터 저장 공간 : 멤버변수 => 프로그램 종료시까지 유지
 *                                  => 다른 클래스에서도 사용이 가능
 *             인스턴스 변수 => new를 이용해서 메모리에 저장 / 실행마다 메모리공간 따로 생성
 *                : 데이터명 변수명;
 *             공유변수 => 컴파일러에 의해 자동생성 / 메모리공간 한개만 사용
 *                : static 데이터형 변수명;
 *            --------------
 *             생성자 : 변수에 대한 초기화 
 *                  *** 클래스 영역에서는 선언만 가능
 *                  : 특징
 *                    - 클래스명과 동일
 *                    - 리턴형 없다 (**void는 리턴형이라서 생성자불가능 일반변수취급함!)
 *                    - 여러개 사용 할 수 있다 (=같은이름으로 여러개 사용) 
 *                      => 오버로딩 : 중복함수정의 (*면접에자주나오니주의)
 *                               : new, add라는 단어가 답으로 나와야함
 *                               : 메소드명이 동일하다
 *                               : 매개변수의 갯수나 데이터형이 틀리다
 *                               : 리턴형은 관계가 없다.
 *                         예)
 *                         A() => A()
 *                         A(int a, int b) => A(int ,int)
 *                         A(String s, double d) => => A(String, double)
 *                         A(int c, int d) => A(int ,int)//중복
 *                         => 실제 메소드에서도 적용
 *                  [기타] 
 *                   : 생성자를 사용하지 않고 초기화 하는 방법
 *                   => 인스턴스 블록 : new에서 메모리를 불러와야하기때문에 생성자를 호출해야함
 *                      {
 *                         구현 => 변수의 초기화
 *                      }
 *                      ==>생성자
 *                   예) class A
 *                      {
 *                         A(){
 *                           
 *                         }
 *                      }
 *                      new
 *                      
 *                   => 정적 블록 : static으로 메모리가 자동할당되기때문에 생성자 필요없음
 *                      static
 *                      {
 *                         구현 => static의 초기화
 *                      }
 *                   예) class A
 *                      {
 *                         static int[]
 *                         
 *                         static{
 *                           
 *                         }
 *                      }
 *                      
 *            --------------
 *              멤버메소드
 *               = static 메소드
 *               = static 리턴형 메소드(매개변수 목록)
 *                 {
 *                    
 *                 }
 *               = 인스턴스 메소드 => 따로생성
 *                 리턴형 메소드(매개변수 목록)
 *                 {
 *                 
 *                 }
 *            --------------
 *               예를들어 계산기를 두개 켜놓고 계산기1에 9를 눌렀을데 계산기2도 9가 눌리면 static
 *                     근데 계산기는 독립적으로 실행됨으로 이건 인스턴스 변수라고 볼수 있다.
 *               예를들어 크롬창을 두개 열때 2번째 페이지의 크기가 1번째 페이지와 가로세로크기가 같은부분=static
 *                     그러나 크롬창1에서 naver를 들어가도 크롬창2에선 실행되지 않음=인스턴스
 *               결론적으로 내가 입력하는데 출력값이 동일하다=static / 출력값이 다르다=인스턴스
 *                      한개의 동작으로 여러개의 공유값이 달라진다=static / 한개의 동작이 한개만 달라진다=인스턴스
 *            --------------
 *            --------------
 *         }
 *         
 *   생성자 => 오라클 연동 (데이터가 저장된 장소)
 *           : 영구적으로 데이터를 저장함 회원가입 정보같은걸 올려두고 끌어오는듯
 *           : 원격으로 연동 가능
 *           : 서버 실행과 동시에 데이터를 가져와야 하기 때문에 오라클과 연동해둠
 *           
 *   윈도우 초기화 => 시작과 동시에 레이아웃을 잡고 처리(이때도 생성자가 사용됨)
 *   
 *   따라서 실습을 위해 변수값으로 생성자를 사용하는것임
 *   실무에서는 서버연결/서버구동 에서 주로 사용함
 *           -----------
 *           = ServerSorket()
 *           
 *   
 *       [메소드] 
 *       : 인스턴스 메소드 => new를 이용해 메모리에 저장할때마다 생성
 *         ---------- 객체 생성마다 => 따로작동
 *         호출 => 객체명.메소드()
 *                ----------
 *       형식 
 *       : 리턴형 메소드명(매개변수목록) <선언부>
 *         {
 *             <구현부>
 *         }
 *         리턴형 : 기본형 , 배열 , 클래스
 *              => 요청에 대한 결과값 (1개만 사용이 가능)
 *              => 여러개인 경우 : 클래스/배열
 *              => 리턴형이 없는 경우 : void
 *              => 메소드명은 알파벳이나 한글로 시작한다.
 *                 숫자를 사용할수도 있음(단,앞에사용금지)
 *                 키워드는 사용 할 수 없다.
 *                 ----클래스명,메소드명은 키워드가 아니다
 *                 공백을 주면 안됨
 *                 특수문자 _ $ 만 사용가능
 *                 소문자로 시작 두번째단어는 대문자시작을 권고한다
 *                 ***소프트웨어 이행관련 한글은 문제발생할수 있음 
 *                    가급적 영어사용 권장
 *                    원도우개발 => 서버리눅스사용
 *                  Full Stack   AWS(PaaS)
 *                 =>StringBoot3
 *                  
 *                  
 *         매개변수 : 사용자가 보내준 값→여러개가 있을수도 있음
 *         
 *              
 *              
 *               
 *             
 */

public class MainClass {
	public static void main(String[] args) {
	}

}
