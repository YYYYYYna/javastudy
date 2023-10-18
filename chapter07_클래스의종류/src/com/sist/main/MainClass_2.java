package com.sist.main;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
 *      지금까지 배웠던건 사용자 정의 일반 클래스였음
 *                   ----------------
 *                   = 데이터형 : 여러개의 변수만 모아서 한번에 저장할 목적 (""변수중심"")
 *                           : ~VO(Value Object) => Spring에서 주로 쓰임
 *                           : ~DTO(Data Transfer Object) => MyBatis(웹)에서주로쓰임
 *                           : ~Bean => JSP에서 주로쓰임
 *                           
 *                   = 액션클래스 : 데이터형 클래스를 제어해줄 목적 (""메소드중심"")
 *                             : ~DAO (Data Access Object) => 오라클연결
 *                             : ~Manager => 파일 입출력 / 크롤링 / OpenAPI(뉴스,지도)
 *                             : ~Service => DAO 여러개를 묶어서 관리
 *                                           : 보통 DAO는 한개의 동작을 저장해두기 때문에 (게시판,댓글...)
 *                                             댓글형게시판 같이 두개의 동작으로 묶기위해 Service 생성
 *                             : ~Controller => 자바에서 브라우저로 보낼때
 *                             : ~RestController => 자바에서 JSON을 이용해서 데이터형같은 문법을 변환 후 자바스크립트로 보낼때
 *       
 *      [7장:클래스의 종류]
 *      1) 추상 클래스
 *         :"단일상속"만 가능
 *         
 *         = 주목적) 
 *           관련된 클래스를 모아서 관리(서로다른 클래스를 연결해서 사용)
 *           클래스 끼리 독립된 관계를 유지해서 한곳에서 에러가 나도 다른곳에는 영향을 끼치지 않음(=결합성이낮은프로그램)
 *           
 *         = 미완성 클래스 : 메소드를 구현하지 않는 경우 => 선언만 한 경우
 *                     : 이 경우 new를 이용하여 메모리 할당이 불가능
 *                     : 사용시 반드시 "상속을 내려서 구현(오버라이딩)후에 사용"해야함
 *         = 선언만 한 메소드가 존재할 수 있다.
 *         = 인스턴스 메소드, 인스턴스 변수를 사용할 수 있다.(=따로저장이가능하다)
 *         
 *         = 형식)    --추상--
 *           public abstract class ClassName
 *           {
 *              -------------①-------------
 *               변수영역
 *              -------------②-------------
 *               구현된 메소드 //공통으로 사용 
 *                         //필요시 오버라이딩
 *                    public void display(){}
 *              -------------③-------------
 *               선언된 메소드 //이부분은 없을수도 있다.
 *                         //그러나 상속을 받으면 반드시 구현해야함
 *                    public abstract void display(); //{}이없음
 *                         //구현이 안되는 경우 = default값 생성이 불가능할때
 *                                         예)해당버튼이 계산기라고 치면 이 버튼이 연산자가될지..숫자가될지..
 *                                            버튼의 용도를 예측할수 없음으로 default가 불가능함
 *                                            그래서 상속받아서 때때마다 오버라이딩해라~로 구현함
 *                                         예)키보드의 버튼도 숫자키인지..방향키인지 예측불가능
 *                   //따라서 용도가 많은건 default값 생성불가 => 선언만 하는 메소드로 주로 구현
 *              ---------------------------
 *           }
 *           
 *         = 추상클래스의 클래스 상속 예제
 *           public abstract class A
 *           public class B extends A
 *           {
 *           }
 *           이런경우 A를 가져다 써야하는데 B로 구현해야함
 *           ==> A a=new B();
 *           ==> 구현된 클래스를 이용해서 메모리를 할당하는 과정임
 *           
 *         = 추상클래스는 공통성을 가지고 있는 클래스 ==> 요구사항 분석시 만들어짐        
 *           예)   게시판 : 목록출력,검색,글쓰기,내용보기,수정하기,삭제하기
 *              묻고답하기 : 목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,답변하기
 *              댓글게시판 : 목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,댓글작성
 *              후기게시판 : 목록출력,검색,글쓰기,내용보기,수정하기,삭제하기,업로드
 *              ===>모두 기능은 비슷한데 각 게시판의 출력화면(=UI)은 다름
 *              ===>이걸 해결하기위해 
 *                  ① 공통으로 사용되는 메소드를 찾는다 => 예시에서는 최상단의 게시판 부분을 찾으면됨
 *                  ② 공통 메소드를 추상메소드 (구현안된 메소드)로 변환한다
 *                  ③ 상속받아서 구현(오버라이딩)하면됨 => 프로그램에 맞게(=각게시판에맞게) 구현하라는뜻
 *                  ④ 추후 추상클래스로 모든 게시판 제어
 *                  ===> 클래스를 묶어서 한개의 이름으로 제어가능!
 *                  ===> 이걸 기반으로 추후 서버 설계때 반대로 가이드라인으로 참고할수도 있음
 *                  
