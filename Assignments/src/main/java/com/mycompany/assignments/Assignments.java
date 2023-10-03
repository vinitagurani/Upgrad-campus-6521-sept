/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignments;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author vini
 */
public class Assignments {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

/*float a;
Scanner in;
in = new Scanner (System.in);

System.out.println ("Enter a number");
a = in.nextFloat();
 int b = (int) a; // absolute value of a 

if (a == 0.0) 
{
	System.out.println ("zero");
}

else if (a < 0.0) 
	System.out.println ("Negative");

else if (a > 0.0)
{ 
	System.out.println ("Positive");
	if (b < 1)
		System.out.println ("Small");
	else if (b > 1000000)
		System.out.println ("Large");
}
*/
//--------------------------------------------------------------
/*int a, rem, b;
Scanner in ;
in = new Scanner (System.in);
a = in. nextInt();

if (a >= 1000)
{
	b = a/1000;
	System.out.printf ("1000 * %d = %d \n", b, b*1000 );
	rem = a%1000;
	a = rem;
}
if (a <1000 & a>=500)
{
	b = a/500;
	System.out.printf ("500 * %d = %d \n",b, b*500);
	rem = a%500;
	a = rem;
}
if (a <500 & a>=100)
{
	b = a/100;
	System.out.printf ("100 * %d = %d \n ",b, b*100);
	rem= a%100;
	a = rem;
}
if (a <100 & a>= 50)
{
	b = a/50;
	System.out.printf("50 * %d = %d\n ",b, b*50);
	rem = a%50;
	a = rem;
}
if (a <50 &a>= 10)
{
	b = a/10;
	System.out.printf("10 * %d = %d \n ",b, b*10);
	rem = a%10;
	a = rem;
}
if (a <10 & a>= 5)
{
	b = a/5;
	System.out.printf("5 * %d = %d \n ",b, b*5);
	rem = a%5;
	a = rem;
}
if (a <5 & a>=2)
{
	b = a/2;
	System.out.printf("2 * %d = %d",b, b*2);
	rem = a%2;
	a = rem;
}
if (a <2)
{
	System.out.printf("one notes of 1rs\n " );
	
}
*/

//----------------------------------------------------------------------------------------
/*boolean isPrime = true;
int num;
for (num = 2; num < 1000; num++)
{
	
	
	for (int i = 2; i <= math.sqrt(num); i++)
	{
		if (num%i == 0)
			isPrime = false;
		break;
	}
}
if (isPrime == true)
	
	System.out.println(num);*/
//-------------------------------------------------------------------------------------------

int num, tenThousands, thousands, hundreds, tens,ones, temp;
Scanner in;
in = new Scanner(System.in);
num = in. nextInt();
tenThousands = num/10000;
System.out.println ("the num at ten thousandth place is "+tenThousands );

temp = tenThousands * 10000;
thousands = (num - temp)/1000;
System.out.println ("the num at thousandth is "+thousands);

temp = temp + (thousands * 1000);
hundreds = (num - temp)/100;
System.out.println ("hundreth place is "+hundreds);

temp = temp + (hundreds * 100);
tens = (num -temp)/10;
System.out.println ("tens place is "+tens);

temp = temp + (tens * 10);
ones = (num - temp)/1;
System.out.println ("" +ones); 

//char a ='A';
//int b = (int) a;
//System.out.println(b);

char a = 56;
System.out.println (a);


    }
}
