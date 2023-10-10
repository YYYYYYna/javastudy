//  영화정보
//  프로그램 기본 => 묶는것이다. => 한개의 이름으로 사용

/*
 *    변수=>1개 / 메모리 이름이 여러개일때
 *         방법1) a~z => if문 26번
 *         방법2) a[] => for문 1번 : 이쪽이 더 짧고 간단함     
 *    데이터형 여러개(변수 여러개) 
 *         방법3) class로 통합 : 훨씬 더 관리하기 쉬움
 *    
 *    **변수통합 => 클래스통합 => 인터페이스
 *    
 *    **클래스 = 사용자 정의 데이터형 (우리에게 필요한걸 만들어 써야함)
 *             단점 : 폴더가 다르면 접근못함
 *             default
 *       
 */
class Movie
{
	//[구분자]
	int movieId; //고유번호 => 상세보기,찾기
	
	//[변수들]
	String poster;
	String nameKr;
	String nameEn;
	String regdate;
	String genre;//장르
	String nation;
	String grade;
	String time;
	double score;
	int showUser;
	int boxoffice;
	int startDay; //개봉일 디데이
	
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
