package my_own_trainings;
public class Lasagna{

    public int expectedMinutesInOven() {
        return 40;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
    }
}