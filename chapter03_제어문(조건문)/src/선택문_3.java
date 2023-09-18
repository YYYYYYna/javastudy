/*
 *  12,1,2=겨울 / 3,4,5=봄 / 6,7,8=여름 / 9,10,11=가을
 *  ***case값은 동일할 수 없다.
 *  ***case값은 실수를 사용할수 없다.(정수만)
 *  ***case 값 : <-를 꼭 적어야 한다.
 *  ***case 수행 후 종료시에는 반드시 break를 써야한다.
 *  ***case에 사용하는 순서는 상관이 없다.
 *  ***같은 case를 수행할때는 동일구간에 적고 break를 적어주면됨
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// 정수를 임의 추출 => random()
		int month=(int)(Math.random()*12)+1;
		System.out.println("입력된 달 : "+month);
		switch(month)
		{
		case 12:
		case 1:
		case 2: //숫자중복되면안됨
		   System.out.println("겨울 입니다.");
		   break;
		case 3: case 4: case 5:
		   System.out.println("봄 입니다.");
		   break;
		case 6: case 7: case 8:
		   System.out.println("여름 입니다.");
		   break;
		case 9: case 10: case 11:
			System.out.println("가을 입니다.");
			break;
		}

	}

}
