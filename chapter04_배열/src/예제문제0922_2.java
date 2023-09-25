//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.


public class 예제문제0922_2 {

	public static void main(String[] args) {
		int[] num=new int[10];
		//정수를 10개 저장하는 배열
		int sum=0;
		double avg=0;
		for(int i=0;i<num.length;i++)
		{
			int rand=(int)(Math.random()*10)+1;
			//1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열
			num[i]=rand;
			sum+=num[i];
		}
		System.out.println("총합:"+sum);
		avg=sum/(num.length);
		System.out.println("평균:"+avg);
	}
}
