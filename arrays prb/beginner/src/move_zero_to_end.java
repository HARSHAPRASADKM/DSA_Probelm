import java.util.*;

class move_zero_to_end
{
	public static void main(String[] args)
	{

		move_zero_to_end rv = new move_zero_to_end();
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


	int Solution(int N[],int n)
	{	
    int new_array[] = new int[n];
    int j=0;
    for(int i=0;i<n;i++)
    {
        if(N[i]!=0)
        { 
          new_array[j]=N[i];
          j++;
        }
    }
    for(int k=j;k<n;k++) 
    {
      new_array[k]=0;
    }
    for (int i=0;i<n;i++)
    {
      System.out.printf("%d ",new_array[i]);
    }
    return -1;
    
  }

}
