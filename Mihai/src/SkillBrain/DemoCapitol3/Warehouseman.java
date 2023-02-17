package SkillBrain.DemoCapitol3;

public class Warehouseman extends Employee {

    @Override
    public double calculateSalary() {
        return 2.5 * reference;
    }

    @Override
    public String getName() {
        return "Angajatul care gestioneaza marfuri se numeste " + firstName + " " + lastName;
    }

    public Warehouseman(String firstName, String lastName, int age, String employementDate, int reference) {
        super(firstName, lastName, age, employementDate);
        this.reference = reference;
    }
}
