/*
 *      61page 참고
 */
public class 선택문_4 {

	public static void main(String[] args) {
		char score=(char)((Math.random()*6)+65); // A B C D E F
		System.out.println("등급:"+score);
		switch(score)
		{
		default:
			System.out.println("존재하지 않는 등급입니다.");
			//break;
		case 'A':
			System.out.println("A등급은 90~100사이의 점수입니다.");
			//break;
		case 'B':
			System.out.println("B등급은 80~90사이의 점수입니다.");
			//break;
		case 'C':
			System.out.println("C등급은 70~80사이의 점수입니다.");
			//break;
		case 'D':
			System.out.println("D등급은 60~70사이의 점수입니다.");
			//break;
		case 'E':
			System.out.println("E등급은 50~60사이의 점수입니다.");
			//break;
			//중간중간 break가 없으면 default 이후의 값을 다 출력하게됨
		}
	}

}
