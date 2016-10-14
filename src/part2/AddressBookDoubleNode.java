package part2;

public class AddressBookDoubleNode {

	private String name;
	private String phoneNum;
	private String email;
	public AddressBookDoubleNode lLink;
	public AddressBookDoubleNode rLink;

	public AddressBookDoubleNode() {
		this.name = null;
		this.phoneNum = null;
		this.email = null;
		this.lLink = null;
		this.rLink = null;
	}

	public AddressBookDoubleNode(String name, String phoneNum, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public AddressBookDoubleNode(String name, String phoneNum, String email, AddressBookDoubleNode lLink,
			AddressBookDoubleNode rLink) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.lLink = lLink;
		this.rLink = rLink;
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
