/*
 *    contains, startsWith, endsWith 3가지 메소드로
 *    검색 프로그램 만들기
 *    (주로 검색기 혹은 자동완성기에 쓰임)
 */
import java.util.Scanner;
public class 문자열7 {

	public static void main(String[] args) {
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어를 입력 : ");
		String findData=scan.nextLine(); //공백이 있어도 전체문장 가져옴(엔터전까지)
		System.out.println(findData);
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData))//검색한 단어가 포함된 데이터를 찾음
			//if(data[i].endsWith(findData))//검색한 단어와 뒤가 같은 데이터를 찾음
			//if(data[i].startsWith(findData))//검색한 단어와 앞이 같은 데이터를 찾음
			//contains랑 startsWith는 매우 중요하니 꼭 기억하기
			{
				try
				{
					Thread.sleep(100);//출력하는 속도
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
