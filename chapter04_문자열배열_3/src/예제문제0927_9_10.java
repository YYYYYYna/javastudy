//9.char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
//10. 위문제를 역순으로 출력하시오

public class 예제문제0927_9_10 {

	public static void main(String[] args) {
		System.out.println("========== 09번 ==========");
		char[] arr=new char[26];
		char c='A';
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c++;//A~Z까지 순서대로 할당됨
		}
		for(char i:arr)
		{
			System.out.print(i);
		}
		System.out.println("\n========== 10번 ==========");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
