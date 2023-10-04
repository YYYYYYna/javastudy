//메소드_4 => 메소드로 구현하기
//리턴형 / 매개변수 / 메소드명 => 가독성있게...
//입력부분 => 기능화시킴
//구구단출력부분 => 기능화시켜서 나중에 재사용하기
import java.util.Scanner;
public class 메소드_4_구현 {
	// 사용자로부터 정수를 받는다
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(2~9) : ");
		//int dan=scan.nextInt();
		//return dan;
		return scan.nextInt();
		//이렇게 한번에 써도됨
	}
	//받은 정수에 해당되는 구구단 출력
	//2가지 경우의수 존재 (return형 사용/비사용)
	
	//[방법1]
	/*static String gugudan(int dan)
	{
		String result=dan+"단\n";
		for(int i=1;i<10;i++)
		{
			result+=dan+"*"+i+"="+dan*i+"\n";
		}
		return result;
	}*/
	
	//[방법2 : return값 없는 방법]
	static void gugudan(int dan)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	//[방법3 : 조립기 / 방법2를 이어서 출력부분도 메소드화]
	static void process()
	{
		int dan=userInput();
		gugudan(dan);
	}
    public static void main(String[] args) {
    	//[방법1] [방법2] 공통필요부분
    	//int dan=userInput();
    	
    	//[방법1]
		//String gu=gugudan(dan);
		//System.out.println(gu);
    	
    	//[방법2 : return값 없는 방법]
		//gugudan(dan);
    	
    	//[방법3 : 조립기]
    	process();
    	
    	
		

	}

}
