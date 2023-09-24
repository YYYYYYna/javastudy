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
 *       
 *       배열 : 같은 데이터형을 여러개 묶어서 관리
 *       1) 장점
 *          여러개의 변수명 => "한개로 합쳐서" 사용
 *          데이터마다 구분하기위해 => 인덱스를 사용 (순차적임)=> 반복문쓰기편함
 *       2) 단점
 *          "고정적이다." => 메모리 할당 (10)
 *          크기 변경이 불가능 => 큰 배열을 생성
 *          같은 데이터형만 모아서 저장
 *       ----------------------------------------------------------
 *       1. 배열선언 
 *          type[] 배열명; →자바(권장)
 *          type 베열명; →C
 *       2. 초기화
 *          ① int[] arr={1,2,3,4,5} => 5
 *                  ↓
 *             변수식별자와동일
 *          ② int[] arr=new int[5] => int(5를 모아서 관리)
 *                     ------------=> 자동초기화 0이 다섯개들어감
 *            int[] arr;
 *                   <스텍>        <힙>
 *                  arr      |
 *                -------    |
 *                           |
 *                -------    |             104       108       112       116
 *            arr=new int[5] |           arr+1*4   arr+2*4   arr+3*4   arr+4*4
 *                  arr      |    ----------------------------------------------------
 *                -------    |         0    ↑    0    ↑    0    ↑    0    ↑    0
 *                  100      |    ↓---------------------------------------------------
 *                -------    |   arr(100)=arr+0*4 //100은임의배정 
 *                                     |
 *                                     ↓
 *                                   arr[0]    arr[1]          ...           arr[4]
 *                                   ----------------------------------------------=>일반변수와동일
 *       3. 값 변경
 *          => 첫번째 값 변경                               => ex)
 *             arr[0]=100이라하면 위에 값도 100으로 변함       -----------------------------------------------
 *             arr[4]=200 //인덱스값은 변하지 않고 내용이 변함     100    ↑    0    ↑    0    ↑    0    ↑   200
 *                                                       -----------------------------------------------
 *                                                        arr[0]    arr[1]          ...           arr[4]
 *           4. 출력
 *          int[] arr      //여기데이터형과 
 *          for(int a:arr) //여기데이터형type이 동일해야함
 *          {
 *               
 *          }
 *        
 *       
 */

//달력만들기


import java.util.Scanner;

public class 배열_생성0 {
	public static void print(int dan) { //배열_생성.print(); 이란 메소드 생성
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+i*dan);//=명령문
		}
	}
                           //type[] 배열명
	public static void main(String[] args) {
		//3학생의 과목별 점수의 총점과 평균
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 학생의 국어점수 : ");
		kor1=scan.nextInt();
		System.out.println("첫번째 학생의 영어점수 : ");
		eng1=scan.nextInt();
		System.out.println("첫번째 학생의 수학점수 : ");
		math1=scan.nextInt();
		
		System.out.println("두번째 학생의 국어점수 : ");
		kor2=scan.nextInt();
		System.out.println("두번째 학생의 영어점수 : ");
		eng2=scan.nextInt();
		System.out.println("두번째 학생의 수학점수 : ");
		math2=scan.nextInt();
		
		System.out.println("세번째 학생의 국어점수 : ");
		kor3=scan.nextInt();
		System.out.println("세번째 학생의 영어점수 : ");
		eng3=scan.nextInt();
		System.out.println("세번째 학생의 수학점수 : ");
		math3=scan.nextInt();
		//이 긴 식의 반복문을 못돌린 이유는 변수명이 다 다르기 때문에 못돌림
		//만약 배열이 가능했다면 kor1~kor3까지 같은 배열로 묶어서 더 간결하게 가능
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		             //데이터값이 3칸을 차지하는데 -5d는 뒤(오른쪽에)에 2칸공백을 포함한 5칸을 띄우겠단말
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor1,eng1,math1,total1,total1/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor2,eng2,math2,total2,total2/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor3,eng3,math3,total3,total3/3.0);
		

	}

}
