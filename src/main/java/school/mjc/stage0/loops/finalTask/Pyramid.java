package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String part1 = "";
        String part2 = "";
        String res2 = "1";
        int k = 2;
        if (cathetusLength != 0) {
            for (int i = 0; i < cathetusLength - 1; i++) {
                part1 += cathetusLength - i;
                part2 += i + 2;
            }
            String bottom = part1 + "1" + part2;
            res2 = bottom;

            for (int i = 0; i < cathetusLength - 1; i++) {
                bottom = bottom.replace("" + (cathetusLength - i), " ");
                bottom = bottom.stripTrailing();

                res2 = bottom + "\n" + res2;

            }
            System.out.println(res2);
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