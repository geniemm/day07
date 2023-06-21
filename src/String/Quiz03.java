package String;

import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	

	 Scanner in = new Scanner(System.in);
     System.out.println("숫자 6개를 입력하세요");

     int[] mynum = new int[6];

     for (int i = 0; i < mynum.length; i++) {
        mynum[i] = in.nextInt();
        if (mynum[i] > 45 || mynum[i] < 0) {
           //mynum 숫자 범위제한 
           System.out.println("숫자를 다시 입력하세요!0~45사이의 숫자만 입력가능");
           i--;
        }
        for (int j = 0; j < i; j++) {
           if (mynum[i] == mynum[j]) {
              //중복숫자 제거 
              System.out.println("중복숫자를 입력하였습니다.");
              i--;
           }
        }

   }
     System.out.print("나의 번호 :");
     for (int i = 0; i < 6; i++) {
        System.out.print(mynum[i] + " ");
     }
     System.out.println();

     // 랜덤 로또 번호 생성
     int lotto[] = new int[6];

     for (int i = 0; i < 6; i++) {
        lotto[i] = (int) (Math.random() * 45) + 1;
        for (int j = 0; j < i; j++) {
           // 중복제거
           if (lotto[i] == lotto[j]) {
              i--;
              break;
           }

        }

     }
     // 랜덤 로또 번호 확인
     System.out.print("복권 당첨 번호 :");
     for (int i = 0; i < 6; i++) {
        System.out.print(lotto[i] + " ");
     }
     System.out.println();

     int cont = 0;// 맞은 갯수
     for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
           if (mynum[i] == lotto[j]) {
              cont++;
           }
        }
     }

     switch (cont) {
     case 6: {
        System.out.println("1등 당첨입니다.");
     }
     case 5: {
        System.out.println("2등입니다.");
     }
     case 4: {
        System.out.println("3등입니다");
     }
     case 3: {
        System.out.println("4등입니다");
     }
     default: {
        System.out.println("꽝입니다");
     }

     }

     System.out.println("맞은 갯수:" + cont);
}

}
     




