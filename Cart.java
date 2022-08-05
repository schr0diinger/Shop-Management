import java.util.ArrayList;

public class Cart implements Modify{


    private ArrayList<ShopGoods> items = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();

    public void add(ShopGoods i, int q) {
        items.add(i);
        quantity.add(q);
        System.out.println("Item Added to cart!");

    }

    public int getSize() {
        return items.size();
    }

    public void view() {

        if ( items.size() != 0 ) {

            int count = 1;
            System.out.println("================Cart Item List================");


            for (int i = 0; i < items.size(); i++) {
                System.out.println("("+count+")"+" "+items.get(i).getpName()+"\t\tQuantity : "+quantity.get(i)+"\t\tPrice : "+items.get(i).getpPrice()+"/-");
                count++;
            }
            pricePrinter();
        }

        else
            System.out.println("No item found in cart!");

    }

    public void delete(int n) {
        items.remove(n-1);
        quantity.remove(n-1);
    }

    public void deleteAll() {
        items.clear();
        quantity.clear();
    }


    private void pricePrinter() {
        System.out.println("------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\ttotal : " + payableCounter() + "/-");
        System.out.println();
    }

    private int payableCounter() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + (quantity.get(i) * items.get(i).getpPrice());
        }
        return total;
    }

}
