package com.bridgelabz.core_java;
import java.util.*;
public class Harmonic {
	public static void main(String[] args) { 
	
Scanner sc=new Scanner(System.in);
double sum=0,n,i;
System.out.println("Enter the value of N = ");
n=sc.nextDouble();
for(i=1;i<=n;i++)
{
sum=sum+(1/i);
if(i==1)
System.out.print("1 +  ");
else if(i==n)
System.out.print(" 1/ "+ i);
else 
System.out.print(" 1/ "+ i);
}
System.out.println();
System.out.println("The sum of this series is:= "+sum);
}
}
