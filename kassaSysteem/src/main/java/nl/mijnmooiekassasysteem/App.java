package nl.mijnmooiekassasysteem;

import java.util.*;

/**
 * Creates a list of product with a ProductId and a Price
 */
public class App {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductId(0);
        product.setPrice(1);
        product.setName("Frikandelbroodje");

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product);

        Kassa cart = new Kassa();
    }
}
