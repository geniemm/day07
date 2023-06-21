package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass04 {
public static void main(String[] args) {
	
	HashSet<String> set = new HashSet<>();
	set.add("일");
	set.add("이");
	set.add("삼");
	System.out.println("set: "+set);

	Iterator<String> it =set.iterator();
	while(it.hasNext()) { 
		// it.hasNext가 true값일때까지 반복을 돌린다.
		// 이러한 방법으로 방법자를 사용해서 값을 하나씩 가져올수있다
		String s = it.next();
		System.out.println(s);
	}
	
	
}
}
