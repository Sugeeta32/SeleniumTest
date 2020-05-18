package practice;

public class Palindrome implements Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation a = new Palindrome();
		
		a.doPalindrome();
		a.numberAdd();
		
//		Palindrome b = new Palindrome();
//		b.doPalindrome();
//		b.test();
		
	}
	private void test() {
		System.out.println("hi");
	}
	
	@Override
	public void doPalindrome() {
		String s = "racecar  ";
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		
	}
	
	@Override
	public void numberAdd() {
		for (int i = 20; i >= 10; i--) {
			System.out.println(i);

		}
		// TODO Auto-generated method stub

	}

	@Override
	public void numberSubtract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void numberMultiply() {
		// TODO Auto-generated method stub

	}

}
