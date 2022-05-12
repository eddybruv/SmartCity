package smartCity;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    static Hotel addHotel() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter new hotel name: ");
        String name = read.nextLine();

        System.out.print("Enter new hotel town: ");
        String town = read.nextLine();

        System.out.print("Enter new hotel price: ");
        int evaluation = read.nextInt();

        System.out.print("Enter new hotel evaluation: ");
        double price = read.nextInt();

        return new Hotel(name, price, town, evaluation);
    }
//    subroutine
    public static void adminSubroutine(ArrayList<Hotel> hotels) {
        Scanner read = new Scanner(System.in);
        System.out.println("How many hotels are to be added?: ");
        int n = read.nextInt();

        do{
            Hotel newHotel = Admin.addHotel();
            hotels.add(newHotel);
            n -= 1;
        }while(n > 0);
    }
}
