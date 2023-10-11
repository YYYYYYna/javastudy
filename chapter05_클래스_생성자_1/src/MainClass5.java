/*
 *   예를들어 오라클 실습을 할때
 *   
 *   오라클 한대를 가지고 조원 5명이 프로젝트를 진행하면
 *   한명이 변경한 사항도 전체에 적용됨 => static
 *   
 *   조원한명당 오라클 한대씩을 가지고 진행함
 *   그럼 한명의 변경사항에 전체적용은 안됨 => 인스턴스
 */

import java.util.*;

//사용자 정의 데이터형
class Join
{
	//구분자
	int mno;
	
	//변수
	String name;
	String address;
	String phone;
	
	//초기값
	Join(int mno, String name, String address, String phone){
		this.mno=mno;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
}

class JoinSystem
{
	static Join[] member=new Join[5];
	//=> 저장값이 축적됨
	
	//Join[] member=new Join[5]; 
	//=> 객체 생성시마다 메모리 따로 생성
	
}
public class MainClass5 {

	public static void main(String[] args) {
		
		JoinSystem js1=new JoinSystem(); //=> static이 없는 경우는 해당 부분 메모리가 따로생김
		Join j1=new Join(1, "홍길동", "서울", "010-1111-1111");
		js1.member[0]=j1;
		//{j,null,null,null,null}로 이뤄져 있음
		
		for(int i=0;i<js1.member.length;i++)
		{
			if(js1.member[i]!=null)
			{
				System.out.println(js1.member[i].name);
			}
		}
		
		System.out.println("------");
		
		JoinSystem js2=new JoinSystem(); //=> static이 없는 경우는 해당 부분 메모리가 따로생김
		Join j2=new Join(2, "심청", "경기", "010-2222-2222");
		js2.member[1]=j2;
		for(int i=0;i<js2.member.length;i++)
		{
			if(js2.member[i]!=null)
			{
				System.out.println(js2.member[i].name);
			}
		}

	}

}
