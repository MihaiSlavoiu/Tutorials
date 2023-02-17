package SkillBrain.DemoCapitol3;

public class HandlingRisk extends Warehouseman implements EmployeeRisk{
    @Override
    public void handlerRisk() {
        System.out.println("Gestionez marfuri care implica un risc inalt si beneficiez de un salariu extra.");

    }

    @Override
    public double calculateSalary() {
        return 3 * reference + monthlyPremium;
    }

    public HandlingRisk(String firstName, String lastName, int age, String employementDate, int reference) {
        super(firstName, lastName, age, employementDate, reference);
    }
}
