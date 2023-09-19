/*
 *     for문 수행시에 => 수열 (숫자마다 패턴을 가지고 있어야 반복문 수행된다.)
 *                                ----
 *                                1,2,3 혹은 2,4,6 같은패턴 1,6,4,9이런식은 안됨
 */
public class 제어문_반복문_11_예제 {
public static void main(String[] args) {
	int three=0, five=0, ten=0;
	
	for(int i=0;i>20;i++)
	{
		int rand=(int)(Math.random()*10)+1;
		
		if(rand%3==0)
		{
			three++;
		}
		if(rand%5==0)
		{
			five++;
		}
		if(rand%10==0)
		{
			ten++;
		}
	}
	
	System.out.println("====결과=====");
	System.out.println("3의 배수의 개수 : "+three);
	System.out.println("5의 배수의 개수 : "+five);
	System.out.println("10의 배수의 개수 : "+ten);

	
	System.out.println("=========================");
	//1=2-3=4-5=6-7=8-9
	int sum=0;
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			sum-=i;
		}
		else
		{
			sum+=i;
		}
	}
	System.out.println(sum);
	
	System.out.println("=========================");
	//BDFHJLN  따라서 초기값:B 마지막조건:N
	for(char c='B';c<='N';c+=2)
	{
		System.out.println(c+" ");
	}
}
}
