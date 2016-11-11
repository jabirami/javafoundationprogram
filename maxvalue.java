import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArrayGet
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int value[]=new int[5];
		int max=0;
		for(int iterator=0;iterator<value.length;iterator++)
		{
		   value[iterator]=Integer.parseInt(bf.readLine());
	    }
	    for(int iterator=0;iterator<value.length;iterator++)
	    {

            if(value[iterator]>max)
            	max=value[iterator];
	    }
	    System.out.println("maximum value is:"+max);
		
	}
}
