package test.shop.dao;

import java.sql.*;
import java.util.ArrayList;

public class ShopDAOImpl implements ShopDAO {
    String url = "jdbc:mysql://localhost:3306/shopdb";
    String username = "root";
    String password = "06919991aH";

    @Override
    public void createTable(String SQL_CREATE) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_CREATE)) {

            preparedStatement.execute();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertRow(String SQL_INSERT) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            preparedStatement.setInt(1, 1);

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateRow(String SQL_UPDATE) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {

            preparedStatement.setString(2, "mkyong");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteRow(String SQL_DELETE) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE)) {

            preparedStatement.setString(1, "mkyong");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Class selectList(String SQL_SELECT) {
       /* List<Class> result = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                long id = resultSet.getLong("ID");
                String name = resultSet.getString("NAME");

                Employee obj = new Employee();
                obj.setId(id);
                obj.setName(name);
                obj.setSalary(salary);
                // Timestamp -> LocalDateTime
                obj.setCreatedDate(createdDate.toLocalDateTime());

                result.add(obj);

            }
            result.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return null; //////////////////////
    }
}
