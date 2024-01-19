/*
3.Program to sort the user entered list of numbers of any size
Input:  List of Numbers
Output: Display the numbers in Ascending order
*/
import java.util.Scanner;
public class C{

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = scanner.nextInt();
		System.out.println("List of numbers: ");
		int arr[] = new int[size];
		for(int x= 0; x < size; x++) {
			arr[x] = scanner.nextInt();
		}
		for(int i = 0; i < size - 1 ; i++){
			for(int j = i; j < size-i-1; j++){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		System.out.println();
		for(int x= 0; x < size; x++){
			System.out.print(arr[x] + " ");
		}
	}
}