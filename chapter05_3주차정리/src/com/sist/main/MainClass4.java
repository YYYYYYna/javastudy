//160page의 값복사와 주소복사의 예제로 나옴
//161page의 그림을 잘 기억해야함
//165page의 그림도 중요함
//메소드(swap)을 이용해서 값을 변경하거나 아님 직접값을대입(A a=b)해서 변경하거나 방법이 2개가 있음
//=>같은 주소가 넘어가면 메소드 안에서도 제어가 가능하다는점!

package com.sist.main;
class Sawon 
{
	//구분자?
	int sabun;
	//변수일듯
	String name;
}
public class MainClass4 {
	static void change(Sawon sa)
	{
		sa.sabun=2;
		sa.name="이순신";
		//원본 변경
		//기본형 => 복사본 => 값만 전송할때
	}
	public static void main(String[] args) {
		Sawon s=new Sawon();
		s.sabun=1;
		s.name="박문수";
		System.out.println(s.sabun+s.name);
		
		change(s);//Sawon sa=s라는뜻
		System.out.println(s.sabun+s.name);
		
		//void로 생성된 메모리주소(=change())에 new로 생성된 s값을 집어넣은거임
		//=> Call By Reference 방식
		    //클래스에 데이터베이스에 있는 값을 매개변수를 이용해서 채워 온다
		    //배열이나 클래스는 모두 적용가능 (예외:String은 일반변수 취급을 받아서 안됨)

	}

}
