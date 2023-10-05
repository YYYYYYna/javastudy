//  5개의 정수를 받아서 => max와 min을 찾아보기

import java.util.*;
public class 메소드_5 {
	//1. 5개의 정수를 받아서
	static int[] userInput()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100+1);
		}
		return arr;
	}
	
	//2. max와 min을 찾아보기
	//그러나 메소드는 1개의 return값만 반환가능 따로 구해야함
	//리턴형 => 1개만 설정 가능
	
	//2-1. max값 구하기
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i>m)
			{
				m=i;
			}
		}
		return m;
	}
	//2-1. min값 구하기
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i<m)
			{
				m=i;
			}
		}
		return m;
	}
	
	//3. 출력
	static void print(int max, int min)
	{
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
	
	//4. 조립기
	static void process()
	{
		int[] arr=userInput();
		System.out.println(Arrays.toString(arr));
		int max=max(arr);//변수명과 메소드는 동일해도 괜찮음
		int min=min(arr);
		print(max,min);
	}
	

	public static void main(String[] args) {
		/*
		//1. 5개의 정수를 받아서
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100+1);
		}
		//여기까지가 입력값받거나 초기화 과정 => 한단락
		
		System.out.println(Arrays.toString(arr));
		
		//2. max와 min을 찾아보기
		int max=arr[0];
		int min=arr[0];//혹은 실제값 가져다두기
		for(int i:arr)
		{
			if(i>max)
			{
				max=i;
			}
			if(i<min)
			{
				min=i;
			}
		}
		//3. 출력
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		*/
		
		process();

	}

}
