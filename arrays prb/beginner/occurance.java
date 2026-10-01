import java.util.*;

class occurance
{
	public static void main(String[] args)
	{

		occurance oc = new occurance();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers ",n);

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
			}
      System.out.println("tell the number for finding occurance in this array : ");
      int occ = sc.nextInt();

		int res = oc.Solution(N,n,occ);
    System.out.printf("the number %d is occured %d times in given array ",occ,res);
   
	}


	int Solution(int N[],int n,int occ)
	{	int count=0;
    for (int i=0;i<n;i++)
    {
      if (occ == N[i])
      {
        count = count + 1;
      }
    }
    System.out.println();
    return count;
  }

}
