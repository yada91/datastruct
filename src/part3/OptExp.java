package part3;

public class OptExp {

	private String exp;
	private int expSize;
	private char testCh, openPair;

	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack s = new LinkedStack();
		expSize = this.exp.length();

		for (int i = 0; i < expSize; i++) {
			testCh = this.exp.charAt(i);
			switch (testCh) {
			case '(':
			case '{':
			case '[':
				s.push(testCh);
				break;
			case ')':
			case '}':
			case ']':
				if (s.isEmpty())
					return false;
				else {
					openPair = s.pop();
					if ((openPair == '(' && testCh != ')') || (openPair == '{' && testCh != '}')
							|| (openPair == '[' && testCh != ']'))
						return false;
				}
			}
		}
		if (s.isEmpty())
			return true;
		else
			return false;

	}
}
