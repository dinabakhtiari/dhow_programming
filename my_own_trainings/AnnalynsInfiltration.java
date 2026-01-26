package my_own_trainings;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;
    }

    public static void main(String[] args) {

       AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
       System.out.println(annalynsInfiltration.canFastAttack(true));
    }
}