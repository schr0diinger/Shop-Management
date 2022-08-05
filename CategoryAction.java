import java.util.Scanner;

public class CategoryAction {

    static Scanner scan = new Scanner(System.in);

    public static void option1(Cart c1, Category cat) {

        int c = 0;

        while (c != 6) {
            System.out.println();
            System.out.println("(1) Fruits");
            System.out.println("(2) Meats");
            System.out.println("(3) Bakery");
            System.out.println("(4) Cleaning Product");
            System.out.println("(5) Snacks");
            System.out.println("(6) Go back to main menu");
            System.out.print("\nEnter your choice:");
            try {
                int x = scan.nextInt();
                scan.nextLine();
                option1Actions(x, c1, cat);
                c = x;
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid number!\n");
                scan.next();
            }
        }
    }

    public static void option1Actions(int x, Cart c1, Category cat) {
        switch (x) {
            case (1) -> fruitOption(c1, cat);
            case (2) -> meatOption(c1, cat);
            case (3) -> bakeryOption(c1, cat);
            case (4) -> cleanerOption(c1, cat);
            case (5) -> snackOption(c1, cat);
            case (6) -> System.out.println();
            default -> System.out.println("\nEnter a valid number!\n");
        }
    }

    public static void fruitOption(Cart c1, Category cat){


        int c = 0;
        while (c != 2) {
            cat.viewFruit();
            System.out.println("\n(1) Add to cart");
            System.out.println("(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int a = scan.nextInt();
            scan.nextLine();
            fruitOptionAction(a, c1, cat);
            c = a;
        }

    }
    static void fruitOptionAction(int a, Cart c1, Category cat) {
        if (a == 1) {
            System.out.println("\nEnter a number to add to cart:");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEnter number of quantity:");
            int y = scan.nextInt();
            scan.nextLine();
            c1.add(cat.getFruit(x), y);
            System.out.println("\n");
            System.out.println("Item Added!");
        }
    }

    public static void meatOption(Cart c1, Category cat){


        int c = 0;
        while (c != 2) {
            cat.viewMeat();
            System.out.println("\n(1) Add to cart");
            System.out.println("(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int a = scan.nextInt();
            scan.nextLine();
            meatOptionAction(a, c1, cat);
            c = a;
        }

    }
    static void meatOptionAction(int a, Cart c1, Category cat) {
        if (a == 1) {
            System.out.println("\nEnter a number to add to cart:");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEnter number of quantity:");
            int y = scan.nextInt();
            scan.nextLine();
            c1.add(cat.getMeat(x), y);
            System.out.println();
            System.out.println("Item Added!");
        }
    }

    public static void bakeryOption(Cart c1, Category cat){


        int c = 0;
        while (c != 2) {
            cat.viewBakery();
            System.out.println("\n(1) Add to cart");
            System.out.println("(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int a = scan.nextInt();
            scan.nextLine();
            bakeryOptionAction(a, c1, cat);
            c = a;
        }

    }
    static void bakeryOptionAction(int a, Cart c1, Category cat) {
        if (a == 1) {
            System.out.println("\nEnter a number to add to cart:");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEnter number of quantity:");
            int y = scan.nextInt();
            scan.nextLine();
            c1.add(cat.getBakery(x), y);
            System.out.println();
            System.out.println("Item Added!");
        }
    }

    public static void cleanerOption(Cart c1, Category cat){

        int c = 0;

        while (c != 2) {
            cat.viewCleaner();
            System.out.println("\n(1) Add to cart");
            System.out.println("(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int a = scan.nextInt();
            scan.nextLine();
            cleanerOptionAction(a, c1, cat);
            c = a;
        }

    }
    static void cleanerOptionAction(int a, Cart c1, Category cat) {
        if (a == 1) {
            System.out.println("\nEnter a number to add to cart:");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEnter number of quantity:");
            int y = scan.nextInt();
            scan.nextLine();
            c1.add(cat.getCleaner(x), y);
            System.out.println();
            System.out.println("Item Added!");
        }
    }


    public static void snackOption(Cart c1, Category cat){


        int c = 0;
        while (c != 2) {
            cat.viewSnack();
            System.out.println("\n(1) Add to cart");
            System.out.println("(2) Previous menu");
            System.out.print("\nEnter your choice:");
            int a = scan.nextInt();
            scan.nextLine();
            snackOptionAction(a, c1, cat);
            c = a;
        }

    }

    static void snackOptionAction(int a, Cart c1, Category cat) {
        if (a == 1) {
            System.out.println("\nEnter a number to add to cart:");
            int x = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEnter number of quantity:");
            int y = scan.nextInt();
            scan.nextLine();
            c1.add(cat.getSnack(x), y);
            System.out.println("\n");
            System.out.println("Item Added!");
        }
    }

}
