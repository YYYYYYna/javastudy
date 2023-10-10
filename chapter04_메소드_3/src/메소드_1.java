/*
 *         변수 / 연산자 / 제어문 
 *           -------------- 명령문 
 *      => 묶어서 사용 
 *      변수 : 배열 / 클래스 (O)
 *      명령문 : 관련된 명령 
 *             => 입력 관련 / 출력 관련 / 요청 관련 => 메소드 
 *             => 동작 => 조립해서 사용 (객체 지향프로그램)
 *                       ========== 수정 / 추가 (유수보수)
 *      메소드는 한개의 직능만 수행이 가능하게 만든다 
 *      => 자바는 클래스 영역을 벗어날 수 없다 (클래스 종속)
 *      
 *      1. 메소드 구성요소 
 *         = 리턴형 : 사용자 요청에 대한 처리 결과값 
 *                   결과값은 반드시 한개만 사용이 가능하다
 *                               --------
 *                                   | 여러개인 경우 => 배열/클래스/컬렉션
 *                   => 예측해서 설정
 *         = 매개변수 : 사용자가 요청한 값
 *                   웹에서 : 마우스 클릭 , 엔터 , 버튼 , 입력창
 *                         ---------              ----
 *                   => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 *                             -------- : 마우스 , 키보드
 *                             
 *         = 메소드명 : 식별자 (변수)
 *                   => 소문자로 시작한다...
 *                   
 *         = return문장 : 처리 결과값을 보내준다. 메소드의 종료점
 *           --------- 맨마지막에 사용하는 것이 아니라 중간에 사용이 가능
 *           method()
 *           {
 *              if()
 *              {
 *                return; <=이때 혹은
 *              }
 *              else
 *              {
 *                return; <=이때도 종료 가능
 *              }
 *           }
 *         
 *      2. 메소드 형식 
 *         --------------[접근지정어]---------------
 *         public : 모든클래스에서 사용가능
 *         protected : 상속받는 클래스, 같은 폴더 안에서
 *         default : 같은 폴더 안에서만
 *         private : 자신의 클래스(=캡슐화) => 은닉화
 *         
 *         ----------------[옵션]-----------------
 *         static : 자동 메모리 저장 ==> new
 *         abstract : 추상 메소드 ==> 선언만 할때(설계=>요구사항)
 *         final : 수정이 불가능 ==> String, Math...
 *         
 *         ----------------[리턴형]-----------------
 *         리턴형(1개)으로 사용 => 기본형(int long byte char double boolean)
 *                            ----               ------ -------- 가장많이쓰임
 *                    => 참조형 : 배열 / 클래스
 *                       String , int[]
 *                    => 메소드 매개변수 전송법
 *                       ---------------
 *                       **Call By Value(값만 전송하는지)
 *                       **Call By Reference(주소값도 전송하는지)
 *        
 *        ----------------[매개변수]-----------------
 *         매개변수(0개이상)으로 사용 => 기본형 : Call By Value
 *                                참조형 : Call By Reference
 *                                ***매개변수가 3개 이상이면 배열,클래스 사용함!
 *        
 *        [접근지정어][옵션] 리턴형 메소드명(매개변수...) ==> 선언부
 *        {
 *           구현부
 *           ===> 변수선언
 *           ===> 연산자
 *           ===> 제어문
 *           -----------마지막엔 결과값을 도출해 줘야함(파이썬:예측)
 *           return 결과값;
 *           => 자체처리 => void => return을 생략할 수 있다.
 *                               ------------
 *                                   |모든 메소드는 return을 필요로 한다
 *                                   |컴파일러가 자동 추가                 
 *        }
 *        => return / import java.lang.* : 자동추가
 *                           ---------- String, Math, System.
 *           return을 생략할때는 void인 경우에만 가능
 *           
 *        ***모든 프로그램
 *        = 입력 기능 => 변수에 대한 초기화
 *        = 처리 부분(요청) => CRUD : Create(추가) => INSERT
 *                              : Read(읽기/목록,상세보기) => SELECT
 *                              : Update(수정) => UPDATE
 *                              : Delete(삭제) => DELETE
 *                        
 *        = 출력 => 사용자가 볼수 있게 만든다. => HTML,CSS
 *        = main() => 프로그램의 시작과 종료
 *        
 *     3. 메소드 유형
 *        리턴형  매개변수
 *         O      O   => String substring(int begin) =>원형
 *         O      X   => String trim() / double random()
 *         X      O   => void main(String[] arg) =>메소드자체에서처리
 *         X      X   => void println() => 다음줄 출력
 *         *** 한개의 클래스 안에서 매소드명이 동일할 수 있다.
 *                            ----------
 *                                |
 *                              매개변수의 갯수나 데이터 형이 다르다
 *                              aaa(int a)
 *                              aaa(double d)
 *                              aaa(int a,int b) => 오버로딩
 *                              => 중복정의 메소드 : 메소드 명이 같으나 (변수명은상관X)
 *                                              데이터 형이 다르면 다른메소드로 인식함
 *                                              또한 aa(int)와 aa(int,int)도 다름
 *    
 *    4. 메소드 호출
 *       ① 인스턴스(홈페이지의경우매일다른뉴스기사) 메소드 => new를 이용해서 메모리 저장
 *         ex) Scanner scan=new Scanner(System.in); //저장해두고!
 *             scan.nextInt() //가져다쓰는 원리
 *       ② 클래스 메소드(static) => 공유(교실시계나 빔프로젝터같은 공유개념/홈페이지의경우 로고) => 자동저장
 *         ex) Math.random() //저장없이 바로 가져다씀
 *       
 *       => static
 *          클래스명.메소드명()
 *          -------------
 *          => 같은 클래스인 경우 → 클래스명 생략 가능
 *          
 *       => aaa(int a, int b)
 *          => aaa(10,20) 
 *          
 *       => int aaa()
 *          int a=aaa()
 *          ---
 *          리턴형 존재시 호출할때 되도록 같은 데이터형으로 불러오기
 *          
 *    5. return값 설정 
 *       int display()
 *       {
 *          return 10;
 *       }
 *       
 *       double display()
 *       {
 *          return 10.5;
 *       }
 *       
 *       String display()
 *       {
 *          return "";
 *       }
 *       
 *       void display()
 *       {
 *          return;=생략가능
 *       }
 *       
 *       int[] display()
 *       {
 *          int[] arr=new int[5];
 *          return arr;
 *       }
 *       
 *       ==> 중요내용!! : 메소드는 여러번 호출 가능(재사용)
 *       
 *    6. 메소드 사용 목적
 *       //해당내용은 면접에서만 사용됨....실무는 구현위주
 *       //그러니까 문법이나 객체지향에 연연하지 말고 걍 해보는게 중요
 *       //효율적인 방법은 일단 하고 수정하며 습득해도됨
 *       
 *       = 반복되는 기능 제거
 *       = 코드 관리가 쉽다 (기능별 분리)
 *       = 소스가 간결하다
 *       = 재사용성이 좋다 (다른 클래스 연결)
 *       
 *    -----------------------------------------------------------------------
 *    **거꾸로 출력할때 유의할 사항
 *    => length-1로 반대출력만 하면됨
 *    => 뒤집는다? => valueOf로 문자열로 바꾸고 charAt사용
 *    
 *    **메소드를 만드는데 중간 조건 하나만 바뀐다
 *    => 매개변수 하나만 추가해서 boolean으로 통합본 만들기
 */

