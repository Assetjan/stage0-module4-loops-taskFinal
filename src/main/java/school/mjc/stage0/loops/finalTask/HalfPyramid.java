package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength ; i>0; i--){
            for (int j = 1; j <= cathetusLength; j++){
                if (j>=i){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
//   01234
//   ***** 0
//   **** 1
//   *** 2
//   ** 3
//   * 4