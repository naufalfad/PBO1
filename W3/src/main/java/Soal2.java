/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author NAUFAL
 */
public class Soal2 {
    public static void main(String[] args) {
     //deklarasi array inp dengan bentuk tipe data string yang dapat menampung 3 elemen string
     String[] inp = new String[3];
     //deklarasi array ang dengan bentuk tipe data integer yang dapat menampung 3 elemen integer
     int[] ang  = new int[3];
     int i;
     
     Scanner input = new Scanner(System.in);
     for (i =0 ; i<3 ; i++){
         String w = input.next();
         inp[i] = w;
         int x = input.nextInt();
         ang[i] = x;
     }
        System.out.println("=========================");
     for (i = 0 ; i<3 ; i++){
        System.out.printf("%-15s%03d%n", inp[i], ang[i]);
     }
        System.out.println("=========================");
    }
}
