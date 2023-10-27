package com.sist.io;
//파일정보출력
import java.io.*;
import java.util.*;
import java.text.*;
/*
 *     getName(), getPath(), length()
 */
public class MainClass_File_2 {

	public static void main(String[] args) {
		try {
			File file=new File("c:\\javaDev\\movie.txt");
			System.out.println("최종수정일 : "+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
			//원래 lastModified()은 long형으로 데이터가 들어옴 여기서 Date를 객체생성해서 long형 데이터를 이용해서 날짜로 변환할수 있음
			
			System.out.println("============ 기타정보 ============");
			System.out.println("**파일명 : "+file.getName());
			System.out.println("**경로명+파일명 : "+file.getPath());
			System.out.println("경로명 : "+file.getParent());
			System.out.println("읽기 가능? "+file.canRead());
			System.out.println("쓰기 가능?"+file.canWrite());
            System.out.println("숨김파일 : "+file.isHidden());
            System.out.println("절대경로 : "+file.getAbsolutePath());
            System.out.println("정규경로 : "+file.getCanonicalPath());
            //System.out.println("**파일 크기 : "+file.length());
            System.out.println("File.pathSepartor-"+File.pathSeparator);
                                   //------------
                                   //: \구분자
            long size=file.length();
            String s=" ";
            /*
            if(size/1024>0) {
            	s=(size/1024)+"KB";
            	}
                else 
                {
            		//s.size/1024+"MB";
                }
            }
            */
		}catch(Exception ex)
		{
			
		}

	}

}
