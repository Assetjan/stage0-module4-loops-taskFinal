package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int k;
        for (int i = 1; i<=9; i++){
            k = i*numberTableToPrint;
            System.out.print(numberTableToPrint + " * " + i + " = " + k);
        }
    }
}
