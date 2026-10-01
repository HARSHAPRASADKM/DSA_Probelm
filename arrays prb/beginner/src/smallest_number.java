import java.util.*;

class smallest_number
{
	public static void main(String[] args)
	{

		smallest_number  sm = new smallest_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers ",n);

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
			}

		int res = sm.Solution(N,n);
		System.out.printf("smallest number is : %d ",res);
	}


	int Solution(int N[],int n)
	{	int smallest =N[0];
		for (int j=1; j<n ;j++)
		{ 	
			if(N[j] < smallest)
			{
				smallest = N[j];
			}
			
		}
	
		return smallest;
	}

}
