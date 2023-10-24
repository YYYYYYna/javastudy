package com.sist.lib;
/*
 *     Random : 난수발생
 *        => nextInt(int bound) ==> 0 ~ bound-1 발생
 *     
 *     [326page]
 *     Arrays : 배열과 관련된 기능 제어
 *        1) sort => 정렬
 *           오라클의 경우 : ORDER BY no DESC(ASC) => 그러나 시간이 오래 걸림
 *                     ==> 좀더 발전시켜 index(최적화***)를 사용함
 *        2) copyOf => 다른 배열에서 복사
 *        3) toString() => 배열값 출력
 *        
 *        **최신순,추천순등등..매뉴를 선택할때 sort를 이용한 결과임
 *        
 *      [328page]
 *      StringTokenizer : 문자열 분리
 *                      : 배열을 token으로 표시하고 한문장으로 가져와서 출력시
 *                        split()으로 token을 기준으로 문자열을 나눠줌
 *                      
 *                      예를들어 가게의 매뉴가 2개인곳도 잇고..5개인 곳도 있기 때문에
 *                      매뉴명과 가격을 배열로 저장한다면 가게마다 매뉴갯수=배열갯수가 달라짐
 *                      그러나? 배열로 저장하지말고 그냥 한문장으로 저장하고
 *                      배열마다 특정 특수문자(예)^)를 넣어주면 나중에 출력할때
 *                      ^를 기준으로 나눠줌으로써 배열처럼 출력하면됨
 *                      그리고? ^이 scanToken의 역할을 수행함
 *                      
 *                      ==> 네트워크 / 빅데이터 / 웹
 *                      ==> 기능(메소드)
 *                          1. countToken() : 분리된 데이터 갯수
 *                          2. nextToken() : 실제 분리된 데이터 읽기
 *                          3. hasMoreTodens() : 분리된 수만큼 루프 수행
 *        
 *        
 */

//Arrays 실습
/////해당방법의 단점 : 배열이 계속해서 새로 만들어지기 때문에 문제가 발생함
/////왜냐하면 arr,arrSub,arrSub2등등...새로운 배열마다 메모리가 무한정 할당됨 ==> static을 이용해서 극복할수 있음
import java.util.*;
public class MainClass_4 {
    
	public static void main(String[] args) {
		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(100)+1; //1~100
		}
		System.out.println("==========정렬 전==========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==========정렬 후==========");
		Arrays.sort(arr);//ASC(오름차순)
		System.out.println(Arrays.toString(arr));
		
		//**가변배열 만드는법 : 컬렉션이 나오기 이전에 사용됨
		//작은 배열을 잘라올때
		System.out.println("======copyOf(arr,3)======");
		int[] subArr=Arrays.copyOf(arr, 3); //(arr에서 , 3개 가져온다는뜻)
		System.out.println(Arrays.toString(subArr));
		
		//큰 배열로 잘라올때
		System.out.println("======copyOf(arr,10)======");
		int[] subArr2=Arrays.copyOf(arr, 10); //(arr에서 , 10개 가져온다는뜻) => 초과되는 인덱스는 초기값(0)으로 채워짐
		System.out.println(Arrays.toString(subArr2)); 
		//초과되는 인덱스에서 초기값 설정되는 범위
		/*
		 * int[] => 0
		 * double[] => 0.0
		 * 클래스 => null
		 * boolean => false
		 */
		
		/////해당방법의 단점 : 배열이 계속해서 새로 만들어지기 때문에 문제가 발생함
		/////왜냐하면 arr,arrSub,arrSub2등등...새로운 배열마다 메모리가 무한정 할당됨 ==> static을 이용해서 극복할수 있음

	}

}
