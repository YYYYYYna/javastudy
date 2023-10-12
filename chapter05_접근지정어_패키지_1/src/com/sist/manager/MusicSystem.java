package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import lombok.Getter;
import lombok.Setter;

//아래는 지니뮤직 200 에서 tr 하나 가져옴
/*
 * <tr class="list" songid="103151984">
                                <td class="check"><input type="checkbox" class="select-check" title="Love Lee" /></td>
                                <td class="number">1
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                                <span class="rank"><span class="rank-none"><span
                                                        class="hide">유지</span></span></span>
                                            
                                            
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('84181610');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/084/181/610/84181610_1692585955705_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Love Lee" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('103151984');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('103151984','1');return false;">
                                        
                                            
                                        
                                        
                                        
                                        
                                            
                                                Love Lee</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80197389');return false;">AKMU (악뮤)</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('103151984');">외</button>
                                            <ul class="list" id="RelationArtist_103151984"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('84181610');return false;">Love Lee</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('103151984;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('103151984;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="103151984" id="add_my_album_103151984" onclick="fnAddMyAlbumForm('#add_my_album_103151984' , '103151984' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('103151984');return false;">다운로드</a></td>
                                    
                                    
                                

                                <td class="btns">
                                    <div class="toggle-button-box lyr-mv" id="list-mv_103151984">
                                        
                                            
                                                <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="Love Lee" onclick="fnPlayMv('103151984','3'); return false;">뮤직비디오 보기</a>
                                            
                                            
                                        
                                    </div>
                                </td>
                                <td class="more">
                                    <div class="toggle-button-box">
                                        <button type="button" class="btn btn-basic btn-more">더보기</button>
                                        <ul class="list">
                                            
                                                
                                                    <li><a href="#" class="item" title="공유" onclick="shareDo('103151984');return false;">공유하기/음악나누기</a></li>
                                                
                                                
                                            
                                            
                                                
                                                    <li><a href="#" class="item" title="선물" onclick="fnGiftSong('103151984');return false;">선물하기</a></li>
                                                
                                                
                                            
                                        </ul>
                                    </div>
                                </td>
                            </tr>
 */
//Music이랑 패키지 같으니까 import 안붙임
public class MusicSystem {
	//여러 유저에게 공유가 되야하기 때문에 static을 설정해야함
	//근데 static으로 설정하면 MainClass에서 접근이 불가능
	@Getter
	@Setter
	static Music[] musics=new Music[50];
	//////static의 장점은 자동으로 메모리가 할당되기 때문에 참조변수를 생성하지 않아도됨
	// ⓐ그래서! 일단 시작과 동시에값을 초기화로 가져오고!
	static
	//:static블록(static변수만사용가능/자동인식)으로 자동으로 초기화 해서 데이터를 집어넣으려함
	/////초기화 블록 특징 : 상속은 불가능, 호출없이 실행가능
	/////초기화 블록이 싫으면 생성자를 이용해서 초기화 진행해도됨
	{
		//1.예외처리 => io(파일,메모리,"네트워크:jsoup") => 프로그램 정상 종료가능
		//table class="list-wrap"
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); 
			//get()은 HTML값을 가져온다는뜻 => doc에 저장됨
			Elements title=doc.select("table.list-wrap td.info a.title");
			//Elements는 HTML에서 테그값 가져오는 라이브러리
			//System.out.println(title);
			
			Elements artist=doc.select("table.list-wrap td.info a.artist");
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			for(int i=0;i<title.size();i++)
			{
				musics[i]=new Music();//new로 메모리 할당
				
				//순위
				musics[i].setMno(i+1);
				//제목
				musics[i].setTitle(title.get(i).text());
			  //musics[i].title이라고 우리가 직접 만들었는데 이제는 클래스 사용하면서 setTitle을 사용할 수 있음
		      //위주석의 자세한 내용은 Music에 적혀있음
				//가수
				musics[i].setSinger(artist.get(i).text());
				//앨범
				musics[i].setAlbum(album.get(i).text());
			}
		}catch(Exception ex) {}
	}
	// ⓑ리턴형으로 값을 넘겨주려함!!
	
	
}
