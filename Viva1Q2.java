/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viva1;

/**
 *
 * @author Jee Syuen
 */
import java.util.Scanner;
public class Viva1Q2 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int inquiries=input.nextInt();
        
        for(int count=1;count<=inquiries;count++)
        {
          int luckydigits=0;
          int zeros=0;
          int evendigits=0;
          int odddigits=0;
          
          int number= input.nextInt();
          int luckynum = input.nextInt();

          if(number==0)
          {
              zeros=1;  
          }
          while(number>0)
          {
              int digit= number%10;
              System.out.println(digit);
              number=number/10;
              if(digit==luckynum && luckynum==0)
              {
                  luckydigits++;
              }
              else if(digit==luckynum)
              {
                  luckydigits++;
              }
              else if(digit==0)
              {
                  zeros++;
              }
              else if(digit%2==0)
              {
                  evendigits++;
              }
              else
              {
                  odddigits++;
              }
          }
          System.out.println("Lucky Count: "+ luckydigits);
          System.out.println("Zero Count: "+ zeros); 
          System.out.println("Even Count: "+ evendigits);
          System.out.println("Odd Count: "+ odddigits); 
          
          if(luckydigits>zeros && luckydigits>evendigits && luckydigits>odddigits)
          {
              System.out.println("LUCKY " + "//test case"+ count);
          }
          else if(evendigits>luckydigits && evendigits>zeros && evendigits>odddigits)
          {
              System.out.println("BALANCED "+"//test case"+ count);
          }
          else if(odddigits>luckydigits && odddigits>zeros && odddigits>evendigits)
          {
              System.out.println("ENERGETIC "+"//test case"+ count);
          }
          else
          {
              System.out.println("NEUTRAL "+"//test case"+ count);
          }
        }
        input.close();
    }
}
