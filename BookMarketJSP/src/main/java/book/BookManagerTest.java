//package book;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BookManagerTest {
//
//	public static void main(String[] args) {
//		BookDAO test;
//		test = new OracleBookDAO();
//		
//		String[] menuList = {
//				"1. 모든 책 조회\n",
//				"2. 책 번호로 조회\n",
//				"3. book insert\n",
//				"4. book delete\n",
//				"5. book update\n"
//		};
//		
//		int menu = 0;
//		Scanner scanner = new Scanner(System.in);
//		do {
//			System.out.println(Arrays.toString(menuList));
//			System.out.print(">>> 메뉴 선택 :");
//			menu = scanner.nextInt();
//			
//			switch(menu) {
//			case 1 -> {
//				for(Book book : test.selectAllBook())
//					System.out.println(book);
//			}
//			case 2 -> {
//				System.out.print("조회할 책 번호 입력 : ");
//				menu = scanner.nextInt();
//				System.out.println(test.select(menu));
//			}
//			case 3 -> {
//				
//			}
//			case 4 -> {
//				System.out.print("삭제할 책 번호 입력 : ");
//				menu = scanner.nextInt();
//				test.delete(menu);
//			}
//			case 5 -> {
//				
//			}
//			
//			
//			}
//		}while(menu != 0);
//		
//
//
//	}
//
//}
