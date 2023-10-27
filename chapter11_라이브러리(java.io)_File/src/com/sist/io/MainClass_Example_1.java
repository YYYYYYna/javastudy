package com.sist.io;
//JavaDev => genie.txt 파일 읽어오기
import java.io.*;
public class MainClass_Example_1 {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\genie.txt");
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
