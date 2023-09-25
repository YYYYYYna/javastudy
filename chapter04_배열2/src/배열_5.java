/*
 *  배열_4번(실무)과 다르게 간단하게 짜는 중복없는 난수
 */
public class 배열_5 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1; //1~10
			for(int k=0;k<i;k++)//두번째값부터 확인하면되니까 k<=i가 아님
			{
				if(arr[i]==arr[k])// :i번째에 중복이발생한다면
				{
					i--;// :다시 i번째로 돌아가서 연산해라.(=다시난수발생)
					// 따라서 이 연산은 인덱스를 이용해서 더 간단하게 해결한 프로그램
					break;
				}
			}
		}
		
		//출력
		for(int i:arr)//출력만하니까 for-each문 사용
		{
			System.out.print(i+" ");
		}

	}

}
