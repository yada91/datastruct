package part2;

public class DoubleLinkedList {
	private AddressBookDoubleNode head;

	public DoubleLinkedList() {
		head = null;
	}

	public void insertLastNode(String name, String phoneNum, String email) {

		AddressBookDoubleNode abn = new AddressBookDoubleNode(name, phoneNum, email);
		if (head == null) {
			this.head = abn;
			return;
		} else {
			AddressBookDoubleNode temp = head;
			while (temp.rLink != null) {
				temp = temp.rLink;
				temp.rLink.lLink = temp;
			}
			temp.rLink = abn;
			abn.lLink = temp.rLink;
			abn.rLink = null;
		}
	}

	public void printList() {
		AddressBookDoubleNode temp = this.head;

		while (temp != null) {
			System.out.println(temp.getName() + " " + temp.getEmail() + " " + temp.getPhoneNum());
			temp = temp.rLink;
		}
	}

	public void delete(String name) {
		AddressBookDoubleNode temp = this.head;
		if (temp == null) {
			System.out.println("error");
		} else {
			while (temp != null) {
				if (temp.getName().equals(name)) {
					temp.lLink.rLink = temp.rLink;
					return;
				}
				temp = temp.rLink;

			}
		}
	}
}
