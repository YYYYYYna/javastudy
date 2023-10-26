package com.sist.lib;
//객체 중복 제거 ==> 그러나 객체값이 같으면 주소값도 같게하는경우는 극히 드물다 ==> 동명이인인경우가 있음
import java.util.*;
class Student{
	private String name;
	private int age;
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//오버라이드
	//지금 오버라이드 한 내용이 객체값이 같으면 메모리 주소값도 같도록 함
	@Override
	public int hashCode() {
		return (name+age).hashCode(); //이름하고 나이가 같으면 같은 해시코드 생성
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
			//객체와 객체값 비교해서 불린 리턴하도록
		}
		return false;
	}
	
	//생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class MainClass_5 {

	public static void main(String[] args) {
		
		//지금 오버라이드 한 내용이 객체값이 같으면 메모리 주소값도 같도록 함
		//원래는 new를 사용하면 메모리 값이 다른데 수정한거임
		Set<Student> set=new HashSet();
		Student s1=new Student("홍길동",25);
		Student s2=new Student("홍길동",25);
		
		/*
		if(s1.equals(s2))
		{
			System.out.println(s1+"=="+s2);
		}
		else
		{
			System.out.println(s1+"!="+s2);
		}
		*/
		
		//set을 통해 값을 저장했는데
		set.add(s1);
		set.add(s2);
		//set은 중복이면 저장안함
		//print했을때 값이 하나만 나온다=중복이다=메모리주소가같다
		System.out.println(set);
		
		//근데? s1값을 바꿈으로써 객체간의 값이 달라지니까
		s1.setName("심청이");
		s1.setAge(20);
		//다른객체로 생성이되서 메모리 주소가 이제 다르게 나옴
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
