    package quanlynhanvien;

    import java.sql.Connection;
    import java.sql.DriverManager;

    import java.sql.SQLException;

    /**
     *
     * @author Windows 10 Version 2
     */
    public class connection {

        private static final String URL = "jdbc:sqlserver://Localhost:1433;databaseName=nhansucongty; encrypt = false";
        private static final String USER = "sa";
        private static final String PASSWORD = "123456";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

    }
