/*
 *      프로그램                   ----영구적 저장---
 *      1. 데이터 관리 (메모리에 저장, 파일 저장, RDMS저장)
 *         --------
 *         1) 데이터 저장
 *            = 한개 저장 : 변수
 *            --------------------------
 *            = 같은 데이터 여러개 저장 : 배열
 *            = 다른 데이터 여러개 저장 : 클래스
 *              => 메모리 주소를 이용하는 프로그램
 *                (-------=참조변수 => 사용자정의데이터형)
 *            -------------------------- 관련된 데이터를 모아서 관리
 *            
 *         2) 데이터 가공
 *            = 명령문 => ;
 *            = 연산자
 *            = 제어문
 *            -----------해당 3가지를 묶어서 처리하는것 = 메소드
 *            
 *         3) 가공된 데이터 출력
 *            = 명령프롬포트 / 윈도우 => Application
 *            = 브라우저 => Web Application
 *              ------------------------=웹
 *            = 모바일 => Mobile Application (=kotlin)
 *            ==============================둘다 문법형식은 동일
 *            = Front-End (React, Vue)
 *                         -----React-Query
 *                         
 *      2. 데이터 관리를 위한 사용자 정의 데이터형
 *         1) 클래스의 구성요소
 *            = class ClassName
 *              {
 *                  -----------
 *                 !① 변수 설정 => 프로그램 종료시까지 사용이 가능
 *                            => 지역변수 : 메소드 종료시 사라지는 변수
 *                               -> 리턴형, 매개변수
 *                            => 전역변수  
 *                               -> 리턴형, 매개변수가 단순해 진다.
 *                               = 공유변수
 *                               = 인스턴스 변수
 *                  -----------
 *                  ② 생성자 설정 : 변수에 대한 초기화
 *                    => 여러개 사용이 가능 , 사용하지 않는 경우
 *                                       ------------
 *                                             |
 *                                      컴파일러에 의해 자동생성
 *                  -----------
 *                 !③ 메소드 설정
 *                  -----------
 *              }
 *         2) 클래스의 변수의 종류
 *            클래스 영역에 선언하는 변수 => 멤버변수 ===> heap에 저장됨
 *                                  : 인스턴스 (객체) 변수 => new를 사용할때마다 따로저장 (heap에 저장)
 *                                  : 클래스 변수 => 공유변수 => static => (Method area에 저장)
 *            *자바의 메모리
 *            ------------------------
 *             Method Area (static)
 *             => 메소드 저장, static 변수
 *            ------------------------
 *             Heap
 *             => 인스턴스 변수 (멤버변수)   =====> 프로그래머가 메모리에 저장, 해제(GC:자동메모리해제)
 *                                                               또는 System.gc()를 사용해 임의로 해제
 *            ------------------------
 *             Stack
 *             => 지역변수, 매개변수        =====> 블록변수 {} => 메모리 자체 관리
 *            ------------------------
 *            
 *         ------------------------------------------------------------   
 *               변수유형        선언위치        메모리저장        사용범위
 *         ------------------------------------------------------------ 
 *          ① 인스턴스변수 : 클래스를 메모리에 저장한 상태  
 *                     : class ClassName
 *                       {
 *                           int a;
 *                       }
 *                     : new -> 새로운 공간이 생성 => 클래스 전체
 *                       
 *          ② 정적변수(앞에static붙은거)
 *                 : class ClassName
 *                   {
 *                       static int a;
 *                   } 
 *                 : 컴파일시에 자동 생성
 *                   
 *          ③ 지역변수 : 메소드 호출시마다 생성
 *                    메소드안에서 사용이 가능
 *                  : class ClassName
 *                    {
 *                        void display()
 *                        {
 *                            int a;
 *                        }
 *                    }
 *                  : 메소드 안에서 사용이 가능
 *          **비행기게임에서 비행기위치값은 인스턴스변수 점수는 정적변수
 *          
 *          [메모리 저장]
 *          인스턴스 : 메모리에 저장된 상태(객체:클래스에 대한 변수명=>메모리주소)
 *                : class A
 *                 
 *                     ---메모리크기를확인->메모리확보->확보된 메모리주소 넘겨주는 역할
 *                 A a=new A()
 *                         ---생성자(멤버변수에 대한 초기화)
 *                     -------초기값 
 *          클래스 : 설계 (필요한 데이터를 모아준다)
 *               : 메모리에 저장 => 활용 => 메모리 해제
 *               ***클래스는 한개의 정보를 모아둔곳 : 형식(틀)만 만들고 데이터는 계속 바꿀수 있도록 만들어야함
 *               : class Movie
 *                 {
 *                    -----
 *                    -----
 *                    -----
 *                    static int a;
 *                    : 만약에 클래스 안에 static 변수가 들어가면 어느 데이터에서도 접근이 가능
 *                    : 이런 변수는 CGV 같은 모든 영화에 해당되는 내용이 있어야함
 *                    : 카드게임의 경우에는 카드크기를 static으로 잡음 한개가 달라지면 모두 달라져야함
 *                    : [공통으로 사용하는 값을 static으로 설정함] = 데이터정규화
 *                 }
 *                 **한개의 데이터형(틀)을 만들고
 *                 Movie m1=new Movie();
 *                 Movie m2=new Movie();
 *                 Movie m3=new Movie();
 *                 ...
 *                 ...
 *                 **각각의 영화를 저장할수 있도록 데이터를 따로 저장함
 *                 [활용시]
 *                  m1.변수명(.은주소접근연산자)
 *                 [해제시] 
 *                  m1=null
 *                  (ex.해당영화가내려갈때,학생들의점수모음이라면전학갈때)
 *         ------------------------------------------------------------ 
 *         **오늘 이후 이번주에 나갈 내용**   
 *         3) 메소드 처리 방법
 *         4) 생성자 확인
 *         ~~~~~~~~~~~~~(객체지향)
 *         5) 초기화 블록
 *         6) 클래스의 종류
 *         7) 라이브러리
 *         8) 예외처리 : 비정상종료를 하지 않도록 처리
 */

