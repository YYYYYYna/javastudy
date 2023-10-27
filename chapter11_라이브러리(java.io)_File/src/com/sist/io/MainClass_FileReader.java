package com.sist.io;
import java.io.*;
//파일 읽기 => 송수신 => 2byte씩 읽어온다 => 문자스트림
//파일 자체 제어 : Reader/Writer
public class MainClass_FileReader {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\java_data\\sawon.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}catch(Exception ex) {}
		}

	}

}
