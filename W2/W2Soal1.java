
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NAUFAL
 */
public class W2Soal1 {
    public static void main(String[] args) {
        //data type yang akan digunakan dalam pengoprasian
        long n;
        //Command untuk melakukan penginputan
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan n! :");
        n = baca.nextLong();
        //fungsi dari try-catch untuk melakukan pengecualian,
        //jika pada proses try terjadi pengecualian maka akan langsung loncat pada
        try{
            if(n >= Byte.MIN_VALUE && n<= Byte.MAX_VALUE){
             System.out.format("%d termasuk :\n", n);
             System.out.println("*byte");             
         }
            if(n >= Short.MIN_VALUE && n<= Short.MAX_VALUE){
             System.out.format("%d termasuk :\n", n);
             System.out.println("*short");
         }
            if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
             System.out.format("%d termasuk :\n", n);
             System.out.println("*int");
         }
            if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
             System.out.format("%d termasuk : \n", n);
             System.out.println("*long");
         }
        }
        catch(Exception e){
            System.out.println("n tidak termasuk");
        }
 }
}