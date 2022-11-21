/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Rawda
 */
public class Doctor extends Person {
    
    private String special;
    
    
    public  Doctor(){}
    public Doctor(int id, String name, int phoneNumber, String email, String special) {
     
        super(id , name, phoneNumber, email);
        this.special = special;
    }

    public void setSpecail(String special) {
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }
    
    public String toString(){
        return 
                super.toString()
                +"Special:"+this.getSpecial()+"\n";
    }

}
