package map;

import java.util.HashMap;

public class TestClass05 {
public static void main(String[] args) {
	
	HashMap<String,Integer> map = new HashMap<>();
	// 컬렉션 프레임워크를 사용할때 괄호안에 자료형은 class라는 자료형밖에 안됨
	// 첫번째 문자가 대문자이면 class 자료형이다. int -> Integer 
	
	map.put("num",123);
	map.put("age",31);
	System.out.println("map:" +map);
	int num = map.get("num");
	System.out.println("num: "+num);
	System.out.println("map.get(age): "+map.get("age"));
	
	System.out.println(map.containsKey("age"));//key/value 가 존재하는지 안하는지 여부
	System.out.println(map.containsValue(123));
	System.out.println(map.containsValue(456));
	
	map.put("age",123); // key중복 안됨, value는 중복 가능
	System.out.println("map: "+map);
	
	map.remove("age");
	System.out.println("remove: "+map);
	
	
}
}
