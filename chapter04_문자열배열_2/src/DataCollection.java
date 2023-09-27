//메소드 생성
//같은 폴더 안에 있으면 읽어올수 있도록 만들어놓음
import java.io.FileReader;

public class DataCollection {
	static String fileReadData(String path)
	{
		String seoulData="";
		try//예외처리
		{
			FileReader fr=new FileReader("C:\\javaDev\\"+path);
			int i=0;
			while((i=fr.read())!=-1)
			{
				seoulData+=(char)i;
			}
		}catch(Exception ex){}
		
		return seoulData;
	}
	/*
	 * public static void main(String[] args) {
		String location=DataCollection.fileReadData("seoul_location.txt");
		//위처럼 다른 클래스에 적으면 같은 폴도에 있다면 해당 파일을 불러올수 있음
		}
	 */
}
