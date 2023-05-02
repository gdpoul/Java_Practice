package Assignment;

public class SubString1 {
	public static void main(String[] args) {

		String orgstr = "AAAABAAAA";
		int orgstrLen = orgstr.length();
		String str = orgstr + orgstr;
		String substr = str.substring(1, str.length() - 1);

		if (substr.contains(orgstr)) {

			System.out.println("Output: true");
			int n = substr.indexOf(orgstr);
			n++;
			String repeatSubstr = orgstr.substring(0, n);

			while (orgstrLen % n == 0 && orgstrLen > n) {
				int count = orgstrLen / n;
				System.out.println("The given string is " + count + " times repetition of " + repeatSubstr);
				orgstrLen = orgstrLen / 2;
				repeatSubstr = repeatSubstr + repeatSubstr;
			}
		} 
		else {
			System.out.println("Output: False");

		}

	}

}
