public class Point{

int x,y;

public String toString()

{

return "(x,y) is"+x+","+y;

}

public Point()

{

x=0;

y=0;

}

public Point(int axis)

{

this.x=axis;

this.y=axis;

}

public Point(int x,int y)

{

this.x=x;

this.y=y;

}

public void setXY(int x,int y)

{

this.x=x;

this.y=y;

}

public double distance(int axis)

{

double distanceAnswer=((axis-x)*(axis-x)+(axis-y)*(axis-y));

distanceAnswer=Math.sqrt(distanceAnswer);

return distanceAnswer;

}

public double distance(int x1,int y1)

{

double distanceAnswer=((x1-x)*(x1-x))+((y1-y)*(y1-y));

distanceAnswer=Math.sqrt(distanceAnswer);

return distanceAnswer;

}

public double distance()

{

double distanceAnswer=((x*x)+(y*y));

distanceAnswer=Math.sqrt(distanceAnswer);

return distanceAnswer;

}

}
