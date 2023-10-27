package com.sist.io;
import java.io.*;

public class MainClass_FileInputStream {

	public static void main(String[] args) {
		try {
			//이건 한글 깨짐
			//FileInputStream fis=new FileInputStream("c:\\java_data\\category.txt"); 
			
			//이건 한글 안깨짐
			FileReader fis=new FileReader("c:\\java_data\\category.txt");
			
			//파일은 한글자씩읽어옴 => (ASC:문자번호)아스키코드값을 읽음
			int i=0;
			//파일 끝날때까지 읽음 => -1(EOF)
			String msg="";
			while((i=fis.read())!=-1)
			{
				msg+=(char)i;
			}
			//바이트 스트림은 => 한글파일읽기 => 파일업로드/파일다운로드
			fis.close();
			System.out.println(msg);
		}catch(Exception ex) {}

	}

}
