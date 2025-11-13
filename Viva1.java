/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viva1;

/**
 *
 * @author Jee Syuen
 */
import java.util.Scanner;

public class Viva1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input:");
        int inquiries = input.nextInt(); 
        String[] results = new String[inquiries];
        
        for(int count = 0; count < inquiries; count++)
        {
            int number = input.nextInt();
            int luckynum = input.nextInt();

            int luckydigits = 0;
            int zeros = 0;
            int evendigits = 0;
            int odddigits = 0;
            

            if(number == 0) 
            {
                if(luckynum == 0) 
                {
                    luckydigits = 1;
                } 
                else 
                {
                    zeros = 1;
                }
            }
            
            while(number > 0)
            {
                int digit = number % 10;
                
                if(digit == luckynum)
                {
                    luckydigits++;
                } 
                else if(digit == 0) 
                {
                    zeros++;
                } 
                else if(digit % 2 == 0) 
                {
                    evendigits++;
                } 
                else 
                { 
                    odddigits++;
                }
                
                number /= 10;
            }

            String result;
            if(luckydigits > zeros && luckydigits > evendigits && luckydigits > odddigits)
            {
                result = "LUCKY";
            }
            else if(evendigits > luckydigits && evendigits > zeros && evendigits > odddigits)
            {
                result = "BALANCED";
            }
            else if(odddigits > luckydigits && odddigits > zeros && odddigits > evendigits)
            {
                result = "ENERGETIC";
            }
            else 
            {
                result = "NEUTRAL";
            }
            
            results[count] = result;
        }

        System.out.println("\nOutput:"); 
        
        for(int i=0; i<inquiries; i++) 
        {
            System.out.println(results[i] + " // test case " + (i+1));
        }
        input.close();
    }
}