//   사칙연산 => 연산자 메소드 4개필요 + 조립기 => 총 5개 필요
import java.util.Scanner;
//정수 2개 => 연산자 1개 필요
public class 메소드_5 {
	//반복되는 부분을 메소드화하여 반복제거 가능
	//[int입력메소드]
	static int userInput(String msg)
	{
		//사실 입력값은 String으로 볼수 있다.
		//입력할때 98을 "9"+"8"로 인식하기 때문에
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"정수 입력 : ");
		return scan.nextInt();
	}
	//[char입력메소드]
	static char opInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자 입력(+,-,*,/) : ");
		return scan.next().charAt(0);
	}
	/*static void process()
	{
		switch(op)
		{
		case '+':
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d+%d=%d\n",num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d+%d=%d\n",num1,num2,num1*num2);
			break;
		case '/':
			if(num2==0)
			{
				System.out.printf("0으로 나눌수 없다.");
			}
			else
			{
				System.out.printf("%d+%d=%.2f\n",num1,num2,num1/(double)num2);
			}
			break;
		}
	}*/
	public static void main(String[] args) {
		int num1=userInput("첫번째 ");
		int num2=userInput("두번째 ");
		//위에 메소드를 하나 만들어서 for문이용이 아닌
		//두번 입력을 메소드 한개로 해결할 수 있음
		char op=opInput();
		//아래 부분도 메소드화 시킬수 잇음
		switch(op)
		{
		case '+':
			//리턴형 : int 
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d+%d=%d\n",num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d+%d=%d\n",num1,num2,num1*num2);
			break;
		case '/':
			//리턴형 : String / 매개변수 : int, int
			if(num2==0)
			{
				System.out.printf("0으로 나눌수 없다.");
			}
			else
			{
				System.out.printf("%d+%d=%.2f\n",num1,num2,num1/(double)num2);
			}
			break;
		}
	}

}
