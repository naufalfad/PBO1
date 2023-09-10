/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */
public class Soal1 {
    
    public static void main(String[] args) {
        String n;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextLine();
        //memisah simbol tertentu yang tertera dalam sebuah string
        String[] isi = n.split("[\\s!,'.?@_]");
        int panjang = isi.length;
        System.out.println( panjang);
        
        for (int i = 0; i<panjang; i++){
            System.out.println(isi[i]);
        }
    }
}
