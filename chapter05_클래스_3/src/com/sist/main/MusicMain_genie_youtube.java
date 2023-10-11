/*
 *  크롤링한 지니뮤직 데이터로 검색 후 해당 노래 동영상 재생하기
 */

package com.sist.main;

import java.util.*;
import java.io.*;//입출력관련
//일반데이터형 => 사용자정의데이터형 => 제공이안됨 => 직접제작

//music의 일반 데이터형 생성
class Music
{
	String rank;
	String title;
	String singer;
	String album;
	String key;
}
//music데이터형 모아서 관리
class MusicData
{
	//사용자 정의 데이터형 = 기본형처럼 사용이 가능 (ex.String[])
	Music[] musics=new Music[49];
	//초기화의 방법
	//1. 생성자
	//2. 초기화 블록이용 : {구현} => 초기화 블록 => 자동생성
	{
		//예외처리 : 에러를 미리 방지 => check, uncheck 두가지 있음 (io쓰이면 무조건 try-catch)
		try
		{
			FileReader fr=
					new FileReader("c:\\javaDev\\genie.txt");
			String data="";
			int i=0; //1글자씩 정수형으로 읽어오라는(받으라는)뜻 => 저장할때는 char로 변환해야함
			while((i=fr.read())!=-1)//횟수몰라서 for문대신 while문 사용
				               //-1은 파일의 끝까지 읽으라는뜻
			{
				data+=(char)i;
			}
			fr.close();//파일닫기를 꼭!!해줘야함!!
			//System.out.println(data);
			
			//파일 나누기
			String[] datas=data.split("\n");
			i=0;
			for(String s:datas)
			{
				String[] ss=s.split("\\|");
				musics[i]=new Music();
				if(ss[0].equals("47"))
				{
					continue;
				}
				musics[i].rank=ss[0];
				musics[i].title=ss[1];
				musics[i].singer=ss[2];
				musics[i].album=ss[3];
				musics[i].key=ss[4];
				i++;
			}
		}catch(Exception ex) {}
	}
	
	
}
public class MusicMain_genie_youtube {

	public static void main(String[] args) {
		MusicData md=new MusicData();
		System.out.println("================= 뮤직 TOP50 =================");
		for(int i=0;i<md.musics.length;i++)
		{
			System.out.println("순위 : "+md.musics[i].rank);
			System.out.println("곡명 : "+md.musics[i].title);
			System.out.println("가수명 : "+md.musics[i].singer);
			System.out.println("앨범 : "+md.musics[i].album);
			System.out.println("동영상 키 : "+md.musics[i].key);
			System.out.println("================================================");
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("동영상 선택(1~50/47번제외) : ");
		int mno=scan.nextInt();
		
		Music mm=md.musics[mno-1];//인덱스번호라서 -1
		System.out.println("==================== 상세보기 ====================");
		System.out.println("순위 : "+mm.rank);
		System.out.println("곡명 : "+mm.title);
		System.out.println("가수명 : "+mm.singer);
		System.out.println("앨범 : "+mm.album);
		System.out.println("동영상 키 : "+mm.key);
		//배열과 다르게 인덱스 번호 하나만 기준으로 잡으면 출력이 가능
		System.out.print("동영상을 실행할까요? (y/n) : ");
		char c=scan.next().charAt(0);
		if(c=='y' || c=='Y')
		{
			try {                                                                  //chrome 링크끝에 공백있어야함
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
						+"http://youtube.com/embed/"+mm.key);
			}catch(Exception ex) {}
		}
		else
		{
			System.out.println("프로그램 종료");
		}
	}

}
