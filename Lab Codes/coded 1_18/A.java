/*1.Aim of the program :  Find the largest among 3 user entered nos. at the command prompt using Java
/*1.Aim of the program :  Find the largest among 3 user entered nos. at the command prompt using Java
Input: Enter three number .
Output: Display the Largest Number*/
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		double a, b, max;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		max = scanner.nextInt();
		if(a>=b && a >= max){
			max = a;
		}
		if(b>=a && b >= max){
			max = b;
		}
		System.out.printf("The largest number is: %.2f", max);
	}
}