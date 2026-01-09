package Project;

import java.sql.*;

public class conn {
    private static Connection c;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodmanagementsystem", "root", "Priti@3204");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return c;
    }
}
