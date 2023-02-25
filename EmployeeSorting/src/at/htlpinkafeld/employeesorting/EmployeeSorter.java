package at.htlpinkafeld.employeesorting;

import java.util.*;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> empArr = new ArrayList<>();

        empArr.add(new Employee("Max", "Dev", 44.00));
        empArr.add(new Employee("Maria", "Buchhaltung", 24.00));
        empArr.add(new Employee("Maria", "Buchhaltung", 34.00));
        empArr.add(new Employee("Max", "Chef", 64.00));
        empArr.add(new Employee("Alfons", "Techniker", 19.00));

        //Collections.sort(List<Employee>);
        showEmployees(empArr);
    }

    public static void showEmployees(List<Employee> empArr){
        for(Employee e: empArr){
            System.out.println(e);
        }
    }
}
