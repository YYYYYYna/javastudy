// 정수를 입력 => 0~32757 => 16bit => 2진법출력하는 메소드
//  입력메소드       2진법변환메소드         출력메소드      => 조립기메소드   
import java.util.Scanner;

public class 메소드_2 {
	//입력메소드
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력(0~32757) : ");
		int num=scan.nextInt();
		return num;
		
	}
	//2진법변환메소드
	static int[] change(int num)//입력메소드에서 num값으로 return해서
	                            //매개변수는 int num
	{
		int[] binary=new int[16];
		int index=15;//뒤에서부터순차출력해야함
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
			{
				break;
			}
			index--;
		}
		return binary;
	}
	//출력메소드 
	static void print(int[] binary)
	{
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i==0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	
	//조립기메소드 
	static void process()
	{
		//입력값받기
		int num=userInput();
		int[] arr=change(num);
		print(arr);
	}
	
	public static void main(String[] args) {
		//메소드에 들어가는 소스는 동일함
		//리턴형과 매개변수 잡는게 중요
		//main에서 코딩을 하고 메소드화 시키는것도 방법
		
		/*//입력
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력(0~32757) : ");
		int num=scan.nextInt();
		//2진법변환
		int[] binary=new int[16];
		int index=15;//뒤에서부터순차출력해야함
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
			{
				break;
			}
			index--;
		}*/
		process();

	}

}
