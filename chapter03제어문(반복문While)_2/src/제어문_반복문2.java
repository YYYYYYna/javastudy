//가위바위보 => 10번 반복 => 3승 2무 5패 처럼 결과나오게

import java.util.Scanner;
public class 제어문_반복문2 {

	public static void main(String[] args) {
		int win=0, lose=0, same=0;
		
		Scanner scan=new Scanner(System.in); //new라는건 다른메모리에 저장되는뜻
		//while문 안에 넣어도 되는데 10이나 수행하기에는 
		//new라는 메모리 값이 너무 커져서 1번만 수행하도록 바깥으로 뺌
		
		int i=1;
		while(i<=10)
		{
			System.out.println("====="+i+"번째 게임"+"=====");
			
			//컴퓨터의 패 결정
			int com=(int)(Math.random()*3); 
			//컴퓨터의 랜덤값을 while 안에 넣어야 10번의 대결을 할 수 있음
			
			int user=0;
			while(true) //유효성 검사 (=원하는값이 나오도록 유도)
			{
				System.out.println("가위(0), 바위(1), 보(2) : ");
				user=scan.nextInt();
				if(user<0 || user>2)
				{
					System.out.println("가위바위보를 입력하세요");
					continue; //처음부터 다시 수행이 가능하도록
				}
				break; //종료시킬 부분 => 소속반복문만 제어함
				//system.어쩌고..종료하는거는 프로그램 자체를 종료해서 잘 사용안함
					
			}
			
		    System.out.println("컴퓨터 : ");
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
		    //사용자의 패 결정
		    System.out.println("사용자 : ");
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
		    }
			//승패결정
		    int res=com-user;
		    //승패결정원리
		    /*
		     *   컴퓨터   -    사용자
		     *   가위(0)  -   가위(0)   =   0   same
		     *           -   바위(0)   =   -1  win
		     *           -    보(0)   =   -2  lose
		     */
		    if(res==-1 || res==2)
		    {
		    	System.out.println("사용자 win");
		    	win++;
		    }
		    else if(res==1 || res==-2)
		    {
		    	System.out.println("사용자 lose");
		    	lose++;
		    }
		    else
		    {
		    	System.out.println("사용자 컴퓨터 same");
		    	same++;
		    }
		    
			i++; //요거 증감식 잊어버리면 안돼!!!!
		}
		
		//10번의 게임이 끝나고(=while문 종료후) 결과값 출력하는곳
		System.out.println("========결과값========");
		System.out.printf("%d승 %d패 %d비",win,lose,same);
		

	}

}
