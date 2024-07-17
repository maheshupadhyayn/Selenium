package strManipulation;

public class StrEquals {
	
	public static void main(String args[]) {
		
		String text = "automatedscript";
 
		if(text.equals("automatedscript")) 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text.equalsIgnoreCase("auTomatEdsCripT"))
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text.equals("automatedScript")) 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text == "automatedscript") 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
			
		char[] arr = {'a','u','t','o'};
		String s  = new String(arr);
		String s1 = "auto";
		System.out.println(s);
		System.out.println(s1);
		
		if("auto" == s){//primitive data type- ref - AZ00003456FG content = auto
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if("auto" == s1){//non-primitive data type
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if("auto".equals(s)){//premitive - String 
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		
		/*
		 * == , always checks the reference
		 * equals(), always checks the content
		 * 
		 * ==, is a conditional operator
		 * equals(), is a method
		 */
	}
}
