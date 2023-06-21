package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestClass03 {
public static void main(String[] args) {
	
	/*
	 	Iterator - 반복자
	 	- 컬렉션 프레임워크들을 순서있는 배열형식으로 변환해 준다.
	 	
	 */
	ArrayList<String> arr = new ArrayList<>();
	arr.add("일");
	arr.add("이");
	arr.add("삼");
	System.out.println("arr: "+arr);
	
	Iterator<String> it = arr.iterator(); //arrlist를 반복자형식으로 바꾸겠습니다.
	/*
	hasNext : 다음 위치의 값이 있으면 true 없으면 false
	next : 다음 위치로 이동하며 해당 위치의 값을 얻어오는 기능
	
	bof: 이 배열의 시작 
	eof: 이 배열의 끝
	*/
	System.out.println(it.hasNext()); // 여기서 it는 bof
	System.out.println(it.next()); // 일
	System.out.println(it.next()); // 이
	System.out.println(it.next()); // 삼
	System.out.println(it.hasNext()); // 삼 뒤에는 없으니까 false, it은 eof
 //	System.out.println(it.next()); // 더이상 가져올 데이터가없는데 또 next를 쓰면 에러
	
	
	
}
}
