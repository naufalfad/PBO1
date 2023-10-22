/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author NAUFAL
 */
public class Sphere extends Shape{
    private double radius;

    public Sphere(double r){
        super("Sphere");
        radius = r;
    }

    public double area(){
        return 4 * Math.PI*radius*radius;
    }

    public String toString(){
        return super.toString() +" of radius"+ radius;
    } 
}
