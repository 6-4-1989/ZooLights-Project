package files;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get all info
        System.out.print("Enter the amount of people in the party >");
        int people = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your first and last name >");
        String name = sc.nextLine();

        System.out.print("Enter the date you want to attend (mm/dd/yyyy)>");
        String date = sc.nextLine();

        System.out.print("Enter your discount code >");
        String discount = sc.nextLine();

        System.out.print("Do you want to do drive through or walk through (drive/walk)? >");
        String transportation = sc.nextLine();
        if(transportation.equalsIgnoreCase("walk")) {
            System.out.print("Do you wish to ride the train (yes/no)? >");
            String ride = sc.nextLine();
            if (ride.equalsIgnoreCase("yes")) {
                System.out.print("Enter your height (in inches) >");
                double height = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter you weight (in lbs) >");
                double weight = sc.nextDouble();
                sc.nextLine();
            }
        }

        System.out.print("Enter your date of birth (mm/dd/yyyy) >");
        String dateOfBirth = sc.nextLine();

    }
}
