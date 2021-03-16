package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class DogTypes {

    private MariaDbDataSource dataSource;

    public Connection getDataSource() throws SQLException {
        return dataSource.getConnection();
    }

    public DogTypes(MariaDbDataSource dataSource) throws SQLException {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String hungary) {
        List<String> list = new LinkedList<>();


        PreparedStatement stmt = null;
        try {
            String query = "select name from dog_types where country = ?";
            stmt = getDataSource().prepareStatement(query);
            stmt.setString(1, hungary);
            ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                list.add(rs.getString(1).toLowerCase());
            }
            getDataSource().close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                getDataSource().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        return list;

    }
}
