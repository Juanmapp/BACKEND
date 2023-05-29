package Clase10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testlog {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:"+
                "./Database/my", "root", "myPassword");
        Statement stmt = con.createStatement();

        String createSql = "DROP TABLE IF EXISTS TEST;\n" +
                "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                "INSERT INTO TEST VALUES(1, 'Hello');\n" +
                "INSERT INTO TEST VALUES(2, 'World');\n";
        stmt.execute(createSql);

        String sql = "SELECT * FROM TEST";
        ResultSet rd = stmt.executeQuery(sql);

        while(rd.next()) {
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }

}

