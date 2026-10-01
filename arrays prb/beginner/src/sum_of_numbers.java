import java.util.*;

class sum_of_numbers
{
	public static void main(String[] args)
	{

		sum_of_numbers sm = new sum_of_numbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers ",n);

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
			}

		int res = sm.Solution(N,n);
		System.out.printf("smallest number  : %d ",res);
	}


	int Solution(int N[],int n)
	{	int sum = 0;
		for (int j=0; j<n ;j++)
		{ 	
      sum = sum + N[j];
		}
	
		return sum;
	}

}
