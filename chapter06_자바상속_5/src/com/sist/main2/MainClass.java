package com.sist.main2;
class Movie{
	//하위의 CGV와 MegaBox의 공통부분을 여기(상위클래스)서 묶어야함
	//[공통특성목록]
	//1. 예약을 한다
	//2. 영화목록을 보여준다
	//3. 상세보기
	//4. 결제를 한다
	//5. 영화추천
	
	//그러나 영화관에 따라 공통특성이라도 약간 다를수는 있음
	//그런 부분을 "오버라이딩"해서 수정해야함
	//오버라이딩 = 기본 기능은 같은데 추가적인 내용이 있는경우 수정하는것
	
	//1. 예약을 한다
	void reserve() {
		System.out.println("예약을 한다");
	}
	//2. 영화목록을 보여준다
	void list() {
		System.out.println("영화 목록을 보여준다");
	}
	//3. 상세보기
	void detail() {
		System.out.println("상세보기");
	}
	//5. 영화추천
	void recommand() {
		System.out.println("영화 추천을 한다");
	}
	//근데 결론적으로 보면 굳이?상위클래스의 메소드에서 구현을 할 필요가 없음
	//하위클래스마다 수행되어야하는 메소드가 조금씩 다를수기 있기때문
	//그래서 일일히 하위클래스에서 오버라이딩 해주는것보다 상위클래스에서
	//메소드를 "선언"만 하는 기능이 생겼는데 이게 "인터페이스"
}
class CGV extends Movie{

	//Override을 통해 기능추가가 가능
	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약");
	}
	//필요한 부분만 override가능
}
class MegaBox extends Movie{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}
	
	//이건 확장시킨거임 => Movie가 가지고 있는 메소드 외에 다른메소드 추가
	public void print() {
		System.out.println("MegaBox:print() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		//하나로 통합해서 출력 => 한개의 객체 생성해야함 => 상위클래스 이용하면됨
		//(상속을 받는 목적 : 관련된 클래스를 묶어서 사용하기위해)
		Movie mm=new CGV(); //Movie안에 있는 메소드만 출력가능
		                    //물론 메소드 호출시 Override된 값으로 출력되긴함
		mm.reserve();
		
		mm=new MegaBox(); //따라서 mm은 print()메소드를 호출할수 없다~~~~
		                  //당연함~~~ 상위클래스(Movie)는 하위클래스(MegaBox)에 접근불가능이니까~~
		mm.reserve();
		
		/*         ↓주소변경됨
		 *         ---------
		 * Movie m=new CGV();
		 * m을 통해 접근시에 => Movie의 메소드와 멤버변수에 접근가능
		 * 
		 * 근데 출력시에 
		 * m.변수를 하면? Movie(클래스)의 값을 가져옴
		 * m.메소드를 하면? CGV(생성자)의 값(=오버라이딩된)을 가져옴   
		 */
		
		/*
		 * Object클래스는 가장 큰 단위이기 때문에
		 * 배열을 만들때 Object를 이용하면
		 * Object[] obj={10,"aaa",10.5,'A',new Movie()};
		 * 이런식으로 데이터형이 섞여 들어갈수도 있다
		 */
		
		Object o=new CGV();
		//CGV cc=o;//Object가 더 큼으로 오류남
		CGV cc=(CGV)o;//큰데이터를 작은데이터형을 받아야하기에 (객체형변환)해줘야함
		//클래스 객체를 리턴하는 메소드가 존재할때
		//이럴경우 항상 Object로 리턴해줌 (일단가장큰단위니까)
		
	}

}

