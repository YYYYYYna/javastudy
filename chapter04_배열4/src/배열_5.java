/*
//배열 => 같은 데이터형을 일정한 순서로 모아서 관리
//배열의 크기 : length
//출력시에는 향상된 for문 (=for~each)
//관련된 종류의 데이터 3개 이상인 경우
// 선언 => 초기값
//         | 
//        1) 명시적
//        2) new
 *           ---
 *            |
 *         자동초기화
 *         


 * [버블정렬의 조건식]
 *  =>1번째비교시3번수행
 *  => i      k  => i+k=4 ==> k=4(length-1)-i
 *     0      4           ==> k<arr.length-1-i
 *     1      3
 *     2      2
 *     3      1
 */

// 버블정렬 예제
import java.util.Arrays;
public class 배열_5 {

	public static void main(String[] args) {
		//초기화
	    int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("====== 정렬전 ======");
		System.out.println(Arrays.toString(arr));
		
		//버블정렬 시작
		System.out.println("====== 정렬후 ======");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=0;k<arr.length-1-i;k++)//선택정렬과 다르게 시작하는 위치:초기값 i=0
			{
				if(arr[k]>arr[k+1])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
