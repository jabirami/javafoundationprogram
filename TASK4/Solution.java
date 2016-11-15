import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Solution

{

public static void main(String a[])throws IOException

{

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

Point po=new Point();

System.out.println("ENTER THE VALUE FOR X AND Y");

int x=Integer.parseInt(bf.readLine());

int y=Integer.parseInt(bf.readLine());

System.out.println("ENTER THE CHOICE");

int choice=Integer.parseInt(bf.readLine());

switch(choice)

{

case 1:po.setXY(x,y);

System.out.println("DISTANCE:"+po.distance());

break;

case 2:po=new Point(x,y);

System.out.println("ENTER THE VALUE FOR X1 AND Y1");

int x1=Integer.parseInt(bf.readLine());

int y1=Integer.parseInt(bf.readLine());

System.out.println("DISTANCE:"+po.distance(x1,y1));

break;

case 3:po=new Point(x);

System.out.println("ENTER THE VALUE FOR AXIS");

int axis=Integer.parseInt(bf.readLine());



System.out.println("DISTANCE:"+po.distance(axis));

break;

}

System.out.println(po);

}

}

