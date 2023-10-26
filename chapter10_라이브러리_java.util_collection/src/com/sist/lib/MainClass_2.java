package com.sist.lib;
/*
 *   [List계열의 클래스]
 *    ==> 순서가 있다 (인덱스)
 *    ==> 데이터가 중복이 된다
 *      
 *    ArrayList
 *     = 단방향 포인터(인덱스)를 가지고 있다 : 엑셀처럼 1 2 3 항목에 데이터가 있음
 *        => 조회하기 편리하다(성능이 좋다)
 *     = 검색이 빠르다, 데이터 추가시에 뒤부터 추가하면 속도가 빠르다
 *     = 단점 : 수정, 중간에 추가, 삭제가 느려지는 단점
 *       ----------------------------------때문에 웹에서는 사용하지 않음
 *       => 수정, 삭제가 없는 프로그램에서 주로 사용
 *          -------------------데이터베이스에서 주로 만들어진다
 *          => 데이터를 모아서 전송(브라우저, 윈도우)
 *          
 *    LinkedList
 *     = 양방향 포인터
 *     = 수정, 삭제, 추가가 많은 경우 주로 사용
 *       => 윈도우(애플리케이션)
 *     = 단점 : 검색속도가 늦다
 *     
 *    Vector
 *     = 단방향 (ArrayList와 동일)
 *     = 동기 => 채팅, 서버연결, 사용자 정보를 저장
 *       ---비동기
 */
import java.util.*;

public class MainClass_2 {

	public static void main(String[] args) {
		
		//Vector만 가지고 있는 메소드 addElement(): 현재는 add로 통일
		//                      getElementAt() : 현재는 get으로 통일
		
		//ArrayList와 Vector의 기본 메소드 차이는 없다
		//다른 메소드를 외우기보다는 Vector를 속도가 느리면 ArrayList로 변환하기 쉽게
		//List<String> list=new ArrayList<String>();
		//List<String> list=new Vector<String>();
		//이런식으로 List인터페이스로 받아서 구현하는것이 포인트임
		
		//Vector이용
		Vector<Integer> vec=new Vector<Integer>();
		
		//데이터 추가 ==> add(Object) 현재는 add(Integer)
		vec.add(10); //index=0
		vec.add(20); //index=1
		vec.add(30); //index=2
		vec.add(40); //index=3
		vec.add(50); //index=4
		vec.addElement(60); //이건 Vector만 가지고 있는 메소드 : 현재는 add로 통일
		//Wrapper라는 클래스는 기본형과 동일하게 사용이 된다
		//int i=10 Integer i=10 => 오토박싱
		
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); //클래스의 기본값을 받음 => 언박싱
			System.out.println(i+"=>"+k);
		}
		
		//삭제 => remove(삭제할index) => 삭제시 자동으로 인덱스 밀림
		System.out.println("====remove====");
		vec.remove(3);
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); //클래스의 기본값을 받음 => 언박싱
			System.out.println(i+"=>"+k);
		}
		
		//수정 => set(바꿀index,바꿀데이터)
		System.out.println("====set====");
		vec.set(2,1000);
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); //클래스의 기본값을 받음 => 언박싱
			System.out.println(i+"=>"+k);
		}
				
		//저장갯수확인 => size()
		System.out.println("====size====");
		System.out.println("접속자 수 : "+vec.size());
				
		//데이터비우기 => clear()
		System.out.println("====clear====");
		vec.clear();
		System.out.println("전체삭제후 접속자 수 : "+vec.size());
				
		//저장여부확인 => isEmpty() : true면 비워져있다, false는 채워져있다
		System.out.println("====isEmpty====");
		if(vec.isEmpty())
		{
			System.out.println("접속자가 없습니다.");
		}
		else
		{
			System.out.println("접속자가 있습니다.");
		}

	}

}
