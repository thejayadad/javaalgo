import java.util.Arrays;

public class TwoDArray {


    public static void main(String[] args) {
        int[][] int2DArrayy;
        int2DArrayy = new int[2][2];
        int2DArrayy[0][0] = 1;
        int2DArrayy[0][1] = 2;
        int2DArrayy[1][0] = 3;
        int2DArrayy[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArrayy));

        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};

        System.out.println(Arrays.deepToString(s2DArray));
    }
}
