package SkillBrain;

public class testBird {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println(birdCount.getBusyDays());
// => 2
    }
}
