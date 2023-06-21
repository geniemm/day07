package String;

public class TestClass01 {
public static void main(String[] args) {
	
	String str;
	String str2 = new String();
	
	String str3="test";
	String str4 = new String("Java Programming");
	
	String str5=str4.toUpperCase();
	System.out.println(str5);
	System.out.println(str5.charAt(3));
	String str6=str5.toLowerCase();
	System.out.println(str6);
	
	str3="JAVA";
	if(str3.toLowerCase().equals("java")){
		System.out.println("수강하는 과목은 java입니다.");
	}

}
}
