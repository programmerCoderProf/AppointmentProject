/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Date;

/**
 *
 * @author Rawda
 */
public class Appointment {
    //class data members
    
    private int id;
    private Date date;
    private String type;
    private Patient patient;
    private Doctor doctor;
    
    //constructors
    public Appointment(){}
    
    public Appointment(int id , String type,Patient p , Doctor d){
        
        this.id =id;
        this.date = new Date();
        this.type=type;
        this.patient = p;
        this.doctor= d;
    }
    //setters & getters
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    //////////////////////
    public Patient addPatient(Patient p){
        
        return p;
        
    }
    
     public Doctor addDoctor(Doctor d){
       
         return d;
         
    }
     //
     
     public String toString(){
         
        return "Appointment Id: "+this.getId()
                 +"\nAppointment Type: "+this.getType()
                 +"\nAppointment Date: "+this.getDate()
                
                 +"\n"+"Patient Name:"+patient.getName()
                 +"\nPatient Gender: "+patient.getGender()
                 +"\nPhone number:"+patient.getPhoneNumber()
                 +"\nDoctor Name: "
                 +doctor.getName()
                 +"\nSpecial :"+doctor.getSpecial();
         
     }
}
