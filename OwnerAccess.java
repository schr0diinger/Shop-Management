import java.util.Scanner;

public class OwnerAccess {

    Scanner scan = new Scanner(System.in);

    void option3(Category cat) {
        int choice = 0;
        while (choice != 2) {
            System.out.println("\n\t(1) Enter admin pin");
            System.out.println("\t(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int c = scan.nextInt();
            scan.nextLine();
            choice = c;

            if (c == 1) {
                System.out.print("Enter Pin:");
                int pin = scan.nextInt();
                scan.nextLine();
                adminShallPass(pin, cat);
            }

            if (c != 1 && c != 2) {
                System.out.println("\n\tEnter a valid number!");
            }

        }
    }

    void adminShallPass(int p, Category cat) {

        if (p == 140160) {
            adminMenu(cat);
        }
        else
            System.out.println("\n\tWrong password");

    }

    void adminMenu(Category cat) {
        System.out.println("===============Welcome Admin================");
        int choice = 0;
        while (choice != 6) {
            System.out.println();
            System.out.println("(1) Fruits");
            System.out.println("(2) Meats");
            System.out.println("(3) Bakery");
            System.out.println("(4) Cleaning Product");
            System.out.println("(5) Snacks");
            System.out.println("(6) Previous menu");
            System.out.print("\nEnter an option:");
            try {
                int x = scan.nextInt();
                scan.nextLine();
                ownerActions(x, cat);
                choice = x;
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid number!\n");
                scan.next();
            }
        }
    }

    void ownerActions(int x, Category cat) {
        switch (x) {
            case (1) -> itemOpt(cat, 1);
            case (2) -> itemOpt(cat, 2);
            case (3) -> itemOpt(cat, 3);
            case (4) -> itemOpt(cat, 4);
            case (5) -> itemOpt(cat, 5);
            case (6) -> System.out.println();
            default -> System.out.println("\nEnter a valid number!\n");
        }
    }

    void itemOpt(Category cat, int listRef) {
        int choice = 0;
        while (choice != 5) {
            viewOpt(listRef, cat);
            System.out.println();
            System.out.println("(1) Add an item");
            System.out.println("(2) Remove an item");
            System.out.println("(3) Update an item");
            System.out.println("(4) Clear the shelf");
            System.out.println("(5) Previous menu");
            System.out.println();
            System.out.print("Enter your choice:");
            try {
                int c = scan.nextInt();
                scan.nextLine();
                optAction(c, listRef, cat);
                choice = c;
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid number!\n");
                scan.next();
            }
        }
    }


    void optAction(int c, int listRef, Category cat) {
        switch (c) {
            case 1 -> cat.addOne(listRef);
            case 2 -> cat.removeOne(listRef);
            case 3 -> cat.updatePrice(listRef);
            case 4 -> cat.clearShelf(listRef);
            case 5 -> System.out.println();
            default -> System.out.println("\nEnter a valid number!\n");
        }
    }




    void viewOpt(int x, Category cat) {
        switch (x) {
            case 1 -> cat.viewFruit();
            case 2 -> cat.viewMeat();
            case 3 -> cat.viewBakery();
            case 4 -> cat.viewCleaner();
            case 5 -> cat.viewSnack();
        }
    }
}