import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS CUENTA; CREATE TABLE CUENTA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " NRO_CUENTA NUMERIC(10, 2) NOT NULL,"
            + " SALDO INT NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO CUENTA (ID, NOMBRE, NRO_CUENTA, SALDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE =  "UPDATE CUENTA SET SALDO=? WHERE ID=?";

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "", "");

    }

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(3565, "Vip", 98797);
        Connection connection = null;
        try {
            getConnection();
        }catch (Exception e) {

        }


    }
}
