package com.sist.main2;
/*
 *      변수,메소드 오버라이딩 => 덮어쓴다!!! 
 *      
 *      [오버라이딩을 가능하게 하는 조건]
 *      1) 메소드명이 동일
 *      2) 상속
 *      3) 매개변수가 동일
 *      4) 리턴형이 동일
 *      5) "접근지정어"에 대하여 "축소"는 불가능, "확장"만 가능
 *         : private < default < protected < public 순의 크기에서
 *           default에서 public 이런식으로 확대는 가능
 *           
 *      
 *     **********************
 *     Super s2=new Sub(); 일때
 *     변수 : Super가 가지고 있는 변수 제어됨
 *     메소드 : Sub가 가지고 있는 메소드 제어됨  ==> 동적바인딩 : 생성자에 따라서 메소드 주소값이 변경됨 
 *                                                 : 변수는 변경이 없다!
 *     
 *     
 */
class Super
{
	int number=10;
	void display()
	{
		System.out.println("Super:display Call...");
	}
}
class Sub extends Super //Super클래스를 확장해서 새로운 클래스를 만든다
{
	int number=20;
	void display()
	{
		System.out.println("Sub:display Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		/*
		//Super s2=new Sub(); 일때 Super의 변수를 출력
		//[멤버변수는 앞의 선언된 클래스값에 영향을 받음]
		
		Super su=new Super();
		System.out.println("Super.number : "+su.number);
		
		Sub sub=new Sub();
		System.out.println("Sub.number : "+sub.number);
		
		//앞에 선언된 클래스명에서 값을 찾아옴
		Super su1=new Sub();
		System.out.println("Super.number : "+su1.number);
		//따라서 해당 값은 10이 나옴
		
		//Super생성 => Super에서 나온 변수
		 */
		
		
        //Super s2=new Sub(); 일때 Sub의 메소드를 출력
        //[메소드는 뒤의 생성자타입에 영향을 받음]
		
		// 총 3가지 종류가 존재 => 1.Super / 2.Sub / 3.Sub->Super
		//1.Super
		Super s1=new Super();
		s1.display();
		//2.Sub
		Sub sub=new Sub();
		sub.display();
		//3.Sub->Super
		Super s2=new Sub();
		s2.display();
		//sub에도 super void값을 상속받아서 메소드 출력 가능
		//그러나 상속받은 값을 변경할 수 있음 => 오버라이딩
		

	}

}
