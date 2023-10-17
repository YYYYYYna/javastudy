package com.sist.main;
/*
 *      1. 객체지향 프로그램 => 어플리케이션(주로여기서객체지향), 웹어플리케이션
 *                                                ----------
 *                                                | 캡슐화, 인터페이스 중심
 *                                                => 연산자,제어문,메소드
 *                                                => 데이터베이스 연동
 *                                                   -----------
 *        객체지향 프로그램의 목적
 *        = 코드의 재사용이 높다 (기존의 코드를 변경,추가)
 *        = 코드관리가 용이하다 (구조적 프로그램=>메소드로 기능별구분가능)
 *        = 이미 사용중인 프로그램을 이용 => 신뢰성이 높다
 *        = 대규모 프로젝트에서 주로 사용
 *          ----------
 *          Model 1 => 홈페이지, 소규모 회사
 *          -------통으로 프로그램 구현(개인)
 *          Model 2 => 공기업, 금융권
 *          -------Front, Back, Database => MVC
 *          
 *          *Spring(MVC) => Front(MVC=>Vuex,Redux/React-Query)
 *          
 *          => 한개의 서버에서 작업 => 서버점검시 서비스 중단
 *             --------------
 *             |여러개의 서버에서 나눠서 작업(=MSA)
 *              => Spring Cloud
 *              => 데이터 분석 => 지능형웹(=추천...)
 *                 new Vue({
 *                 })
 *                 import 
 *                 class App extends React
 *                 {
 *                 }
 *                 funtion App(){} => CDN
 *       
 *       
 *       객체지향에서 클래스의 구성 => 추상화(=공통적으로가지고있는특성만모아주기)
 *                ----
 *                : 공통적인 데이터 , 기능을 모아서 저장 => 사용
 *                  ---멤버변수---  -메소드-
 *                : 사물을 단순화 시키는 작업 => 추상화
 *                
 *                : 한개의 클래스로 동작하는것이 아니다
 *                  여러개 클래스로 연관관계
 *                  행위자 <=====> 처리
 *                  사람          자판기
 *                  사용자,관리자     웹 
 *      -------------------------------------------------------
 *      --개발자마다 생각하는 데이터가 다를때 극복하는법 => 기준을 잡아줘야함
 *      --맛집에 들어가는 데이터를 추출해야한다면? 생각하는 데이터가 다 같을수 없음
 *      [기준을 잡는 가이드라인]
 *      1) 설계에 필요한 데이터 설계 (벤치마킹) ===> 멤버변수
 *      2) 기능 (메뉴,버튼) => 메소드화 ===> 멤버메소드
 *      3) 변수에 대한 초기값을 어떻게 줄건지 ===> 생성자
 *      -------------------------------------------------------
 *      클래스를 메모리에 저장할때는
 *        클래스명 변수명=new 클래스명()
 *                       --------
 *                       생성자가 필수로 필요함
 *                       모든 클래스는 생성자를 가지고 있음
 *     --------------------------------------------------------
 *     재사용  /  데이터 변질,손질  /  변경이 쉽게... (객체 지향) => 유지보수
 *     ----     -----------     ---------
 *     |상속,포함  |캡슐화           |다형성(오버라이딩,오버로딩)
 *     
 *     **멤버변수 잡는걸 주의해야함
 *       -----
 *       |따로사용 => 인스턴스 변수
 *       |한개 사용 => 정적 변수
 *       ---------------------데이터베이스 (정규화)
 *           중복데이터삭제 => 1정규화
 *           중복메소드삭제 => 2정규화
 *      -------------------------------------------------------    
 *      클래스의 구성요소 (5장)
 *        class A
 *        {
 *           1.데이터 선언 : 멤버 아님 static => 데이터 손실,변지방지 (private,은닉화,getter/setter)
 *           2.데이터 저장 : 생성자 = 클래스명과동일
 *                             = 리턴형없음
 *                             = 여러개사용가능(=오버로딩)
 *                                         -------기능추가
 *                                         메소드명 동일
 *                                         매개변수의 갯수나 데이터형이 다름
 *                                         리턴형 관계없음
 *                                         생성자는 필요시에만 사용
 *                                         생성자가 없는 경우는 자동 디폴트 생성자 생성
 *                             =>멤버변수에 초기화
 *                             =>메모리 저장시 호출되는 메소드
 *                      
 *                      : 초기화블록 = 컴파일러에의해자동호출
 *                                =>인스턴스블록 : 멤버변수,정적변수 초기화
 *                                           : 생성자를 반드시 호출
 *                                =>정적블록 : 정적변수만 초기화가 가능(static)
 *                                         : 자동 초기화
 *           3.데이터 활용 : 메소드 ==> 다른 클래스와 통신(연결) => public
 *                        종류) 일반멤버메소드 [접근지정어] 리턴형 메소드(매개변수목록)
 *                        
 *                             정적메소드 [접근지정어] static 리턴형 메소드(매개변수) ==> 멤버변수를 활용하지 않는경우
 *                                     예) 이미지를 정해진 상자에 딱 맞게 채워넣는 메소드를 만든다면? static으로 설정하기
 *                                     예) 웹사이트주소에서 (%3946392%3=>자바 (=인코딩)), (자바=>%3946392%3 (=디코딩)) 과정도 static으로
 *                                     
 *                             종단메소드 : 오버라이딩이 안되는 메소드
 *                                     : 사용빈도가 적음
 *                                     [접근지정어] final 리턴형 메소드명(매개변수)
 *                                     
 *                             추상메소드 : 구현이 안된 메소드 => 선언만 하는 메소드
 *                                       설계용(abstract)
 *                                       => 추상클래스 / 인터페이스
 *                                       => 여러개의 클래스를 한개의 이름으로 묶어서 처리
 *                                          -------------------------------
 *                                          데이터 여러개 => 한개의 이름으로 제어 (배열)
 *                                          여러개의 클래스 => 인터페이스 ==> 이후 Spring이 이역할을 수행함
 *                                                        =결합성을 낮게 만든다
 *                                                         ----
 *                                                         클래스를 수정해도
 *                                                         다른클래스에 영향을
 *                                                         주지않음!!!!
 *        }
 *      객체지향 3대 특성 (6장)
 *      => 상속 : 기존의 기능을 사용
 *               extends : 확장
 *               => 예외 : static,생성자,초기화블록,private
 *               => final클래스는 상속할수 없다
 *      => 다형성 : 변경(오버라이딩) / 추가(오버로딩)
 *      ---------------------------------------------
 *         재사용 : 변경(상속) , 있는그대로(포함)
 *                                 ----멤버변수로 사용
 *                                     |기본형,배열,클래스,열거형,인터페이스
 *                                                         |데이터베이스연결
 *                                              Connection
 *                                                  |
 *                                             ------------
 *                                         Oracle  MySQL  MSSQL
 *      
 *      클래스의 종류 (7장)
 *        ----------------------------------
 *        = 추상클래스
 *          public abstract class ClassName
 *        = 인터페이스 => 추상클래스의 일종
 *          public interface interface명
 *          {
 *             //상수형메소드
 *             //선언만된 메소드 =ex=> 윈도우:버튼,마우스,키보드
 *          }
 *        ----------------------------------미완성된클래스 : new를 이용해서 메모리 할당이 안된다
 *                                                    : 항상 상속을 내려서 구현된 다음에 사용
 *        = 내부클래스 : 스레드 , 네트워크 , 데이터분석시 사용
 *                                   ------가장많이쓰임
 *          = 멤버 클래스
 *            class A =>서버 =>접속시처리 (윈도우)
 *            {
 *               A데이터
 *               class B =>통신서버 =>접속안하고통신 (스레드)
 *               {
 *                  A데이터여기서도사용가능!!  
 *               }
 *            }
 *          = 익명의 클래스
 *            class A
 *            {
 *               B b=new B();
 *               {
 *                  //아래B부분에서가져옴
 *                  void display()
 *                  {
 *                  }
 *               }
 *            }
 *            class B
 *            {
 *               void display()
 *               {
 *               }
 *            }
 *      사전에 에러방지 (8장)
 *       1) 직접처리
 *          try-catch
 *       2) 간접처리
 *          메소드() throws 예외처리
 *       3) 임의발생 => 테스트
 *       4) 사용자 정의 예외처리
 *      ---------------기본분법
 *      라이브러리 => 조립 (9장~15장)
 *       => Spring , IO , Collection 쪽은 꼭 외우기 ==> SQL 부분도!! ==> Network부분으로 이어짐
 *        
 */
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
/*
 *  오버라이딩(재정의)의 기본은 "상속"을 된 상태에서 해야하지만
 *  그러나 속도가 더 중요함으로 가급적 상속을 지양함
 *  그래서 "익명의 클래스를 이용"하면 재정의가됨으로 "상속없이 오버라이딩 가능!"
 */
