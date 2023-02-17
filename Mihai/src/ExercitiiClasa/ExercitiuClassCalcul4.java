package ExercitiiClasa;

public class ExercitiuClassCalcul4 {
    // Media aritmetica a 3 numere este 14. Primul este cu 7 mai mare decat al doilea si al treilea este de 3 ori mai mare decat al doilea.
    //(a+b+c)/3  = 14
    public void calcul() {
        /*
        (a+b+c)/3 = 14 => 14*3= 42(suma aritmetica)
        c = b * 3
        a = b + 7
        (b+7) + b + (b * 3)= 42
           2b + 7 + 3b = 42
           5b = 35
           b = 7
           a = 14
           c = 21
        */
        ExercitiuClass4 obj1 = new ExercitiuClass4();
        int primaSuma = obj1.getB() + 7;
        int multiplication = obj1.getB() * 3;
        obj1.setA(primaSuma);
        obj1.setC(multiplication);
        System.out.println((obj1.getA() + obj1.getB() + obj1.getC()) / 3);
        System.out.println("(" + (obj1.getA() + " " + "+" + obj1.getB() + " " + "+" + obj1.getC()) + ")" + "/3 " + "=" + (obj1.getA() + obj1.getB() + obj1.getC()) / 3);
    }

    public static void main(String[] args) {
        ExercitiuClassCalcul4 rezultatCalcul = new ExercitiuClassCalcul4();
        rezultatCalcul.calcul();
    }

}
