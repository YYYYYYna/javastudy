/*
 *    while 
 *    -----
 *     => 10개의 난수
 *     => 최대값 / 최소값 (=변수 따라서 while문 바깥에 위치해야함)
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		int max=1,min=100; 
		//난수발생시 최대 최소값을 가져다 놔야하기 때문에
		//max에는 1 min에는 100을 가져다 놔서 어떤값이와도
		//문제없이 바뀔수 있도록 값을 이렇게 설정함
		
		int i=1; //루프변수 => 1~ 처럼 변하는범위가 지정되어있음
		
		while(i<=10) //=(int a=(int)(Math.random()*100)+1;)이거 10개쓴거랑 똑같음
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			//여기에 최대/최소값을 구해야함
			if(max<rand)
			{
				max=rand;
			}
			if(min>rand)
			{
				min=rand;
			}
			i++; //이렇게 증감식이 있어야 i의 값이 달라지기 때문에
			     //i=1;이라서 영원히 true루프에 걸리는 상황을 막아야함
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		

	}

}
