package by.du4.study;

public class RockMusic implements  Music {
    @Override
    public String getSong() {
        return "Wind cries Mary.";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization.");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction.");
    }
}
