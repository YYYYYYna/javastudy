/*
 *        배열
 *        --- 묶어서 관리
 *            1) 변수 ==> 같은 유형의 변수가 3개 이상 => 묶어서 처리
 *                                                -----
 *                                                변수명을 한개로 처리
 *                   ==> 같은 데이터형 ==> 배열
 *                                      
 *                   ==> 다른 데이터형 ==> 클래스
 *                                      → ~VO(Spring) , ~DTO(MyBatis) , ~Bean(JSP)
 *                                      
 *            2) 명령문 : 관련된 명령끼리 묶어서 구조적 프로그램 → 메소드
 *                       메소드 ==> 단락을 나눠줌       
 *                       
 *       [기본문법 공부하는 순서]
 *       데이터 묶기 (변수)
 *       명령문 묶기 (명령문) => 소스코딩 ;
 *                   |기능별로나눔
 *                  입력 --
 *                  처리  |--관련된 메소드를 만들어놔서 실습하며 가져다 쓸수있도록 함
 *                  출력 --
 *                  
 *       ex. 사람이 버튼을 눌러서 자판기에서 음료를 뽑는다 라고 하면 
 *           사람,자판기가 변수 음료가 나오는 과정이 메소드
 *       ex. 사용자 혹은 관리자를 중심으로 객체지향 프로그램을 짜는데
 *           유즈케이스의 회원가입, 상품검색등이 다 메소드
 *       
 */

//달력만들기
package chapter04_배열;

public class 배열_생성 {
	public static void print(int dan) { //배열_생성.print(); 이란 메소드 생성
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+i*dan);//=명령문
		}
	}

	public static void main(String[] args) {
		

	}

}
