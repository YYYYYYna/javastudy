//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.


public class 예제문제0922_2 {

	public static void main(String[] args) {
		int[] num=new int[9];
		for(int i=0;i<10;i++)
		{
			num[i]=(int)(Math.random()*10)+1;
		}
		for(int i:num)
		{
			System.out.print(num[i]+" ");
		}
	}
}
