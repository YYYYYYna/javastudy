package com.sist.io;
//BufferedOutputStream => 파일 쓰기
import java.io.*;
public class MainClass_4 {

	public static void main(String[] args) {
		try {
			//1. 파일생성
			FileOutputStream fos=
					new FileOutputStream("c:\\java_data\\sawon.txt");
			//2. 메모리생성
			BufferedOutputStream bos=
					new BufferedOutputStream(fos); //메모리로 이동시킴
			//3. 값 할당
			String data="홍길동|개발부|서울|대리|3600\r\n";
			bos.write(data.getBytes());
			//4. 파일닫기
			bos.close();//File을 연결해서 처리
		}catch(Exception in)
		{}
	}

}
