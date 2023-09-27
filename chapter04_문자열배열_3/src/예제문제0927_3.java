//3.100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
public class 예제문제0927_3 {

	public static void main(String[] args) {
		int[] arr=new int[100];
		int[] count=new int[10];//word count => 문자열 많은 순으로 추천 가능
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);//0~9
			
		}
		//빈도수 구하기
		for(int i:arr)
		{
			count[i]++;//인덱스번호(0~9)를 이용함
		}
		//빈도수 출력
		for(int i=0;i<count.length;i++)
		{
			System.out.printf("빈도수[%d] : %d\n",i,count[i]);
		}
		
	}

}
