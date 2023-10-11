import java.util.*;
import java.io.*;

//사용자 정의 데이터형 제작
//: 데이터 정의만 하는 페이지 생성
class Movie
{
	//1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
	//|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
	//|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
	
	//구분자
	//배열은 구분자 따로 안만들어도됨 => 인덱스 번호 사용함 혹은 rank
	
	//변수
	String rank;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;	
}

//: 기능만 처리하는 페이지 생성
class MovieSystem
{
	static Movie[] movies=new Movie[1938];//인덱스값 아니고 인덱스갯수라서 n-1아님!
	
	// 1. 데이터를 초기화 해야함 (=생성자)
	MovieSystem()
	{
		//1-1. 파일을 읽으면 예외처리를 해줘야함
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			//***이자리에 String data=""; 를 적는것보다 StringBuffer를 사용하는게 더 빠름
			StringBuffer data=new StringBuffer();
			int i=0; //char => fr.read() => 한글자씩 정수
			while((i=fr.read())!=-1)
			{
				//***이자리에 data+=(char)i; 를 적는것보다 append를 사용하는게 더 빠름
				data.append((char)i);
				//문자열결합=append
			}
			fr.close();//꼭 닫아주기...^^
			//1-2. 한 줄씩 데이터 나누기(행나누기)
			String[] datas=data.toString().split("\n");
			//1-3. |를 기준으로 데이터 나누기(열나누기)
			i=0;
			for(String ss:datas) 
				     //ss는 Movie.txt를 가지고 있는 데이터변수
			{
				String[] s=ss.split("\\|");
				movies[i]=new Movie();
				movies[i].rank=s[0];
				movies[i].title=s[1];
				movies[i].genre=s[2];
				movies[i].poster=s[3];
				movies[i].actor=s[4];
				movies[i].regdate=s[5];
				movies[i].grade=s[6];
				movies[i].director=s[7];
				i++;
			}

		}catch(Exception ex) {}
	}
	// 2. 목록 출력 (=메소드)
	void list()
	//각자 rank, title...으로 묶인 8개의 데이터 꾸러미에서 호출값을 가져옴
	//Movie(0.rank(데이터꾸러미) / 1.title(데이터꾸러미) ... 7.director(데이터꾸러미)) 로 구성됨
	//이전에 메소드로만 만들었던 것과는 데이터의 묶인 형태가 다름
	{
		for(Movie m:movies)
		{
			System.out.println(m.rank+"."+m.title);
		}
	}
	// 3. 상세보기 (=메소드)
	void detail(int mno)
	//배열은 구분자 따로 안만들어도됨 => 인덱스 번호 사용함 혹은 rank
	//호출하기 위해서 매개변수가 필요함!!
	{
		Movie m=movies[mno-1];//인덱스번호라서 n-1
		System.out.println("======== 영화 상세보기 ========");
		System.out.println("영화명 : "+m.title);
		System.out.println("감독 : "+m.director);
		System.out.println("출연 : "+m.actor);
		System.out.println("장르 : "+m.genre);
		System.out.println("등급 : "+m.grade);
		System.out.println("개봉일 : "+m.regdate);
		System.out.println("순위 : "+m.rank);
		System.out.println("===========================");
	}
	// 4. 영화명 찾기 (=메소드)
	void movieNameFind(String title)
	{
		System.out.println("======== 제목 검색결과 ========");
		for(Movie m:movies)
		{
			if(m.title.contains(title))
			{
				System.out.println(m.title);
			}
		}
		System.out.println("===========================");
	}
	// 5. 출연으로 찾기 (=메소드)
	void movieActorFind(String actor)
	{
		System.out.println("======== 배우 검색결과 ========");
		for(Movie m:movies)
		{
			if(m.actor.contains(actor))
			{
				System.out.println(m.title+"["+m.actor+"]");
			}
		}
		System.out.println("===========================");
	}
	// 6. 장르 찾기 (=메소드)
	void movieGenreFind(String genre)
	{
		System.out.println("======== 장르 검색결과 ========");
		for(Movie m:movies)
		{
			if(m.genre.contains(genre))
			{
				System.out.println(m.genre);
			}
		}
		System.out.println("===========================");
	}
}
public class MovieMain {

	public static void main(String[] args) {
		//main=유저가 보는 위치 이부분이 JSP라네!!!!
		MovieSystem ms=new MovieSystem();
		ms.list();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("===========================");
		
		// 3. 상세보기 검색
		/*
		System.out.print("상세보기 할 영화 선택(1~1938) : ");
		int mno=scan.nextInt();
		ms.detail(mno);
		*/
		
		//4. 영화명으로 검색
		/*
		System.out.print("영화명을 입력 : ");
		String title=scan.next();
		ms.movieNameFind(title);
		*/
		
		//5. 출연으로 검색
		/*
		System.out.print("배우를 입력 : ");
		String actor=scan.next();
		ms.movieActorFind(actor);
		*/
		
		//6. 장르로 검색
		System.out.print("장르를 입력 : ");
		String genre=scan.next();
		ms.movieGenreFind(genre);
		
	}

}
