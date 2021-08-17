package test.shop.dao;

public interface ShopDAO {
    void createTable(String SQL_CREATE);

    void insertRow(String SQL_INSERT);

    void updateRow(String SQL_UPDATE);

    void deleteRow(String SQL_DELETE);

    Class selectList(String SQL_SELECT);
}
