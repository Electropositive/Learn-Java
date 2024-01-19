/*
2.Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
Input: Enter 10 number from keyboard 
Output: 	Display number of even and odd number
*/
import java.util.Scanner;
public class B{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 numbers from keyboard: ");
		int arr[] = new int[10];
		int counte = 0, counto = 0;
		for(int x: arr){
			arr[x] = scanner.nextInt();
			if(arr[x]%2 == 0){
				counte++;
			} else {
				counto++;
			}
		}
		System.out.println("Number of Even Numbers = " + counte);
		System.out.println("Number of Odd Numbers = " + counto);

	}
}