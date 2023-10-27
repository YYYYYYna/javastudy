package com.sist.io;
//존재여부 확인  ====> exists()
// 확인후 폴더/파일만들기 ===> mkdir/createNewFile
import java.io.*;
/*
 *      exists() : 존재여부확인
 *      createNewFile() : 새 파일 생성
 *      mkdir() : 새 디렉토리(폴더) 생성
 */
public class MainClass_File_1 {

	public static void main(String[] args) {
		try {
			//폴더 만들기
			File dir=new File("c:\\java_data");
			if(dir.exists())//dir은 존재하는가?
			{
				System.out.println("이미 존재하는 폴더 입니다!!");
			}
			else
			{
				dir.mkdir();//새폴더 생성
				System.out.println("폴더 생성 완료!!");
			}
			//파일 만들기
			File file=new File("c:\\java_data\\category.txt");
			if(file.exists())//dir은 존재하는가?
			{
				System.out.println("이미 존재하는 파일 입니다!!");
			}
			else
			{
				file.createNewFile();//새파일 생성
				System.out.println("파일 생성 완료!!");
			}
		}catch(Exception ex)
		{
			
		}

	}

}
