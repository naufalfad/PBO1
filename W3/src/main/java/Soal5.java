/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */
public class Soal5 {
    public static void main(String[] args) {
        long angka, peng;
        String plat;
        String[] gab;
        Scanner inp = new Scanner(System.in);
        
        //menginputkan angka pada string
        plat = inp.nextLine();
        // memisahkan spasi dari string plat dan ditampung oleh string gab
        gab = plat.split(" ");
        //penggabungan semua angka terjadi disini
        plat = String.join("", gab);
        //dari hasil penggabungan string plat diubah menjadi tipe data long
        angka = Long.parseLong(plat);
        
        peng = (angka - 999999)%5;
        if(peng == 0){
            System.out.println("jalan");
        }
        else{
            System.out.println("berhenti");
        }
    }
    
}
