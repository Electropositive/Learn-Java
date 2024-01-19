import java.util.Scanner;
class palindrome{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int x = sc.nextInt();
	int n = x;
	int rev=0;
	while(n>0)
	{
		int rem = n%10;
		rev = rev*10 + rem;
		n/= 10;
	}
	if(rev==x)
		System.out.println(x+" is a palindrome number.");
	else
		System.out.println(x+" is not a palindrome number.");
	}
}