/*
 *    split() => String[]
 */
public class 문자열_5 {

	public static void main(String[] args) {
		
		
		//split() : 기준문자를 하나 잡아서 '배열'로 만들어주는 기능
		/*String actor="하정우,임시완,배성우,김상호";
		String[] movie=actor.split(",");
		System.out.println(movie[1]);*/
		
		//|와 같은 정규식 처리시 주의점
		String actor="하정우|임시완|배성우|김상호";
		String[] movie=actor.split("|");
		System.out.println(movie[0]);
		//결과값이 '하' 로 나옴 |이 정규식으로 처리되서 그럼
		
		String[] movie1=actor.split("\\|");//|를 하려면 \\|로 써야함
		System.out.println(movie1[0]);
		
		//trim() : 앞뒤 공백지우기, 가운데는 안지움!!
		String name="        Hello Java ";
		System.out.println(name);
		System.out.println(name.trim());
		//=> 실수로 아이디나 PW 입력시 공백 지우는용도로 쓰임
		
		//replace(a,b) : a를 b로 변경하라 (char:char 혹은 String:String)
		String sss="Hello Java";
		System.out.println(sss.replace('a', 'b'));
		System.out.println(sss.replace("Java", "Oracle"));
		System.out.println(sss);//그러나 원본은 손상X
		//원본도 바꾸려면 새로운 변수로 명명해줘야함
		System.out.println(sss=sss.replace("Java", "Oracle"));
		System.out.println(sss);
		
		//문자열 결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		System.out.println(msg);
		if(msg.length()>20)//글자수가 20이상이면
		{
			msg=msg.substring(0,20)+"...";//자르고 ... 을 붙여라
			//concat() : +와 같은 역할을 수행함 그러나 자주 안나옴!
			//msg=msg.substring(0,20).concat("...");
		}
		System.out.println(msg);
	}

}
