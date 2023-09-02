/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NAUFAL
 */
public class W2Soal4 {
    /* "methodOne" metode ini menerima satu argumen dengan tipe data long dan mengembalikan
    sebuah nilai dengan tipe data short */
    static short methodOne(long l)
    {
        /* proses yang dilakukan dari "methodOne" yaitu mengcasting nilai dengan tipe data long menjadi
        tipe data integer, lalu mengembalikan nilai tersebut menjadi tipe data short*/
        int i = (int) l;
        return (short)i;
        }
 public static void main(String[] args)
 {
    //deklarasi nilai tipe data double dengan nilai 10.25
    double d = 10.25;
    //casting tipe data double menjadi tipe data float
    float f = (float) d;
    /* mengcasting nilai pada tipe data float menjadi long dan mengembalikan nilai
    menjadi tipe data short sesuai dengan metode (methodOne), lalu di casting lagi
    menjadi tipe data byte pada hasil akhir*/
    byte b = (byte) methodOne((long) f);
    System.out.println(b);
 }
}
