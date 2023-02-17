package SkillBrain;

public class Lasagna {

    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven() - minuteInCuptor;
    }

    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public static int totalTimeInMinutes(int minute, int layers) {
        return preparationTimeInMinutes(layers) + minute;
    }

    public static void main(String[] args) {
        System.out.println(Lasagna.totalTimeInMinutes(20, 3));
    }
}

