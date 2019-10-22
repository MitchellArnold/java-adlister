package model;

import interfaces.Products;

import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {
    private List<Product> products = new ArrayList();

    public ListProducts() {
        insert(new Product("hammer", 9.99));
        insert(new Product("chainsaw", 56.22));
        insert(new Product("tree-hammer", 54.22));
    }

    public void insert(Product product) {
        this.products.add(product);
    }

    public List<Product> all() {
        return this.products;
    }
}
