package com.sist.manager;

public class Student {

	//default (접근지정어) => 같은 패키지내에서는 접근 가능
	                  //=> 다른 패키지에서는 접근 불가능
	
	//이렇게 public을 하면 모든 패키지에서 접근 가능
	//public int hanbun;
	//단점 : 모든 데이터가 노출 => 
	
	//private는 다른패키지에선 접근불가능
	//private int hakbun;
	//protected도 다른패키지에선 접근불가능
	//protected int hakbun;
	public int hakbun;
	public String name;
	public int kor,eng,math;

}


