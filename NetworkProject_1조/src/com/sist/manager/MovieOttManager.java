package com.sist.manager;

import java.util.*;
import java.io.*;
import com.sist.vo.*;

public class MovieOttManager {
	
	private static ArrayList<MovieOttVO> mlist=new ArrayList<MovieOttVO>();
	
	static {
		/*
		 * 1|더 문|https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2Fbefb3ff392b22b07b93f8d4f2bbc0e8b30f5f2df|
		 * 2023.08.02|SF/액션/드라마|한국|
		 * 12세이상관람가|129분|7.5|누적관객 정보 없음
		 */

		//1차실행부분
		FileReader fr=null;
		String data="";
		try {
			fr=new FileReader("c:\\java_data\\movie_OTT_Tving.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			
			String[] fd=data.split("\n");
			
			for(String s:fd)
			{
				try {
					   StringTokenizer st=
							   new StringTokenizer(s,"|");
					MovieOttVO vo=new MovieOttVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setImage(st.nextToken());
					vo.setRegdate(st.nextToken());
					vo.setGenre(st.nextToken());
					vo.setNation(st.nextToken());
					vo.setGrade(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setScore(Double.parseDouble(st.nextToken()));
					vo.setMake_share(st.nextToken());
					mlist.add(vo);
					
				}catch(Exception ex) {}
			}

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			} catch (Exception e) {}
			
		}//1차실행부분
		
		/*
		//2차실행부분
		  FileInputStream fis=null;
		  ObjectInputStream ois=null;
		   try
		   {
			   fis=new FileInputStream("c:\\java_data\\m_ott_tving.txt");
			   ois=new ObjectInputStream(fis);
			   mlist=(ArrayList<MovieOttVO>)ois.readObject();
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   try
			   {
				   fis.close();
				   ois.close();
			   }catch(Exception ex) {}
		   }
	   }//2차실행부분
	   */
	}//static블록//2차실행시주석해야함
	
	//1차,2차실행블록
	 public static void main(String[] args) {
		   MovieOttManager mom=new MovieOttManager();
		   for(MovieOttVO vo:mlist)
		   {
			   System.out.println("번호:"+vo.getMno());
			   System.out.println("업체명:"+vo.getTitle());
			   System.out.println("개봉일:"+vo.getRegdate());
			   System.out.println("장르:"+vo.getGenre());
			   System.out.println("상영시간:"+vo.getTime());
			   System.out.println("평점:"+vo.getScore());
			   System.out.println("누적관객수:"+vo.getMake_share());
			   System.out.println("==========================");
		   }
		   
	}//1차,2차실행블록
}
