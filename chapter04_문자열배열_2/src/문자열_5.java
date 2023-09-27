import java.io.*;//파일읽기/파일입출력
import java.util.*;
/*
 *     라이브러리 자주 쓰이는것들 모음
 *     -------
 *        java.lang : Object, String, StringBuffer, Math, Wrapper
 *        java.util : List, Set, Map
 *        java.io   : (파일 업로드/다운로드 과정)
 *        java.net
 *        java.text
 */
public class 문자열_5 {
	static String movie;//이 movie라는 변수를 만들어서 안에 데이터를 다 넣어둠
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1)//몇글자인지 알수 없으니까 for문말고 while
				               //-1=파일끝날때까지
			{
				data.append((char)i);
			}//append와 StringBuffer를 사용하면 while문 단독 사용보다 훨~씬 속도가 줄어듬
			movie=data.toString();
			
		}catch(Exception ex){}
	}
                                           //예외처리
	public static void main(String[] args) throws Exception {
		
		//System.out.println(movie);//movie라는 String데이터가 내장되어있다고 전제하고 실행함
		//↑위를 실행하면 모든 데이터가 출력됨
		
		String[] movieData=movie.split("\n");//한 행씩 잘라서 배열로 저장함
		//System.out.println(movieData[0]);//맨 첫번째 행이 출력됨
		//↑행의 구성을 보면 8가지의 변수로 구성된걸 확인 가능
		//System.out.println("영화갯수 : "+movieData.length);//총 영화갯수 출력
		
		
		System.out.println("================== 영화목록 ==================");
		//Q. 검색기능사용하기
		//1. 송강호가 출연한 영화를 출력하시오
		Scanner scan=new Scanner(System.in);
		/*System.out.print("이름 입력 : ");
		String name=scan.next();
		for(String movie:movieData)//그안에 행 정보를 또 열로 나눠서 출력하기...(2중배열개념인듯)
		{
			String[] detail=movie.split("\\|");
			if(detail[4].contains(name))//검색어가 포함된 영화찾기
			{
				System.out.println("순위 : "+detail[0]);
				System.out.println("영화명 : "+detail[1]);
				System.out.println("장르 : "+detail[2]);
				//System.out.println("포스터 : ");//이미지출력안되니까포스터부분건너뜀
				System.out.println("출연자 : "+detail[4]);
				System.out.println("개봉일 : "+detail[5]);
				System.out.println("관람등급 : "+detail[6]);
				System.out.println("감독 : "+detail[7]);
				System.out.println("---------------------------------------------------");
			}
			
		}*/
		//2. 1990년대에 개봉한 영화를 출력하시오
				/*for(String movie:movieData)
				{
					String[] detail=movie.split("\\|");
					if(detail[5].contains("1990"))//검색어가 포함된 영화찾기, 문자임! 숫자아님!
					{
						System.out.println("순위 : "+detail[0]);
						System.out.println("영화명 : "+detail[1]);
						System.out.println("장르 : "+detail[2]);
						//System.out.println("포스터 : ");//이미지출력안되니까포스터부분건너뜀
						System.out.println("출연자 : "+detail[4]);
						System.out.println("개봉일 : "+detail[5]);
						System.out.println("관람등급 : "+detail[6]);
						System.out.println("감독 : "+detail[7]);
						System.out.println("---------------------------------------------------");
					}
					
				}*/
	   
	    //3. 12세 관람가 영화를 출력하시오
				/*for(String movie:movieData)
				{
					String[] detail=movie.split("\\|");
					if(detail[6].startsWith("12"))//12로 시작하는 영화찾기,12는 문자임! 숫자아님!
					{
						System.out.println("순위 : "+detail[0]);
						System.out.println("영화명 : "+detail[1]);
						System.out.println("장르 : "+detail[2]);
						//System.out.println("포스터 : ");//이미지출력안되니까포스터부분건너뜀
						System.out.println("출연자 : "+detail[4]);
						System.out.println("개봉일 : "+detail[5]);
						System.out.println("관람등급 : "+detail[6]);
						System.out.println("감독 : "+detail[7]);
						System.out.println("---------------------------------------------------");
					}
					
				}*/
		//4. 검색한 관람가 영화를 출력하시오
		        System.out.print("등급 입력 : ");
		        int grade=scan.nextInt();
				for(String movie:movieData)
				{
					String[] detail=movie.split("\\|");
					if(detail[6].startsWith(String.valueOf(grade)))//검색어 영화찾기 숫자라서 형변환해줘야함!
					{
						System.out.println("순위 : "+detail[0]);
						System.out.println("영화명 : "+detail[1]);
						System.out.println("장르 : "+detail[2]);
						//System.out.println("포스터 : ");//이미지출력안되니까포스터부분건너뜀
						System.out.println("출연자 : "+detail[4]);
						System.out.println("개봉일 : "+detail[5]);
						System.out.println("관람등급 : "+detail[6]);
						System.out.println("감독 : "+detail[7]);
						System.out.println("---------------------------------------------------");
					}
					
				}
		

	}

}
