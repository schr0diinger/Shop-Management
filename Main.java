import java.util.Scanner;


public class Main extends MainMenuActions {
    static Scanner scan = new Scanner(System.in);


    public static void menuOptions(int a, Cart c1, Category cat, OwnerAccess admin) {
        switch (a) {
            case 1 -> CategoryAction.option1(c1, cat);
            case 2 -> MainMenuActions.option2(c1);
            case 3 -> admin.option3(cat);
            case 4 -> System.out.println();
            default -> System.out.println("Enter a valid number");

        }
    }

    public static void main(String[] args) {

        Cart c1 = new Cart();
        OwnerAccess admin = new OwnerAccess();
        Category cat = new Category();
        cat.defaultAdder();


        int choice = 0;
        while (choice != 4) {
            System.out.println("\t\t\t#######################################################################");
            System.out.println("\t\t\t############                                               ############");
            System.out.println("\t\t\t############       Welcome to Blue Ball Super Market       ############");
            System.out.println("\t\t\t############                                               ############");
            System.out.println("\t\t\t#######################################################################");
            System.out.println("\n===Enter a number from the following menu===\n");
            System.out.println("(1) Browse by category");
            System.out.println("(2) View and update items in cart");
            System.out.println("(3) Administration Access");
            System.out.println("(4) Exit the system");
            System.out.print("\nEnter your choice:");


            try {
                int a = scan.nextInt();
                scan.nextLine();
                menuOptions(a, c1, cat, admin);
                choice = a;
            }

            catch (Exception e) {
                System.out.print("\nEnter a valid number!");
                scan.next();
            }
        }
    }
}
