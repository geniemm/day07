package String;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	

		   public static void main(String[] args) {

		      Random random = new Random();// 랜덤 수 만드는 객체 생성
		        int answer = random.nextInt(100); // 100까지의 수만 랜덤
//		        System.out.println(("정답 미리보기: ") + answer);
		        int input_number;
		        int repeat_count = 0;
		        Scanner scan = new Scanner(System.in);
		        System.out.println("1~100사이의 숫자중 하나로 배정된 숫자를 맞추시오.");
		        do {
		            System.out.print("정답: ");
		            input_number = scan.nextInt();
		            repeat_count++;
		            if (input_number > answer) {
		                System.out.println("좀 더 낮은 수를 입력하세요.");
		            }
		            if (input_number < answer) {
		                System.out.println("좀 더 높은 수를 입력하세요.");
		            }
		        } while (input_number != answer);
		        System.out.printf("정답입니다. 총 시도횟수는 %d회 입니다.\n", repeat_count);
		          
		   }

}
