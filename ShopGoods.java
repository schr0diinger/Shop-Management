
public class ShopGoods {

    private String pName;
    private int pPrice;

    ShopGoods(String n, int p) {
        pName = n;
        pPrice = p;
    }

    void setpName(String pName) {
        this.pName = pName;
    }

    void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    String getpName() {
        return pName;
    }

    int getpPrice() {
        return pPrice;
    }

}
