package map;

public class TestClass06 {
public static void main(String[] args) {
	
	// 형변환
	float fl =(float)1.11;
	int num = 100;
	String sNum = num+""; // 아래와 마찬가지로 작용된다.
	System.out.println("백"+100); // 문자열과 숫자를 더하면 하나의 문자열로 만들어줌
	
	System.out.println(sNum+100);
	System.out.println(num+100);
	// "100" 가능, "안녕" 변환안됨
//	int n = sNum; // 숫자형식의 문자열만 가능하다
	int n = Integer.parseInt(sNum); // 문자형식의 숫자는 Integer.parseInt를 사용
	System.out.println(n+123);
	
}
}
