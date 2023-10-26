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
 *             : 파일 쓰기 / 파일 읽기 할때 주로사용(한글은2byte라서위에는깨짐)
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
 */
public class MainClass_1 {
	public static void main(String[] args) {
		
	}

}
