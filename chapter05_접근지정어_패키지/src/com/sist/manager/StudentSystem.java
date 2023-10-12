package com.sist.manager;
//같은 패키지상에 있는 경우 => default/public/protected
//import를 사용하지 않는다.

import java.util.*;
/*
 *     //메소드 => 1)멤버메소드, 2)static메소드, 3)생성자
 *	   //위를 만들때는 접근지정어가 반드시 "public"이어야 가져다 쓸수 있음
 *	   //접근성을 높이기 위해 변수 빼고는 대부분 public을 사용함
 *     ----------------------------------------------------
 *                      ==>상속은 속도가 느려져서 웹에서는 잘 사용안함
 *     캡슐화 / 오버라이딩 / 상속 / "포함"
 *     ----   ------          --- 밑줄부분중요함
 *                       | 상속이 없는 POJO방식의 클래스 사용하기도함
 *     ----------------------------------------------------
 *     [코딩을 하며 가장 많이 신경써야하는 순위]
 *     1) 결합상 : 결합성이 높을수록 사소한 변경에 영향을 많이받음 (메소드명바꾸면다른클래스에서안먹힌다던지)
 *     2) 가독성
 *     3) 응집성
 *     4) 최적화(퍼포먼스)
 *     
 */
public class StudentSystem {
	
	public Student[] Students=new Student[3];
	
	
	//값 입력
	//근데 문제는 해당 부분은 MainClass에서 접근해야하는데 이렇게 만들면 접근 못할수도 있음
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<Students.length;i++)
		{
			Students[i]=new Student();
					
			System.out.print("학번 입력 : ");
			Students[i].hakbun=scan.nextInt(); //public 메소드
			
			System.out.print("이름 입력 : ");
			Students[i].name=scan.next();
			
			System.out.print("국어점수 입력 : ");
			Students[i].kor=scan.nextInt();
			
			System.out.print("영어점수 입력 : ");
			Students[i].eng=scan.nextInt();
			
			System.out.print("수학점수 입력 : ");
			Students[i].math=scan.nextInt();
		}
		
	}

}
