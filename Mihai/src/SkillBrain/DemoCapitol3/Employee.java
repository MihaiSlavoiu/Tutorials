package SkillBrain.DemoCapitol3;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String employementDate;
    protected int reference;

    abstract double calculateSalary();
    abstract String getName();

    Employee(String firstName, String lastName, int age, String employementDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employementDate=employementDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmployementDate() {
        return employementDate;
    }

    public int getReference() {
        return reference;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployementDate(String employementDate) {
        this.employementDate = employementDate;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
