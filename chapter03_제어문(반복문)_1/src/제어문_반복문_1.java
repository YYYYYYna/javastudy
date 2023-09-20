/*    //묶어서사용=캡슐화 / 받아서사용=상속
 * 
 *     1. 반복문 => 중복을 제거
 *                --------- 메소드
 *                
 *        1. 데이터 저장
 *           변수 (한개만 저장이 가능) => 묶어서 사용
 *           ex) 국어,영어,수학,총점,평균의 데이터가 120명이 잇다면??
 *           ----------------------- 배열을 사용해 간략히 표현가능
 *                                   --- 그러나 같은것끼리만 묶을수 있음 이점을 보안하여 "클래스"를 사용함
 *           
 *        2. 명령문 => 묶어서 사용
 *           ----------------- 메소드 ...
 *                             -----------+ 클래스
 *     2. 반복문의 종류
 *        1. for : 횟수가 지정된 경우 주로 사용
 *                 => ex) 화면출력, 리스트목록출력, 영화목록출력
 *           일반for / 향상된for(항상 배열/컬렉션이 있어야함)
 *              |
 *         => for문만! 2차까지 준비해야함(웹에서가끔등장하기때문+앱에선주로사용함...돈벌려면해야함) => 코테에서 나옴
 *        
 *        2. while : 횟수가 없는 경우에 주로 사용
 *                 => 무한루프(ex.파일읽기,데이터베이스)
 *                 
 *        3. do~while : 반드시 한번이상을 수행 (사용빈도가 거의 없다.)
 *        --------------------------------------------------
 *            | 각각의 사용처가 규정이나 문법사항은 아니다. 편한거 사용하면됨
 *        
 *     3. 제어 (다시 시작, 종료)
 *        -----------------
 *        break; 반복문 중단
 *        continue 특정부분 제외
 *     
 *     for문에서 중요한부분
 *     ----------------
 *     1)형식 for(초기값;조건식;증감식) => 가급적이면 {}을 사용해야 덜 헷갈림
 *             반복실행문장
 *             문장 ==> for문소속문장이아님
 *             
 *                            |false면 종료| 
 *                            |          |
 *                      1     2←반복-3    |
 *     2)동작(순서) for(초기값;조건식;증감식)  |
 *                {           |true 3    | 
 *                  반복실행문장 4 <---------
 *                }
 *             
 *     3)패턴
 *     
 *        
 *                 
 */

//import java.io.FileReader;
import java.io.*;
public class 제어문_반복문_1 {

	public static void main(String[] args) throws Exception{
		/*String s="ABCDEFGHIJKLMNOP";
		
		//방법1
		String[] alpha=s.split("");
		for(int i=0;i<alpha.length;i++)
		{
			System.out.println(alpha[i]);
		}
		
		System.out.println();
		//방법2 
		for(String ss:alpha)
		{
			System.out.println(ss);
		}*/

        FileReader fr=new FileReader("C:\\Users\\sist\\git\\java_study\\chapter03_제어문(반복문)\\src\\제어문_반복문9.java");
        int i=0;
        while((i=fr.read())!=-1) //-1=EOF(문장끝날때까지)
        {
        	System.out.print((char)i); //해당파일을 읽어옴
        }
        
	}

}
