package part2;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.insertLastNode("동후", "0101234", "nap");
		dl.insertLastNode("동후1", "0101111", "nap2");
		ll.insertLastNode("동후", "0101234", "nap");
		ll.insertLastNode("동후1", "0101111", "nap2");
		while (true) {
			System.out.println("1.단순 2.이중");
			int no = sc.nextInt();
			if (no == 1) {
				System.out.println("1. 삽입, 2.삭제, 3.보기,");
				int index = sc.nextInt();
				switch (index) {
				case 1:
					System.out.println("이름  입력하세요 ");
					String name = sc.next();
					System.out.println("전화번호 입력하세요 ");
					String phoneNum = sc.next();
					System.out.println("이메일 입력하세요 ");
					String email = sc.next();
					ll.insertLastNode(name, phoneNum, email);
					break;
				case 2:
					System.out.println("이름  입력하세요 ");
					name = sc.next();
					ll.delete(name);
					break;
				case 3:
					ll.printList();
					break;
				default:
					break;
				}
			} else if (no == 2) {
				System.out.println("1. 삽입, 2.삭제, 3.보기,");
				int index = sc.nextInt();
				switch (index) {
				case 1:
					System.out.println("이름  입력하세요 ");
					String name = sc.next();
					System.out.println("전화번호 입력하세요 ");
					String phoneNum = sc.next();
					System.out.println("이메일 입력하세요 ");
					String email = sc.next();
					dl.insertLastNode(name, phoneNum, email);
					break;
				case 2:
					System.out.println("이름  입력하세요 ");
					name = sc.next();
					dl.delete(name);
					break;
				case 3:
					dl.printList();
					break;
				default:
					break;
				}
			}

		}

	}

}
