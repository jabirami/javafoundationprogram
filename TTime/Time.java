package timing;
public class Time
{
	public int hour,minute,second;
	public Time()
	{
		int hour=0;
		int minute=0;
		int second=0;
	}
	public Time(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void nextHour()
	{
		hour=hour+1;
		if(hour==24)
		{
			hour=0;
		}
		print();
	}
	public void nextMinute()
	{
		minute=minute+1;
		if(minute==60)
		{ 
			minute=0;
			hour=hour+1;
			if(hour==24)
			hour=0;
		}
			print();
	}
	public void nextSecond()
	{
		second=second+1;
		if(second==60)
		{
			second=0;
			minute=minute+1;
			if(minute==60)
			{
			minute=0;
			hour=hour+1;
		    }
		    if(hour==24)
		    hour=0;
        }
        	print();
	}
	public void previousHour()
	{
		if(hour==0)
		hour=23;
		else 
		hour=hour-1;
			print();
	}
	public void previousMinute()
	{
		if(minute==0)
		{
		minute=59;
		hour=hour-1;
		if(hour==0)
		hour=23;
	    }
		else 
		minute=minute-1;
			print();
	}
	public void previousSecond()
	{
		if(second==0)
		{
		second=59;
		minute=minute-1;
	    if(minute==0)
	      {
	    	minute=59;
	    	hour=hour-1;
	        if(hour==0)
	         {
	    	   hour=23;
	         }
	      }  
		else 
		second=second-1;
	   }
	   	print();
	}
	public void print()
	{
		System.out.print(String.format("%02d:",hour));
		System.out.print(String.format("%02d:",minute));
		System.out.print(String.format("%02d",second));

	}

}
