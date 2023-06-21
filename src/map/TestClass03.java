package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass03 {
public static void main(String[] args) {
	
	HashMap<String,String> map = new HashMap<>();
	map.put("이름","홍길동");
	map.put("나이","20");
	map.put("주소","산골짜기");
	System.out.println("map: "+map);

	System.out.println(map.keySet());
	System.out.println(map.values());

	Set<String> set = map.keySet(); 
	System.out.println("set: "+set);
	//set의 값을 꺼내오려면 iterator를 사용해야 한다. set.get은 없다 ㅠㅠ
	Iterator<String> it = set.iterator();
	while(it.hasNext()) {
		String key = it.next();
		System.out.println(key+":"+map.get(key));
	}
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());
	
}
}
