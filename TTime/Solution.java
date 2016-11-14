package org;
import timing.Time;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Solution
{
	public static void main(String a[])throws IOException
	{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		Time ti=new Time();
		
		System.out.println("ENTER YOUR HOUR MINUTE AND SECOND:");
		int hour=Integer.parseInt(bf.readLine());
		int minute=Integer.parseInt(bf.readLine());
		int second=Integer.parseInt(bf.readLine());
		ti=new Time(hour,minute,second);
		System.out.println("ENTER THE CHOICE:");
		int choice=Integer.parseInt(bf.readLine());
	    switch(choice)
		{
			case 1:ti.nextSecond();
			break;
			case 2:ti.nextMinute();
			break;
			case 3:ti.nextHour();
			break;
			case 4:ti.previousSecond();
			break;
			case 5:ti.previousMinute();
			break;
			case 6:ti.previousHour();
			break;
		}
	

	}
}
