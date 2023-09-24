// 문자 => 10개를 저장하는 배열 생성 => 초기화 => 출력

//실수배열 ==> double[] arr={10,20,30,40,50}
//=> 10.0
//double[]
//필기못한부분ㅠㅠ

//index를 이용하는 프로그램
/*
 *  int[]
 */



import java.util.Arrays;

public class 배열_생성2 {

	public static void main(String[] args) {
		char[] alpha=new char[10];
		// char a,b,c...
		// alpha[0]...alpha[9]
		// 초기화
		for(int i=0;i<alpha.length;i++) //length를 써서 길이로 for문을 돌림
		{
			alpha[i]=(char)((Math.random()*26)+65); //변환해서 랜덤알파벳 10개를 채움
		}
		// alpha={'A','B','C'...}
		// 출력 => for-each(배열과 컬렉션에서만 사용가능) ==> 웹출력
		System.out.println("\n====== for-each 이용 ======");
		for(char c:alpha) //여기는 인덱스값으로 변환해서 가져오는게 아님
		{
			System.out.print(c+" ");
		}
		System.out.println("\n====== for(일반):index이용 ======");
		//값을 변경, 초기화
		for(int i=0;i<alpha.length;i++)
		{
			System.out.print(alpha[i]+" ");
		}
		System.out.println("\n====== API ======");
		System.out.println(Arrays.toString(alpha));
		for(int i=alpha.length;i>=0;i--)
		{
			System.out.print(alpha[i]+" ");
		}
	}
}
