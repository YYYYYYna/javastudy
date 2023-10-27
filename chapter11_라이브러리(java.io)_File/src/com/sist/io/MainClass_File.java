package com.sist.io;
/*
 *      [데이터저장]==============================>[데이터가공]=====================>[데이터출력]
 *      파일                                                                     도스출력
 *       => 업로드,다운로드,openAPI                                                   ↓
 *                                                                              윈도우**
 *      오라클(RDBMS)                                                               ↓
 *       => JDBC = DBCP = ORM                                                   브라우저
 *                        (라이브러리:마이바티스,JPA)
 *      --------------------------------------------------------------------------------
 *       사용자 정의 클래스
 *       + 라이브러리
 *       -------------한개의 프로그램 완성
 *         라이브러리)
 *             java.lang => Object,String,Math,Wrapper,**StringBuffer
 *             java.util => Date,StringTokenizer,List,Map,**Set,Calendar
 *             java.io => File,FileInputStream/FileOutputStream,FileReader/FileWriter,
 *                        BufferedReader,ObjectInputStream/ObjectOutputStream
 *             java.net => URL/URLEncoder/Socket
 *             java.sql => Connection/Statement/ResultSet
 *             java.text => DecimalFormat/SimpleDateFormet
 *       
 *       2차자바:브라우저(Web)
 *       3차자바:Spring(핵심)
 *      --------------------------------------------------------------------------------
 *       1) IO : Input/Output => 입출력
 *               ------------
 *                 = 메모리
 *                 = 파일
 *                 = 네트워크 
 *               -----------> 클래스가 동일
 *         
 *         입출력 방식
 *         -------- 
 *         메모리(데이터 저장) ======> 자바응용프로그램 ==============> 화면 출력
 *          -파일,네트워크      |                            |
 *                          InputStream                  OutputStream
 *                          |                            |
 *                          일반파일(.zip .png...)          <Writer>
 *                           => 1byte씩 읽음 ==> 바이트스트림
 *                          문자저장파일(.txt .dat...)
 *                           => 2byte씩 읽음 ==> 문자스트림
 *                          <Reader>
 *             스트림)
 *                데이터 이동통로
 *                읽기 혹은 쓰기 단방향 송신 => 두개 프로그램 동시에 수행(쓰레드)
 *                => 네트워크
 *                => 웹에서는 이미 서버가 만들어져 있다(서버가 동작할수 있도록 기능을 추가하는것)
 *                      
 *             바이트 스트림:1byte)
 *                => 업로드, 다운로드, 카페...
 *                InputStream                                        OutputStream
 *                |                                                  |
 *                FileInputStream                                    FileOutputStream
 *                FilterInputStream
 *                |
 *                BufferedInputStream
 *                  => 메모리 전체를 저장(속도가 빠르다) : 파일통으로저장
 *                ObjectInputStream
 *                  => 파일을 객체단위로 저장 : 파일문장단위로저장
 *             
 *             문자 스트림:2byte)
 *                => 파일제어(한글) => 파일읽기/쓰기
 *                Reader                   Writer
 *                |                        |
 *                FileReader               FileWriter
 *                |                        |
 *                BufferedReader           BufferedWriter
 *                
 *             독립적인 클래스)
 *                File) : 일반클래스
 *                   정보를 읽어올때 생성자를 이용한다
 *                   file
 *                     new File("경로명\\파일명")
 *                   directory => 폴더정보를 가져올때 이용함
 *                     new File("경로명")
 *                   => 주요메소드
 *                      1)파일특성
 *                        =읽기전용 => boolean canRead()
 *                        =쓰기전용 => boolean canWrite()
 *                        =숨김파일 => boolean isHidden()
 *                      2)파일정보
 *                        =파일명 : String getName()
 *                        =경로명+파일명 : String getPath()
 *                        =경로명 : String getParent()
 *                        =파일크기 : long length() **리턴형int아님!!
 *                        =수정일 : long lastModified()
 *                      3)파일종류
 *                        =파일여부확인 : boolean isFile()
 *                        =폴더여부확인 : boolean isDirectory()
 *                      4)파일,디렉토리 만들기
 *                        =createNewFile() => 파일만들경우
 *                        =mkdir()
 *                      5)삭제
 *                        =void delete() => 폴더삭제시 파일이 존재하면 삭제불가능
 *                         rm 파일명, rm-rf (리눅스)
 *                         AWS(리눅스=명령어)
 *                      6)존재여부확인
 *                        =boolean exists()
 *                      7)폴더에 있는 모든 파일 읽기
 *                        =File[] listFiles()
 *                      8)파일 크기
 *                        Byte => KB(파일크기/1024) => MB(파일크기/1024)/1024
 *                   => 파일읽기 : FileInputStream/FileReader
 *                            => String 저장 불가능 : byte[]로 변경해서 저장
 *                   => 파일쓰기 : FileOutputStream/FileWriter
 *                            => String 자체를 저장
 *             
 *              바이트스트림) 
 *                  (1byte씩 송수신) => 자료실 (업로드,다운로드)
 *                                => 갤러리게시판, 후기게시판
 *                                    
 *              문자스트림) 
 *                  (2byte씩 송수신) => 한글(한글자당2byte)파일읽기/저장
 *                                => Git을 연결할때 UTF-8로 통일하지 않으면 다 깨짐...
 *             
 *              보조스트림)
 *                  읽는 속도와 쓰는 속도를 빨리 하기 위해 미리 메모리에 올려놓고 시작
 *                  예)속도 : String < StringBuffer
 *                                         ------
 *                                         임시로 저장을 한 후에 올리는 형식이라 빠름
 *              
 *              네트워크)
 *                   OutputStream (1byte)
 *                   BufferedReader (2byte로 변환후 수신)
 *                   
 *              ==> 메소드 : read(),write(),close()
 *              ==> IO는 반드시 예외처리한다(체크 예외처리)             
 */

//폴더 전체 확인
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		try {
			//directory확인
			File dir=new File("c:\\javaDev"); //파일명 지정안하면 디렉터리 정보 가져옴
			                 //윈도우는 \, \는 반드시 2개\\를 사용
			                 //mac,linux 는 /
			                 //가급적 절대경로를 이용하기
			                 // . => 현재폴더  |  .. => 상위폴더:cd:change directory
			// 폴더안에 있는 폴더/파일읽기
		    File[] list=dir.listFiles();
		    //출력
		    for(File f:list)
		    {
		    	if(f.isFile())
		    	{
		    		System.out.println(f.getName()+"=(file)");
		    	}
		    	else if(f.isDirectory())
		    	{
		    		System.out.println(f.getName()+"=(Directory)");
		    	}
		    }
		}catch(Exception ex)
		{
			
		}

	}

}
