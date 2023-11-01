package com.sist.manager;
import java.util.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

import java.io.*;
public class FoodManager {
	
	private static ArrayList<FoodCategoryVO> clist=new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> flist=new ArrayList<FoodHouseVO>();
	/*
	 *   Exception => 수정이 가능한 예외처리
	 *   |
	 *   ------------------------------------
	 *   |                                  |
	 *   CheckedException            UnCheckedException
	 *   ----------------            ------------------
	 *   컴파일시에 예외처리 확인           (자동)예외처리 확인하지 않음
	 *   ----해당import----            ----해당import----
	 *   => java.io                  => java.lang
	 *   => java.net                 => java.util
	 *   => java.sql
	 *   목적) 에러를 사전에 방지
	 *        에러시 정상수행 할수있도록함
	 */
	
	//초기화블록 => static변수가 있는 경우 주로 사용
	//        => 자동수행이 된다, 상속은 안된다
	static {
		/*
		FileReader fr=null;
		ObjectOutputStream ois=null;
		FileOutputStream fis=null;
		try {
			//정상수행문
			//[fr부분]
			fr=new FileReader("c:\\java_data\\food_category.txt"); //해당파일이UTF라면 2byte씩 읽혀서 int부분이 오류날수 있음
			                                                       //ANSI로 바꿔서 저장해야함
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close(); //이어서 하나를 더 읽어야해서 여기에 close()를 적음
			
			String[] cates=data.split("\n"); //한줄씩 나눔
			for(String s:cates)//s에 이제 fr의 한줄이 들어감
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				FoodCategoryVO vo=new FoodCategoryVO();
				vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
				vo.setTitle(st.nextToken());
				vo.setSubject(st.nextToken());
				vo.setPoster(st.nextToken());
				clist.add(vo);
			}
			
			//[fis부분+ois부분]
			fis=new FileOutputStream("c:\\java_data\\fc.txt");
			ois=new ObjectOutputStream(fis);
			ois.writeObject(clist);
			
		}catch(Exception ex)
		{
			//에러확인후 복구문
			ex.printStackTrace();
		}
		finally
		{
			//무조건 수행하는 문장
			try {
				//보통 파일닫기/서버닫기를 수행
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
		*/
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:\\java_data\\fc.txt");
			ois=new ObjectInputStream(fis);
			clist=(ArrayList<FoodCategoryVO>)ois.readObject();
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
		
		//2차실행부분
		   //FileInputStream fis=null;
		  // ObjectInputStream ois=null;
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
		
	}
	/*
	public static void main(String[] args) {
		//FoodManager fm=new FoodManager();
		//System.out.println("저장 완료");
		
		for(FoodCategoryVO vo:clist)
		{
			System.out.println(vo.getCno());
			System.out.println(vo.getTitle());
			System.out.println(vo.getSubject());
			System.out.println(vo.getPoster());
			System.out.println("===============================");
		}
		
	}
	*/
	
	public ArrayList<FoodCategoryVO> foodCategoryData(int no)
	{
		ArrayList<FoodCategoryVO> list=new ArrayList<FoodCategoryVO>();
		int start=0;
		int end=0;
		if(no==1)
		{
			start=0;
			end=11;
		}
		else if(no==2)
		{
			start=12;
			end=17;
		}
		else if(no==3)
		{
			start=18;
			end=29;
		}
		for(int i=start;i<=end;i++)
		{
			list.add(clist.get(i));
		}
		return list;
	}

	public FoodCategoryVO categoryInfoData(String title)
	{
		FoodCategoryVO vo=new FoodCategoryVO();
		for(FoodCategoryVO fvo:clist)
		{
			if(fvo.getTitle().equals(title))
			{
				vo=fvo;
				break;
			}
		}
		return vo;
	}
	 public ArrayList<FoodHouseVO> foodHouseListData(int cno)
	   {
		 /*
		   System.out.println(flist.size());
		   return flist;
		   */
		 ArrayList<FoodHouseVO> list=new ArrayList<FoodHouseVO>();
		 for(FoodHouseVO fvo:flist)
		 {
			 if(fvo.getCno()==cno) {
				 list.add(fvo);
			 }
		 }
		 return list;
	   }
	 
	 public FoodHouseVO foodInfoData(int fno)
	 {
		 FoodHouseVO vo=new FoodHouseVO();
		 for(FoodHouseVO fvo:flist)
		 {
			 if(fvo.getFno()==fno)
			 {
				 vo=fvo;
				 break;
			 }
		 }
		 return vo;
	 }
	 
	 public ArrayList<FoodHouseVO> foodFindData(String title)
	 {
		 ArrayList<FoodHouseVO> list=new ArrayList<FoodHouseVO>();
		 for(FoodHouseVO fvo:flist)
		 {
			 if(fvo.getName().contains(title))
			 {
				 list.add(fvo);
				 //break;
			 }
		 }
		 return list;
	 }
}