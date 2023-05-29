import java.sql.*;

public class Animales {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " TIPO varchar(100) NOT NULL "
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (1, 'Pancho', 'Perro')";
    private static final String SQL_INSERT2 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (2, 'Pillo', 'Gato')";
    private static final String SQL_INSERT3 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (3, 'Cepillo', 'Elefante')";
    private static final String SQL_INSERT4 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (4, 'Pepe', 'Perro')";
    private static final String SQL_INSERT5 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (5, 'Rolo', 'Caballo')";

    private static final String SQL_DELETE =  "DELETE FROM ANIMALES WHERE ID=2";


    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");

    }

    private static void verAnimales(Connection connection) throws SQLException {
        String sql = "SELECT * FROM ANIMALES";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try{
            connection= getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement rd = connection.createStatement();
            rd.execute(SQL_INSERT);

            Statement rd2 = connection.createStatement();
            rd2.execute(SQL_INSERT2);

            Statement rd3 = connection.createStatement();
            rd3.execute(SQL_INSERT3);

            Statement rd4 = connection.createStatement();
            rd4.execute(SQL_INSERT4);

            Statement rd5 = connection.createStatement();
            rd5.execute(SQL_INSERT5);

            verAnimales(connection);


        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            connection.close();
        }

    }
}
