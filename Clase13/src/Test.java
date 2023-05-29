import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

    private final static String SQL_CREATE_TABLE = "DROP IF EXISTS odontologo; CREATE TABLE odontologo" +
            "("
            + "ID INT PRIMARY KEY"
            + "APELLIDO varchar(100) NOT NULL,"
            + "NOMBRE varchar(100) NOT NULL,"
            + "MATRICULA varchar(100) NOT NULL"
            + ")";

    private final static String SQL_INSERT = "INSERT INTO odontologo (ID, APELLIDO, NOMBRE, MATRICULA) VALUES (?,?,?,?)";
    private final static String SQL_UPDATE = "UPDATE odontologo SET MATRICULA=? WHERE ID =?";

    public Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection(" jdbc:h2:tcp://localhost/~/test", "sa", "");
    }

    public static void main(String[] args) {
        Odontologo odontologo = new Odontologo("Licini", "Juan", "433453654");


    }



}
