/*
 *    코딩테스트 나오면 아래 ***부분에서 가장 많이 나옴
 *    ex) 백지에 버블정렬 만들기, 선택정렬순서 말하기...
 *    ***알고리즘 : 정렬(선택 정렬, 버블정렬)
 *    ***자료구조 : 데이터 관리(추가 => 가지고 오기)
 *               스택(LIPO:후입선출) / 큐(FIPO:선입선출) / 데큐(양방향)
 *               :메모리             :네트워크     
 *    -------------------------------------------------------
 *    선택 정렬 => 한개를 선택해서 변경
 *    버블 정렬 => 인접한 것끼리 정렬
 *    
 *      [선택 정렬] => 작은값을 왼쪽에 정렬
 *      30 10 20 50 40 => 10 20 30 40 50 으로 나오도록 하기 
 *      -- --
 *      10 30 -> 작은수 왼쪽으로 자리 바꿈
 *      --    --
 *      10    20
 *      --       --
 *      10       50
 *      --          -- => 이렇게 각각 비교해서 작은수를 왼쪽으로 옮김
 *      10          40    순차적으로 1~5번째 자리까지 서로 비교함
 *      10 30 20 50 40
 *      -----1차비교-----
 *      10 30 20 50 40
 *         -- -- -> 2차비교는 2번째 자리부터 비교시작함
 *         20 30
 *         --    --
 *         20    50
 *         :
 *      
 *      [버블 정렬] => 큰값을 오른쪽에 정렬
 *      30 10 40 50 20 => 10 20 30 40 50 으로 나오도록 하기 
 *      -- -- 
 *      10 30
 *         -- --
 *         30 40
 *            -- --
 *            40 50
 *               -- ---> 인접한것끼리 바꿈
 *               20 50
 *      10 30 40 20 50 -> 2,3차를 더 시행해야하는경우 
 *      -----1차비교-----0번째비교시4번수행
 *      10 30 40 20 (50)-> 논리상 가장 큰수가 오른쪽에 오게됨으로 다음시행때는
 *      -- --              가장 오른쪽에 위치한 수를 고정시키고 앞에 4개로
 *      10 30              다시 버블정렬을 시행한다.
 *         -- --
 *         30 40 
 *            -- --
 *            20 40
 *      10 30 20 40 (50)-> 2차비교때는 4번째 자리를 고정하면서 순차적으로 진행
 *      -----2차비교-----1번째비교시3번수행
 *                     => i      j  => i+j=4 ==> j=4(length-1)-i
 *                        0      4
 *                        1      3
 *                        2      2
 *                        3      1
 *         
 */

// 선택정렬 예제1 : 숫자 정렬
import java.util.*;
public class 배열_3 {
	public static void main(String[] args) {
		//초기화
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("====== 정렬전 ======");
		System.out.println(Arrays.toString(arr));
		
		//선택정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=i+1;k<arr.length;k++)//두번째 시행은 2번째 자리부터 시행하도록 초기값은 i+1
			{
				if(arr[i]>arr[k])//i번째자리와 i+1번째자리 비교할때 
				{                //i번째 자리가 더 크다면
					int temp=arr[i];//(temp=자리교체를 위한 임시변수값)
					arr[i]=arr[k];//i+1번째자리에 i번째자리'값'을 대입 = 큰값을 오른쪽으로 이동
					arr[k]=temp;//그리고 i+1번째자리'값'을 i번째자리에 대입 = 작은값은 왼쪽으로 이동
					
				}
			}
			System.out.println("===== "+(i+1)+"차 시행 =====");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("====== 정렬후 ======");
		System.out.println(Arrays.toString(arr));
	}
}