public class MainClass2 extends JFrame{
	
	//포함클래스
	JTable table; //=모양내기
	DefaultTableModel model; //=테이블 데이터 제어
	
	//초기화
	public MainClass2()
	{
		String[] col={"번호","이름","성별","주소","전화"}; //표 맨상단부분~
		String[][] row=new String[0][5];
		
		//현재상태로는 사용자에게 보여짐과 동시에 편집도 됨...이럼안됨
		
		//이렇게 인스턴스 생성자를 이용해서 상속없이! 오버라이딩 진행할수 있도록함!! => 익명의클래스
		model=new DefaultTableModel(row,col){
			@Override
			public boolean isCellEditable(int row, int column) {
				//=익명의클래스부분
				//아래는 오버라이딩을 통해서 사용자가 편집기능을 사용할수 없도록 선언한것
				return false;
			}
		};
		/*
		 *  오버라이딩(재정의)의 기본은 "상속"을 된 상태에서 해야하지만
		 *  그러나 속도가 더 중요함으로 가급적 상속을 지양함
		 *  그래서 "익명의 클래스를 이용"하면 재정의가됨으로 "상속없이 오버라이딩 가능!"
		 */
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		//배치
		add("Center",js);
		String[] data={"1","홍길동","남자","서울","010-1111-1111"};
		for(int i=0;i<10;i++)
		{
			model.addRow(data);
		}
		setSize(640,480);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MainClass2();
	}

}
