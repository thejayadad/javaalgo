public class TwoDimeArray {
    int arr[][] = null;

    public TwoDimeArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows] [numberOfColumns];
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;

            }
        }
    }

    public void insertValueInTheArray(int row, int col, int value){
        try {
            if(arr[row] [col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Value inserted");
            } else {
                System.out.println("Block is occupied");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Invalid index");
        }
    }

    //ACCESS CELL VALUEVFROM ARRAY
    public void accesscell(int row, int col){
        System.out.println("\nAccessing Row " + row + ", Col#" + col);
        try {
            System.out.println("Cell Value is: " + arr[row][col]);

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Invalid index");

        }
    }

    //TRAVERSE 2D ARRAY
    public void traverse2DArray(){
        for(int row=0; row < arr.length; row++){
            for(int col=0; col < arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    //SEARCHING FOR SINGLE VALUE
    public void searchingValue(int value){
        for(int row=0; row <arr.length; row++){
            for(int col=0; col< arr[0].length; col++){
                if (arr[row][col] == value){
                    System.out.println("Value found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    //DELETING VALUE FROM ARRAY
    public void deleteValueFromArray(int row, int col){
        try {
            System.out.println("Successfully deleted" + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;  

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Not a valid index");
        }
    }
}
