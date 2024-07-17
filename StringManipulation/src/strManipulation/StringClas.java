package strManipulation;

public class StringClas {

	public static void main(String[] args) {
		int num = 3;
		for(int row=1; row<=num;row++){
			for(int space =num;space>row;space--){
				System.out.print("  ");
			}
			for(int col=row; col>=1;col--){
				System.out.print(col);
			}
			for( int rightCol = 2; rightCol<=row; rightCol++){
				System.out.print(rightCol);
			}
			System.out.println();
		}
	}

}
/*
      1
   2 1
3 2 1

      1
   2 1 2
3 2 1 2 3

      1
   2 1
3 2 1
   2 1
      1

*/