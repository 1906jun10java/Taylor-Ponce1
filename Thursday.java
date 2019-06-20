public class Thursday {
	public static void main(String[] args) {
		String str = "dogeeseseegod";
		String sub1 = str.substring(0, 1 + 2);

		System.out.println(str + " contains the letters " + sub1 + ", dogs are great :)");
		System.out.println(triangle(10));
	}

	// public static boolean IsthisPalindrome(String str, String Substr) {

	public static int triangle(int newrows) {
		if (newrows == 1) {
			return newrows;
		}
		return newrows + triangle(newrows - 1);
	}
}
