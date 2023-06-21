package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		String menu;
		int price;

		while (true) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 종 료");
			System.out.print(">>> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("== 메뉴 등록 ==");
				System.out.print("등록할 메뉴 입력: ");
				menu = sc.next();
				if (map.containsKey(menu)) {
					System.out.println("존재하는 메뉴입니다.");

				} else {
					System.out.print("가격 입력: ");
					price = sc.nextInt();
					map.put(menu, price);
					System.out.println(map);
					System.out.println("메뉴 등록 완료");
					System.out.println();
					break;
				}
			case 2:
				System.out.println("=== MENU ===");
				Iterator<String> it = map.keySet().iterator();
				while (it.hasNext()) {
					String key = it.next();
					System.out.println(key + ":" + map.get(key));

				}

				System.out.println("1. 수정\t2.삭제\t3.나가기");
				System.out.print("==> ");
				int nChoice = sc.nextInt();

				if (nChoice == 1) {
					System.out.println("** 메뉴를 수정합니다 **");
//				System.out.println("[1] 메뉴수정  [2] 가격수정  선택하세요");
//				int num = sc.nextInt();
//				if(num==1) {

					System.out.print("수정하려는 메뉴의 이름을 입력하세요: ");
					menu = sc.next();
					if (map.containsKey(menu)) {

						System.out.print("수정 후 가격을 입력하세요: ");
						int nPrice = sc.nextInt();
						map.put(menu, nPrice);
						System.out.println("수정 완료 ~ ");

					} else {
						System.out.println("해당하는 메뉴가 없습니다.\n");

					}
				} else if (nChoice == 2) {
					System.out.println("** 메뉴 삭제 **");
					System.out.println("삭제하려는 메뉴의 이름을 입력하세요: ");
					menu = sc.next();
					if (map.containsKey(menu)) {
						map.remove(menu);
						System.out.println(menu + " 이(가) 삭제되었습니다.");
					} else {
						System.out.println("해당하는 메뉴가 없습니다.\n");

					}
				} else {
					System.out.println("** 메인화면으로 나가기 **");
					break;
				}

			case 3:
				System.out.println("** 프로그램종료 **");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");

			}

		}
	}
}
