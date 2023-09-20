/*
 *   <<추석전까지 꼭 외워둬야하는 내용!>>
 *   변수 => 데이터형, 식별자형
 *       => 한개의 데이터를 저장하는 메모리 공간
 *          (저장된 영역은 변경해서 다시 저장이 가능)
 *       => 변수 기능 
 *          1. 읽기(값을 가지고 온다) 2. 쓰기(메모리에 저장/수정 가능)
 *       => 변수를 저장히기 위해서는 먼저 메모리 크기를 결정해야함
 *                                 --------- 
 *                                    | 기본형 : (ex. 데이터형)=이미 크기가 결정되어잇음)
 *                                    | 참조형 : 사용자가 정의함 (ex. 배열,클래스)
 *                                                               *x,y표  *클래스의 원리는 자처럼 기준으로 저장되서
 *                                                                       많은 데이터를 계산하는데 쓰이는거같음
 *       => 기본형 : 내가 저장하는 크기에 따라 맞는걸 써야함 (ex. 128byte는 long에 저장해야함 int최대크기 127)
 *                : 컴퓨터에서 인식하는 모든숫자는 int라는거 잊지말기 (만약 int범위를 벗어나면 L붙여줘야함)
 *          정수(byte(1),int(4),long(8))
 *              *100L은 long형의 데이터라는거 잊지말기
 *          실수(double(8),char(2))
 *              *double=15자리
 *              *char=0~65535
 *              *100f은 float형의 데이터라는거 잊지말기
 *          논리(boolean(1))
 *              *true/false만 저장이 가능
 *       -------------------------------------------------------------------------------------------------
 *       변수 활용 (프로그램 => 데이터 관리) 을 얼마나 잘하는지 여부가 실력의 차이
 *               (ex) react의 경우 state={}로 데이터를 명명 그러나 vue의 경우 data:{}로 명명)
 *       변수 활용 방법 => 연산자, 제어문 
 *                      (따라서 이 둘을 얼마나 잘 다루느냐가 실력여부차이)
 *                      ** 단항연산자 (++, --, !, (type))
 *                      ** 이항연산자 (* / % + -)(== != < > <= >=)(&& ||)(= += -=)
 *                      ** 삼항연산자 (조건식=값1?값2:) <-틀릴수도잇음함확인하셈
 *                      ** 자동형변환 / 강제형변환
 *                      ** +는문자열결합
 *       ----------------------------------------------------------------------------
 *       프로그램 흐름 제어시 필요한 문장을 선택하는 기준
 *          => 오류가 발생시 건너뛴다 => if
 *          => 반복수행 => for, while
 *          => 원하는 프로그램 수행 => for
 *          => 제어문 (각각의 제어문 형식 꼭 외워야함...)
 *             : 단일/선택/다중조건문
 *               *단일은 비교/부정/논리연산자만사용해서 t/f가림
 *             : 조건문
 *               *if-else문으로 t/f가림
 *               *다중if문(=다중조건문) 여러개의 조건중에 한개 수행이 가능
 *             : 선택문
 *               *switch문
 *             : 반복문
 *               *for문
 *               *while문
 *      ------------------------------------------------------------------------------
 *      2차 for => 등수 구하기, 빈도 구하기, 정렬(선택, 버블)...
 *      ------
 *      for(초기값;조건식;증가식) ===> 줄수(row)
 *      {
 *          for(초기값;조건식;증가식) ===> 실제출력
 *          {        ----- 설정 (수열=방정식) => 수와 수의 관계
 *                 반복수행문     ---------- 분석(넘파이,판다스)
 *                               MatPlotLib => 시각화
 *          }                    R => 자바에서 연동
 *          System.out.println(); //줄수바꾸는역할 꼭 잊지말고넣기
 *      }
 *      
 */

/*
 *     *
 *    **
 *   ***
 *  ****
 */
public class 제어문_반복문_최종정리 {
   public static void main(String[] args) {
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=4-i;j++)
		   {
			   System.out.print(' ');
			   
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print('*');
		   }
		   System.out.println();
	   }
	   System.out.println();
	   
	   
	   /*
	    *   ****
	    *    ***
	    *     **
	    *      *
	    *  
	    *     j     i     k
	    *    공백   줄수   별표
	    *     0     1     4
	    *     1     2     3
	    *     2     3     2
	    *     3     4     1
	    *    --------
	    *    i=j+1 => j=i-1
	    *          ---------
	    *          i+k=5 => k=5-i
	    */
	   for(int i=1;i<=4;i++)
	   {
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(' ');
			   
		   }
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print('*');
		   }
		   System.out.println();
	   }
   }
}
