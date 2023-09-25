//문장 자르기는 주소값에 따라 데이터를 나눌때 용이 => 경기도 별로 성남시 별로 인덱스값이 다르니까 나누기 편함

//Q. 1~100난수발생 => 10개 저장 => 배열을 사용해서 처리
//1. 총합구하기
//2. 평균구하기
//3. 최대값 구하기
//4. 최소값 구하기
//5. 최대값의 위치 찾기 ==> index이용
//6. 최소값의 위치 찾기 ==> index이용

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		/*int[] a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
		}*/
		//중복을 보기 위해 임의로 배열 할당하기
		int[] a={10,20,10,30,40,50,30,10,30,50};
		
		System.out.println("===== 저장된 값 =====");
		System.out.println(Arrays.toString(a)); //배열출력
		
		//총합과 평균 구하기
		int sum=0;
		double avg=0;
		for(int i:a)
		{
			sum+=i;
		}
		System.out.print("총합 : "+sum);
		System.out.printf("\n평균:%.2f\n",sum/10.0);
		
		//최대값구하기
		int max=0,min=100;//반대로 대입해서 비교후 변환가능
		//최대 최소에는 실제값이 필요함 따라서 for-each값이 필요함
		for(int i:a)//인덱스값말고 실제값 가져와야함
		{
			if(max<i)
				max=i;
			if(min>i)
				max=i;
		}
		System.out.print("\n최대값 : "+max);
		System.out.print("\n최소값 : "+min);
		
		//최대최소 인덱스번호 가져오기
		//당연히 인덱스 값이 필요함으로 일반 for문을 사용
		int index=0;
		//최대값 인덱스
		// => 중복값까지 알려주는 경우
		for(int i=0;i<a.length;i++)
		{
			if(max==a[i])
			{
				System.out.print("\n최대값의 위치 : "+(i+1));
				//이렇게 if문안에 print를 넣으면 중복된 곳도 다 알려줌
			}
		}
		//System.out.print("\n최대값의 위치 : "+(index1+1));
		
		//최대값 인덱스
		// => 중복값 도출 안되고 한번만 알려주는 경우
		/*for(int i=0;i<a.length;i++)
		{
			if(max==a[i])
			{
				index=i;
				break;
			}
		}
		System.out.print("\n최대값의 위치 : "+(index+1));*/
		

	}

}
