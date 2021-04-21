import java.util.Scanner;

public class Min2yrsNday {
    public static void main(String[] args) {
        int years,days,Rdays;
        System.out.println("Enter The Minutes To Convert Into Years And Days");
        Scanner obj = new Scanner(System.in);
        int min =obj.nextInt();

        years = min/525600;
        days = min/1440;
        Rdays =days /10;


        System.out.println(min + " minutes is " + years + " years and "  +  Rdays + " days ");



    }
}
