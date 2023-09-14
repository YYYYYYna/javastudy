import java.util.Scanner;
public class 예제문제0914 {

	public static void main(String[] args) {
		/*//1. 농구공 5개씩 한 박스에 들어간다. 40개면 8상자,26개면 6상자이다 삼항연산자를 이용해서 구현하시오
		//=>총페이지 만드는 문제랑 유형이 같음
		 
		//농구공갯수기입(랜덤)
		Scanner scan=new Scanner(System.in);
		System.out.print("농구공의갯수 : ");
		int ball=scan.nextInt();
		
		//박스변수설정
		int box=ball/5;
		
		//농구공갯수/박스상자(5개)
		System.out.print(ball%5==0?+box+"개 입니다.":"");
		System.out.print(ball%5!=0?+(box+1)+"개 입니다.":"");
		
		//선생님풀이1 : box를 안씀
		System.out.print(ball%5==0?+ball/5:ball/5+1+"개 입니다.":"");
		//선생님풀이2 : box를 안씀
		System.out.print("필요한박스:"+(int)(Math.ceil(ball...못적음;
		
		*/
		
		/*//2. 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. 알맞은 코드를 넣으세요.
	    char ch = 'z'; 
	    
	    //숫자,대문자,소문자 분류
	    boolean b = ((int)ch<=57 && (int)ch>=48 || (int)ch<=90 && (int)ch>=65 || (int)ch<=122 && (int)ch>=97);
	
	    System.out.println(b); 
	    System.out.println((int)ch);
	    
	    //선생님풀이1 : scan과 charAt(0)사용
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch=scan.next().charAt(0);//char받아오는법
		System.out.print("ch="+ch);
		boolean b=(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'?true:false);
		System.out.println(b);
	    */
		
		//3. 대문자를 소문자로 변경하는 코드, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
		char ch = 'H'; 
	    char lowerCase = ch>='A' && ch<='Z'?(char)(ch+32):ch; 
	    System.out.println("ch : " + ch); 
	    System.out.println("ch to lowerCase : " + lowerCase);
	    System.out.print((int)ch>=97?"입력값이 소문자입니다.":"");

		

	}

}
