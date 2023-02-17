package SkillBrain;

public class ElonsToyCar {
    private int distance;
    private int battery;

    public ElonsToyCar(int distance1, int battery1) {
        this.distance = distance1;
        this.battery = battery1;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar(0, 100);
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery != 0) {
            distance = distance + 20;
            battery = battery - 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        car.drive();
        System.out.println(car.batteryDisplay());
        System.out.println(car.distanceDisplay());
        for (int i = 0; i < 110; i++) {  //nu trebuie sa mai imi scada bateria si sa mai creasca distanta cand i> 100
            car.drive();
        }
        System.out.println(car.batteryDisplay());
        System.out.println(car.distanceDisplay());
    }

}
