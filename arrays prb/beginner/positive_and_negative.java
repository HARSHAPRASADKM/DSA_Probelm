import java.util.*;

class positive_and_negative
{
	public static void main(String[] args)
	{

		positive_and_negative sm = new positive_and_negative();
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
		System.out.printf("number of zero's: %d ",res);
	}


	int Solution(int N[],int n)
	{	int count_positive = 0;
		int count_negative=0;
		int count_zero=0;
		for (int j=0; j<n ;j++)
		{ 	
			if (N[j] > 0)
			{
				count_positive = count_positive + 1;
			}
			else if (N[j] < 0)
			{
				count_negative = count_negative + 1;
			}
			else 
			{
				count_zero = count_zero + 1;
			}
      
		}
		System.out.printf("number of positive numbers : %d ",count_positive);
		System.out.println();
		System.out.printf("number of negative numbers : %d ",count_negative);
		System.out.println();
		return count_zero;
	}

}
