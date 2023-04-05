public class MissingNumber {


public static void main(String[] args) {
    Main main = new Main();

int mainNums[] = {1,2,3,4,5,6,7,8,9,10};

main.missNum(mainNums);


}
public void missNum(int[] intArray){
    int sum1 = 0;
    int sum2 = 0;

    for(int i: intArray){
        sum1 += i;
    }
    sum2 = 10*(10+1)/2;
    int difference = sum2 - sum1;
    System.out.println("Missing number is " + difference);
}


}
