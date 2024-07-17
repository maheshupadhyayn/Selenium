package strManipulation;

public class UpperLower {
	
	public static void main(String args[]) {
		
		//toUpperCase(), toLowerCase() & toCharArray()
		/*String s = "class jupiter.com.google.login.Google_Login_Test";		
		}*/
		String text = "auTOmatedSCrIpt";
		String str1 = text.toUpperCase();
		String str2 = str1.toLowerCase();
		
		System.out.println(str1);
		System.out.println(str2);		
		

		char[] chArr = text.toCharArray();//convert your String into an character array
		for(int i=0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		/*
		 * String s = SELEnium, auTOmatedSCrIpt
		 * 1 - How many upper case & how many lower case - count
		 * 2 - Convert upper to lower case  & lower to upper - seleNIUM
		 */
		
		
		/*
		String name = "SELEnium";
		//Print how many capital letters are there in String
		int counter=0;
		for(int index=0; index<text.length();index++){
			if(text.charAt(index) >=65 && text.charAt(index)<=90){
				System.out.println("character is upper - "+text.charAt(index));
				counter++;
			}
		}
		System.out.println(counter);
		//With charArray()
		char[] arryChar = text.toCharArray();
		int counter1=0;
		for(int index=0;index<arryChar.length;index++){
			if(arryChar[index] >=65 && arryChar[index]<=90){
				System.out.println("character is upper - "+arryChar[index]);
				counter1++;
			}
		}
		
		
		for(int index=0;index<arryChar.length;index++){
			if(arryChar[index] >=65 && arryChar[index]<=90){
				System.out.println("character is upper - "+arryChar[index]);
				System.out.println(text.toLowerCase().charAt(index));
			}
		}
		
		
		String test= "kNOWledgeWARE";
		  char [] ch =test.toCharArray();
		  int count=0;
		  for (int index=0;index<ch.length;index++)
		  {
		  if (ch[index]>=97 && ch[index]<=122)
		  {
		   System.out.println(" lower case character is " +ch[index]);
		   char result=ch[index];
		   int ascii=result;
		    ascii=ascii-32;
		    result=(char)ascii;
		   System.out.println("Character converted to Uppercase is  "+result);
		     count++;
		  }
		 }
		   System.out.println(" Total character of lower case "+counter);

		
		//String text = "auTOmatedSCrIpt";
		//To print the number of lower case without tocharArray()
		//To print the number of upper & lower both without tocharArray()
		//To print upper using charArray()
		//To print lower number of characters using charArray
		//To print both lower & upper using charArray()
		//Replace lower with upper without tocharArray()
		//Replace upper character with lower without tocharArray()
		//Replace lower to upper & upper to lower without tocharArray()
		//Replace lower with upper with tocharArray()
		//Replace upper character with lower with tocharArray()
		//Replace lower to upper & upper to lower with tocharArray()
		
		
		
		
		
		
		
		
		
		
		/*
		String s = "santosh";//SELEnium, seleNIUM
		String s1 = s.substring(0,2).toUpperCase();
		String s2 = s.substring(2).toLowerCase();
		System.out.println(s1+s2);
		
		//Ascii Value of small letters - 97 - 122
		//Ascii Value of capital letters - 65 - 90
		/*for(int i = 0;i<s.length();i++){
			if(i<4){
				int asciiVal=s.charAt(i);
				if(asciiVal>=65 && asciival<=90){
					
				}else{
					
				}
					
			}
		}*/
		
		//Variables Type
		
		
				
		
		/*String s = "SELenium";//selENIUM
		for(int i=0;i<=s.length()-1;i++){
			int asciiCharVal = s.charAt(i);
			if(asciiCharVal<97){
				System.out.println("Uppercase");
			}else{
				System.out.println("lowercase");
			}
		}*/
		
	}
	
}
