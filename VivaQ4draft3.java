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
public class VivaQ4draft3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toLowerCase();
        int k = sc.nextInt();

        String firstWhisper = word.substring(0, k);
        String coreValue = word.substring(0, k);
        String lastEcho = word.substring(0, k);
        int maxAsciiSum = 0;

        // calculate ASCII sum of first substring
        for (int i = 0; i < k; i++) 
        {
            maxAsciiSum += word.charAt(i);
        }

        for (int i = 1; i <= word.length() - k; i++) 
        {
            String sub = word.substring(i, i + k);

            if (sub.compareTo(firstWhisper) < 0) firstWhisper = sub;
            if (sub.compareTo(coreValue) > 0) coreValue = sub;

            int sum = 0;
            for (int j = 0; j < k; j++) sum += sub.charAt(j);
            if (sum > maxAsciiSum) 
            {
                maxAsciiSum = sum;
                lastEcho = sub;
            }
        }
        System.out.println(firstWhisper);
        System.out.println(lastEcho);
        System.out.println(coreValue);
    }
} 
  
