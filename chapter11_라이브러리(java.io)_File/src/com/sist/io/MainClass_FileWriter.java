package com.sist.io;
/*
 *    FileReader / FileWriter 
 *    -----------------------
 *      => 다른언어(한국어)도 사용할수 있도록~~
 *      => 문자스트림(2byte)
 *                            
 *    FileInputStream / FileOutputStream
 *    ----------------------------------
 *       => 파일 입출력이 가능 (1byte) => 알파벳,숫자는 문제없음      
 */
import java.util.*;
import java.io.*;
//여러문장을 저장할때 2가지 방법이 있음
//1)append모드 => new FileWriter("",true) => 크롤링은 append 주로 사용
//2)create모드 => 문자열결합해서 한번에출력
public class MainClass_FileWriter {

	public static void main(String[] args) {
		FileWriter fw=null;//초기화 경로명은 try-catch안에 들어가야 함으로 null값으로 생성함
		try {
			fw=new FileWriter("c:\\java_data\\sawon.txt",true);//***append를 써야 실행시 중복저장됨!! 없으면 데이터 계속 하나씩만 저장됨
			                 //이렇게 경로부터 파일명까지 적어줬는데 파일이 없으면?
			                 //자동으로 creatNewFile()이 실행되서 파일이 생성됨
			Scanner scan=new Scanner(System.in);
			System.out.print("사번입력 : ");
			int sabun=scan.nextInt();
			System.out.print("이름입력 : ");
			String name=scan.next();
		    System.out.print("부서입력 : ");
		    String dept=scan.next();
		    
		    String msg=sabun+"|"+name+"|"+dept+"\r\n"; //이게 선생님이 주신 movie데이터 저장햇던 방식
		     //파일의 단점 : 구분자가 없음 => 내가 |로 임의구분자를 만들어 줘야함
		    
		    // [파일저장]
		    fw.write(msg);//byte로 안자르고 바로 저장 가능
		    
		    System.out.println("파일 저장 완료!");
		}catch(Exception ex) {
			//**복구/에러위치확인에 사용
			ex.printStackTrace();//에러위치잡을수잇음
		}
		finally
		{
			//**보통 파일닫기,서버닫기,오라클닫기에 사용
			//무조건 파일을 닫도록 finally 사용
			try {
				fw.close();//얘도 파일이니까 예외처리 해야해서 try로 감싸야함
			}
			catch(Exception ex) {}
		}

	}

}
