package strManipulation;

public class StringSplit {

	public static void main(String args[]) {
		
		//String s = "aaa bbb ccc aaa bbb ccc aaa bbb ccc";
		String text = "a,b,c,d,d,e";
		/*
		 * a,b,c,d,d,e - Split by ","
		 * 1st - a   2nd - b,c,d,d,e
		 * 1st - b   2nd - c,d,d,e
		 * 1st - c - 2nd - d,d,e
		 * 1st - d - 2nd - d,e
		 * 1st - d - 2nd - e
		 * 1st - e
		 * 
		 * a,b,c,d,d,e - Split by "d,"
		 * 1st - a,b,c,  2nd d,e
		 * 1st -         2nd e
		 * 1st - e
		 */
		System.out.println(text.length());
		
		String[] str1 = text.split("d,");//deliminator
		System.out.println(str1.length);
		
		for(int i=0; i<str1.length; i++) {
			
			System.out.println(str1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String a = "a_cd_def_jefh_xyzab";
				
		String[] str2 = a.split("_");
	
		for(int i=0; i<str2.length; i++) {
			
			System.out.println(str2[i]+" length is : - "+str2[i].length());
		}*/
		
	}

}
