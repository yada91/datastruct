package part3;

public class LinkedStack implements Stack {
	private StackNode top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : " + item);
	}

	@Override
	public char pop() {

		if (isEmpty()) {
			System.out.println("Deleting fail! Linked stack is empty!");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

		if (isEmpty()) {
			System.out.println("Deleting fail! Array stack is empty");

		} else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		if (isEmpty()) {
			System.out.println("peeking fail! Array stack is empty");
			return 0;
		} else {
			return top.data;
		}

	}

	public void printStack() {
		if (isEmpty()) {
			System.out.println("Array stack is empty");
		} else {
			StackNode temp = top;
			System.out.println("Linked Stack>>");
			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}

}
