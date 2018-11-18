package prueba;

public class Product {
    private int id;
    private String name;
    private int costprice;
    private int saleprice;
    private int producttype;

    public Product(int id, String name, int costprice, int saleprice, int producttype) {
        this.id = id;
        this.name = name;
        this.costprice = costprice;
        this.saleprice = saleprice;
        this.producttype = producttype;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCostprice() {
        return costprice;
    }

    public int getSaleprice() {
        return saleprice;
    }

    public int getProducttype() {
        return producttype;
    }

}
