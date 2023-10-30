package com.sist.io;
import java.io.*;
//BufferedInputStream => 파일 데이터 읽기
public class MainClass_3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=
					new FileInputStream("c:\\javaDev\\geine.txt");
			BufferedInputStream bis=
					new BufferedInputStream(fis);
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.println((char)i);
				//그런데 이렇게 읽어오면 한글이 깨짐
			}
			bis.close();
		}catch(Exception ex) {}

	}

}
