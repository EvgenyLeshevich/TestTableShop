package test.shop;

import test.shop.dao.ShopDAOImpl;

public class Main {
    private static final String SQL_CREATE_SHOP = "create table Shop" +
            "(" +
            "ID INTEGER auto_increment primary key NOT NULL," +
            "Title varchar (20) NOT NULL" +
            ")";

    private static final String SQL_CREATE_POSITION = "create table Position " +
            "(" +
            "ID INTEGER auto_increment primary key NOT NULL," +
            "Position varchar (20) NOT NULL," +
            "Shop_id INTEGER NOT NULL, FOREIGN KEY (Shop_id) REFERENCES Shop (ID)" +
            ")";

    public static void main(String[] args) {
        ShopDAOImpl tableShop = new ShopDAOImpl();
        tableShop.createTable(SQL_CREATE_SHOP);

        ShopDAOImpl tablePosition = new ShopDAOImpl();
        tablePosition.createTable(SQL_CREATE_POSITION);
    }
}
