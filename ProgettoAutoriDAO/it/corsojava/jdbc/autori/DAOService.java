package it.corsojava.jdbc.autori;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOService {

    private static String userName;
    private static String userPass;
    private static String connectionString;

    public static AutoreDAO createAutoreDAO(){
        return new AutoreDAOImpl();
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, userName, userPass);
    }

    public static void setUserName(String userName) {
        DAOService.userName = userName;
    }

    public static void setUserPass(String userPass) {
        DAOService.userPass = userPass;
    }

    public static void setConnectionString(String connectionString) {
        DAOService.connectionString = connectionString;
    }
}
