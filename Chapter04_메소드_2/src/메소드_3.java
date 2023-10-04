//  시저스 암호화(=AES) 예제
import java.util.Scanner;
public class 메소드_3 {
	//***매개변수 전송법 : 아래의 과정을 기억해야함
	//[문자열 입력받는 메소드] => return형O(=문자열받아야함),매개변수X(=Scanner)
	static String userInput()
	{
		//Scanner scan=new Scanner(System.in);
		//System.out.print("문자열 입력 : ");
		return 메소드_2.userInput();//메소드 호출 활용
	}
	
	//[암호화 시키는 메소드] => return형O(=문자열받아야함),매개변수O(=문자열받아야함)
	static String encode(String msg)
	{
		String result="";//**이둘은세트로외우기
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			result+=(char)(c+3);//이부분이 시저스 암호화
		}
		return result;//**이둘은세트로외우기
		//void가 아니니 여기에 sysout이 오지 않음!!!
	}
	
	//[복호화 시키는 메소드] => return형/void형△(=출력부분이라상관없음),매개변수O(=암호문받아야함)
	static void decode(String en)
	{
		for(int i=0;i<en.length();i++)
		{
			char c=en.charAt(i);
			System.out.print((char)(c-3));
		}
	}

	public static void main(String[] args) {
		//[문자열 입력받는 메소드]
		String msg=userInput();
		System.out.println("msg : "+msg);
		
		//[암호화 시키는 메소드]
		String en=encode(msg);
		System.out.println("암호화 결과값 : "+en);
		
		//[복호화 시키는 메소드]
		decode(en);

	}

}
