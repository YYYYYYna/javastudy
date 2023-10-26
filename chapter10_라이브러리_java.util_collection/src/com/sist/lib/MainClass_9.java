package com.sist.lib;

//스프링의 원리 실습
import java.util.*;
/*
interface I
{
	public void display();
}
class A implements I{
	
	@Override
	public void display() {
		System.out.println("A:display call...");
	}
	
}
class B implements I{
	
	@Override
	public void display() {
		System.out.println("B:display call...");
	}
	
}
class C implements I{
	
	@Override
	public void display() {
		System.out.println("C:display call...");
	}
	
}
class D implements I{
	
	@Override
	public void display() {
		System.out.println("D:display call...");
	}
	
}
class Container
{
	private Map<Stirng, I> map=new HashMap<String,I>();
	public Container() {
		map.put("a",new A());
		map.put("b",new B());
		map.put("c",new C());
		map.put("d",new D());
	}
	public I getBean(String key)
	{
		return map.get(key);
	}
}
public class MainClass_9 {

	public static void main(String[] args) {
		
		Container c=new Container();
		I i=c.getBean("a");
		i.display();
		
		//싱글턴의 원리 : a를 아무리 불러도? 메모리 주소가 같다
		System.out.println("i="+i);
		i=c.getBean("a");
		i.display();
		

	}

}*/
