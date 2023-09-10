/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */
public class Soal6 {
    public static void main(String[] args) { 
     BigInteger a = null, b = null;
     boolean input = false;
     Scanner nilai = new Scanner(System.in);
     
     while(!input){
      System.out.println("masukkan nilai awal");
      a = nilai.nextBigInteger();
      System.out.println("masukkan nilai kedua");
      b = nilai.nextBigInteger();
      if ((a.compareTo(BigInteger.ZERO) < 0)||(b.compareTo(BigInteger.ZERO) < 0)){
          System.out.println("inputan anda harus bilangan positif");
      }
      else{
          input = true;
      }
      }
      
     System.out.println(a.add(b));
     System.out.println(a.multiply(b));
            
    }
}
