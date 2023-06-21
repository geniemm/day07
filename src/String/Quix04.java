package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class Quix04 {
public static void main(String[] args) {
	
	LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
	int a=0,b=0,c=0; 
	map.put("가위 바위 보", a);
	map.put("업 다운 게임", b);
	map.put("산수문제", c);
	
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	while(true) {
	System.out.println("==================");
	System.out.println("[1] 가위바위보 게임");
	System.out.println("[2] 업다운 게임");
	System.out.println("[3] 산수문제");
	System.out.println("[4] 내 게임 현황");
	System.out.println("[5] 종료");
	System.out.println("==================");
	System.out.print("메뉴 선택 ==> ");
	int choice = sc.nextInt();
	
	
	switch(choice) {
	case 1:
		System.out.println("======== 가위 바위 보 게임 ========");
		System.out.print("(1) 가위  (2) 바위  (3) 보  입력 >>");
		int me = sc.nextInt();
		int com = (r.nextInt(3)+1);
	
		//System.out.println(com);
	
		if(me-com==2 || com-me ==1) {
			System.out.println("이겼습니다!");
		}
		else if(me-com==1 || com-me==2) {
			System.out.println("졌습니다.\n");
		}else {
			System.out.println("비겼습니다.\n");
		}
		System.out.println(map);
		map.put("가위 바위 보", ++a);
		break;

	case 2:
		int level=0;
		while(level!=4) {
		System.out.println("--------- 업 다운 게임 ---------");
		System.out.print("(1)easy  (2)normal  (3)hard  (4)exit 	"
				+ "\n선택 >>");
		level = sc.nextInt();
		int myAns=0;
		
		if(level==1) {
			int easy = r.nextInt(10);
			while(myAns!=easy){ 
			System.out.print("0~10 사이의 수 입력: ");
			myAns=sc.nextInt();
			if(myAns<easy) {
				System.out.println("업!");
		
			}else if(myAns>easy) {
				System.out.println("다운!");
				
			}else {System.out.println("정답!");break;
			}
			}
		}else if(level==2) {
			int normal = r.nextInt(50);
			while(myAns!=normal) {
				System.out.print("0~50 사이의 수 입력: ");
				myAns=sc.nextInt();
				if(myAns<normal) {
					System.out.println("업!");
				}else if(myAns>normal) {
					System.out.println("다운!");
				}else {System.out.println("정답!");break;}
				}
		}else if(level==3) {
			int hard = r.nextInt(100);
			while(myAns!=hard) {
				System.out.print("0~100 사이의 수 입력: ");
				myAns=sc.nextInt();
				if(myAns<hard) {
					System.out.println("업!");
				}else if(myAns>hard) {
					System.out.println("다운!");
				}else {System.out.println("정답!");break;}
				}
		}else break;
		}
		map.put("업 다운 게임", ++b);
		break;

	case 3:
		System.out.println("******* 산수 문제 *******");
		int correct=0, ng=0;
		for(int i=1;i<=5;i++) {
		int r1 =r.nextInt(100);
		int r2 =r.nextInt(100);
		System.out.println(r1+"+"+r2+"= ?");
		System.out.print("정답은? ");
		int math=sc.nextInt();
		
		if((r1+r2)==math) {
			System.out.println("정답입니다!\n");
			correct++;
		}
		else {
			System.out.println("틀렸습니다.\n");
			ng++;
		}
		if(i==5) {
			System.out.println("다섯문제 끝났습니다");
			System.out.println("맞은개수 :" +correct);
			System.out.println("틀린개수 :"+ng);
			System.out.println();
			break;
		}
		}
		map.put("산수문제",++c);
		break;
		
	case 4:
		Iterator<String> it = map.keySet().iterator();
		System.out.println("< 내 게임 현황 >");
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		System.out.println();
		break;
		
	
	case 5:
		System.out.println("프로그램 종료");
		System.exit(0);	
}
}
}
}
