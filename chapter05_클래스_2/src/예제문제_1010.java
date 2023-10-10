import java.text.DecimalFormat;

public class 예제문제_1010 {
//1번문제
class 영화
{
	//[구분자]
	int movieId; //고유번호 => 상세보기,찾기
		
	//[변수들]
	String poster;
	String nameKr;
	String nameEn;
	String regdate;//개봉일
	String genre;//장르
	String nation;
	String grade;
	String time;
	double score;
	int boxoffice;
	
	String subject;
	String content;
}

//2번문제
class 뉴스
{
	//구분자
	int news_no;
	
	//변수
	String poster;
	String title;
	String content;
	String regdate;
	String author;
}

//3번문제
class 맛집_카테고리
{
	//구분자
	int Food_cate_no;
	
	//변수
	String poster;
	String title;
	String subject;
}

//4번문제
class 맛집
{
	//구분자
	int Food_cate_no;
	int fno;
	
	//변수
	String name;
	double score;
	String address;
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu;
}

//5번문제
class 레시피
{
	//구분자
	int recipe_no;
	
	//변수
	String poster;
	String title;
	String chef;
	int score;
	int hit;
	int userShow;
}

//6번문제
class 뮤직
{
	//구분자
	int music_no;
	
	//변수
	int rank;
	String state;//유지- 상승▲ 하강▼
	int idcrement;//등폭 state뒤에 적힌 숫자
	String poster;
	String title;
	String singer;
	String album;
	int userLike;//아래에 출력하는 형식 적어둠
}

//7번문제
class 상품
{
	//구분자
	int goods_no;
	
	//변수
	int goods_discount;
	String goods_poster;
	String goods_name;
	int goods_price;
	//출력시 문자열결합이 가능하니까 숫자는 되도록 int로 나타내기
}

//8번문제
class 연극
{
	//[구분자]
	int musical_no; //고유번호 => 상세보기,찾기
		
	//[변수들]
	String poster;
	String showNow;
	String title;
	String genre;//장르
	String regdate;//개봉일
	String location;
	String actor;
	String grade;
	double time;
}
	public static void main(String[] args) {
		//상승폭 + 상승숫자 + , 로 출력하는법
		int like=3216549;
		//라이브러리
		//=> 숫자 => int
		DecimalFormat df=new DecimalFormat("###,###");
		//new => 새로운 메모리 공간 생성
		System.out.println("▲"+df.format(like));
		//출력시 문자열결합이 가능하니까 숫자는 되도록 int로 나타내기

	}

}
