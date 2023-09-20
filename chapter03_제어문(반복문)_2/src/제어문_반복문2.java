/*
 *    2단~9단 구구단 출력
 *    --------
 *    2*1=2  3*1=3 .... 9*1=9
 *    
 *    2*9=18 3*9=27 .... 9*9=81
 *    
 *    => 1차 for문 1~9
 *    => 2차 for문 2~9
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) //각각단에서 몇까지 곱한값을 나오게 할건지 
		{      
			 for(int j=2;j<=9;j++) //몇단부터 몇단까지 출력할건지
			 {           
			       System.out.printf("%2d * %2d = %2d\t",j,i,j*i);        
			 }
			 System.out.println();          
		}//약간 표로 치면 열이랑 행 설정하는개념같음
		

	}

}
