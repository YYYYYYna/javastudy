/*
 *     
 *     지금은 프로그램을 짜는게 아님
 *     지금은 웹개발에 필요한 자바 문법/형식/흐름 을 공부하는거임
 *                         ----------
 *          브라우저(웹) <=연결=> [자바] <=연결=> 오라클(웹에필요한데이터가저장되어있음)
 *          --------
 *          HTML/JAVASCRIPT/CSS 만 인식함
 *          => 위의 단점 : 오라클/MySQL(데이터베이스)와 연결할수 있는 프로그램이 없음
 *     ---------------------------------------------------------------
 *     [118page]
 *     [필수로 외워야할 사항]
 *     1. 클래스의 구조(형식)
 *        class => 필요한 모든 데이터 모아서 한번에 저장을 목적
 *                         ----------
 *                         =>기능/데이터
 *            **클래스명 => 식별자(우리가 직접 만든거라서 키워드가 아님)
 *                    => 약속사항을 지킬것 ①대문자로시작 ②들여쓰기
 *                    => 가급적이면 알파벳쓰기
 *                    => _MainClass : _가 앞에 있는건 임시클래스임
 *                    => 실무를 보면 데이터형만 모아둔 클래스 : 보통 ~VO ~DTO가 붙어있음
 *                                액션(기능)만 모아둔 클래스 : ~DAO , ~Service, ~Manager
 *        class 클래스명
 *        {
 *           ----------1번위치----------
 *          {변수선언} => 따로저장 / 한개저장 에 따라 쓰이는 변수가 다름
 *                     인스턴스   static(:데이터목록,회원목록,게시물목록) ==> 추후에는 모든 접속자가 공유할수 있는 오라클을 사용할 예정
 *            
 *                  : 멤버변수 => "new"를 사용해 객체 생성시에 따로 저장되는 메모리
 *                           => 사용시) 객체명.변수명
 *                           => 저장위치) Heap => 프로그래머관리영역 => 현재는 GC에서 관리맡음
 *                                                                  ---
 *                                                                  GC의 대상 : 객체가 null 혹은 사용하지않는 객체
 *                                                                          : 멀티미디어관련은 꼭 회수해줘야함 => System.gc()
 *                           => 사용범위) 해당클래스 전체. 필요시에는 다른 클래스에서도 사용 가능
 *                           => 소멸시기) 프로그램 종료시 소멸
 *                           
 *                  : 공유변수(static) => 컴파일러에 의해 자동으로 메모리 할당  
 *                                  => 사용시) 객체명.변수명 / 클래스명.변수명
 *                                  => 저장위치) Method Area(static) => 한개만 저장이 가능
 *                                  => 사용범위) 해당클래스 전체. 필요시에는 다른 클래스에서도 사용 가능
 *                                  => 소멸시기) 프로그램 종료시까지 사용
 *                  
 *                                  
 *                  ========> 자동default초기화
 *           ----------2번위치----------
 *            {생성자} : 반드시 필요로 한다 (생성자가 없는 경우 자동으로 컴파일러가 생성)
 *                   = 멤버변수 초기화
 *                   = 메모리 할당시 (클래스 저장)
 *                   = 시작과 동시에 처리하는 명령문 (ex.오라클연결,네트워크 => 서버구동,자동로그인)
 *                   = 특징 ① 생성자는 클래스명과 동일
 *                         ② 리턴형이 존재하지 않음
 *                         ③ 여러개를 만들 수 있다(=오버로딩) => 중복 함수 정의
 *                                           ------**오버로딩조건
 *                                                  : 한개의 클래스에서 제작
 *                                                  : 메소드명이 동일
 *                                                  : 매개변수의 갯수나 데이터형이 다르다 => 다른 메소드로 인식
 *                                                  : 리턴형은 관계없음
 *                                                 **다른클래스에서 객체 생성시 반드시 => public
 *                   
 *            {초기화블록} : 멤벼변수의 초기값 담당
 *             -------
 *              **인스턴스 블록 : 인스턴스 변수, static 변수에 대한 초기화 가능
 *              **static 블록 : static 변수만 초기화 가능
 *              => 해당내용은 초기화 뿐만 아니라 클래스속 변수사용에서도 같은 논리로 적용되는듯
 *                 static클래스에서 static변수 사용가능 그러나 인스턴스변수는 new로 할당 후 사용해야함
 *                 인스턴스클래스에서는 따로 값 할당없이 static과 인스턴스 둘다 사용가능
 *            
 *            ~사용방법~
 *            class ClassName
 *            {
 *               변수 선언;
 *               {
 *                  인스턴스 블록
 *               }
 *               static 
 *               {
 *                  static 블록
 *               }
 *               -------------자동호출 , 상속이 불가능
 *               *** 상속의 예외조건 : 생성자
 *            }
 *            => 초기화 순서
 *               1) 명시적인 초기화 => 1고민후 불가능하면 2.3중 선택
 *               2) 초기화 블록 : 주로 static(자동저장되기때문)변수에 대한 초기화로 쓰임
 *                          ***React(XML,JSON)에서 많이 쓰임!!!
 *               3) 생성자 : 주로 인스턴스 변수에 대한 초기화로 쓰임
 *            
 *            ~사용방법~
 *             (a는참조변수)
 *              ↑               a        new         A()
 *            A a=new A() ==> 참조변수에 메모리크기할당후 변수에초기값넣어줌
 *                --- ---
 *                new => int mollac(sizeOf(A)) => 메모리크기확인(sizeOf)후 주소값넘겨주기(mollac)
 *                       ---------------------(사용이많아서연산자로승격됨)
 *                       => 기본형 외의 데이터형은 크기를 알지 못한다.
 *                       => 리턴형 => 메모리 주소
 *                A() => 변수에 초기값을 설정(넣어줌)
 *                ***생성자는 단독으로 호출 불가능 : 반드시 "new 생성자()" 형태로 호출 가능
 *           ----------3번위치----------
 *            [메소드로 주로 만드는 기능]              [객체지향3대특성]
 *            => 읽기/쓰기 => getter/setter         ===> 캡슐화
 *            => 이미 만들어진 메소드 => 변경 => 오버라이딩 ===> 다용성
 *            => 새로운 기능 추가 => 오버로딩            ===> 다용성
 *            => 재사용 => is-a / has-a            ===> 상속/포함
 *            
 *            {멤버메소드} => 클래스 영역에서만 선언/구현!
 *            
 *            ① 사용자 정의 메소드 => 기능, 반복제거, 재사용
 *              ⒜ 멤버 메소드 => new를 사용할때마다 따로 저장
 *                         => 다른 클래스와 통신할때 사용 (ex메세지)
 *                형식) [접근지정어=public] 리턴형 메소드명(매개변수목록) <<구현부>>
 *                     {
 *                         <<선언부>>
 *                     }
 *                      <<출력부>>
 *                      : 객체명.메소드명()
 *                      : scan.nextInt()
 *                      : s.trim()
 *                        
 *                     => 리턴형 : **JSP로 서버에 값을 넘겨주는것도 리턴형임!!!
 *                               **public movie[] 이런식으로 넘겨줬었음..
 *                             : 사용자요청에 대한 결과값.
 *                             : 한개만 설정(여러개일 경우 => 배열/클래스)
 *                             : 상세보기 → 클래스(배열:목록) => 컬렉션
 *                                             |           |
 *                                            고정          가변
 *                             : 리턴형은 반드시 사용한다
 *                               결과값이 있는 경우 = return 값
 *                               결과값이 없는 경우 = void => return 생략이 가능
 *                     => 매개변수 : 사용자가 보내준값
 *                               예)로그인창 => id,pw
 *                                 검색기 => 검색어
 *                                 클릭 => 번호
 *                                 ---------------
 *                                 *3개이상 넘어가면 클래스를 사용해야함
 *                                  예) 게시판 글쓰기, 회원가입
 *                     => 멤버메소드는 멤버변수, static변수, 지역변수를 사용할 수 있다.
 *                     => 메소드 유형
 *                        리턴형   매개변수 
 *                           ==> R(SELECT:검색) => DML
 *                         O       O
 *                         O       X
 *                       ------------메소드 자체 처리 (CRUD)
 *                                   ==> CUD => (INSERT:예약,UPDATA,DELETE)
 *                         X(void) O
 *                         X(void) X
 *               ~사용방법~
 *               class A
 *               {
 *                  int a=10;
 *                  void aaa()
 *                  {
 *                     ---구현
 *                     return;
 *                  }
 *                  int bbb()
 *                  {
 *                     ---구현
 *                     return a; => 데이터형이 동일
 *                  }
 *                }
 *                **메모리 저장
 *                A aa=new A();
 *                --aa--
 *                0x1000
 *                ------ ↖  
 *                        --0x1000--
 *                        -----a----
 *           //해당공간에 변수     10   ==> aa.a
 *           //메소드가 순서대로----------  
 *           //메모리에 저장됨    aaa() ==> aa.aaa()
 *                         ----------
 *                            bbb() ==> aa.bbb()
 *                         ----------   [.은주소접근연산자]
 *                        => 리턴형이 있는 경우
 *                           int a=aa.aaa();
 *                           ---     ------
 *                        => 리턴형이 없는 경우
 *                           aa.bbb()
 *                         
 *              ⒝ 공유 메소드 => static
 *                ~사용방법~
 *               |--둘이자리바꿔도됨--|
 *                [접근지정어] static 리턴형 메소드명(매개변수목록)
 *                
 *               **=> static메소드는 static변수, static메소드는 사용이 자유롭다
 *               **=> static메소드 안에서는 인스턴스변수,인스턴스메소드는 new로 값을 할당후에 사용해야함
 *              
 *              ⒞ 상속을 방지 => final (종단메소드)
 *              
 *              ⒟ 선언만 한다 => abstract (추상클래스/인터페이스) **인터페이스는 Spring에서 자주 쓰임 매우중요
 *                         => 상황마다 프로그램에 맞게 구현
 *              
 *            ② 라이브러리 메소드
 *             **라이브러리 와 프레임워크 의 차이
 *               =완제품      =레고부품 
 *                (jar)      (java) ex.전자정부,ANY
 *               
 *           -------------------------
 *           //한 클래스에 모든 1.2.3위치 구성이 다 들어가는건아님
 *           //가독성을 위해 위치로 나눠준것임
 *           //기능에 따라 클래스를 따로 생성 하기도함
 *        }
 *     2. 메모리 저장이 어떻게 되는지 : new 생성자()
 *        122page ==>
 *         객제생성
 *         --- 기본형 => 변수
 *         --- 클래스 => 객체 (메모리 공간)
 *         --- 하둡  
 *         --- 클라우드 => 네트워크
 *         class A
 *         {
 *         }
 *         new A() => Thread() => new Thread,new 윈도우()
 *         -------메모리 주소 리턴 => 필요한 경우에는 주소를 저장 : 꼭 참조변수를 생성할 필요가 없다.
 *         123page ==>
 *         방법1)
 *         A a=new A();
 *         a.변수,메소드
 *         방법2)
 *         A a;
 *         a=new A();
 *         
 *     3. 호출하는 방법 
 */
class A
{
	int a=10; //멤버변수
	static int b=20; //공유변수
	
	//그냥 생성후 main에서 new A().display();로 호출해도됨
	void display()
	{
		System.out.println("A:display Call...");
	}
	
	//근데 이렇게 두개가 생성되었을때는
	void aaa()
	{
		System.out.println("A:aaa Call...");
	}
}

public class MainClass {
	
	public static void main(String[] args) {
		//멤버변수호출
		A aa=new A(); //:aa라는 메모리에 a변수 넣기
		System.out.println(aa.a);
		System.out.println(aa.b); //:aa라는 메모리에 static b값 넣기
		System.out.println(A.b); //:static b 호출 (띠로메모리할당필요X)
		
		//이렇게 하면 쓸데없이 메모리 2개 생성한거임
		new A().display();//new가 두번 사용되었기 때문에
		new A().aaa();    //각각의 A메모리가 다름
		
		//두개를 한번에 효율적으로 호출하는법은
		 A a=new A(); //이렇게 new한번 호출로 해결하는것이 좋음
		 a.display();
		 a.aaa();

	}

}
