//9)100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
                    //           ------ 변수발생
public class 예제문제0919_9 {
public static void main(String[] args) {
	int sum=0, count=0;
	
	for(int i=100;i<=999;i++)
	{
		if(i%4!=0)
		{
			sum+=i;
			count++;
		}
	} //i는 여기까지만 사용가능.... => 자동소멸
	System.out.println(sum);
	System.out.println(count);
}
}