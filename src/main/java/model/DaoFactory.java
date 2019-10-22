package model;

import interfaces.Products;

/// Gate keeper
public class DaoFactory {
    static private Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
}
