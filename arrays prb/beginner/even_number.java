import java.util.*;

class even_number
{
 
	public static void main(String[] args)
	{

		even_number ev = new even_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int N[] = new int[n];
		System.out.printf("enter %d numbers : ",n);
    System.out.println();

			for (int i=0; i<n ; i++)
			{
  				N[i]=sc.nextInt();
          
			}

		int res = ev.Solution(N,n);
		System.out.printf("total number of even number is : %d ",res);
    
    
			
	}


	int Solution(int N[],int n)
	{	int count =0;
   System.out.print("the numbers are :");
		for (int j=0; j<n ;j++)
		{ 	
      
			if(N[j]%2 == 0 )
			{
				count = count + 1;
        System.out.printf(" %d  ",N[j]);
       
       
			}
			
		}
    System.out.println();
		return count;
	}

}
