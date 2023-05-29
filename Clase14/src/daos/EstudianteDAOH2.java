package daos;

import entidades.Estudiante;

import java.sql.*;
import java.util.List;


public class EstudianteDAOH2 implements IDao<Estudiante> {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:tcp://localhost/~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER).newInstance();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("INSERT INTO estudiantes VALUES(?,?,?)");
            preparedStatement.setLong(1,estudiante.getId());
            preparedStatement.setString(2,estudiante.getNombre());
            preparedStatement.setString(3, estudiante.getApellido());

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return estudiante;
    }

    @Override
    public void eliminar(Long id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER).newInstance();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM estudiantes where id=?");
            preparedStatement.setLong(1, id);


            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }



    }

    @Override
    public Estudiante buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Estudiante estudiante = null;
        try {
            Class.forName(DB_JDBC_DRIVER).newInstance();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes where id=?");
            preparedStatement.setLong(1,id);


            ResultSet result = preparedStatement.executeQuery();

            while(result.next()) {
                Long idEstudiante = result.getLong("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

            }
            preparedStatement.close();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        return null;
    }
}
