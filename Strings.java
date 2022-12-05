public class Strings {
	public static void main(String[] args) {
		System.out.println("==================================");
		char[] cArr = {'w','e','l','c','o','m','e'};
		System.out.println(String.copyValueOf(cArr));
		String msg="welcome";
		System.out.println(msg);
		
		System.out.println("==================================");
		String s = new String("KaUr");
		System.out.println(s);
		System.out.println("String Length: " +s.length());
		System.out.println("Char at position: " +s.charAt(0));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println("==================================");
		String s1 = "HEY";
		String s2 = "HEY";
		String s3 = "HELLO";
		String s4 = "BYE";
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3.concat(s2));
		System.out.println(s3);//Strings are IMMUTABLE OR UNCHANGABLE
		s1 = s1.concat(s3);
		System.out.println(s3);
		System.out.println(s2.concat(s3).concat(s4));
		System.out.println("==================================");
		String s5="WELCOME TO JAVA";
		String[] words = s5.split("\\s");
		for(String s6:words) {
			System.out.println(s6);
		}
		System.out.println("==================================");
		String s7=" welcome ";
		System.out.println(s7);
		System.out.println(s7.length());
		System.out.println(s7.trim());
		System.out.println(s7.trim().length());
	}

}
