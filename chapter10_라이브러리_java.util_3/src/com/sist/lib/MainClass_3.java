package com.sist.lib;
/*
 *    338page => 제네릭 <>
 *    
 *    제네릭 : 데이터형을 통일할때 주로 사용(기존에 설정된 데이터를 변경)
 *         => 기본형 사용 불가 클래스형만 사용이 가능
 *            => Wrapper를 이용해서 기본형을 사용할 수 있게 만든다
 *         형식) <클래스형>
 *              자바에서는 컬렉션이 모두 Object로 설정이 되어 있다
 *                               ------- 지정된 클래스 형으로 변경
 *                               
 *    각각 사용되는 약어종류
 *    <T> => type (클래스형)
 *    <E> => element (요소)
 *    <K> => key
 *    <V> => value
 *    
 *    예)
 *    List<E>
 *    Vector<E>
 *    Set<E>
 *    Map<K,V>
 *    
 *    장점 => 소스가 간결해진다 => 형변환이 필요없음
 *    단점 => 무조건 지정된 데이터형만 첨부가능
 *    예) ArrayList => Object
 *       ArrayList<String> => String
 *       ArrayList<Integer> => int
 *       ArrayList<int> => 불가능!!
 *       ArrayList<Music> => 사용자정의클래스도 가능!!
 *         => 따라서 저장된 데이터는 
 */
class Data<T>
{
	private T t; //T가 없는 경우는 자동으로 Object를 사용함
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
}

public class MainClass_3 {

	public static void main(String[] args) {
		/*
		Data data=new Data();
		//data.이후에 get/set둘다 Object형이 옴
		Data<String> data1=new Data<String>();
		//data1.이후에는 <String>으로 설정했기 때문에 get/set둘다 String형이 옴
		 */
		
		Data d=new Data(); //제네릭스없어서 경고받음
		Data<String> d1=new Data<String>(); //생성하고 아직 사용안해서 경고받음

	}

}
