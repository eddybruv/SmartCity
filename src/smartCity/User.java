package smartCity;

import java.util.Scanner;

public class User {
    static public void userSubroutine () {
        Scanner read = new Scanner(System.in);

        System.out.print("User Choices \n1. Search by evaluation.\n2. Search by town. \n3. Make recommendation \n4. Quit\n" );
        int choice = read.nextInt();
        do {
            if (choice == 1) {
                System.out.print("Enter evaluation to search: ");
                int evaluation = read.nextInt();

                for (int n = 0; n < Main.registeredHotels.size(); n++) {
                    if (Main.registeredHotels.get(n).evaluation >= evaluation) {
                        System.out.println("Available Hotels: \n");
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Evaluation: " + Main.registeredHotels.get(n).evaluation);
                    }
                }
            } else if (choice == 2) {
                System.out.print("Enter evaluation to search: ");
                String town = read.nextLine();
                int count = 0;
                for (int n = 0; n < Main.registeredHotels.size(); n++) {

                    if (Main.registeredHotels.get(n).town.equals(town)) {
                        count++;
                        System.out.println("Available Hotels: \n");
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Town: " + Main.registeredHotels.get(n).town);
                    }
                }
                if (count == 0) {
                    System.out.println("No results found");
                }
            } else if (choice == 3) {
                for(int n = 0; n < Main.registeredHotels.size(); n++) {
                    System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name);
                }
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
