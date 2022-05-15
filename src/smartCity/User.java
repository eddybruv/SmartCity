package smartCity;

import java.util.Scanner;

public class User {
    static public void userSubroutine () {
        Scanner read = new Scanner(System.in);


        do {
            System.out.print("User Choices\n~~~~~~~~~~~~~~~\n1. Search by evaluation.\n2. Search by town. \n3. Make recommendation \n4. Return to Menu\n" );
            int choice = read.nextInt();

//            Search by evaluation / stars
            if (choice == 1) {
                int count = 0;
                System.out.print("Enter evaluation to search: ");
                int evaluation = read.nextInt();

                System.out.println("Available Hotels above "+evaluation+":\n");
                for (int n = 0; n < Main.registeredHotels.size(); n++) {
                    if (Main.registeredHotels.get(n).evaluation >= evaluation) {
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Evaluation: " + Main.registeredHotels.get(n).evaluation);
                        count++;
                    }
                    System.out.println("\n");
                }

                if (count == 0) {
                    System.out.println("No hotels found!\nTry a lower evaluation :)\n");
                }

            }

//            Search by town
            else if (choice == 2) {
                System.out.print("Enter town of search: \n");
                String town = read.next();

                int count = 0;
                System.out.println("Available Hotels in "+town+":\n");

                for (int n = 0; n < Main.registeredHotels.size(); n++) {

                    if (Main.registeredHotels.get(n).town.equals(town)) {
                        count++;
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Town: " + Main.registeredHotels.get(n).town);
                    }
                }
                if (count == 0) {
                    System.out.println("No results found!\nTry a different town :)\n");
                }
            }

//          Recommend Hotel
            else if (choice == 3) {
                System.out.print("Enter hotel to recommend: " );
                String name = read.nextLine();
                for(int n = 0; n < Main.registeredHotels.size(); n++) {
                    if(Main.registeredHotels.get(n).name.equals(name))
                        Main.registeredHotels.get(n).recommendation++;
                }
            }
            else if (choice == 4) {
                break;
            }
        }while (true);
    }
}
