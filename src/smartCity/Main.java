package smartCity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Hotel> registeredHotels = new ArrayList<>();

    public static void main (String[] args) throws IOException {

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("Welcome to Smart City\n");
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\nSelect user type: ");
            System.out.println("1. Admin\n2. User \n3. Exit\n");


            int userChoice = read.nextInt();

            if(userChoice == 1) {
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.print("Admin Mode\n");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                System.out.println("Enter choice of action: \n1. Enter Admin-User Mode \n2. Register Hotels\n3. Exit");
                int admin_choice = read.nextInt();

                if(admin_choice == 1) {
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    System.out.print("Admin-User Mode\n");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    Admin.userSubroutine();
                } else if(admin_choice == 2) {
                    Admin.adminSubroutine(registeredHotels);
                    System.out.println("Registered Hotels are: \n");
                    System.out.printf("%s %15s %15s %15s\n", "NAME", "TOWN", "PRICE", "STARS");
                    for (Hotel registeredHotel : registeredHotels) {
                        System.out.printf("%s %17s %17s %11s \n", registeredHotel.name, registeredHotel.town, String.valueOf(registeredHotel.price), String.valueOf(registeredHotel.evaluation));
                    }
                } else {

                }

            } else if (userChoice == 2) {
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.print("User Mode\n");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                User.userSubroutine();
            } else {
                System.out.println("Bye Bye");
                break;
            }
        } while(true);
    }
}
