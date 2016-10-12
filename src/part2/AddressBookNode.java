package part2;

public class AddressBookNode {

	private String name;
	private String phoneNum;
	private String email;
	public AddressBookNode link;

	public AddressBookNode() {
		this.name = null;
		this.phoneNum = null;
		this.email = null;
		this.link = null;
	}

	public AddressBookNode(String name, String phoneNum, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public AddressBookNode(String name, String phoneNum, String email, AddressBookNode link) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getEmail() {
		return email;
	}

}
