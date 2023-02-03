package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String res = "1";
        int h = 2;
        for (int i = cathetusLength; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                System.out.print(" ");
            }
            System.out.print(res);
            System.out.println();
            res = h + res + h;
            h++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
//      123456789
//          1     1
//         212    2
//        32123   3
//       4321234  4
//      543212345 5