import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,ans;
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=Math.floorDiv(a,6);
		    //System.out.println(c)
		    ans=c;
		    if (a%6>0){
		        ans+=1;
		    }
		   System.out.println(ans*b);
		}
	}
}