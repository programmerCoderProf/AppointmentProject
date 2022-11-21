/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
public class Clinic {
    
    private int id;
    private String name;
    private String location;
    private int phoneNumber;
    private String type;
 
   public Clinic() {    }

    public Clinic(int id, String name, String location, int phoneNumber, String type) {
       
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.type = type;
        
   
    }
    //setters and getters

    public void setId(int id) {
        
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
  public String getType() {
        return type;
    }
///////////////////////////////
    public String toString() {
        return "Clinic Info:\nId: " +this.getId()
                + "\nName: "+this.getName()
                + "\nLocation: "+this.getLocation()
                + "\nPhone number: "+ this.getPhoneNumber()
                + "\nType: " + this.getType();
    }

}
