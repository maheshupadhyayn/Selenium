package strManipulation;

public class CharAtIndexOf {
	public static void main(String[] args) {
		String s = "seleniume";
		char c = s.charAt(4);
		System.out.println(c);
		int charAscii = s.charAt(4);
		System.out.println(charAscii);
		
		int index = s.indexOf('l');
		System.out.println(index);
		
		int eIndex = s.indexOf('e');
		System.out.println(eIndex);
		
		int lastIndex = s.lastIndexOf('e');
		System.out.println(lastIndex);
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("Char "+s.charAt(j)+" is duplicate");
				}
			}
		}
		
		String s1 = "SELEnium";//How manu upper case & how many lower case
		//Convert upper to lower and lower to upper
	}
}
