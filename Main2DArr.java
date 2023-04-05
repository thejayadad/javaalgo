import java.util.Arrays;

public class Main2DArr {


    public static void main(String[] args) {
        TwoDimeArray sda = new TwoDimeArray(3,3 );

        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(1, 0, 30);
        sda.insertValueInTheArray(1, 1, 40);
        sda.accesscell(0, 1);
        System.out.println(Arrays.deepToString(sda.arr));
        sda.traverse2DArray();
        sda.searchingValue(20);

        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(sda.arr));


    }
}
