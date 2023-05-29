import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Empleado {

    private static final Logger logger = Logger.getLogger(Empleado.class);




    public static void main(String[] args) throws Exception{

        try {

            Class.forName("org.h2.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();

            String sql = "DROP TABLE IF EXISTS EMPLEADOS;\n" + "CREATE TABLE EMPLEADOS(id INT PRIMARY KEY, nombre VARCHAR(255), apellido VARCHAR(255), edad INT, telefono VARCHAR(255));\n" +
                    "INSERT INTO EMPLEADOS VALUES (1, 'Sergio', 'Aciar', 25, '12343537');\n" +
                    "INSERT INTO EMPLEADOS VALUES (2, 'Aylen', 'Cormick', 25, '12343533');\n" +
                    "INSERT INTO EMPLEADOS VALUES (3, 'Rocio', 'Silva', 25, '1234327');\n" +
                    "INSERT INTO EMPLEADOS VALUES (4, 'Juan', 'Edward', 25, '123233537');\n" +
                    "INSERT INTO EMPLEADOS VALUES (5, 'Nico', 'Toscano', 25, '12346537');\n";

            statement.execute(sql);

            String query = "SELECT * FROM EMPLEADOS";

            Statement statement2 = connection.createStatement();
            ResultSet rs = statement2.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getInt(4) + " " + rs.getString(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
