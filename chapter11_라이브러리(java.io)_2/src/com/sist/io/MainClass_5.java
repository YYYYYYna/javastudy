package com.sist.io;
import java.io.*;
public class MainClass_5 {
//파일 카피하기 == 업로드/다운로드
	public static void main(String[] args) {
		try {
			FileInputStream fis=
					new FileInputStream("c:\\javaDev\\genie.txt");
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\genie.txt");
			BufferedInputStream bis=
					new BufferedInputStream(fis);
			BufferedOutputStream bos=
					new BufferedOutputStream(fos);
			
			int i=0;//read() => 한 글자 읽기
			//read(byte[]) => 읽은 바이트수
			byte[] buffer=new byte[1024];
			//=> 1024byte를 읽어서 => 새로운 파일에 전송
			while((i=bis.read(buffer,0,1024))!=-1)//현재는 i에 매개변수가 있음으로 값 설정이 가능
			{
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception ex) {}

	}

}
