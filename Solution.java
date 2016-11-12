import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int choice=Integer.parseInt(bf.readLine());
        switch(choice)
        {
        	case 1:
        	Circle cObject=new Circle();
        	cObject.radious=Double.parseDouble(bf.readLine());
        	cObject.circleArea();
        	break;
        	case 2:
        	Rectangle rObject=new Rectangle();
        	rObject.length=Double.parseDouble(bf.readLine());
        	rObject.breath=Double.parseDouble(bf.readLine());
        	rObject.rectangleArea();
        	break;
        	case 3:
        	Triangle tObject=new Triangle();
        	tObject.height=Double.parseDouble(bf.readLine());
        	tObject.base=Double.parseDouble(bf.readLine());
        	tObject.triangleArea();
        	break;

        }   
		
        
	}
}
