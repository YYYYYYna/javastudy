package com.sist.lib;
import java.util.*;
public class MainClass_12 {
    //제네릭에서 매개변수 설정 유념하기
	public static void display1(ArrayList<Integer> list) 
	{
		for(int i:list)
		{
			System.out.println(i+" ");
		}
	}
	public static void display2(ArrayList<Double> list) 
	{
		for(double d:list)
		{
			System.out.println(d+" ");
		}
	}
	public static void display3(ArrayList<String> list) 
	{
		for(String s:list)
		{
			System.out.println(s+" ");
		}
	}
	public static void display4(ArrayList<?> list) 
	{
		//for(String s:list)//String이나 int는 오류남 매개변수가 지금 Object로 넘어와서
		for(Object s:list)//와일드카드도 데이터형은 Object형으로 받는다는걸 기억해야함
		{
			System.out.println(s+" ");
		}
	}
	
	public static void display5(ArrayList list) 
	{
		for(Object s:list)//String이나 int는 오류남 매개변수가 지금 Object로 넘어와서
		{
			System.out.println(s+" ");
		}
	}
	//ArrayList<String> list=new ArrayList<String>();
	//display5(list) => Object가 됨 왜냐면 메소드의 데이터형을 따라감
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		//display3(list);는 오류남 String형이라서
		display1(list);
		//display4, display5는 Object형이라 가능
		
		ArrayList<Double> list1=new ArrayList<Double>();
		//list.add(10);//오류남!! double형이니까
		list1.add(10.0);
		list1.add(20.0);
		list1.add(30.0);
		display2(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("10");
		list2.add("20");
		list2.add("30");
		display3(list2);
	}

}
