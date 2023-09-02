
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NAUFAL
 */
public class W2Soal5 {
    public static void main(String[] args) {
    //deklarasi string A dan B
    String A,B;     
    Scanner teks = new Scanner(System.in);
   
        System.out.println("Masukkan Isi String Pertama :");
        A = teks.nextLine();
        System.out.println("Masukkan Isi String Kedua :");
        B = teks.nextLine();
        
        /*menghitung jumlah panjang string A dan B (A/B.length()) dan menjumlahkan
        kedua panjang kalimat dari string tersebut */
        System.out.println(A.length()+B.length());
        
        /* membandingkan urutan leksikal dari isi string A dan string B jika urutan
        alfabet string A berada setelah string B maka akan mencetak Yes*/
        System.out.println(A.compareTo(B)> 0? "Yes" : "No");
        
        /* (toUpperCase) mengubah huruf awal dari string A dan B menjadi huruf kapital
        lalu menggabungkannya kembali dengan sisa string yang ada */
        A = A.substring(0, 1).toUpperCase()+A.substring(1);
        B = B.substring(0, 1).toUpperCase()+B.substring(1);
        // mencetak kedua string
        System.err.println(A+" "+B);
    }
}
