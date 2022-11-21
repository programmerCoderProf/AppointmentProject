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
public class Person {

    private int id;
    private String name;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {

        return "Id: " + this.getId()
                + "\nName: " + this.getName()
                + "\nPhone number:" + this.getPhoneNumber()
                + "\nEmail:" + this.getEmail()
                + "\n";
    }
}
