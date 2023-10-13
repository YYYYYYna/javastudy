package com.sist.main;
/*
 *      객체 대입 [얕은복사예시]
 *      => 메모리 통으로 전송하기 때문에 같은 메모리주소를 제어하게됨
 */
//클래스가 2개면 public 안됨!
class Human
{
	int age; //0
	String name; //null
}
public class MainClass3 {
	public static void main(String[] args) {
		//변수(멤버변수/정적변수/지역변수/매개변수) => 읽기/쓰기 정도만 가능
		
		 Human hong=new Human(); //hong(age,name)
                                 //접근시 hong.age / hong.name
         hong.age=20; //메모리에 저장하기 => setter
         hong.name="홍길동"; //쓰기 => setter
         System.out.println(hong.age);
         System.out.println(hong.name);
         
         
         //////[얕은복사예시]
         //hong => 변수
         Human shim=hong;
         //대입이 가능하다 ==> 메모리 주소를 대입 (=같은걸 제어하게됨)
         //따라서 shim과 hong은 같은 메모리 주소를 가지고 있음
         /*
          *  int a=10;
          *  int b=a; ==> 이경우엔 메모리의 값이 대입된거임
          */
         shim.age=30; //메모리에 저장하기 => setter
         shim.name="심 청"; //쓰기 => setter
         
         //같은 주소값을 공유하기 때문에 shim의 데이터가 새로 생긴게 아니라
         System.out.println(shim.age);
         System.out.println(shim.name);
         
         //hong의 데이터가 삭제되고 shim으로 대체됨
         System.out.println(hong.age);
         System.out.println(hong.name);
         
	}
	
}
