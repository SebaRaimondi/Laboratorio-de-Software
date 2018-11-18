package prueba;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("data", generateProducts());
        map.put("message", "Retrieved MANY products");
        map.put("paginationData", null);

        map.
    }

    private static List<Product> generateProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"toddy",10,10,1));
        products.add(new Product(2,"oreo",5,10,1));
        products.add(new Product(3,"opera",3,10,1));
        products.add(new Product(4,"cheetos",5,15,5));
        products.add(new Product(5,"doritos",5,15,5));
        products.add(new Product(6,"tv",5,20,6));
        products.add(new Product(7,"monitor",5,20,6));
        return products;

    }
}


{"status":"success","data":[{"id":1,"name":"toddy","costprice":10,"saleprice":10,"producttype":1},{"id":2,"name":"oreo","costprice":5,"saleprice":10,"producttype":1},{"id":3,"name":"opera","costprice":3,"saleprice":10,"producttype":1},{"id":4,"name":"cheetos","costprice":5,"saleprice":15,"producttype":5},{"id":5,"name":"doritos","costprice":5,"saleprice":15,"producttype":5},{"id":6,"name":"tv","costprice":5,"saleprice":20,"producttype":6},{"id":7,"name":"monitor","costprice":5,"saleprice":20,"producttype":6}],"messsage":"Retrieved MANY products","paginationData":null}