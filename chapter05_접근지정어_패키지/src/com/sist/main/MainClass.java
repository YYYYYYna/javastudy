package com.sist.main; //이부분이 유저가 보는 부분 = JSP
//패키지가 다르면 => 반드시 클래스 사용시에 import 사용해야함
import com.sist.manager.*; //이렇게 하면 Student , StudentSystem (public이라서) 둘다 사용 가능

public class MainClass {

	public static void main(String[] args) {
		//Student std=new Student();
		//같은 패키지가 아니기 때문에 std.를 사용해도 그 안에 데이터를 못불러옴
		
		StudentSystem ss=new StudentSystem();
		ss.input();
		           //StudentSystem에서 배열을 public으로 줘서 접근가능
		for(Student s:ss.Students)
		{
			System.out.println(s.hakbun);
			System.out.println(s.name);
			System.out.println(s.kor);
			System.out.println(s.eng);
			System.out.println(s.math);
			System.out.println("===========");
		}
		

	}

}
