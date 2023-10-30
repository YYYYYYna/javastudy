package com.sist.io;
import java.io.*;
//객체단위 저장 => 객체 단위로 읽기 => ObjectInputStream
//ObjectOutputStream
/*
 *    Sawon s=new Sawon(...);
 *    s ==> -------------------
 *          -------sabun-------
 *          -------name--------
 *          -------dept--------
 *          --------job--------
 *          -------------------
 *          ==> (메모리)병렬화
 *          
 *    객체단위로 저장 ==> (메모리)직렬화 (=implements Serializable)
 *     ---------------------------
 *      sabun  name  deft  job...
 *     ---------------------------
 */
import java.util.*;
class Sawon implements Serializable{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	//입력용 생성자
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	//초기화 생성자(default)
	public Sawon() {
		
	}
	
}
public class MainClass_6 {

	public static void main(String[] args) {
		try {
			//메모리에 저장 => ArrayList이용
			ArrayList<Sawon> list=
					new ArrayList<Sawon>();
			list.add(new Sawon(1,"홍길동","개발부","대리",3800));
			list.add(new Sawon(2,"박문수","영업부","사원",3300));
			list.add(new Sawon(3,"이순신","총무부","과장",4800));
			list.add(new Sawon(4,"강감찬","개발부","사원",3300));
			list.add(new Sawon(5,"을지문덕","기획부","대리",3800));
			
			//파일에 저장(아까처럼 한줄씩 저장이 아닌 ArrayList를 통으로 저장)
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\emp.txt");//파일저장은 FileOutput
			ObjectOutputStream oos=
					new ObjectOutputStream(fos);//Object단위로 저장하면 주소값이 저장되어서 깨진것처럼 보임 아마 저번주차에 캡슐화보다 다른 보안?이 있다던데 그거인듯?
			oos.writeObject(list);
			oos.close();
			fos.close();
			System.out.println("객체 단위 저장 완료");
			
			//아마 인코딩?된 상태라 다 깨져있는거 같음...
			//뒤에 MainClass_7에서 파읽읽는 실습 이어서함
		}catch(Exception ex) {}

	}

}
