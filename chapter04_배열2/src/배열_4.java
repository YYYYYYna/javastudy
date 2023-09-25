// 중복없는난수발생
// => 예약일,예약시간...을 만들때 주로 사용
public class 배열_4 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		//1~10까지 난수발생 , 중복없어야함
		int su=0; //난수저장변수
		boolean bCheck=false; //중복확인변수
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			//----------[난수발생구간]
			while(bCheck)
				//=true=>난수중복->무한반복
				//=false=>종료 
				//따라서 중복이아닐때까지돌려야함
			{
				//난수발생
				su=(int)(Math.random()*10)+1; //1~10
				bCheck=false; //**for문이 수행이 안되면 수행될 종료조건 만들어 줘야함
				//=비교->arr에 저장된 값과 난수가 같은지 확인
				for(int j=0;j<i;j++)
				{
					//i=>저장된갯수
					if(arr[j]==su)//같은수가 있는지확인
					{
						bCheck=true;//while을 다시수행
						break;
					}
					/*
					 *else
					 *  bCheck=false;  
					 * =>이렇게 쓰면 안됨 무한루프걸림
					 */
				}
			}
			//----------[난수발생구간]
			//주의할점1 : else문 사용X, 다른 false발생을 유도하면안됨
			//주의할점2 : break;문으로 꼭 종료조건을 넣어줘야함
			arr[i]=su;
		}
		
		//출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