import java.util.Arrays;

public class 메소드_1 {
	//1. 메소드의 위치는 여기임
	//2. 메소드안에 메소드는 들어갈수 없음
	     //배열만듬  정렬   배열로생성      
	
	// 5자리의 정수를 전송 => 거꾸로 출력
	//**뒤집는다? => valueOf로 문자열로 바꾸고 charAt사용
	//reverse
	static int reverse(int num)
	{
		String str=String.valueOf(num);
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		return Integer.parseInt(res);//정수형으로 다시 바꾸기
	}
	//ASC
	static int[] sortASC(int[] arr)
	// 5개의 정수를 전송 => 정렬해서 int[] => 가져오기
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//DESC
	static int[] sortDESC(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//ASC DESC 통합본 (int[]리턴형버전)
		static int[] sort(int[] arr, String type)
		{
			boolean bCheck=false;
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(type.equals("ASC"))
					{
						bCheck=arr[i]>arr[j];
					}
					else
					{
						bCheck=arr[i]<arr[j];
					}
					if(bCheck)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr;
		}
		
		//ASC DESC 통합본 (void버전)
				static void sort_1(int[] arr, String type)
				{
					boolean bCheck=false;
					for(int i=0;i<arr.length-1;i++)
					{
						for(int j=i+1;j<arr.length;j++)
						{
							if(type.equals("ASC"))
							{
								bCheck=arr[i]>arr[j];
							}
							else
							{
								bCheck=arr[i]<arr[j];
							}
							if(bCheck)
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}
					}
					
				}
		//조립하는 메소드
		static void process()
		{
			// 5개 정수 설정
			int[] arr=new int[5];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*100+1);
			}
			System.out.println("정렬전 : ");
			System.out.println(Arrays.toString(arr));
			
			//비통합본 출력법
			/*
			int[] result=sortASC(arr);
			System.out.println("정렬후 ASC: ");
			System.out.println(Arrays.toString(result));
			result=sortDESC(arr);
			System.out.println("정렬후 DESC: ");
			System.out.println(Arrays.toString(result));
			*/
			
			//통합본 int[] 리턴형 출력법
			////=Call By Value 방식
			/*
			System.out.println("정렬후 통합본 ASC(리턴형): ");
			int[] result=sort(arr,"ASC");
			System.out.println(Arrays.toString(result));
			System.out.println("정렬후 통합본 DESC(리턴형): ");
			result=sort(arr,"DESC");
			System.out.println(Arrays.toString(result));
			*/
			
			//통합본 void 출력법
			//=Call By Reference 방식
			sort_1(arr,"ASC");
			System.out.println("정렬후 통합본 ASC(void): ");
			System.out.println(Arrays.toString(arr));
			sort_1(arr,"DESC");
			System.out.println("정렬후 통합본 DESC(void): ");
			System.out.println(Arrays.toString(arr));
			
			//reverse 출력
			System.out.println("reverse : ");
			System.out.println(reverse(12345));
			
		}
		
	public static void main(String[] args) {
		//3. 이곳이 메소드 조립기
		process();



}

}
