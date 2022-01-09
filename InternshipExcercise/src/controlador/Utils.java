/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Comparator;
import modelo.Employee;
import modelo.Time;
import java.util.ArrayList;

/**
 *
 * @author Alan Bermudez
 */
public class Utils {

    public static void separeteCheckInChekOutHours(String schedule[], ArrayList<Time> checkIn, ArrayList<Time> checkOut) {
        String aux[];
        for (String schedule1 : schedule) {
            aux = schedule1.split("-");
            checkIn.add(new Time(aux[0]));
            checkOut.add(new Time(aux[0].substring(0, 2) + aux[1]));
        }
    }

    public static ArrayList<Comparator> compareSchedule(ArrayList<Employee> employees) {
        ArrayList<Comparator> comparisons = new ArrayList<>();
        Comparator auxComparator;
        int counter=0;
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                auxComparator = new Comparator(employees.get(i).getName(), employees.get(j).getName(), 0);
                for (int k = 0; k < employees.get(i).getCheckInHours().size(); k++) {
                    for (int h = 0; h < employees.get(j).getCheckInHours().size(); h++) {
                        if (employees.get(i).getCheckInHours().get(k).getDay().equals(employees.get(j).getCheckInHours().get(h).getDay())) {
                            if (employees.get(i).getCheckInHours().get(k).getHour() <= employees.get(j).getCheckOutHours().get(h).getHour() &&
                                    employees.get(i).getCheckOutHours().get(k).getHour() >= employees.get(j).getCheckInHours().get(h).getHour()) {
                                counter++;
                            }
                        }
                    }
                }
                auxComparator.setAmountOfMatches(counter);
                counter=0;
                comparisons.add(auxComparator);
            }
        }
        return comparisons;
    }

}
