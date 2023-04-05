import java.util.Scanner;

public class Temp {


    public static void main(String[] args) {
        //ask user for days
        //average temperature

        Scanner scan = new Scanner(System.in);
        System.out.println("How many days of tempature will you enter?");
        int numDays = scan.nextInt();
        int [] temps = new int[numDays];

        int sum = 0;

        for(int i =0; i <= numDays; i++){
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temps[i] = scan.nextInt();
            sum += temps[i];

        }

        double average = sum / numDays;
        int above = 0;
        for(int i = 0; i < temps.length; i++){
            if(temps[i] > average){
                above++;
            }
        }
        System.out.println();
        System.out.println(" Average Temp " + average);
        System.out.println("Days above average " + above);

    }
}
