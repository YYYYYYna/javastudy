// if~else
// (조건)?값1:값2
// 조건 : true => 값1
// 조건 : false => 값2
//
// * java.lang.에 들어있는 class는 자동으로 인식해줌 ex) String, System, Math...
// * 대문자와 소문자의 숫자차이가 32나옴. 65=A 97=a
public class 삼항연산자 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
        //         0.0~99.0 => 0~99 +1 1~100
		//Random r=new Random() r.next(100)
		System.out.println(a%2==0?a+"는(은) 짝수다":a+"는(은) 홀수다");
		
		char ch='a';
		char c=(char)((Math.random()*26)+65);//char는 +65를 받을수 없기에 ()를 씌워줘야한다
		int s=(int)(Math.random()*2);
		ch=s==0?c:(char)(c+32);
	    //System.out.println(c>='A' && c<='Z'?c+"는(은) 대문자입니다.":c+"는(은) 소문자입니다.");
		System.out.println(ch>='A' && ch<='Z'?ch+"는(은) 대문자입니다.":ch+"는(은) 소문자입니다.");
	}

}
