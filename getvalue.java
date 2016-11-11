import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArrayGet
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int value=Integer.parseInt(bf.readLine());
		System.out.println(value);
	}
}
