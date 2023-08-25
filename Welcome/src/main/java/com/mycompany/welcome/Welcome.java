/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome;

/**
 * This program displays a greeting for the reader.
 * @version 11.0.20 2023-07-18
 * @author NAUFAL
 */
public class Welcome {

    public static void main(String[] args) {
	 String greeting = "Welcome to Core Java!";
	 System.out.println(greeting);
	 for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
	 System.out.println();
    }
}
