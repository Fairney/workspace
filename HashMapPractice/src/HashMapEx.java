import java.util.*;
public class HashMapEx{

	String kSt,vSt;
	Integer kInt,vInt;
	public HashMapEx(String k,String v){
		System.out.println("키 값과, value값이 String인 생성자를 만들었습니다.");
		this.kSt= k;
		this.vSt= v;
		HashMap<String,String> map = new HashMap<>();
		
		
	}
	public HashMapEx(Integer k,String v){
		System.out.println("키 값과, value값이 Integer과 String인 생성자를 만들었습니다.");
		HashMap<Integer,String> map = new HashMap<>();
		map.put(k,v);
	}
	public HashMapEx(String k,Integer v){
		System.out.println("키 값과, value값이 String인 생성자를 만들었습니다.");
		HashMap<String,Integer> map = new HashMap<>();
		map.put(k,v);
	}
	
	
}
