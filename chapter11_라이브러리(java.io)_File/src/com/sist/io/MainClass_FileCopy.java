package com.sist.io;
/*
 *    파일 업로드와 다운로드는 파일을 카피해서 진행하는거임
 *    
 *    FileInputStream / FileOutputStream 의 주 역할 : 파일복사..(웹:업로드,다운로드)
 *    
 *    파일이용 => 메모리(데이터=>프로그램 종료시에 자동으로 해제)
 *    -----
 *    영구적으로 하기위해 저장함
 *    
 *    파일의 단점 : 보안에 취약하다
 *             : 파일은 종속적이다(여러개의 파일을 연결해서 사용하기 어렵다)
 *             : 로컬 이용
 *    데이터베이스(파일의단점을극복함)
 *             : 보안이 강하다
 *             : 원격이용이 가능하다
 */

import java.io.*;
public class MainClass_FileCopy {

	public static void main(String[] args) {
		try {
			//파일 읽기 => 서버
			FileInputStream fis=new FileInputStream("c:\\javaDev\\back.jpg");
			//파일 쓰기 => 클라이언트
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\back.jpg");
			
			//파일 복사
			int i=0;//=읽은 바이트수
			byte[] buffer=new byte[1024];//=한번에 1024byte씩 읽어서 복사
			//**read()=한글자씩 읽음 **read(byte[])=지정한 바이트씩 읽음
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				fos.write(buffer,0,i);//읽은 바이트=i만큼 저장해라
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
			
		}catch(Exception ex) {}

	}

}
