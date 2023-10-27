package com.sist.io;
/*
 *     입출력을 할때 IO로 제어하면 속도가 느려짐
 *     =>IO를 이용해서 파일로 전송후 메모리로 제어함
 */
import java.util.*;
import java.io.*;

class Student
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}

//이걸 웹으로 변환하면? 데이터 한개씩 쪼개는 부분이 li이고 이 데이터를 웹으로 보내는 형식
class StudentManager
{
	private static ArrayList<Student> list=new ArrayList<Student>();
	
	static {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\java_data\\student.txt");
			// 1|홍길동|90|90|90|270|90.00 이렇게 데이터 저장할 예정임
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			//**해당줄은 맨 처음데이터가 없기 때문에 split가 오류날수 있음 그래서 try문에 저장함
			String[] stds=data.split("\n"); //한명=한줄씩 저장
			
			for(String s:stds)
			{
				//배열보다 StringTokenizer가 더 편함~~
				StringTokenizer st=new StringTokenizer(s,"|"); //한단어씩 저장
				
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(st.nextToken()));
				ss.setName(st.nextToken());
				ss.setKor(Integer.parseInt(st.nextToken()));
				ss.setEng(Integer.parseInt(st.nextToken()));
				ss.setMath(Integer.parseInt(st.nextToken()));
				ss.setTotal(Integer.parseInt(st.nextToken()));
				ss.setAvg(Double.parseDouble(st.nextToken()));
				
				list.add(ss); //리스트 초기화 완료
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}catch(Exception ex) {}
		}
	}//리스트 초기화 완료
	
	
	// [기능1] 전체목록 출력
	public ArrayList<Student> StudentAllData(){
		return list;
	}
	
	// [기능2] 학생한명 상세보기
	public Student StudentDetailData(int hakbun) {
		Student ss=new Student();
		for(Student s:list)
		{
			if(s.getHakbun()==hakbun)
			{
				ss=s;
				break;
			}
		}
		return ss;
	}
	
	// [기능3] 학생 한명 추가하기
	public void studentInsert(Student ss)
	{
		list.add(ss);
	}
	
	// [기능4] 학생 한명 수정하기
	public void studentUpdate(int hakbun,Student ss)
	{
		//컬렉션의 경우 인덱스 수정하면 학번=인덱스+1의 관계가 
		//성립되지 않을수 있기 때문에 i를 밖으로 뺌
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				break;
			}	
		}
		list.set(i, ss);
	}
	
	// [기능5] 학생 한명 삭제하기
	public void studentDelete(int hakbun)
	{
		//그니까 학번을 기준으로 삭제하면 안되고 인덱스를 기준으로 실행해야함
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				break;
			}//그래서 확인했을때 인덱스랑 내가찾는 학번이 일치하면?
		}
		list.remove(i);//삭제하시오~~
	}
	
	// 위에서 기능을 사용해서 데이터에 삭제/추가가 실행될경우
	// 파일에도 똑같이 변경이 되어야함으로 파일 수정 메소드도 만듬
	// =>파일은 중간삭제가 시간이 걸림으로 [분리->수정->새로저장] 방식을 사용할예정
	// [기능6-1] 수정한 데이터 새로 저장
	public void save() {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\java_data\\student.txt");
			String msg=" ";
			for(Student s:list)
			{
				msg+=s.getHakbun()+"|"
						+s.getName()+"|"
						+s.getKor()+"|"
						+s.getEng()+"|"
						+s.getMath()+"|"
						+s.getTotal()+"|"
						+s.getAvg()+"\r\n";
			}
			msg=msg.substring(0,msg.lastIndexOf("\r\n"));
			fw.write(msg);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
			}catch(Exception ex) {}
		}
	}
	// [기능6-2] 수정한 데이터 새로 저장
	public void getRead() {
		
	}
}
public class MainClass_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
