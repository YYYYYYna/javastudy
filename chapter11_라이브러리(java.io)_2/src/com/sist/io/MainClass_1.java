package com.sist.io;
/*
 *      IO => 입력,출력
 *      = 메모리 입출력
 *      = 파일 입출력
 *      = 네트워크 입출력
 *      ------------------
 *       1. 클래스의 종류
 *          1) 송수신 => 1byte === 바이트 스트림
 *          2) 송수신 => 2byte === 문자 스트림
 *             ** 스트림 : 데이터를 이동하는 통로
 *          메모리,파일,네트워크 ===== 자바응용프로그램 ===== 화면출력
 *                           |                 |
 *                    InputStream(1byte)   OutputStream
 *                    Reader(2byte)        Writer
 *          3) 클래스
 *             = 1byte(바이트 스트림)
 *               => 파일전송, 업로드, 다운로드 => byte단위로 전송
 *                 InputStream : 읽기                                
 *                     |
 *                 ------------
 *                 |          |
 *         FileInputStream    FilterInputStream
 *                                    |
 *                           **BufferedInputStream
 *                
 *                OutputStream : 쓰기
 *                     |
 *                ------------
 *                |          |
 *      **FileOutputStream   FilterOutputStream
 *                                   |
 *                           **BufferedOutputStream
 *              ** Buffer : 임시기억장소 => 속도 최적화
 *                 => 파일이나 웹서버에 있는 모든 데이터를 메모리에 올려놓고 시작
 *           = 2byte => 파일제어 (파일읽기/파일쓰기)
 *             *** 문자스트림 (한글 => 2byte)
 *                 Reader             Writer
 *                 |                  |
 *               **FileReader       **FileWriter
 *                 ----------         ----------
 *               **BufferedReader     BufferedWriter
 *             = 객체 단위 저장
 *               = ObjectInputStream
 *               = ObjectOutputStream
 *               = 직렬화 / 역직렬화
 *               
 *               객체저장
 *               class A
 *               {
 *                  int age;
 *                  String name;
 *                  int kor;
 *               }
 *               A a=new A(); //메모리 공간을 만들어서 저장한다
 *               
 *               메모리에 저장 : 직렬화 ==> ObjectOutputStream
 *               메모리에서 값 읽기 : 역직렬화 ==> ObjectInputStream 
 *               
 *        => 파일 관련
 *           .txt (파일 자체를 제어)
 *           ---- Spring,MyBatis ==> XML을 대체(어노테이션)
 *                ------ xml없이 사용 => Spring-boot
 *           .xml , .json , .csv , .properties (웹)
 *           ----   -----   -----
 *             |      |       |=>데이터분석(공공포털)
 *             |      |=>JavaScript:자바의데이터형과연동이안됨
 *             |=>Spring
 *             ------------------------------------------> 제어(읽기/쓰기) 클래스가 이미 라이브러리
 *        
 *        => 파일 정보 => File
 *           File : 파일, 디렉토리까지 관리
 *           ---- 일반클래스
 *           사용법)
 *             File file=new File(c:\\javaDev\\aa.txt")
 *                => 파일 정보 읽기
 *             File dir=new File("c:\\javaDev")
 *                => 폴더 정보 읽기
 *           주요메소드)
 *             long length() : 파일크기 => 단위 Bytes
 *             String getName() : 파일이나 폴더 이름만 읽은경우
 *             String getPath() : 경로+이름
 *             String getParent() : 경로
 *             boolean isFile(), boolean isDirectory()
 *             boolean exists() : 존재여부 확인
 *             File[] listFiles() : 폴더안에 있는 모든 파일 읽기
 *             delete() : 파일삭제
 *             createNewFile() : 파일생성
 *             mkdir() : 폴더생성
 *           --------------------------------------------
 *           FileInputStream / FileReader
 *              => read() , read(byte[],offset,len), close()
 *           FileOutputStream / FileWriter
 *              => writer() , write(String..), close()
 *                     
 */

import java.io.*;
//패키지설정을 해야함 => 예외처리(체크예외) => 컴파일러가 예외처리 했는지 체크

//=> Buffered (속도가 빠르다) => 파일읽기

public class MainClass_1 {

	public static void main(String[] args) {
		/*
		try {
			String data="";
			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			System.out.println(data);
		}catch(Exception ex){}
		*/
		try {
			FileInputStream fis=
					new FileInputStream("c:\\javaDev\\genie.txt");
			//한번에 데이터 읽기
			BufferedReader in=
					new BufferedReader(new InputStreamReader(fis));
			        //    1byte =============> 2byte 로 변환 : 필터스트림
			String data="";
			while(true)
			{
				String s=in.readLine();//=한줄씩 읽어오기
				if(s==null)
				{
					break;
				}
				data+=s;
			}
			in.close();
			System.out.println(data);
		}catch(Exception ex){}
	}

}
