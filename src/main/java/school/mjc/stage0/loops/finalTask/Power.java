package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int k = 1;
        for (int i = 0; i < power; i++){
            k = k * numberToPrint;
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        new Power().printPower(2, 5);
    }
}
