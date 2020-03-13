package com.mycompany.lab3;

import java.util.Scanner;

public class IsPrimeMethod {
     public static void main(String[] args)
    {   
        int x;
        int y = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type an integer: ");
        x = keyboard.nextInt();
        
        for(int z = 2; z < x; z++)
        {
            if(x%z != 0)
            {
               y++;
            }
        }
        {
            if(y == x - 2)
            {
                System.out.println(x + " is a prime number");
            }else{
                System.out.println(x + " is not a prime number");
             }        
    }
   }
}