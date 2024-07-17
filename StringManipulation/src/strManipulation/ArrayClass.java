package strManipulation;

public class ArrayClass {
	/*
	 * Array is a collection of similar data type
	 * Why Array - To avoid multiple memory declaration
	 * new - will helpful to allocate new memory allocation
	 */
	public static void main(String[] args) {
		//Array Syntax
		int harshalAge = 25;
		int namrataAge = 23;
		int govindaAge = 22;
		/*
		 * index - Index is always length/size - 1 (0-3)
		 * length - length and size is always same
		 * size - Total # of values it holds
		 */
		int[] ages = new int[4];
		ages[0] = 25;
		ages[2] = 23;
		ages[3] = 22;
		System.out.println(ages.length);
		for(int index=0;index < ages.length;index++){
			System.out.println(ages[index]);
		}
		
	}

}
