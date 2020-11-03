/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Assignment1 {

    public static void isAscending(int []array)
    {
        boolean value = false;
        boolean sortedAsc = true;
        boolean sortedDesc = true;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1])
                sortedDesc = false;
            else
                sortedAsc = false;
        }
        if(sortedAsc)
        { for (int i = 0; i < array.length; i++) {   
                System.out.println(array[i]);
            }
        System.out.println("The array is sorted in an ascending form");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number do you want to enter: ");
        int size = input.nextInt();
        int [] array = new int[size];
        System.out.println("Enter you numbers: ");
        for (int i = 0; i < size; i++) {
            array[i]=input.nextInt();  
        }
           isAscending(array);  
    }
    
}