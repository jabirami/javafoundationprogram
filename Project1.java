class Project1

{

public static void main(String a[])

{

int val=Integer.parseInt(a[0]);

int salary=0,j=0,flag=0;

char ch=' ';

int empNo[]={1001,1002,1003,1004,1005,1006,1007};

String

name[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};

String

join[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/

06/2006"};

char design[]={'e','c','k','r','m','e','c'};

String

dept[]={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};

int basic[]={20000,30000,10000,12000,50000,23000,29000};

int hra[]={8000,12000,8000,6000,20000,9000,12000};

int it[]={3000,9000,1000,2000,20000,4400,10000};

String designation=null;

for(int i=0;i<7;i++)

{

if(empNo[i]==val)

{

flag=1;

j=i;

ch=design[i];

salary=salary+basic[i]+hra[i]-it[i];

}

}

switch(ch)

{

case 'e':salary=salary+20000;

designation="Engineer";

break;

case 'c':salary=salary+32000;

designation="Consultant";

break;

case 'k':salary=salary+12000;

designation="clerk";

break;

case 'r':salary=salary+15000;

designation="Receptionist";

break;

case 'm':salary=salary+40000;

designation="Manager";

break;

}

if(flag==1)

System.out.print("EmpNo EmpName Department Designation Salary\n"+empNo[j]+"

"+name[j]+" "+dept[j]+" "+designation+" "+salary);

else

System.out.print("Tere is no employee with empid:"+val);

}

}
