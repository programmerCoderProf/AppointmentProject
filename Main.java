/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rawdah
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner input = new Scanner(System.in);
        ArrayList pList = new ArrayList<Patient>();
        ArrayList dList = new ArrayList<Doctor>();
        ArrayList appList = new ArrayList<Appointment>();

        Clinic c = new Clinic(1, "ANH", "Dubi", 574567697, "General");

        Patient p1 = new Patient(1, "Mohammed", 574567696, "moh@gmail.com", "male");
        Patient p2 = new Patient(2, "Mead", 574567695, "mead@gmail.com", "femal");
        
        pList.add(p1);
        pList.add(p2);
        Doctor d1 = new Doctor(1, "Ali", 574567694, "ali@gmail.com", "Eyese");
        Doctor d2 = new Doctor(2, "Aish", 574567693, "aish@gmail.com", "Heart");
        dList.add(d1);
        dList.add(d2);
        Appointment a = new Appointment(1, "Eyes", p1, d1);
        Appointment a2 = new Appointment(1, "Eyes", p2, d2);
        appList.add(a);
        appList.add(a2);
        int ch;
        try {
        while (true) {
            System.out.println("\tCLINIC SYSTEM");
            System.out.println("\n================================");
            System.out.println("1. Add Doctor:"
                    + "\n2. Add Patient"
                    + "\n3. Add Appointment"
                    + "\n4. Show All Patients"
                    + "\n5. Show All Doctors"
                    + "\n6. Show All Appointments"
                    + "\n7. Show Clinic info"
                    + "\n8. Exit");
            System.out.println("\n================================");
          
                ch = input.nextInt();
                
                if (ch==1) {
                    Doctor n = new Doctor();
                    System.out.print("Enter the docotr Id: ");
                    n.setId(input.nextInt());
                    System.out.print("Enter the name: ");
                    n.setName(input.next());
                    System.out.print("Enter the phone number: ");
                    n.setPhoneNumber(input.nextInt());
                    System.out.print("Enter the email: ");
                    n.setEmail(input.next());
                    System.out.print("Enter the special: ");
                    n.setSpecail(input.next());
                    
                    dList.add(n);
                    System.out.println("Added Successfuly\n");
                } else if (ch == 2) {
                    Patient pn = new Patient();
                    System.out.print("Enter the id: ");
                    pn.setId(input.nextInt());
                    System.out.print("Enter the name: ");
                    pn.setName(input.next());
                    System.out.print("Enter the phone number: ");
                    pn.setPhoneNumber(input.nextInt());
                    System.out.print("Enter the email: ");
                    pn.setEmail(input.next());
                    System.out.print("Enter the gender: ");
                    pn.setGender(input.next());
                    pList.add(pn);
                    System.out.println("Added Successfuly\n");
                } else if (ch == 3) {
                    Patient pn = new Patient();
                    System.out.println("Please enter patient data: ");
                    System.out.print("Enter the id: ");
                    pn.setId(input.nextInt());
                    System.out.print("Enter the name: ");
                    pn.setName(input.next());
                    System.out.print("Enter the phone number: ");
                    pn.setPhoneNumber(input.nextInt());
                    System.out.print("Enter the email: ");
                    pn.setEmail(input.next());
                    System.out.print("Enter the gender: ");
                    pn.setGender(input.next());
                    System.out.println("================================");
                    System.out.println("ID    Name\tSpecial");
                    for (int i = 0; i < dList.size(); i++) {
                        System.out.print(i + 1 + "");
                        Doctor d = new Doctor();
                        d = (Doctor) dList.get(i);
                        System.out.println("     " + d.getName() + "\t" + d.getSpecial());
                    }
                    System.out.print("Please choice the doctor: ");
                    int ans = input.nextInt();
                    if (ans <= dList.size() && ans > 0) {
                        System.out.print("Enter the appointment id: ");
                        int id = input.nextInt();
                        System.out.print("Enter the appointment type: ");
                        String type = input.next();
                        Appointment ap = new Appointment(id, type, pn, (Doctor) dList.get(ans - 1));
                        
                        ap.addDoctor((Doctor)dList.get(ans - 1));
                        ap.addPatient(pn);
                        
                        appList.add(ap);
                        pList.add(pn);
                        System.out.println("Added Successfully the Appointment\nDate : " + ap.getDate());
                        System.out.println();
                    } else {
                        System.out.println("Please Select doctor number from list: ");
                    }

                } else if (ch == 4) {
                    System.out.println("================================");
                    System.out.println("Patients Info");
                    for (Object o : pList) {
                        System.out.println(o.toString());
                        System.out.println("----------------------------");
                    }
                    System.out.println("================================");
                } else if (ch == 5) {
                    System.out.println("================================");
                    System.out.println("Doctors Info");
                    for (Object o : dList) {
                        System.out.println(o.toString());
                        System.out.println("----------------------------");
                    }
                    System.out.println("\n================================");
                } else if (ch == 6) {
                    System.out.println("\n================================");
                    System.out.println("Appointments Info");
                    for (Object o : appList) {
                        System.out.println(o.toString());
                        System.out.println("----------------------------");
                    }
                    System.out.println("\n================================");
                } else if (ch == 7) {
                    System.out.println("\n================================");
                    System.out.println(c.toString());
                    System.out.println("\n================================");
                } else if (ch == 8) {
                    System.out.println("\n================================");
                    System.exit(0);
                    System.out.println("================================");
                } else {
                    System.out.println("Invalid chioce");
                }
            }
        } catch (InputMismatchException ex) {
            
                System.out.println("You must enter integer values !!");
            }
    }
}
