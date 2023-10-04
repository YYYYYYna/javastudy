/*
 *   ~를입력받아/~합을구하라/~로 바꿔주는(=사용자가보내준값) => 매개변수O
 *   
 *    리턴형 메소드명(매개변수...)
 *    {          ---------가변매개변수
 *        => 자체에서 void (=결과값 없는 상태)
 *    }
 *    메소드 : 기능처리 (연산자+제어문)
 *           = 다른 클래스 연결
 *           = 재사용
 *         : Callback => main => 자동으로 호출되는 메소드(시작점)
 *         : 사용자 정의 -> 프로그래머가 직접제작
 *         : 라이브러리 -> 이미 제작된 메소드 =만들지못하는프로그램
 *           ① 자바에서 제공
 *           ② 외부업체에서 제공 (Jsoup,Spring) => mvnrepository.com
 *           =CBD(조립식프로그램) => 메소드 호출이 많다
 *         : 조립할때 ,재사용, 유지보수가 편리하게 만든다.
 *         : 재사용
 *           메소드를 불러온다
 *           ------------각유형호출하는법
 *             int aaa() ========> int a=aaa()
 *             double bbb() =====> double d=bbb()
 *             void ccc() =======> ccc()
 *             boolean ddd() ====> boolean b=ddd()
 *           ------------다른클래스에서호출하는법
 *             class A
 *             {
 *                int aaa(){}
 *             }
 *             class B
 *             {
 *                main()
 *                {
 *                   A.aaa()//메소드 보유 클래스를 적고 가져와야함
 *                   => Math.random()
 *                }
 *             }
 *              
 *    
 *    메소드 사용시에 => 호출
 *    -----------------main()은 컴파일러에 의해 자동호출
 *                              ----------------
 *                                     |=Callback
 */
import java.util.*;
public class 예제문제1004_1번_5번 {
	// 1. 1~10까지 출력하는 메소드 구현
	//[1번] return(X)=void / 매개변수(X)
	static void one()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
	}
	//2. 1~10까지 합을 구하는 메소드 구현
	//[2번] return(O)=int (혹은 void) / 사용자요청값없음=매개변수(X)
	static int two()
	{
		System.out.println("\n-------------------------");
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		return hap;
	}
	
	//3. 1~n까지 합을 구하는 메소드 구현
	/*static int three()
	{
		System.out.println("-------------------------");
		int rand=(int)(Math.random()*100)+1;
		System.out.println("3번문제 n의 값 : "+rand);
		int result=0;
		for(int i=1;i<=rand;i++)
		{
			result+=i;
		}
		return result;
	}*/
	//3번 선생님 풀이
	//[3번] return(O)=int (혹은 void) / 합을구함=매개변수(O)
	static void sum(int n)
	{
		System.out.println("-------------------------");
		int hap=0;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		System.out.println("3번 정답 : "+hap);
	}
	
	//4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	//[4번] void / 매개변수X
	static void four()
	{
		System.out.println("-------------------------");
		int rand1=(int)(Math.random()*100)+1;
		int rand2=(int)(Math.random()*100)+1;
		System.out.print("4번 문제 첫번째 나누기 값 : "+rand1);
		System.out.print("\n4번 문제 첫번째 나누기 값 : "+rand2);
		double result=(double)rand1/rand2;
		System.out.print("\n4번 정답 : "+result);
	}
	//[4번] 선생님풀이 return=double / 매개변수(2개)
	static String div(int a,int b)
	{
		System.out.println("-------------------------");
		String result="";
		if(b==0)
		{
			result="0으로 나눌수 없습니다.";
		}
		else
		{
			result="4번 정답 : "+a+"/"+b+"="+a/(double)b;
		}
		return result;
	}
	
	
	//~문자열 입력 메소드~
	static String userInput()
	{
		return 메소드_2.userInput();
	}
	//5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	//[5번] void / 매개변수O
	

	public static void main(String[] args) {
		//1번
		one();
		
		//[2번]
		int two=two();
		System.out.println("2번 정답 : "+two);
		
		//[3번]
		//int thr=three();
		//System.out.println("3번 정답 : "+thr);
		//[3번] 선생님풀이
		int num=(int)(Math.random()*100)+1;
		sum(num);
		
		//[4번]
		four();
		//[4번] 선생님풀이
		Scanner scan=new Scanner(System.in);
		System.out.print("\n첫번째 정수 입력 : ");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b=scan.nextInt();
		String res=div(a,b);
		System.out.println(res);
		
		//[5번]
		//String으로 toUpperCase사용하면됨
		

	}

}
