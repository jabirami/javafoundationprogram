import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

class ThreeDimensionalArray

{

public static void main(String args[])throws IOException

{

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

int counter[][][];

counter=new int [12][][];

int iterator=0,year=2015;

int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};

if((year%4==0)&&(year%100!=0)||(year%400==0))

{

monthDays[1]=29;

}

else

{

monthDays[1]=28;

}

for(iterator=0;iterator<monthDays.length;iterator++)

{

counter[iterator]=new int[monthDays[iterator]][24];

}

for(int i=0;i<12;i++)

{

for(int j=0;j<monthDays[i];j++)

{

String data=bf.readLine();

String visitors[]=data.split(" ");

for(int k=0;k<24;k++)

{

counter[i][j][k]=Integer.parseInt(visitors[k]);

}

}

}

int

januarySum=0,decemberSum=0,daySum=0,januaryAverage=0,decemberAverage=0,dayAverage

=0,i,j;

for(i=0;i<31;i++)

{

for(j=0;j<24;j++)

{

januarySum=januarySum+counter[0][i][j];

}

}

januaryAverage=januarySum/(31*24);

System.out.println("AVERAGE NUMBER OF CUSTOMER IN

JANUARY:"+januaryAverage);

for(j=0;j<24;j++)

{

decemberSum=decemberSum+counter[11][20][j];

}

decemberAverage=decemberSum/24;

System.out.println("AVERAGE NUMBER OF CUSTOMER IN DECEMBER

21:"+decemberAverage);

for(i=0;i<12;i++)

{

for(j=0;j<24;j++)

{

daySum=daySum+counter[i][6][j];

}

}

dayAverage=daySum/(12*24);

System.out.println("AVERAGE NUMBER OF CUSTOMER ON EVERY MONTH DAY

7:"+dayAverage);

int leapSum=0,leapAverage=0;

if((year%4==0)&&(year%100!=0)||(year%400==0))

{

for(i=0;i<12;i++)

{

for(j=0;j<24;j++)

{

leapSum=leapSum+counter[i][28][j];

}

}

leapAverage=leapSum/(12*24);

System.out.println("AVERAGE NUMBER OF CUSTOMER ON EVERY MONTH DAY

29:"+leapAverage);

}

else

{

for(i=0;(i<12)&&(i!=1);i++)

{

for(j=0;j<24;j++)

{

leapSum=leapSum+counter[i][28][j];

}

}

leapAverage=leapSum/(11*24);

System.out.println("AVERAGE NUMBER OF CUSTOMER ON EVERY MONTH DAY

29:"+leapAverage);

}

int hourSum=0,hourAverage=0,k=0;

for(i=0;i<12;i++)

{

for(j=0;j<24;j++)

{

for(k=9;k<18;k++)

{

hourSum=hourSum+counter[i][j][k];

}

}

}

hourAverage=hourSum/(12*9);

System.out.println("AVERAGE NUMBER OF CUSTOMER ON EVERY DAY OF HOUR

10 TO 18:"+hourAverage);

int specificSum1=0,specificAvg1=0;

for(i=0;i<12;i++)

{

for(j=7;j<12;j++)

{

specificSum1=specificSum1+counter[i][4][j];

specificSum1=specificSum1+counter[i][6][j];

specificSum1=specificSum1+counter[i][11][j];

specificSum1=specificSum1+counter[i][15][j];

specificSum1=specificSum1+counter[i][22][j];

}

for(j=15;j<24;j++)

{

specificSum1=specificSum1+counter[i][4][j];

specificSum1=specificSum1+counter[i][6][j];

specificSum1=specificSum1+counter[i][11][j];

specificSum1=specificSum1+counter[i][15][j];

specificSum1=specificSum1+counter[i][22][j];

}

}

specificAvg1=specificSum1/(5*14);

System.out.println("AVERAGE NUMBER OF CUSTOMER OF DAYS FROM HOUR 8

TO 12 AND FROM 16 TO 24:"+specificAvg1);

int julySum=0,julyAverage=0;

for(i=0;i<12;i++)

{

for(j=0;j<24;j++)

{

julySum=julySum+counter[6][i][j];

}

}

julyAverage=julySum/(12*24);

System.out.println("TOTAL AND AVERAGE NUMBER OF CUSTOMER ON EVERY

MONTH OF JULY:"+julySum+" "+julyAverage);

int everyMonthSum=0,everyMonthAverage=0,yearSum=0,yearAverage=0;

for(i=0;i<12;i++)

{

everyMonthSum=0;

everyMonthAverage=0;

for(j=0;j<monthDays[i];j++)

{

for(k=0;k<24;k++)

{

everyMonthSum=everyMonthSum+counter[i][j][k];

}



}

everyMonthAverage=everyMonthSum/(24*monthDays[i]);

yearSum=yearSum+everyMonthSum;

System.out.println("TOTAL AND AVERAGE NUMBER OF

CUSTOMER FOR EVERY MONTH:"+everyMonthSum+" "+everyMonthAverage);

}

yearAverage=yearSum/12;

System.out.println("TOTAL AND AVERAGE NUMBER OF CUSTOMER FOR

YEAR:"+yearSum+" "+yearAverage);



}

}
