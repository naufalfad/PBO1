/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */
public class Soal3 {
    public static void main (String[] args){
        int angka1, angka2, nilai;
        char oper;
        
        Scanner inp = new Scanner(System.in);
        angka1 = inp.nextInt();
        //mengambil bentuk karakter pertama dengan charAt(0)
        oper = inp.next().charAt(0);
        angka2 = inp.nextInt();
        
        if((angka1 >= 0 && angka1 <=1000) && (angka2 >= 0 && angka2 <=1000)){
           switch(oper){
            case '+':
                nilai = angka1 + angka2;
                System.out.println(nilai);
                break;

            case '-':
                nilai = angka1 - angka2;
                System.out.println(nilai);
                break;                

            case '/':
                nilai = angka1 / angka2;
                System.out.println(nilai);
                break;

            case '*':
                nilai = angka1 * angka2;
                System.out.println(nilai);
                break;

            case '%':
                nilai = angka1 % angka2;
                System.out.println(nilai);
                break;
                
            default:
            System.out.println("input salah");
            break;
            }
        }
    }
}
