import java.util.Scanner; //맨처음 Scanner 함수를 불러와야함
public class 예제문제0913_scanner {

	public static void main(String[] args) {
		
		//scanner를 이용해 정수두개를 적는 방법
		Scanner scan=new Scanner(System.in);
		
		System.out.println("두개 정수 입력(10 20) : ");
		int aa=scan.nextInt();
	    int bb=scan.nextInt();
	    System.out.println(aa%bb);
	    
	    //이럴경우 밑에 console창에 숫자를 직접 입력해야함...

	}

}
