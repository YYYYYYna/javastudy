package com.sist.io;
//한글 파일 읽기 => (X) => 다움로드/업로드에 사용
//read() , writh() ==>append
// create모드(W모드)=> new FileInputStream / new FileOutputString("경로명") : 다 읽고 맨 마지막 한줄만 저장됨
// append모드=> new FileOutputString("경로명",true) : 읽은값은 다 저장해줌

//파일은 한번 열면 반드시 .close로 닫는다!!!!!!

import java.io.*;
import java.util.*;
public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		try {
			String[] cate= {
					"얼큰한 칼국수 맛집 베스트 20곳",
					"여의도 맛집 베스트 50곳",
					"일본 라멘 맛집 베스트 70곳",
					"어복쟁반 맛집 베스트 15곳",
					"한식 주점 베스트 30곳"
			        }; //아까만든 category.txt에 저장하려고함
			
			for(String s:cate)
			{
				//파일저장
				FileOutputStream fos=new FileOutputStream("c:\\java_data\\category.txt",true);//append모드
				//byte를 문자열로 변환
				fos.write((s+"\r\n").getBytes());
				            //\r한칸띄고 \n한줄띄기
				fos.close();//꼭 닫기!!!
			}
			System.out.println("파일저장완료!");
		}catch(Exception ex)
		{
			
		}

	}

}
