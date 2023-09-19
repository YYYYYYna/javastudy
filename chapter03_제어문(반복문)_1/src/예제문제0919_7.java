//7) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
public class 예제문제0919_7 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%3==0) //!= 써도됨
				continue; //바로 i++로 이동해서 3은 4가됨 
			System.out.print(i+" "); //이제 걍 출력하면됨....
		}

	}

}
