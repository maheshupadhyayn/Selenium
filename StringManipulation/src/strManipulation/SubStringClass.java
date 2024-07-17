package strManipulation;

public class SubStringClass {
	
	public static void main(String args[]) {
		
		//substring(), subSequence()
		
		String text = "automatedscript";
 
		String str1 = text.substring(3);
		String str2 = text.substring(3, 8);
		CharSequence str3 = text.subSequence(3, 8);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String a = "T1230fdfd56 order placed succesfully.";
		System.out.println(a.substring(0, 11));
		
		/* Print only oder ID using substring
		 * Problem 1 need to print transaction ID.
		 * T1230987456 order placed succesfully.
		 * T6789123409 order placed succesfully.
		 * Problem 2 - what was the trasaction credit/debit?
		 * Transaction 75638Debit is done - print 75638 trasaction is debit
		 * Transaction 89545Credit is done - print 89545 transaction is credit
		 * Problem 3 - what we ordered?
		 * You ordered Pizza.
		 * You ordered Burger.
		 */
	}

}