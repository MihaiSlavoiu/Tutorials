package SkillBrain.Capitol32;

public class Caine1 implements Mamifer,AnimalDeCompanie{//interfetele se implememteaz cu implements
    @Override
    public void mananca() {
        System.out.println("eu sunt un caine si imi place sa mananc oase");
    }

    @Override
    public void sunet() {
        System.out.println("ham ham");
    }

    @Override
    public void reproducere() {
        System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
    }

    @Override
    public void vaneaza() {
        System.out.println("Eu sunt un caine si nu pot vana");
    }
    private void alearga(){
        System.out.println("Eu sunt un animal si alerg");
    }

    private String variabilaPrivata = "Eu sunt privata";
}
