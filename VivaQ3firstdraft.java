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
public class VivaQ3firstdraft 
{
    public static void main(String[] args)
    {
       Scanner input= new Scanner(System.in);
       System.out.println("Please enter the number of queries:");
       int queries = input.nextInt();
       
      for(int i=0; i<queries; i++)
      {
         System.out.println("\nHeight:");
         int height= input.nextInt();
         System.out.println("Style(A/P):");
         String style=input.next();
         style=style.toUpperCase();
         
         for (int row=1; row<=height; row++)
         {
           
            if(style.equals("A"))
            {
                for(int k=1; k<=row; k++)
                {
                  System.out.print(row); 
                }
            }
            else if(style.equals("P"))
            {
                for(int m=1; m<=height-row; m++)
                {
                    System.out.print(" ");                   
                }
                for(int n=1; n<=row;n++)
                {
                    System.out.print(n);
                }
                for(int p=row-1; p>=1; p--)
                {
                    System.out.print(p);
                }
            }
          System.out.println();
         }
       }
     input.close();
    }
}
