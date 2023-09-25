// 응용
// => 정수를 1개 입력 받아서 => 2진법을 출력
// 16bit(0~32767) => 양수 값을 진행
/*
 *   10
 *   0000 0000 0000 1010 //2진법은 뒤에서부터 채워야함
 */
import java.util.Scanner;

public class 배열_2 {
       public static void main(String[] args) {
    	   int[] binnary=new int[16];
    	   //값을 채울때 앞에서부터 채우는지 뒤에서부터 채우는지 체크해야함
    	   //지금 구하는건 2진법이니까 뒤에서 부터 채워야함
    	   int index=binnary.length-1; //마지막 index번호를 넣어줘야함. 16의 경우에는 15. n-1값임.
    	   //따라서 역순으로 값을 배치하기
    	   Scanner scan=new Scanner(System.in);
    	   System.out.print("0~32767 사이의 정수를 입력 : ");
    	   int num=scan.nextInt();
    	   System.out.println("====== 라이브러리 이용결과 ======");
    	   System.out.println(Integer.toBinaryString(num));
    	   
    	   System.out.println("===== while+for문 이용결과 =====");
    	   //그러나 끝나는 횟수를 모르니까 for문못씀 while반복문 써야함
    	   //2진법 계산하는 while문
    	   while(true)
    	   {
    		   binnary[index]=num%2;
    		   num=num/2; //1/2=0정수값
    		   if(num==0)
    		   {
    			   break;
    		   }
    		   index--;
    	   }
    	   //2진법으로 출력하는 for문
    	   for(int i=0;i<binnary.length;i++)
    	   {
    		   if(i%4==0 && i!=0)
    		   {
    			   System.out.print(" ");
    		   }
    		   System.out.print(binnary[i]);
    	   }
	
     }
}
