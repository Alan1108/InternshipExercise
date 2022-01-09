/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alan Bermudez
 */
public class Comparator {

    private static Comparator instance;
    private String employee1;
    private String employee2;
    private int amountOfMatches;

    public Comparator(String employee1, String employee2, int amountOfMatches) {
        this.employee1 = employee1;
        this.employee2 = employee2;
        this.amountOfMatches = amountOfMatches;
    }

    /**
     * @return the employee1
     */
    public String getEmployee1() {
        return employee1;
    }

    /**
     * @param employee1 the employee1 to set
     */
    public void setEmployee1(String employee1) {
        this.employee1 = employee1;
    }

    /**
     * @return the employee2
     */
    public String getEmployee2() {
        return employee2;
    }

    /**
     * @param employee2 the employee2 to set
     */
    public void setEmployee2(String employee2) {
        this.employee2 = employee2;
    }

    /**
     * @return the amountOfMatches
     */
    public int getAmountOfMatches() {
        return amountOfMatches;
    }

    /**
     * @param amountOfMatches the amountOfMatches to set
     */
    public void setAmountOfMatches(int amountOfMatches) {
        this.amountOfMatches = amountOfMatches;
    }

    @Override
    public String toString() {
        return employee1+"-"+employee2+": "+amountOfMatches;
    }
    
    public static Comparator getInstance(String employee1, String employee2){
        if(instance == null){
            instance = new Comparator(employee1, employee2, 0);
            return instance;
        }else{
            return instance;
        }
    }
    
}
