//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
public class 예제문제0920_2 {

	public static void main(String[] args) {
		char ch1=' ',ch2='	';
		char ch=(char)(Math.random()*600)+1;
		if(ch==ch1 && ch==ch2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
