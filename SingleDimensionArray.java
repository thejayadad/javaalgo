public class SingleDimensionArray {

    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }

    }

    public void insert(int location, int valueToBeInserted){

        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Succesfully Inserted");
            } else {
                System.out.println("This cell is occupied");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid index to access array");

        }


    }

    //Array Traversal
    public void traverseArray(){

        try {
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Array no longer exists");
        }

    }

    //SEARCH FOR ELEMENT IN ARRAY LINEAR SEARCH
    public void searchInArray(int valueToSearch ){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value found at the index of " + i);
                return ;
            }
        }
        System.out.println("Value not found " + valueToSearch );
    }

    //DELETE VALUE FROM ARRAY
    public void deleteValue(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value has been deleted");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Value provided not in range of array");
        }
    }

}
