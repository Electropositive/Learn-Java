//5.Find the no. of occurrence of each element in a user entered list of nos.
import java.util.Scanner;
class E
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the list: ");
		int  n =sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter list of numbers: ");
		for(int i=0;i<n;i++)
		{ 
	        arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			int count =0;
			for(int j=i;j<n;j++)
			{
               if(arr[i]==arr[j])
			   {
				   count++;
				   if(i!=j){
					for(int k = j;k < n-1;k++){
						arr[k] = arr[k+1];  
					}
					n--;
					j--;					
				   }
				   
			   }
			}
			System.out.print("\nOccurrence of " + arr[i]+ " = " + count);
		}
	}
}