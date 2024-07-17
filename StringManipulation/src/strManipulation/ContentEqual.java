package strManipulation;

public class ContentEqual {

	public static void main(String[] args) {

		String text = "automatedscript";
		 
		boolean val1 = text.contentEquals("auto");
		boolean val2 = text.contentEquals("automatedscript");
		boolean val3 = text.contentEquals("Automatedscript");
		boolean val4 = "auto".contentEquals(text);
		
		System.out.println("If value is 'true', both are equal..");
		System.out.println("If value is 'false', both are not equal..\n");
 
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}