//  학생 클래스 만들기 => 이름, 국,영,수 점수
/*
 *    파일명은 .java
 *          ------
 *          => 클래스명과 동일(대소문자 구분)
 *          A.java , a.java
 *          
 *    한 파일 안에 여러개의 클래스를 사용할 수 있다.
 *    **public이 있는 경우
 *    class A
 *    public class B
 *    --------------public class는 한 파일에 1개만 사용 가능
 *                  ------------가 파일명이 됨
 *    
 *    **public이 없는 경우
 *    class A
 *    class B
 *    ------- public이 없는 경우 저장명은 A.java , B.java
 *    ------- 일반 => 저장명은 main이 있는 클래스를 저장명으로 설정
 *    
 *    **같은폴더(src)에 저장된 경우
 *    class A
 *    public class MainClass1
 *    
 *    class A
 *    public class MainClass2
 *    -----------------------=> 오류남 (A는 이미 사용중)
 */
import java.util.*;
//a. 클래스로 데이터 모으기
//가급적이면 따로 클래스를 만들기를 권장
//new를 이용하면 저장공간을 따로 만들 수 있다.
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	//멤버변수사용 => 기본형, 클래스, 배열
}
public class MainClass {

	public static void main(String[] args) {
		//b. 배열로 데이터 모으기
		String[] names=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		//한명에 대한 정보 => index가 같은 것을 이용한다.
		/*
		 *   names
		 *  -------       --names[0]----names[1]----names[2]--
		 * @6504e3b2  ==> |          |            |
		 *  -------       |----------|------------|----------
		 *                @6504e3b2   @6504e3b2+4   @6504e3b2+8
		 *                
		 *  모든 클래스는 변수선언시 => 4byte(주소)
		 */
		//System.out.println(names);
		
		//[입력부분]
		/*Scanner scan=new Scanner(System.in);
		for(int i=0;i>3;i++)
		{
			System.out.println((i+1)+"번째 이름 입력 : ");
			names[i]=scan.next();
			System.out.println((i+1)+"번째 국어 입력 : ");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 영어 입력 : ");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학 입력 : ");
			math[i]=scan.nextInt();
		}
		//[출력부분]
		for(int i=0;i>3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
					kor[i],eng[i],math[i],
					kor[i]+eng[i]+math[i],
					(kor[i]+eng[i]+math[i])/3.0);
		}*/
		
		//[클래스 이용] : 사용자 정의 데이터형
		
		//      |변수명=구분을위해서"인스턴스/객체"라고함  
		//      ↓    ↓초기화
		Student hong=new Student();
		//int    a  = 10 과 같은 의미
		hong.name="홍길동";
		hong.kor=99;
		hong.eng=99;
		hong.math=99;
		System.out.println("hong주소 = "+hong);
		System.out.println(hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math+" "
		                   +(hong.kor+hong.eng+hong.math)+" "
		                   +(hong.kor+hong.eng+hong.math)/3.0);
		/*
		 *  [stack:주소]                [heap:실제데이터]
		 *     hong
		 *    -------                  new Student()
		 *   @515f550a    
		 *    -------   =>  @515f550a  ----names----
		 *    
		 *                             -----kor-----
		 *                
		 *                             -----eng-----
		 *                
		 *                             -----math-----
		 *                  
		 *                    hong.name , hong.kor , hong.math
		 *                
		 */
		
		Student shim=new Student();
		shim.name="심청";
		shim.kor=88;
		shim.eng=88;
		shim.math=88;
		System.out.println("shim주소 = "+shim);
		System.out.println(shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math+" "
                +(shim.kor+shim.eng+shim.math)+" "
                +(shim.kor+shim.eng+shim.math)/3.0);
		
		Student park=new Student();
		park.name="박문수";
		park.kor=77;
		park.eng=77;
		park.math=77;
		System.out.println("park주소 = "+park);
		
		
	}

}
