package com.sist.lib;
/*
 *       Format 형식
 *       
 *       ***DecimalFormat : 숫자변환(천자리앞에,)
 *       ChoiceFormat : switch
 *       MessageFormet : 출력형식
 *       ***SimpleDateFormet : 날짜 출력 형식
 *       ---------------------------------
 *       java.text
 *       
 */

import java.text.*;
public class MainClass_1 {

	public static void main(String[] args) {
		
		//형식1 DecimalFormat : #으로 내가 원하는 형식을 적어주면됨
		/*
		int[] won={1000,20300,350000,4500000,67000000};
		DecimalFormat df=new DecimalFormat("##,###,###,###"); //내가 원하는 형식을 써주면됨
		for(int i:won)
		{
			System.out.println(df.format(i)+"원");
		}
		*/
		
		//형식2 ChoiceFormat : switch케이스 대신 사용됨(자주사용안함)
		double[] limit={59,60,70,80,90};
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,85,90,80,72,60,58};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int s:score)
		{
			System.out.println(s+":"+cf.format(s));
		}
		
		
	}

}
