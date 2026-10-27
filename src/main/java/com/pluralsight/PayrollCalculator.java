package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {

        //Start Buffered Reader and File reader to get data from file
        //Try catch catches errors and allows user to try again
        try { BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
            String line;
            while ((line = reader.readLine()) != null){
                //System.out.println(line);
                String[] tokens = line.split("\\|");
                //change data type (Tokens are strings...parse data)
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.print("ID: " + employee.getEmployeeId());
                System.out.println("Name: " + employee.getName());
                System.out.printf("Gross Pay: $%.2fn", employee.getGrossPay());




            }

        } catch (Exception e) {
            System.out.println("Oops,an error has surfaced. Try again.");
        }


    }
}
