/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */
public class Soal4 {
    public static void main (String[] args){
        int pokok = 500000;
        int item, gaji;
        Scanner jual = new Scanner(System.in);
        item = jual.nextInt();
        
        if (item >=80){
            item = item * 5000;
            gaji = (pokok * 35)/100;
            gaji = gaji + item + pokok;
            System.out.println(gaji);
        }
        if (item >= 40 && item <= 80){
            item = item * 5000;
            gaji = (pokok * 25)/100;
            gaji = gaji + item + pokok;
            System.out.println(gaji);            
        }
        if (item >= 15 && item <=49){
            item = item * 5000;
            gaji = item + pokok;
            System.out.println(gaji);            
        }
        if (item <= 14){
            item = item * 5000;
            gaji = (pokok * 15)/100;
            gaji = pokok - gaji + item;
            System.out.println(gaji);
        }
    }    
}
