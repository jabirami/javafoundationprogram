import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Count
{
	public static void main(String a[]) throws IOException
	{
		int max=0,count=0;
		int array[]=new int[5];
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<array.length;i++)
		{
		  array[i]=Integer.parseInt(bf.readLine());
		}
		for(int i=0;i<array.length;i++)
		{
		if(array[i]>max)
		max=array[i];
        }
       for(int i=0;i<array.length;i++)
		{
			if(max==array[i])
			count++;
		}
        System.out.println("maximum number and count of maximum number is :"+max+" "+count);
    }
} 