*         = 추상클래스인지 아닌지 확인하는법
*           1) 추상클래스와 생성자가 다른경우 : 추상클래스!
*              왜냐면 같은 경우는 일반클래스였음!!!
*              예) List names=new ArrayList(); 이거는 다르니까 추상클래스 아님 인터페이스란뜻임
*              
*           2) 메모리 할당을 하는데 메소드를 이용한다? : 추상클래스! 
 *               
 *      2) 인터페이스 => 추상클래스의 일종
 *         :인터페이스도 클래스임 그러나 다른점은 "다중상속"이 가능하단점
 *         
 *      3) 내부 클래스
 *      
 *      
 *      ===> 버튼, 마우스, 키보드 해당 기능들은 프로그램에 따라 다름으로 default로 처리 불가능
 *           -----추상메소드사용됨------
 *           예)
 *           abstract class ActionListener
 *           {
 *              버튼클릭(); //기능1선언
 *              더블클릭(); //기능2선언
 *           }
 *           abstract class MouseListener
 *           {
 *              마우스클릭_left(); //기능1선언
 *              마우스클릭_right(); //기능2선언
 *           }
 *           abstract class KeyListener
 *           {
 *              키보드클릭(); //기능1선언
 *              키보드UP(); //기능2선언
 *           }
 *           
 *           //게임제작을 할때는 키보드 마우스 버튼이 동시에 움직여야하는데
 *           //아~~근데 단일 상속시에는 마우스랑 버튼 키보드의 클래스를 동시에 못받는구나...
 *           class Game1 extends ActionListener
 *           class Game2 extends MouseListener
 *           class Game3 extends KeyListener 
 *           class Game4 extends Game1
 *           class Game5 extends Game2
 *           :
 *           //이렇게 무한으로 받아야함...
 *           
 *           //그러나?
 *           //인터페이스를 이용하여 다중상속으로 받은경우
 *           class Game implements ActionListener,MouseListener,KeyListener
 *           //이렇게 한줄로 해결할수 있음~~
 *           
 *           따라서 인터페이스가 추상클래스를 보안한점은
 *           1) 다중 상속을 가능하게함
 *           2) 구현이 안된 메소드만 사용
 *           3) 변수 => 상수
 *           4) 기본 => 다른 클래스에 영향이 없게 만든다
 *           
 *           그니까 인터페이스는 웹에서 방화벽같은 역할을 해주는거임
 *           각각의 기능이 유기적으로 기능하되 에러를 중간에 막아줌
 *           
 *           
 *           
 *           
 *           
 *           
 *      
 */

//추상클래스 만들어봄
abstract class 도형{
	//선, 사각형, 원...뭘 그릴지 모르지 선언만해줌
	public abstract void draw(); //:추상메소드(선언만해줌)=무조건구현(오버라이딩)해야함
	
	//선색 같은 바뀌지 않을 기본사항은 구현도 해줌
	public void select(){
		System.out.println("검정색을 사용한다.");//:default는 생성됨,추후필요시수정도가능
	}
}

//아래는 추상클래스에서 상속받아서 구현하는 클래스 부분
class 선 extends 도형{

	//오버라이딩 부분 안가져오면 오류남!!!!
	////:추상메소드(선언만해줌)=무조건구현(오버라이딩)해야함
	@Override
	public void draw() {
		System.out.println("선을 그린다.");
		
	}
}

class 사각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
		
	}
}

class 원 extends 도형{

	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
	public void select(){
		System.out.println("빨간색을 사용한다.");//default값을 오버라이딩함
	}
}

class 삼각형 extends 도형{

	//오버라이딩 부분 안가져오면 오류남!!!!
		////:추상메소드(선언만해줌)=무조건구현(오버라이딩)해야함
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
	public void select(){
		System.out.println("파란색을 사용한다.");//default값을 오버라이딩함
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("도형을 선택하세요(1원,2사각형,3선,4사각형) : ");
		int mode=scan.nextInt();
		
		//하나를 가지고 관련된 여러개의 클래스를 관리하는법)
		//이렇게 서로 다른 클래스를 주소값만 바꿔서 실행하는 방법을 사용해야함
		도형 a=null;
		if(mode==1) {
			a=new 원();
		}
		else if(mode==2) {
			a=new 사각형();
		}
		else if(mode==3) {
			a=new 선();
		}
		else if(mode==4) {
			a=new 삼각형();
		}
		//그럼 아래if문과 다르게 공통부분 코딩을 줄일 수 있음
		a.draw();
		a.select();
	
		
		/*
		//이렇게 if문 남발하면 안됨;;
		if(mode==1){
			원 a=new 원();
			a.draw();
			a.select();
		}
		else if(mode==2){
			사각형 a=new 사각형();
			a.draw();
			a.select();
		}
		else if(mode==3){
			선 a=new 선();
			a.draw();
			a.select();
		}
		else if(mode==4){
			삼각형 a=new 삼각형();
			a.draw();
			a.select();
		}
		*/

	}

}
