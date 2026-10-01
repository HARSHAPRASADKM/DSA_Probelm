import java.util.*;

class second_largest_number
{
	public static void main(String[] args)
	{

		second_largest_number lg = new second_largest_number();
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
    int second_largest = Integer.MIN_VALUE;
		for (int j=1; j<n ;j++)
		{ 	
			if(N[j] > largest1)
			{ 
        second_largest = largest1;
				largest1 = N[j];
			}
      else if (N[j] != largest1)
      {
        if (N[j] > second_largest)
        {
          second_largest = N[j];
        }
      }
			
		}
    
		return second_largest;
	}

}
