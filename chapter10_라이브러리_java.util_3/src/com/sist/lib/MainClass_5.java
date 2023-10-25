package com.sist.lib;
// => 메소드(340page)
//    => 검색 => contains등등을 이용하는 과정...

import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		//=정수만 메모리에 저장한다는뜻
		
		/*
		 *   Wrapper 클래스 => 기본형을 클래스형으로 만들어서 
		 *                   1)기능을 부여함
		 *                   2)제네릭을 사용
		 *        => 장점 : Wrapper클래스와 기본형이 호환가능
		 *                Integer => 10,20,30...
		 *                Integer i=10; 인경우에도 get할때 int로 받기 가능
		 *                =언박싱/오토박싱의 호환성
		 */
		
		//추가 => add()
		
		//list.add(Integer.valueOf(10));
		//앞에서 제네릭으로 Integer로 명명해서 굳이 위처럼 쓸 필요없음
		
		list.add(10); //index=0
		list.add(20); //index=1
		list.add(30); //index=2
		list.add(40); //index=3
		list.add(50); //index=4 순서대로 들어감
		//만약에 list.add(2,5);로 설정하면 index=2에 5가 들어가고 남은 값은 뒤로 한칸씩 밀림
		//또한 remove(2);를 하면 해당칸이 삭제되고 뒤의 값이 앞으로 한칸씩 밀림
		//기억할사항!! 인덱스 범위벗어나면 오류남
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);//제네릭 덕분에 형변환 필요없어짐~~
			System.out.println("index="+i+":"+val);
		}
		
		//[인덱스 추가예시]
		//만약에 list.add(2,5);로 설정하면 index=2에 5가 들어가고 남은 값은 뒤로 한칸씩 밀림
		System.out.println("====추가====");
		list.add(3,6); //그러나 속도저하문제로 가급적 사용 지양. 순차적이지 않으면 속도가 저하됨
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);//제네릭 덕분에 형변환 필요없어짐~~
			System.out.println("index="+i+":"+val);
		}
		
		//[인덱스 삭제예시]
		//또한 remove(2);를 하면 해당칸이 삭제되고 뒤의 값이 앞으로 한칸씩 밀림
		System.out.println("====삭제====");
		list.remove(1);
		
		for(int i=0;i<list.size();i++)//여기범위에 <=하면 오류남
		{
			int val=list.get(i);//제네릭 덕분에 형변환 필요없어짐~~
			System.out.println("index="+i+":"+val);
		}
		
		//인덱스는 0부터 시작함 => size():갯수 => 범위에 = 들어가면 안됨!
		//인덱스를 초과하면 오류 발생
		//=>그래서 for-each구문을 사용하면 인덱스신경쓸 필요없음
		System.out.println("===foreach===");
		for(int i:list)
		{
			System.out.println(i);
		}
		
		//데이터 저장갯수 세기
		System.out.println("=============");
		System.out.println("데이터 저장 갯수 : "+list.size());
		
		//데이터 존재여부 확인 (장바구니,찜하기등에 사용됨)
		System.out.println("=============");
		System.out.println("데이터가 없나요? : "+list.isEmpty());
		//장바구니예시
		if(list.isEmpty()==false)
		{
			System.out.println("장바구니에 "+list.size()+"개 있습니다.");
		}
		else
		{
			System.out.println("장바구니가 비어있습니다.");
		}
		
		//데이터 모두 삭제
		list.clear();
		System.out.println("=============");
		System.out.println("데이터 저장 갯수 : "+list.size());
		
		//데이터 존재여부 확인 (장바구니,찜하기등에 사용됨)
		System.out.println("=============");
		System.out.println("데이터가 없나요? : "+list.isEmpty());
		//장바구니예시
		if(list.isEmpty()==false)
		{
			System.out.println("장바구니에 "+list.size()+"개 있습니다.");
		}
		else
		{
			System.out.println("장바구니가 비어있습니다.");
		}
		
	}

}
