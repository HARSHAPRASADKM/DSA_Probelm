import java.util.*;

class reverse_numbers
{
	public static void main(String[] args)
	{

		reverse_numbers rv = new reverse_numbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers ",n);

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
			}

		rv.Solution(N,n);
		
	}


	void Solution(int N[],int n)
	{	
    int reverse_array[] = new int[n];
		for (int i = n-1,j=0; i >= 0 ; i--,j++ )
    {
      reverse_array[j] = N[i];
      System.out.printf("%d ",reverse_array[j]);
    }
    
  }

}
