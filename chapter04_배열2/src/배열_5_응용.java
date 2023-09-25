import java.util.Scanner;
/*
 *    숫자 야구 게임
 *    1. 난수 (3자리)=중복이 없는 난수
 *   ex. 369 => new int[3]
 *    2. 사용자가 입력 => new int[3]
 *       123 ==> 0S-1B
 *       321 ==> 1S-0B
 *       368 ==> 2S-0B
 *       369 ==> 3S-0B <종료>
 *       
 *       조건 : S==3 이면 종료
 *       
 */
public class 배열_5_응용 {
	public static void process() //메소드생성
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)//난수발생하기
		{
			com[i]=(int)(Math.random()*9)+1;//1~9
			for(int k=0;k<i;k++)
			{
				if(com[i]==com[k])//중복없애기
				{
					i--;
					break;
				}
			}
		}
		//컴퓨터 숫자 출력
		//System.out.printf("%d%d%d\n",com[0],com[1],com[2]);
		
		//사용자 입력 숫자
		int[] user=new int[3];//배열끼리 비교해야함 => 3자리입력유도 후 우린 잘라서 사용
		Scanner scan=new Scanner(System.in);
		//=맞추는횟수알수없음=>while문 사용
		while(true)
		{
			//우선 사용자 입력값 받음
			System.out.print("3자리 정수 입력 : ");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력 입니다.");
				continue; //while문 조건식(=처음)으로 돌아감
			}//정상적으로 입력
			//이제 입력한 배열 자르는 과정
			user[0]=input/100; //첫번째자리
			user[1]=(input%100)/10; //두번째자리
			user[2]=input%10;//세번째자리
			//오류체크
			if(user[0]==user[1] || user[2]==user[1] || user[0]==user[2])
		    //같은숫자인경우오류처리
			{
				System.out.println("같은숫자는 사용할 수 없습니다.");
				continue;//처음부터 다시 입력하도록
			}
			if(user[0]==0 ||user[1]==0 || user[2]==0)
		    //입력값0인경우오류처리
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;//처음부터 다시 입력하도록
			}
			//힌트제공과정
			int s=0,b=0;//s는같은자리같은숫자 b는다른자리같은숫자
			for(int i=0;i<com.length;i++)
			{
				for(int k=0;k<user.length;k++)
				{
					if(com[i]==user[k])//=같은수가 있다면
					{
						if(i==k)//=같은자리에 있다면
						{
							s++;
						}
						else
						{
							b++;
						}
					}
				}
			}
			System.out.println("Input Number : "+input+",Result"+s+"S-"+b+"B");
			//종료여부확인
			if(s==3)
			{
				System.out.println("게임을 다시할까요?(Y/y)");//순서 달라지면 실행 이상하게 됨 주의하기
				char c=scan.next().charAt(0);
				if(c=='Y' || c=='y')
				{
					process();//메소드 사용함
				}
				else
				{
					System.out.println("Game Over");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		process();//메소드 사용함

	}

}
