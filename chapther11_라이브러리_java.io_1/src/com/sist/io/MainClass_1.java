package com.sist.io;
/*
 *       자바 입출력 (입력: InputStream, 출력: OutputStream)
 *                ------------------------------------ IO
 *       => 반드시 예외처리를 해야한다
 *       => 반드시 import를 이용해서 클래스를 읽어온다
 *               ------(java.io.*)
 *       
 *       특징)
 *         1.단방향 (빨대라고 생각하면됨)
 *         2.데이터 이동통로를 이용하고 있다
 *           ----------Stream
 *         3.이동통로
 *           = 1byte씩 읽는통로 : 바이트 스트림
 *             ~InputStream , ~OutputStream
 *             : 파일 업로드 / 파일 다운로드 할때 주로 사용
 *             : 네트워크는 1바이트씩...
 *             
 *           = 2byte씩 읽는통로 : 문자 스트림
 *             ~Reader(FileReader) , ~Writer
 *             : 파일 쓰기 / 파일 읽기 할때 주로사용
 *             : 한글은 한 글자당 2byte라서 1byte사용시 깨짐
 *      -----------------------------------------------------------------
 *        바이트 스트림 => file (:파일 입출력에 중점을 두고 구분할것)
 *        ---------
 *         InputStream           OutputStream
 *              |                     |
 *        FileInputStream      FileOutputStream
 *        ObjectInputStream    ObjectOutputStream
 *        
 *         Reader                  Writer
 *         ------                  ------
 *           |                       |
 *         FileReader              FileWriter
 *      -----------------------------------------------------------------
 *        보조스트림 (Buffered~)
 *        => BufferedReader , BufferedWriter , 
 *           BufferedInputStream , BufferedOutputStream
 *      -----------------------------------------------------------------
 *        
 *        
 *        1) 자바 특징
 *           ------
 *           자바에서는 IO는 Stream을 사용하고 있다
 *                       ------
 *                         |데이터를 이동하는 통로
 *                         ----------------- ⓐFIFO(선입선출) = Queue(큐)
 *                                           ⓑLIFO(선입후출) = Stack(스텍:메모리)
 *                                           
 *       => IO
 *          = 메모리 입출력
 *          = 파일 입출력
 *          = 네트워크 입출력 => 웹!
 *       
 *       => IO는 단방향통신
 *       => 쓰레드는 양방향통신 : 두개의 프로그램을 동시에...
 *                        : 예) 채팅(수신과발신을동시에)
 *       => 아무튼 읽기/쓰기를 도와줌
 *          (1byte, 2byte)
 *          
 *          자바(서버) =====> 브라우저 =====> 화면출력
 *                           |
 *                         더블클릭으로실행한다는건? C나 C++로 만들어졌다는말
 *                         
 *          자바는 char당 바이트가 2
 *          C는 char당 바이트가 1
 *          화면출력은 char당 바이트가 2
 *          ==> 서로 호환이 안됨
 *          
 *          그래서 자바=>브라우저는 char=>byte로 변경(인코딩)
 *               브라우저=>화면출력은 byte=>char로 변경(디코딩) 하는 과정을 통해 출력함
 *     
 *        356page
 *        메모리 (데이터 저장) ====== 자바 응용 프로그램 ====== 모니터 전송
 *                          |                    |
 *                      InputStream         OutputStream
 *                      =System.in에서 in    =System.out에서 out
 *                       => class System
 *                          {
 *                             static InputStream in;
 *                             static OutputStream out;
 *                          }
 *                          
 *        357page
 *        IO관련 클래스:중요한거 책에 표시해둠
 *                     Object
 *                       |
 *        --------------------------------------------------------------
 *        |        |                           |              |        |
 *        "File"   InputStream                 OutputStream   Reader   Writer
 *                 |                           |
 *                 "FileInputStream"           "FileOutputStream" 
 *                 FilterInputStream(위를보강)    FilterOutputStream(위를보강)
 *                 |                           |
 *                 "BufferedInputStream"       "BufferedOutputStream"
 *                 
 *        ==> 파일모드(mode) => r,w,a
 *            : r모드=읽기
 *              FileReader r=new FileReader("경로") => create모드
 *            : w모드=쓰기
 *              FileReader w=new FileWriter("경로") => create모드
 *            : a모드
 *              FileReader a=new FileReader("경로",true) => append모드
 *              
 *        ==> File : 독립된 클래스
 *            ----
 *             =File 정보
 *              new File("경로명\\파일명") ==> 파일 정보 읽어옴
 *             =디렉터리 정보
 *              new File("경로명") ==> 디렉터리 정보 읽어옴
 *             주요기능)
 *               getName() : 파일명 , 폴더명
 *               getPath() : 경로명부터 ~ 파일명까지 전부 읽을때
 *               getParent() : 경로명만 읽을때
 *             특성)
 *               canRead() : 읽기전용인지? t/f
 *               canWrite() : 쓰기전용인지? t/f
 *               isHidden() : 숨김파일인지? t/f
 *              파일인지폴더인지확인)
 *               isFile() : 파일인지? t/f
 *               isDirectory : 디렉토리인지? t/f
 */

import java.util.*;
/*
 *     데이터를 이동하는 통로
 *     ----------------- ⓐFIFO(선입선출) = Queue(큐)
 *                       ⓑLIFO(선입후출) = Stack(스텍:메모리)
 *     
 *     코딩테스트 가장 많이 나오는 문제 : 스텍과 큐를 만드시오
 *     int[] arr=new int[10];
 *     //큐예시
 *     int index=0;
 *     for(int i=0;i<arr.length;i++)
 *     {
 *        이러면 "선입선출"이 가능해짐 =>큐
 *     }
 *     
 *     //스텍예시
 *     int index=9;
 *     for(int i=9;i>=0;i--)
 *     {
 *        이러면 "선입후출:이 가능함 =>스텍
 *     }
 */
public class MainClass_1 {
	public static void main(String[] args) {
		
		/*
		Queue<Integer> q=new LinkedList<Integer>();
		//데이터 첨부 : add가 아니라 offer사용
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		//ⓐFIFO(선입선출) = Queue(큐)방식
		while(!q.isEmpty())
		{
			System.out.println(q.poll());//get아니고 poll로 사용
		}
		
		System.out.println("========");
		Stack<Integer> s=new Stack<Integer>();
		//***new를 사용하면 일반클래스임
		
		//데이터 첨부 : add가 아니라 push사용
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		//ⓑLIFO(선입후출) = Stack(스텍:메모리)방식
		while(!s.isEmpty())
		{
			System.out.println(s.pop());//get아니고 pop로 사용
		}
		*/
		
		String s="자바";
		byte[] b=s.getBytes();// =>이게 디코딩
		System.out.println(Arrays.toString(b));
		
		
	}

}
