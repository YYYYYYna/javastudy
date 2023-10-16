//이렇게 만들면 안됨!!!!!!!!!!!!!

package com.sist.main2;
import java.util.*;
public class MainClass {
	
	//지금 이 클래스가 I i=new A();의 형태임 (뒤에 하이클래스가 생성되는)
	//이런유형은 데이터형을 동일하게 만드는게 중요함(=상속의기본목적)
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("클래스 선택 : ");
		int select=scan.nextInt();
		
		//이렇게 I클래스로 하나로 모아서(=상속) 짧게 해결할수 있음
		I[] i= {null, new A(), new B(), new C(), new D(), new E()};
		i[select].execute();
		
		/*
		//이렇게 만들면 안됨!!!!!!!!!!!!!
		if(select==1)
		{
			A a=new A();
			a.execute();
		}
		if(select==2)
		{
			B b=new B();
			b.execute();
		}
		if(select==3)
		{
			C c=new C();
			c.execute();
		}
		if(select==4)
		{
			D d=new D();
			d.execute();
		}
		if(select==5)
		{
			E e=new E();
			e.execute();
		}*/
		
	}

}
