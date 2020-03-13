package com.mycompany.lab3;

import java.util.Random;

public class IsEvenMethod {
  public static boolean IsEvenMethod(int x)
{
    if (x%2==0)
{
return(true); 
}
else
{
return(false); 
}
}
 public static void main(String[] args)
{
System.out.println("Generating 100 random intgrs");

Random rand = new Random();
int EvenCount=0,OddCount=0;
for(int i=1;i<=100;i++)
{
int number = rand.nextInt();
if ( IsEvenMethod(number))
    {
     EvenCount++;
    }
else 
    {
        OddCount++;
        System.out.println("The total of even numbers is "+EvenCount); 
        System.out.println("The total of odd numbers is "+OddCount);
        
        }
}
}
}