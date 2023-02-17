package SkillBrain.DemoCapitol3;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Staff staff = new Staff();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariul minim pe economie din tara dumneavoastr9a in lei: ");
        while(!scanner.hasNextInt()){
            System.out.println("Valoare introdusa nu este Integer valid, mai incercati odata");
        }
        int salariulMinim = scanner.nextInt();
        System.out.println("Introduceti salariul mediu pe economie in tara dumneavoastra in lei ");
        while(!scanner.hasNextInt()){
            System.out.println("Valoare introdusa nu este Integer valid, mai incercati odata");
        }
        int salariulMediu = scanner.nextInt();

        int salariulMinimPeOra = salariulMinim / 160;
        int salariulMediuPeOra = salariulMediu / 160;

        staff.addEmployee(new Seller("Alina", "Bostan", 45,"1995",salariulMinim));
        staff.addEmployee(new Technician("Leonard", "Veres", 28,"2010",salariulMediu));
        staff.addEmployee(new Warehouseman("Cosmin", "Ureche", 35,"2015",salariulMinim));
        staff.addEmployee(new TechnicianRisk("Matilda", "Anastasia", 30,"2009",salariulMinim));
        staff.addEmployee(new HandlingRisk("Marius", "Costin", 42,"2004",salariulMinim));

        staff.showSalaries();
        System.out.println("Salariul mediu in companie este " + staff.averageSlary() + " lei");



    }
}
