import java.util.Scanner;
class grade{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		if(marks<50 || marks>100)
			System.out.println("Not defined");
		else if(marks>=90 && marks<=100)
			System.out.println("O");
		else if(marks>=80)
			System.out.println("E");
		else if(marks>=70)
			System.out.println("A");
		else if(marks>=60)
			System.out.println("B");
		else if(marks>=50)
			System.out.println("C");
		
	}
}
			
		