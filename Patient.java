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
public class Patient extends Person{
    
    private String gender;
    
    public Patient(){}
    
    public Patient(int id, String name, int phoneNumber, String email , String gender) {
        
        super(id, name, phoneNumber, email);

        this.gender=gender;
        
    }   
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public String toString(){
       return 
                super.toString()
               
                +"Gender:"+this.getGender();
    }
}
