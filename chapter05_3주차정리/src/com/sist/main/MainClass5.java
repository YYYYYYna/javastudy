package com.sist.main;
//캡슐화 예제
class Member
{
	//변수 은닉화 하기
	private int age; //초기값:0
	private String name; //초기값:null 현재는읽기/쓰기만 가능한 상태
	
	//아래 getter/setter를 이용한것을
	//"""캡슐화"""코딩이라고함!!
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		Member m=new Member();
		//getter setter가 없는 경우엔 private 기 때문에 값에 접근 불가능!
		
		//setter(메소드)를 이용해서 값에 접근함
		m.setAge(20); 
		m.setName("홍길동");
		////예를들어 은행에서 은행원이 "비밀번호를눌러주세요(=행동)=set000()" 요청하면 입력가능하게되는 원리와 같음
		
		//getter(메소드)를 이용해 값을 가져옴
		System.out.println(m.getAge()+m.getName());
	}

}
