/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Time;
import modelo.Employee;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alan Bermudez
 */
public class ArchiveController {
    public static ArchiveController instance;

    public ArrayList<Employee> chargeOfficeSchedules(String docName) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employeeAux;
        Utils util = new Utils();
        File doc = new File(docName);
        String aux[];
        ArrayList<Time> checkInHour;
        ArrayList<Time> checkOutHour;
        try {
            Scanner scan = new Scanner(doc);
            while (scan.hasNextLine()) {
                checkInHour = new ArrayList<>();
                checkOutHour = new ArrayList<>();
                aux = scan.nextLine().split("=");
                employeeAux = new Employee(aux[0]);
                aux = aux[1].split(",");
                Utils.separeteCheckInChekOutHours(aux, checkInHour, checkOutHour);
                employeeAux.setCheckInHours(checkInHour);
                employeeAux.setCheckOutHours(checkOutHour);
                employees.add(employeeAux);
                checkInHour = null;
                checkOutHour = null;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File entered not found ");
        }

        return employees;
    }

}
