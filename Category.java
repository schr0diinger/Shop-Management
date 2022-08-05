import java.util.ArrayList;
import java.util.Scanner;


class Fruit extends ShopGoods {
    Fruit(String s, int p) {
        super(s, p);
    }
}

class Meat extends ShopGoods {
    Meat(String s, int p) {
        super(s, p);
    }
}

class Bakery extends ShopGoods {
    Bakery(String s, int p) {
        super(s, p);
    }
}

class Cleaner extends ShopGoods {
    Cleaner(String s, int p) {
        super(s, p);
    }
}

class Snack extends ShopGoods {
    Snack(String s, int p) {
        super(s, p);
    }
}


public class Category {

    Scanner scan = new Scanner(System.in);
    private ArrayList<ShopGoods> listFruit = new ArrayList<>();
    private ArrayList<ShopGoods> listMeat = new ArrayList<>();
    private ArrayList<ShopGoods> listBakery = new ArrayList<>();
    private ArrayList<ShopGoods> listCleaner = new ArrayList<>();
    private ArrayList<ShopGoods> listSnack = new ArrayList<>();

    Fruit mango = new Fruit("Mango", 150);
    Fruit orange = new Fruit("Orange", 200);
    Fruit berry = new Fruit("Berry", 50);

    Meat beef = new Meat("Beef", 450);
    Meat chicken = new Meat("Chicken", 200);
    Meat mutton = new Meat("Mutton", 400);

    Bakery cake = new Bakery("Cake", 35);
    Bakery bc = new Bakery("Biscuits", 40);

    Cleaner gc = new Cleaner("Glass Cleaner", 80);
    Cleaner cc = new Cleaner("Carpet Cleaner", 140);
    Cleaner tc = new Cleaner("Toilet Cleaner", 60);

    Snack sn1 = new Snack("Combo1", 80);
    Snack sn2 = new Snack("Combo2", 100);


    void defaultAdder() {
        addToFruit(mango);
        addToFruit(orange);
        addToFruit(berry);

        addToMeat(beef);
        addToMeat(chicken);
        addToMeat(mutton);

        addToBakery(cake);
        addToBakery(bc);

        addToCleaner(gc);
        addToCleaner(cc);
        addToCleaner(tc);

        addToSnack(sn1);
        addToSnack(sn2);
    }

    public void viewFruit() {
        view(listFruit);
    }

    public void viewMeat() {
        view(listMeat);
    }

    public void viewBakery() {
        view(listBakery);
    }

    public void viewCleaner() {
        view(listCleaner);
    }

    public void viewSnack() {
        view(listSnack);
    }


    public ShopGoods getFruit(int a) {
        return listFruit.get(a-1);
    }

    public ShopGoods getMeat(int a) {
        return listMeat.get(a-1);
    }

    public ShopGoods getBakery(int a) {
        return listBakery.get(a-1);
    }

    public ShopGoods getCleaner(int a) {
        return listCleaner.get(a-1);
    }

    public ShopGoods getSnack(int a) {
        return listSnack.get(a-1);
    }


    void view(ArrayList<ShopGoods> items) {

        if ( listFruit.size() != 0 ) {

            int count = 1;
            System.out.println("========Item List========");
            System.out.println("    Item" + "\t\t\tPrice");

            for (ShopGoods item : items) {
                System.out.print("("+count+")"+" "+item.getpName()+"\t\t\t"+item.getpPrice()+"/-");
                System.out.println();
                count++;
            }
        }

        else
            System.out.println("No item found!");

    }




    void addToFruit(Fruit F) {
        listFruit.add(F);
    }

    void addToMeat(Meat F) {
        listMeat.add(F);
    }

    void addToBakery(Bakery F) {
        listBakery.add(F);
    }

    void addToCleaner(Cleaner F) {
        listCleaner.add(F);
    }

    void addToSnack(Snack F) {
        listSnack.add(F);
    }





    void addOne(int listRef) {
        System.out.println();
        System.out.println("Enter a name for item: ");
        String name = scan.nextLine();
        System.out.println("Enter price for " + name + ":");
        int price = scan.nextInt();
        scan.nextLine();
        ShopGoods dummyProduct = new ShopGoods(name, price);
        switch (listRef) {
            case 1 -> listFruit.add(dummyProduct);
            case 2 -> listMeat.add(dummyProduct);
            case 3 -> listBakery.add(dummyProduct);
            case 4 -> listCleaner.add(dummyProduct);
            case 5 -> listSnack.add(dummyProduct);
        }

        System.out.println("\tItem added to shelf!");
    }

    void removeOne(int listRef) {
        viewList(listRef);
        System.out.println();
        System.out.println("Enter an item no. to delete: ");
        int n = scan.nextInt();
        scan.nextLine();
        switch (listRef) {
            case 1 -> listFruit.remove(n - 1);
            case 2 -> listMeat.remove(n - 1);
            case 3 -> listBakery.remove(n - 1);
            case 4 -> listCleaner.remove(n - 1);
            case 5 -> listSnack.remove(n - 1);
        }

        System.out.println("\n\tItem Removed from shelf!\n");
    }

    void updatePrice(int listRef) {
        viewList(listRef);
        System.out.println();
        System.out.println("Enter an item no to update price: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter new price: ");
        int newPrice = scan.nextInt();
        scan.nextLine();
        switch (listRef) {
            case 1 -> listFruit.get(n - 1).setpPrice(newPrice);
            case 2 -> listMeat.get(n - 1).setpPrice(newPrice);
            case 3 -> listBakery.get(n - 1).setpPrice(newPrice);
            case 4 -> listCleaner.get(n - 1).setpPrice(newPrice);
            case 5 -> listSnack.get(n - 1).setpPrice(newPrice);
        }

        System.out.println("\n\tPrice updated successfully.\n");
    }

    void clearShelf(int listRef) {
        System.out.println("Do you want to clear the shelf?");
        System.out.println();
        System.out.println("\t(1) Yes");
        System.out.println("\t(2) No");
        System.out.print("\nEnter your choice: ");
        int c = scan.nextInt();
        scan.nextLine();

        if (c == 1) {
            switch (listRef) {
                case 1 -> listFruit.clear();
                case 2 -> listMeat.clear();
                case 3 -> listBakery.clear();
                case 4 -> listCleaner.clear();
                case 5 -> listSnack.clear();
            }
        }
        if (c != 1 && c != 2) {
            System.out.println("\n\tEnter a valid number!");
        }
    }

    void viewList(int x) {
        switch (x) {
            case 1 -> viewFruit();
            case 2 -> viewMeat();
            case 3 -> viewBakery();
            case 4 -> viewCleaner();
            case 5 -> viewSnack();
        }
    }
}






