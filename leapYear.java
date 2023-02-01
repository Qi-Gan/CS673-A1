
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = y.nextInt();
        System.out.println("The input year: " + year);
        boolean leapYear = false;

        if (year % 400 == 0) {
            leapYear = true;
            System.out.println(year + " is a leap year.");
        }

        else {
            if (year % 4 == 0 && year % 100 != 0) {
                leapYear = true;
                System.out.println(year + " is a leap year.");
            }
            else {
                leapYear = false;
                System.out.println(year + " is not a lep year.");
            }
        }
    }
}



