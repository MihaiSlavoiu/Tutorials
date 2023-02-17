package SkillBrain;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    //BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        int today = birdsPerDay[birdsPerDay.length - 1];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum = sum + birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int x = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
            x++;
            }

        }
        return x;
    }
}
