package SkillBrain.DemoCapitol3;

public class Technician extends Employee {
    @Override
    public double calculateSalary() {
        return 2 * reference;
    }

    @Override
    public String getName() {
        return "Tehnicianul se numeste " + firstName + " " + lastName;
    }

    Technician(String firstName, String lastName, int age, String employementDate, int reference) {
        super(firstName, lastName, age, employementDate);
        this.reference = reference;
    }
}
