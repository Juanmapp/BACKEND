import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Figura {

        public static void main(String[] args) throws Exception {
            Class.forName("org.h2.Driver").newInstance();


            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement stmt = con.createStatement();

            String createSql = "DROP TABLE IF EXISTS FIGURA;\n" +
                    "CREATE TABLE FIGURA(iD INT PRIMARY KEY, tipoFigura VARCHAR(255), color VARCHAR(255));\n" +
                    "INSERT INTO FIGURA VALUES(1, 'circulo', 'rojo');\n" +
                    "INSERT INTO FIGURA VALUES(2, 'circulo', 'verde');\n"+
                    "INSERT INTO FIGURA VALUES(3, 'cuadrado', 'azul');\n"+
                    "INSERT INTO FIGURA VALUES(4, 'cuadrado', 'verde');\n"+
                    "INSERT INTO FIGURA VALUES(5, 'cuadrado', 'rojo');\n";

            stmt.execute(createSql);

            String sql = "SELECT * FROM FIGURA WHERE color = 'rojo' AND tipoFigura = 'circulo'";
            ResultSet rd = stmt.executeQuery(sql);

            while(rd.next()) {
                System.out.println(rd.getInt(1) + rd.getString(2) + rd.getString(3));
            }
        }

    }

