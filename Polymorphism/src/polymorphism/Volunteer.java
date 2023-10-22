/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author NAUFAL
 */

public class Volunteer extends StaffMember {
    
    public Volunteer (String eNmae, String eAddress, String ePhone){
        super(eNmae, eAddress,ePhone);
    }

    public double pay(){
        return 0.0;
    }
    
}
