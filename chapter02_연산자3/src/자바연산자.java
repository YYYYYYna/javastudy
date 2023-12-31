/*
 *       변수 : 저장공간
 *       ---
 *       자바 저장공간을 설정(자료형, 데이터형)
 *       ----------------
 *       정수 : byte (8bit) => 0,1을 8개 채워서 숫자한개 저장
 *                  -128~127
 *             int (32bit) => 21억 4천 ~ 21억 4천
 *             --------------------------------default (컴퓨터에서 모든 숫자는 int를 인식)
 *             long (64bit) => 금융권, 빅데이터
 *       실수 : double (64bit) => 소수점 15자리 이상
 *       문자 : char (16bit) => 0~65535=문자번호(숫자로 저장되나 음수는 없음)
 *                             ex) 'A' (X) 65 (O)
 *       논리 : boolean (8bit) => true, false => 0,1
 *       ---------------------------------------------------------------
 *         정수 3개 저장해야한다면
 *         => int a,b,c; (변수3개를만들어야함)
 *         
 *         실수 2개 저장해야한다면
 *         => double d1,d2;
 *         
 *         문자 1개 저장
 *         => char c;
 *         
 *         boolean
 *         => boolean bb;
 *       
 *       프로그램을 작성하는 과정
 *       -----> 데이터 저장 -----> 사용자 요청에 맞게 가공 -----> 화면출력
 *       -----> 프로그램(반복)             |
 *                                    연산자
 *       자바에서 제공하는 연산자
 *       ------------------
 *       단항연산자 : 
 *           = 증감연산자 (++,--) : 한개 증가, 한개 감소
 *             ++a : a값을 증가 시킨후에 다른연산을 수행
 *             a++ : 먼저 다른연산을 수행후에 나중에 1증가
 *             --a : a값을 감소 시킨후에 다른연산을 수행
 *             a-- : 먼저 다른연산을 수행후에 나중에 1감소 
 *           = 부정연산자 (!) : boolean에서만 사용이 가능
 *                            => true -> false
 *                               false -> true
 *                            => boolean bCheck=false;
 *                               bCheck=!bCheck ==> bCheck=true
 *                               예약가능한 날 => !(예약가능한 날)
 *                            => hover효과를 boolean으로 줄수 있음
 *                               mouseon ==> !mouseon
 *           = 형변환연산자 (type) => 강제형변환
 *             --------- 객체지향 형변환 (클래스)
 *             숫자관련만 (정수, 실수, 문자)
 *             -----------------------
 *              - UpCasting : 데이터형을 크게 만든다.
 *                  int => double
 *                  char => int
 *                  --------------=자동형변환
 *                  int a='A'
 *                        ---int로 변경되어 65로 자동변경됨
 *                  double d=100
 *                           ---double로 변경되어 100.0으로 자동변경됨   
 *                              
 *               - DownCasting : 데이터형을 작게 만든다.
 *                  char c=(char)65;  c='A'
 *                  int i=(int)100.0  i=100
 *                  
 *             데이터형의크기 : byte < char < int < long < float < double
 *                          강제형변환<------------------------->자동형변환
 *                                                            = 연산 처리시 많이 변경 (자바자체)
 *                                                            = 데이터형이 같은것 끼리 연산이 된다 
 *                                                            = (자세한 내용은 사진찍어놓은것 참고하기)
 *                                                            주의점 : char+char/char+byte/byte+byte = int로 변경
 *                                                                    =int 이하 데이터형은 연산시 int로 변경
 *       이항연산자 : 
 *           = 산술연산자 (*,/,%,+,-)우선순위대로정렬함)
 *             + : 두개의 값을 더함, 문자를 합쳐줌
 *                 "7"+"7"="77"
 *                 *** 7+"7"+7-7; //오류
 *                     7+"7"+(7-7); //"77"
 *                     7+"7"+(7/7); //"771"
 *             / : 정수/정수=정수
 *                 정수/실수=실수
 *                 정수/(double)정수=실수
 *                 *** 0으로나눌수없음 실행시 오류발생
 *             % : 왼쪽부호
 *                 => 윤년 구하기, 숫자 자르기..., 배수구하기
 *                 
 *           = 비교연산자 (==,!=,>,<,<=,>=) 
 *             : 결과값은 true/false로 나옴
 *             : 문자, 정수, 실수
 *             : 자바는 Unicode(한글자당 2byte)를 사용 (모든 국가의 언어 사용이 가능)
 *               ''=문자 ""=문자열 둘이다름
 *             == 같다
 *             != 같지않다
 *             < 작다(왼쪽 기준)
 *             > 크다(왼쪽 기준)
 *             <= 작거나 같다(왼쪽 기준)
 *             >= 크거나 같다(왼쪽 기준)
 *             
 *           = 논리연산자 (&&,||)
 *             && : 직렬연산자 (조건 2개가 true일 경우에만 true)
 *                  => 주로사용처 : 기간, 범위가 포함된 상태
 *             || : 병렬연산자 (조건 2개중에 한개 이상 true일 경우 true)
 *                  => 주로사용처 : 잘못된 입력
 *             
 *           = 대입연산자 (=,+=,-=)
 *             = 일반대입
 *             += 증가시킴 ===> a+=3 //3씩증가한다는뜻
 *             -= 감소시킴 ===> a-=10 //10씩감소한다는뜻
 *        
 *       삼항연산자 : 조건연산자 ?:
 *       (조건)?값1:값2;
 *       
 */
//  산술연산자(연산자가 필요한 문제가 나오면 제일먼저 변수가 몇개 필요한지 파악해야함)
//  정수 3개 입력을 받아서 총점, 평균, 학점

import java.util.Scanner; //Scanner 클래스를 가져온다
// c => include
// c# => using
// 자바스크립트 => import
public class 자바연산자 {
	public static void main(String[] args) {
		int kor,eng,math;
		int total;
		double avg;
		//================== 여기까지는 선언 (메모리저장하는공간만만듬)
		// 메모리 공간에 값을 첨부 => 변수의 초기화
		Scanner scan=new Scanner(System.in);
		//                      -----------키보드입력
		System.out.println("국어,영어,수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		// 활용할 수 있다.
		// new => 메모리에 저장 (클래스)
		// 연산처리
		total=kor+eng+math;
		avg=total/3.0;
		// 결과 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println();
		System.out.print(avg>=90 && avg<100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<80?"C학점":"");
		System.out.print(avg>=90 && avg<100?"D학점":"");
		System.out.print(avg<60?"F학점":"");

	}

}
