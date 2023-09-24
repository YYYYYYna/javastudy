/*
 *     년도와 월을 받아서 => 요일 출력
 *     ex) 2023 9 22  => 금
 *     너무어려워서 보류함
 */

// 가위바위보


import java.util.Scanner;

public class 배열_생성3 {
	public static void main(String[] args) {
		int com=(int)(Math.random()*3);//0,1,2
		
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) : ");
		int user=scan.nextInt();
		
		//이 3줄로 아래 if문과 같은 결과를냄
		String[] res= {"가위","바위","보"}; 
		     //순서대로 res[0] res[1] res[2]
		     //만약에 res[0]=없음 으로 바꾸면 바꿔짐
		System.out.println("컴퓨터:"+res[com]);
		System.out.println("사용자:"+res[user]);
		
		//if문으로 만듬
		/*System.out.println("컴퓨터:");
		if(com==0)
		{
			System.out.println("가위");
		}
		else if(com==1)
		{
			System.out.println("바위");
		}
		else if(com==2)
		{
			System.out.println("보");
		}
		
		System.out.println("사용자:");
		if(user==0)
		{
			System.out.println("가위");
		}
		else if(user==1)
		{
			System.out.println("바위");
		}
		else if(user==2)
		{
			System.out.println("보");
		}*/
		
	}

}
