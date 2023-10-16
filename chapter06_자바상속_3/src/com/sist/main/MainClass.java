package com.sist.main;

//213page
//생성자중에 같은 클래스에 있는 또다른 생성자 호출 = this()
//상속에서 부모의 생성자 호출 = super()
//매개변수가 있는 생성자의 경우에는 상위생성자에서 먼저 호출이 이뤄지고 사용되어야함
class A
{
	private int a;
	/*
	//경우1)
	public A(int a)
	{
		this.a=a;
	}
	*/
	
	//경우2)
	public A()
	{
		
	}
}
class B extends A
{
	/*
	//경우1)
	public B(int a) //매개변수가 존재하고
	{
		super(a); //생성자가 매개변수를 호출하는 구조를 만들어야함
	}
	*/
	
	//경우2)
	public B()
	{
		//super(); 가 생략되어 있음
	}
}
public class MainClass {
	public static void main(String[] args) {
		
	}

}
