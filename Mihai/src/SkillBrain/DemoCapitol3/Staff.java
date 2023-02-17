package SkillBrain.DemoCapitol3;

import java.util.ArrayList;

public class Staff {
    ArrayList<Employee> employeeList;

    Staff() {
        employeeList = new ArrayList<>();

    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void showSalaries() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + "care castiga " + employee.calculateSalary() + " in lei.");
        }
    }

    public double averageSlary() {
        int employeeNumer = 0;
        double allSalary = 0;
        while (employeeNumer < employeeList.size()) {
            allSalary = allSalary + employeeList.get(employeeNumer).calculateSalary();
            employeeNumer++;
        }
        return allSalary / employeeList.size();
    }
}
