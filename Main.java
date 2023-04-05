public class Main {


    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 20);

        // // var firstElement = sda.arr[0];
        // // System.out.println(firstElement);

        // System.out.println("Array Traversal");
        // sda.traverseArray();

        sda.searchInArray(8);



    }


}
