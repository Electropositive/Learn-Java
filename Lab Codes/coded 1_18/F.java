/*6.:  Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
Input:   Enter 3X3 matrix  
        			e.g.     6 7 3 
                  			 8 9 2 
            		 	 1 2 9 
            	 Output: 	Left=24
  		         Right=13 */
import java.util.Arrays;
import java.util.Scanner;
public class F {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3X3 matrix: ");
		int [][]arr = new int[3][3];

		
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j< 3 ;j++){
				arr[i][j] = scanner.nextInt();
			}
		}
		int Left = 0, Right = 0;
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 3; j++){
				if(i==j){
					Left = Left + arr[i][j];
				}
				if((i+ j) == 2) {
					Right += arr[i][j];
				}
			}
		}
		System.out.println("Left = " + Left);
		System.out.println("Right = " + Right);
	}
}