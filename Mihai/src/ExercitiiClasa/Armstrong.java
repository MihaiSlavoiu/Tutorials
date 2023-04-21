package ExercitiiClasa;

import static java.lang.Math.pow;

public class Armstrong {


    public int riseOfPowef(long number) {
        int riseOfPower = 0;
        while(number>0) {
            long rest = number % 10;
            number = number/10;
            riseOfPower++;
        }
        return riseOfPower;
    }

    /*
     * Check no is Armstrong or not in java Program
     * */
    public void armstrongNumber(long number) {
        long  temp = number;
        long[] elements = new long[10];
        long rest;
        long sum = 0;
        for (int i = 0; temp > 0; i++) {
            rest = temp % 10;
            elements[i] = rest;
            temp = temp / 10;
        }
        for (long element : elements) {
            sum = (int) (sum + pow(element, riseOfPowef(number)));
        }
        if (number == sum) {
            System.out.println("este numar Armstrong: " + number);
        }
        else {
            System.out.println("nu este numar Armstrong");
        }
    }

    public static void main(String[] args) {
        Armstrong numbers = new Armstrong();
        numbers.armstrongNumber(371);
        for (long i = 0; i < 10000000000L; i++) {
//            numbers.armstrongNumber(i);
//        }
        }
    }
}
