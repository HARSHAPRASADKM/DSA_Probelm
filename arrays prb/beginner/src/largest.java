import java.util.*;

class largest 
{
	public static void main(String[] args)
	{

		largest lg = new largest();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers ",n);

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
			}

		int res = lg.Solution(N,n);
		System.out.printf("%d ",res);
	}


	int Solution(int N[],int n)
	{	int largest1 =N[0];
		for (int j=1; j<n ;j++)
		{ 	
			if(N[j] > largest1)
			{
				largest1 = N[j];
			}
			
		}
	
		return largest1;
	}

}
