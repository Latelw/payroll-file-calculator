package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {

        //Start Buffered Reader and File reader to get data from file
        //Try catch catches errors and allows user to try again
        try { BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String[] tokens = line.split("\\|");
                //change data type (Tokens are strings...parse data)
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.printf("%d|%s|%.2f%n",employee.getEmployeeId(), employee.getName(), employee.getGrossPay());






            }

        } catch (Exception e) {
            System.out.println("Oops, an error has occurred. Please try again!");
        }



    }
}
