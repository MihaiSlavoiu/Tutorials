package SkillBrain.DemoCapitol3;

public class TechnicianRisk extends Technician implements EmployeeRisk {


    @Override
    public void handlerRisk() {
        System.out.println("Lucrez intr-un mediu de risc inalt si beneficiez de un salariu extra.");
    }

    @Override
    public double calculateSalary() {
        return 2.5 * reference + monthlyPremium;
    }

    public TechnicianRisk(String firstName, String lastName, int age, String employementDate, int reference) {
        super(firstName, lastName, age, employementDate, reference);
    }
}
