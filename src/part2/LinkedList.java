package part2;

public class LinkedList {

	private AddressBookNode head;

	public LinkedList() {
		head = null;
	}

	public void insertLastNode(String name, String phoneNum, String email) {

		AddressBookNode abn = new AddressBookNode(name, phoneNum, email);
		if (head == null) {
			this.head = abn;
			return;
		} else {
			AddressBookNode temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = abn;
		}
	}

	public void printList() {
		AddressBookNode temp = this.head;

		while (temp != null) {
			System.out.println(temp.getName() + " " + temp.getEmail() + " " + temp.getPhoneNum());
			temp = temp.link;
		}
	}

	public void delete(String name) {
		AddressBookNode temp = this.head;
		AddressBookNode pre; //
		if (temp == null) {
			System.out.println("error");
		} else {
			while (temp != null) {
				if (temp.link.getName().equals(name)) {
					temp.link = temp.link.link;
					return;
				}
				temp = temp.link;
			}
		}
	}
}
