package com.sist.student;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//학생관리 클래스 생성 : else if문마다 객체생성할수 없으니까
		StudentManager sm=new StudentManager();
		
		while(true)
		{
			System.out.println("=========메뉴=========");
			System.out.println("1. 학생 목록");
			System.out.println("2. 상세 보기");
			System.out.println("3. 학생 추가하기");
			System.out.println("4. 학생 수정하기");
			System.out.println("5. 학생 삭제하기");
			System.out.println("6. 학생 찾기");
			System.out.println("7. 프로그램 종료");
			System.out.println("====================");
			System.out.print("메뉴 선택 : ");
			int menu=scan.nextInt();
			
			if(menu==7)
			{
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			else if(menu==1)
			{
				//학생정보 받아서
				ArrayList<Student> list=sm.studentAllData();
				//학생정보 출력하기
				for(Student s:list)
				{
					System.out.println(s.getHakbun()+"."+s.getName());
				}
			}
			//리턴이랑 매개변수를 꼭 기억하기
			//***정보여러개넘기면 : Student
			else if(menu==2)
			{
			    System.out.print("상세보기 할 학번 선택 : ");
			    int hakbunDetail=scan.nextInt();
			    Student std=sm.studentDetailData(hakbunDetail);//이부분 좀더 설명듣고 싶음
			    System.out.println("선택한 학번 : "+std.getHakbun());
			    System.out.println("선택한 학번의 이름 : "+std.getName());
			    System.out.println("선택한 학번의 국어점수 : "+std.getKor());
			    System.out.println("선택한 학번의 영어점수 : "+std.getEng());
			    System.out.println("선택한 학번의 수학점수 : "+std.getMath());
			    System.out.println("선택한 학번의 총점 : "+(std.getMath()+std.getEng()+std.getKor()));
			    System.out.printf("선택한 학번의 평균 : %.2f\n",(std.getMath()+std.getEng()+std.getKor())/3.0);
			}
			//리턴이랑 매개변수를 꼭 기억하기
			//***정보한개넘기면 : ArrayList
			else if(menu==6)
			{
				System.out.println("검색할 이름 선택 : ");
				String hakbunSearch=scan.next();
				ArrayList<Student> list=sm.StudentFindData(hakbunSearch);
				for(Student std:list)
				{
					System.out.println(std.getHakbun()+"."+std.getName());
				}
			}
			else if(menu==5)
			{
				 System.out.print("삭제 할 학번 선택 : ");
				 int hakbunDelete=scan.nextInt();
				 sm.StudentDelete(hakbunDelete);//void니까 리턴값(객체생성)없음
			}
			else if(menu==3)
			{
				 System.out.print("새로운 학생 이름 입력 : ");
				 String newName=scan.next();
				 System.out.print("새로운 학생 국어 입력 : ");
				 int newKor=scan.nextInt();
				 System.out.print("새로운 학생 영어 입력 : ");
				 int newEng=scan.nextInt();
				 System.out.print("새로운 학생 수학 입력 : ");
				 int newMath=scan.nextInt();
				 
				 Student std=new Student(sm.hakbunMaxData(),newName,newKor,newEng,newMath);
				 sm.StudentInsert(std);
			}
			else if(menu==4)
			{
				System.out.print("수정할 학번 입력 : ");
				int hakbunChange=scan.nextInt();
				System.out.print("수정할 학생 이름 입력 : ");
				String newName=scan.next();
				System.out.print("수정할 학생 국어 입력 : ");
				int newKor=scan.nextInt();
				System.out.print("수정할 학생 영어 입력 : ");
				int newEng=scan.nextInt();
			    System.out.print("수정할 학생 수학 입력 : ");
				int newMath=scan.nextInt();
				 
				Student std=new Student(hakbunChange,newName,newKor,newEng,newMath);
				sm.StudentInsert(std);
			}
		}

	}

}
