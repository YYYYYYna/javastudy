package com.sist.main2;
//1.객체형변환 예시
//2.객체형변환과 Object 리턴값 없이 값할당

//상위클래스를 리턴할 경우 반드시 형변환을 해야함!! => 라이브러리에서 자주 쓰임
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		
		//1.객체형변환 예시
		List list=new ArrayList();
		list.add("홍길동");
		
		//String name=list.get(0); 
		//이러면 오류남
		//현재 list의 리턴형은 Object기 때문에
		//String은 더 작음으로 에러
		
		String name=(String)list.get(0); 
		//이렇게 객체 형변환을 시켜줘야 가능
		
		//2.객체형변환과 Object 리턴값 없이 값할당
		List<String> list11=new ArrayList<String>();
		list11.add("홍길동");
		//그러나? List뒤에 <데이터형>을 정해주면
		//Object로 자동할당을 하지 않음으로
		
		String name11=list11.get(0); 
		//이렇게 따로 객체형변환을 하지 않아도 가능
	
		

	}

}
