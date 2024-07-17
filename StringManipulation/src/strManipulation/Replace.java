package strManipulation;

public class Replace {

	public static void main(String args[]) {
		
		// replace(), replaceAll() & replaceFirst()
		//String s = "class jupiter.com.google.login.Google_Login_Test";
		String text = "automatedscript";
 
		String str1 = text.replace('t', 'T');
		String str2 = text.replaceAll(text, "Hello Selenium Hello");
		String str3 = str2.replaceFirst("Hello", "Java");
		String str4 = text.replaceFirst("a", "A");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}