
public class 제어문_반복문3 {

	public static void main(String[] args) {
		for(int i=6;i<=9;i++) //이번엔 여기가 몇단부터 몇단까지 출력할건지
		{      
			 System.out.println(" ♥♥♥ "+i+"단 ♥♥♥"); 
			 for(int j=1;j<=9;j++) //각각단에서 몇까지 곱한값을 나오게 할건지 
			 {           
			       System.out.printf("%d * %d = %d\t",i,j,j*i);        
			 }
			 System.out.println();          
		}//약간 표로 치면 열이랑 행 설정하는개념같음
		 //설정만 잘하면 열.행위치도 바꿀수 잇음

	}

}
