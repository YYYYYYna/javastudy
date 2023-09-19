//   20개의 정수/난수 발생 => 짝수와 홀수 갯수 세기
public class 제어문_반복문11 {

	public static void main(String[] args) {
		int even=0,odd=0; //순서대로 짝수와 홀수
		
		for(int i=0;i<20;i++)
		{
			int rand=(int)(Math.random()*10)+1;
			
			if(rand%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("=====결과값=====");
		System.out.println("짝수의 갯수 : "+even);
		System.out.println("홀수의 갯수 : "+odd);

	}

}
