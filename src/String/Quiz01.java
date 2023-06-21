package String;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {

   public static void main(String[] args) {
      final int life = 10;          // 시도할 수 있는 횟수
      int count = 0;
      String solution;
      Scanner sc = new Scanner(System.in);
      
      String[] words = { "java", "count", "school", "book", "student", "programer" };
      int index = (new Random()).nextInt(words.length);
      solution = words[index];          // words 배열에서 랜덤한 인덱스의 문자열 지정
      StringBuffer answer = new StringBuffer(solution.length());          
                                // 위의 랜덤한 문자열길이로 StringBuffer 생성
      
      System.out.println("행맨에 오신것을 환영합니다. 첫번째 문자부터 맞추면 됩니다.");

      while (true) {
         System.out.print("\n현재의 상태: ");
         System.out.print(answer);

         for (int i = 0; i < solution.length() - answer.length(); i++) {
            System.out.print("_");          // 맞추지 못한 문자수 만큼 '_' 표시
         }

         if (answer.length() == solution.length()) {
            System.out.println("\n문자를 맞추셨습니다 !!!");
            break;
         }

         System.out.println("\n남은 기회 : " + (life-count));
         System.out.print("다음문자를 추측하시오: ");
         String c = sc.next();          // 입력한 알파벳

         int i = answer.length();
         if (c.equals(String.valueOf(solution.charAt(i)))) {
            answer.insert(i, c);
            count++;
            continue;
         }else {
            count++;
            if (life-count == 0) {
               System.out.println(life + "번의 기회동만 맞추지 못했습니다.");
               System.out.println("정답은 : "+solution);
              
               break;
            }
         }

      }
      sc.close();

   }

}