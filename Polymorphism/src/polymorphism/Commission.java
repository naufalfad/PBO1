/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author NAUFAL
 */

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phone, 
    String socSecNumber, double rate, double commissionRate) {
        super(name, address, phone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay(); 
        double commissionPay = totalSales * commissionRate;
        totalSales = 0.0; 

        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        return parentString + "\nTotal Sales: $" + totalSales;
    }
}
