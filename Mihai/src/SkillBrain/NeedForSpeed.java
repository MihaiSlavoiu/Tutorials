package SkillBrain;

public class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int meters;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.meters = 0;
    }

    public boolean batteryDrained() {
        if (battery <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        battery = battery - batteryDrain;
        meters = meters + speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        RaceTrack race = new RaceTrack(distance);

        System.out.println(race.carCanFinish(car));

    }
}

class RaceTrack {
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        boolean finish = false;
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() == distance) {
                finish = true;
            }
        }
        return finish;
    }
}

