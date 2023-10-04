//알파벳을 입력받아서 대문자인지 소문자인지 확인
//경우의수를 따져야함 메소드 1개로 만들지 2개로 만들지
import java.util.Scanner;
public class 메소드_6 {
	static char alphaInput()
	//Scanner로 값을 받기 때문에 매개변수 필요 없음
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		return scan.next().charAt(0);
		//여기서 알수 있는 자바의 단점
		//=> char를 받아서 처리하는 기능이 없음
		//=> String으로 받아서 charAt으로 잘라야함
	}
	static void result(char c)
	//값을 받아야 하기 때문에 매개변수가 필요함
	//고민을 해봤는데 결과값을 넘겨주지 않고 메소드 내에서 처리하려고함 => void사용
	//만약에 대문자/소문자를 main 쪽으로 넘겨준다면 void가 아닌 String return형을 사용하면됨
	{
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는/은 대문자 입니다.");
		}
		else if(c>='a' && c<='z')
		{
			System.out.println(c+"는/은 소문자 입니다.");
		}
		else
		{
			System.out.println(c+"는/은 알파벳이 아닙니다.");
		}
	}
	public static void main(String[] args) {
		//알파벳 받기
		char c=alphaInput();//return값이 잇어서 변수생성
		result(c);//void로 만들어서 그냥 출력만 하면됨

	}

}
