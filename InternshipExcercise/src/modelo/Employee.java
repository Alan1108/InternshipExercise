/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Alan Bermudez
 */
public class Employee {
    private String name;
    private ArrayList<Time> checkInHours = new ArrayList<>();
    private ArrayList<Time> checkOutHours = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }
    
    public Employee(){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the officeSchedules
     */
    public ArrayList<Time> getCheckInHours() {
        return checkInHours;
    }

    /**
     * @param checkInHours the officeSchedules to set
     */
    public void setCheckInHours(ArrayList<Time> checkInHours) {
        this.checkInHours = checkInHours;
    }

    /**
     * @return the checkOutHours
     */
    public ArrayList<Time> getCheckOutHours() {
        return checkOutHours;
    }

    /**
     * @param checkOutHours the checkOutHours to set
     */
    public void setCheckOutHours(ArrayList<Time> checkOutHours) {
        this.checkOutHours = checkOutHours;
    }

    @Override
    public String toString() {
        String aux="Employee: \nName: " + name+"\nOffice Schedule\n";
        for(int i=0, j=0;i<checkInHours.size() && j<checkOutHours.size();i++,j++){
            aux+="Day: "+checkInHours.get(i).getDay() + 
                    "\nCheck In Hour: "+checkInHours.get(i).getHour()+":"+checkInHours.get(i).getMinute()+"\n" + 
                    "Check Out Hour: "+checkOutHours.get(j).getHour()+":"+checkOutHours.get(j).getMinute()+"\n" ;
        }        
        return aux;
    }
    

}
