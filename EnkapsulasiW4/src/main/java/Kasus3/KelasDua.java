/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus3;

/**
 *
 * @author NAUFAL
 */
class KelasDua {
    {
        //5 tidak akan ditampilkan karena main bukan berawal dari sini
        System.out.println(5);
    }
    public static void main(String[] args){
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        //10 tidak akan ditampilkan karena baris ini hanya akan menjadi akses untuk menampilkan bagian dalam konstruktor KelasSatu
        KelasSatu dua = new KelasSatu(10);
    }
}
