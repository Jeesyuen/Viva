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
public class VivaQ1firstdraft 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter the number of queries(1-500):");
        int queries=input.nextInt();
        
        for(int count=0; count<queries; count++)
        {
            System.out.println("\nInitial Value(0-50):");
            int initialvalue= input.nextInt();
                if (initialvalue<0 || initialvalue>50)
                {
                System.out.println("Please enter a valid initial value. ");
                } 
            System.out.println("Multiplier Seed(0-50):");
            int multiplierseed= input.nextInt();
                if(multiplierseed<0 || multiplierseed>50)
                {
                    System.out.println("Please enter a valid multiplier seed. ");
                }
            System.out.println("Charm Length(1-15):");
            int charmlength= input.nextInt();    
                if(charmlength<1 ||charmlength>15)
                {
                System.out.println("Please enter a valid charmlength.");
                }
            

            if(initialvalue>=0 && initialvalue<=50 && multiplierseed>=0 && multiplierseed<=50 && charmlength>=1 && charmlength<=15)
            {
                System.out.println("The sequence for this query would be:");
                for(int i=0; i<charmlength; i++)
                {
                int calculation=0;
                calculation=(int) (initialvalue+(multiplierseed*Math.pow(2, i)));
                // typecasting cause math.pow gives a double
                System.out.print(calculation+" ");   
                }  
            } 
            System.out.println();
        } 
        input.close();
    }   
}
   
