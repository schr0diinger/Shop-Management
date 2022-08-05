import java.util.Scanner;

public class MainMenuActions extends CategoryAction {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    static Scanner scan = new Scanner(System.in);



    public static void option2(Cart c1) {

        int c = 0;

        while (c != 3) {
            c1.view();
            System.out.println("\n(1) Update your Cart");
            System.out.println("(2) Checkout");
            System.out.println("(3) Return to Main Menu\n");
            try {
                int x = scan.nextInt();
                scan.nextLine();
                option2Action(x, c1);
                c = x;
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid number!\n");
                scan.next();
            }
        }


    }

    private static void option2Action(int x, Cart c1) {
        switch (x) {
            case 1 -> cartUpdater(c1);
            case 2 -> purchase(c1);
            case 3 -> System.out.println();
            default -> System.out.println("\nEnter a valid number!\n");

        }
    }

    public static void cartUpdater(Cart c1) {

        int c = 0;

        while (c != 3) {
            c1.view();
            System.out.println("\n(1) Clear Cart");
            System.out.println("(2) Delete an item");
            System.out.println("(3) Return to Previous Menu\n");
            System.out.print("Enter your choice: ");
            try {
                int x = scan.nextInt();
                scan.nextLine();
               updaterAction(x, c1);
                c = x;
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid number!\n");
                scan.next();
            }
        }
    }

    private static void updaterAction(int x, Cart c1) {
        switch (x) {
            case 1 -> delAll(c1);
            case 2 -> del(c1);
            case 3 -> System.out.println();
            default -> System.out.println("\nEnter a valid number!");

        }
    }

    public static void delAll(Cart c1) {
        c1.deleteAll();
        System.out.println("Cart cleared!");
    }

    public static void del(Cart c1) {
        System.out.print("Enter Item N0. to delete:");
        try {
            int x = scan.nextInt();
            scan.nextLine();
            c1.delete(x);
            System.out.println("Item no " + x + " is deleted.");
        }
        catch (Exception E) {
            System.out.println("Number out of list!");
            scan.next();
        }
    }


    public static void purchase(Cart c1) {
        if (c1.getSize() == 0)
            System.out.println("\nNothing to purchase!\n");
        else {
            System.out.println("\n" + ANSI_GREEN + "Purchase complete!" + ANSI_RESET + "\n");
            c1.deleteAll();
        }

    }

}
