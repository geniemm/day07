package random;

import java.util.Random;

public class TestClass01 {
public static void main(String[] args) {
	
	
	for(int i=0;i<5;i++) {
		System.out.println(Math.random());
		
	}
	System.out.println("================");
	for(int i=0;i<5;i++) {
		double ran = Math.random()*5+1;
		System.out.println((int)ran);
	}
	System.out.println("=============");
	Random r = new Random();
	
	for(int i=0;i<5;i++) {
		int num = r.nextInt(3); // 0~2
		System.out.println(num);
		
	}
	System.out.println();
	for(int i=0;i<8;i++) {
		int lotto = r.nextInt(45);//1~45
		System.out.println(lotto+1);
		
	}
	
}
}
