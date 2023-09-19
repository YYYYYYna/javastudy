
 // 1~30까지 출력 => 짝수만출력 => 3줄씩 출력
 
public class 제어문_반복문_12 {

	public static void main(String[] args) {
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%2d\t",i);
				
			}
			if(i%6==0) //위아래 if문의 순서가 달라지면 출력값이 틀림
			{
				System.out.println();
			}
		}

	}

}
