package com.sist.lib;

import java.util.*;
//제네릭스<> 실습
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	public Sawon(int sabun,String name, String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	public void print()
	{
		System.out.println("사번 : "+sabun);
		System.out.println("이름 : "+name);
		System.out.println("부서 : "+dept);
	}
}
public class MainClass_4 {

	public static void main(String[] args) {
		
		//데이터형이 섞여있으면 루프를 돌릴수 없기 때문에 제네릭스값이 있는것이 기본이다.
		//ArrayList<E> 이렇게!!
		/*
		ArrayList list=new ArrayList(); 
		//현상태는 Object로 받음
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("홍길동");
		list.add(4);
		list.add(5);
		
		for(int i=0;i<list.size();i++)
		{
			/*
			int val=(int)list.get(i);
			System.out.println(val); //오류남 왜냐면 "홍길동" String형이 섞여있기 때문
			*/
		/*
			Object obj=list.get(i);
			System.out.println(obj);//오류안남 Object는 다 받을수 있기 때문
		}
	*/
		//데이터를 저장할때는 같은데이터를 첨부하는것이 중요하다
		//**ArrayList는 폴더의 개념임
		//**Object는 온갖파일이 다 모여있는 다운로드 폴더같은 개념...
		//**ArrayList<00폴더> 이렇게 폴더를 나눠서 관리하는 개념임
		
		//Object대신 저장해야하는 데이터형을 설정 => 모든 매개변수,리턴형이 변경된다.
		//1.제네릭을 이용한 컬렉션은 가급적 제네릭을 사용 권장함
		//2.데이터 첨부시에 원하는 데이터만 첨부가 가능하다
		//3.분석이 쉬워진다
		//4.제네릭 명명시 다른 데이터형 추가첨부는 불가능
		//5.제네릭안에는 <클래스형>만 들어갈수 있음
		ArrayList<Sawon> list=new ArrayList<Sawon>(); 
		list.add(new Sawon(1, "홍길동1", "개발부"));
		list.add(new Sawon(2, "홍길동2", "영업부"));
		list.add(new Sawon(3, "홍길동3", "총무부"));
		
		for(int i=0;i<list.size();i++)
		{
			//Object obj=list.get(i);//Object가 Sawon보다 더 큰 클래스임으로 print메소드 이용불가!!
			Sawon obj=list.get(i); //B b=new B();의 형태임
			obj.print();
		}
		//Object가 Sawon보다 더 큰 클래스임으로 print메소드 이용불가!!
		//Object obj=list.get(i);
		//(Object의 변수와 메소드 + Sawon에 상속받아서 오버라이딩된 메소드)만 이용이 가능하기 때문
		//Sawon obj=list.get(i); => 오류남
		//list.get()부분은 ArrayList list=new ArrayList(); 현재 Object로 받기 때문
		
		

	}

}
