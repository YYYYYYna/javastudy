package com.sist.manager;
import java.util.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

import java.io.*;
public class FoodManager2 {
	
	private static ArrayList<FoodCategoryVO> clist=new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> flist=new ArrayList<FoodHouseVO>();
	
	static {
		 /*
		    *  1|
		    *  1|
		    *  가양칼국수버섯매운탕
		    *  |4.3|
		    *  서울특별시 영등포구 국제금융로 78 
		    *  홍우빌딩 B1 지번 서울시 영등포구 
		    *  여의도동 43-3 홍우빌딩 B1
		    *  |02-784-0409
		    *  |국수 / 면 요리
		    *  |만원-2만원
		    *  |유료주차 가능
		    *  |11:30 - 21:30
		    *  |가양칼국수버섯매운탕 12,000원 샤브 소고기 (200g) 
		    *  12,000원
		    *  |https://mp-seoul-image-production-s3.mangoplate.com/52481_1621066187997112.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725902210805.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725904425496.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491189261172.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491193055171.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80

		    */
		/*
		   //1차실행부분
		   FileReader fr=null;
		   FileInputStream fis=null;
		   ObjectInputStream ois=null;
		   StringBuffer sb=new StringBuffer();
		   String data="";
		   try
		   {
			   
			   fr=new FileReader("c:\\java_data\\food_house.txt");
			   int i=0;
			   while((i=fr.read())!=-1)
			   {
				   sb.append((char)i);
			   }
			   String[] fd=sb.toString().split("\n");
			   System.out.println(fd.length);
			   for(String s:fd)
			   {
				  try
				  {
				   s=s.substring(0,s.indexOf("?"));
				   StringTokenizer st=
						   new StringTokenizer(s,"|");
				   
				   FoodHouseVO vo=new FoodHouseVO();
				   vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
				   vo.setCno(Integer.parseInt(st.nextToken()));
				   vo.setName(st.nextToken());
				   vo.setScore(Double.parseDouble(st.nextToken()));
				   vo.setAddress(st.nextToken());
				   vo.setPhone(st.nextToken());
				   vo.setType(st.nextToken());
				   vo.setPrice(st.nextToken());
				   vo.setParking(st.nextToken());
				   vo.setTime(st.nextToken());
				   vo.setMenu(st.nextToken());
				   vo.setPoster(st.nextToken());
				   flist.add(vo);
				  }catch(Exception ex) {}
			   }
			   //System.out.println(sb.toString());
			   FileOutputStream fos=
					   new FileOutputStream("c:\\java_data\\fh.txt");
			   ObjectOutputStream oos=new ObjectOutputStream(fos);
			   oos.writeObject(flist);
			   fos.close();
			   oos.close();
			   System.out.println("저장완료!!");
			   
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();//  에러 확인 / 복구 
		   }
		   finally
		   {
			  try
			  {
				   fis.close();
				   fr.close();
			  }catch(Exception ex) {}
		   }//1차실행부분
		   */
		   
		   //2차실행부분
		   FileInputStream fis=null;
		   ObjectInputStream ois=null;
		   try
		   {
			   fis=new FileInputStream("c:\\java_data\\fh.txt");
			   ois=new ObjectInputStream(fis);
			   flist=(ArrayList<FoodHouseVO>)ois.readObject();
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
	
	//}//static블록//2차실행시주석해야함
	
	
	 //1차,2차실행블록
	   public static void main(String[] args) {
	   FoodManager fm=new FoodManager();
	   for(FoodHouseVO vo:flist)
	   {
		   System.out.println("번호:"+vo.getFno());
		   System.out.println("참조번호:"+vo.getCno());
		   System.out.println("업체명:"+vo.getName());
		   System.out.println("주소:"+vo.getAddress());
		   System.out.println("전화:"+vo.getPhone());
		   System.out.println("메뉴:"+vo.getMenu());
		   System.out.println("==========================");
	   }
	   
     }//1차,2차실행블록
	   
	   //3차시행블록
	   public ArrayList<FoodHouseVO> foodHouseListData(int cno)
	   {
		   System.out.println(flist.size());
		   return flist;
	   }//3차시행블록
	
}