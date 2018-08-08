package program;

public class ArmstrongPrg
{

	public static void main(String[] args) 
	{
		int i,r,sum,t,j;
		for(i=100;i<=999;i++)
		{
			sum=0;
			j=i;
			while(j>0)
			{
				r=j%10;
				sum=sum+(r*r*r);
				j=j/10;
			}
			if(i==sum)
				System.out.println(i+"is armstrong ");
		}
	}

}
