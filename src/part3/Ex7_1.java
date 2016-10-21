package part3;

public class Ex7_1 {
	public static void main(String args[]) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack s = new ArrayStack(stackSize);

		s.push('A');
		s.printStack();

		s.push('B');
		s.printStack();

		s.push('C');
		s.printStack();

		System.out.println(s.peek());
		
		
		deletedItem = s.pop();
		if (deletedItem != 0) {
			System.out.println("deleted Item: " + deletedItem);
		}
		s.delete();
		s.printStack();
	}
}
