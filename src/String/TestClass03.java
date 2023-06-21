package String;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	
	String str = "test";
	System.out.print("문자열 입력: ");
	String str2 = "test   ";//new Scanner(System.in).next();
	System.out.println(str+".");
	System.out.println(str2+".");
	System.out.println(str2.trim()+"."); // trim은 양쪽에 있는 공백을 지워준다.
	
	System.out.println("str==str2 : "+str.equals(str2));
	System.out.println("str==str2 : "+str.equals(str2.trim()));
	
	String addr = "052154/서울시/종로구/단성사4층";
	String[] s_addr = addr.split("/");
	// 어떤 기준으로 자를건지 기준을 "" 사이에 넣는다. >> 배열로 받는다.
	for(int i=0;i<s_addr.length;i++) {
		System.out.println(s_addr[i]);
	}
	 for(String ss : s_addr){
		 System.out.println(ss);
	 }
	String result = addr.replace("4","2");
	System.out.println(addr);
	System.out.println(result);
	
	result = "010-1234-2345";
	System.out.println(result.replace("-",""));
	

}
}
