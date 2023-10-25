package com.sist.student;

import java.util.*;

public class StudentManager {
	
	private static ArrayList<Student> list=new ArrayList<Student>(); 
	
	//여러명 저장
	//초기화 => private니까 생성자사용
	public StudentManager() {
		list.add(new Student(1, "홍길동", 90, 90, 90));
		list.add(new Student(2, "심청이", 80, 80, 80));
		list.add(new Student(3, "춘향이", 70, 70, 70));
		list.add(new Student(4, "이순신", 60, 60, 60));
		list.add(new Student(5, "박문수", 50, 50, 50));
	}
	
	//기능1) 목록출력
	public ArrayList<Student> studentAllData()
	{
		return list;
	}
	
	//기능2) 상세보기
	public Student studentDetailData(int hakbun)
	{
		Student s=new Student();
		//해당 학번 검색하기
		for(Student std:list)
		{
			if(std.getHakbun()==hakbun)
			{
				s=std;
				break;
			}
		}
		return s;
	}
	
	//기능3-1) 새로운 학번 자동증가(=sequence) 메소드 ==> 중복없는 데이터 만든다
	public int hakbunMaxData()
	{
		int max=0;
		for(Student std:list)
		{
			if(max<std.getHakbun())
			{
				max=std.getHakbun();
			}
		}
		return max+1;
	}
	
	//기능3) 학생 추가 => add
	public void StudentInsert(Student std) 
	{//***추가수정할 매개변수가 많은경우 이렇게↑ 클래스로 전송하면됨
		list.add(std);
		System.out.println("학생 추가 완료!!");
	}
	
	//기능4) 학생 수정 => set(인덱스,데이터필요)
	public void studentUpdate(Student std)
	{
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==std.getHakbun())//학번의 위치값 확인
			{
				index=i;
				break;
			}
		}
		list.set(index, std);
		System.out.println("수정이 완료 되었습니다.");
	}
	
	//기능5) 학생 삭제 => remove(인덱스필요)
	public void StudentDelete(int hakbun) 
	{   //foreach사용안한이유는=> 삭제시 인덱스번호가 필요해서
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				list.remove(i);
				System.out.println(hakbun+"학번을 삭제했습니다.");
				break;
			}
		}
		
	}
	
	//기능6) 학생 찾기 => contains
	//***정보여러개넘기면 : Student
	//***정보한개넘기면 : ArrayList
	public ArrayList<Student> StudentFindData(String name)
	{
		ArrayList<Student> arr=new ArrayList<Student>();
		for(Student std:list)
		{
			if(std.getName().contains(name))
			{
				arr.add(std);
			}
		}
		return null;
	}
	

}
