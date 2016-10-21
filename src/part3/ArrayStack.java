package part3;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];

	public ArrayStack(int stackSize) {
		// TODO Auto-generated constructor stub
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub

		return (top == -1);
	}

	public boolean isFull() {
		return (top == this.stackSize - 1);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Inserting fail! array stack is fulls");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item: " + item);
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Deleting fail! Array stack is empty");
			return 0;
		} else {
			return itemArray[top--];
		}

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Deleting fail! Array stack is empty");

		} else {
			top--;
		}
	}

	@Override
	public char peek() {
		if (isEmpty()) {
			System.out.println("peeking fail! Array stack is empty");
			return 0;
		} else {
			return itemArray[top];
		}

	}

	public void printStack() {
		if (isEmpty()) {
			System.out.println("Array stack is empty");
		} else {
			System.out.println("Array Stack>>");
			for (int i = 0; i <= top; i++) {
				System.out.print(itemArray[i]);
			}
			System.out.println();
		}
	}
}