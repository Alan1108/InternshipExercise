/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internshipexcercise;

import controlador.Utils;
import modelo.Comparator;
import modelo.Employee;
import controlador.ArchiveController;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alan Bermudez
 */
public class InternshipExcercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String docName;
        System.out.println("Enter the directory of the archive of employees register: ");
        docName = scan.nextLine();
        ArchiveController archiveController = new ArchiveController();
        ArrayList<Employee> employees = archiveController.chargeOfficeSchedules(docName);
        ArrayList<Comparator> comparisons = Utils.compareSchedule(employees);
        for(Comparator aux : comparisons){
            if(aux.getAmountOfMatches()!=0){
                System.out.println(aux.toString());
            }
        }
    }
    
}
