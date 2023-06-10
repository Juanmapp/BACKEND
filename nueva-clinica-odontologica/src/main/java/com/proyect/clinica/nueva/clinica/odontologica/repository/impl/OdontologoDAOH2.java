package com.proyect.clinica.nueva.clinica.odontologica.repository.impl;

import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OdontologoDAOH2 implements IDAO<Odontologo> {


    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //con la instruccion INIT=RUNSCRIPT cuando se conecta a la base ejecuta el script de sql que esta en dicho archivo
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "";

    @Override

        public List<Odontologo> listar() {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            List<Odontologo> odontologos = new ArrayList<>();
            try {
                //1 Levantar el driver y Conectarnos

                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

                //2 Crear una sentencia
                preparedStatement = connection.prepareStatement("SELECT *  FROM odontologos");

                //3 Ejecutar una sentencia SQL
                ResultSet result = preparedStatement.executeQuery();

                //4 Obtener resultados
                //4 Obtener resultados
                while (result.next()) {
                    int idOdontologo = result.getInt("id");
                    String nombre = result.getString("nombre");
                    String apellido = result.getString("apellido");
                    String matricula = result.getString("matricula");

                    Odontologo odontologo = new Odontologo(idOdontologo,nombre,apellido,matricula);
                    odontologos.add(odontologo);
                }

                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();

            }

            return odontologos;
        }



    @Override
    public Odontologo agregar(Odontologo odontologo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia especificando que el ID lo auto incrementa la base de datos y que nos devuelva esa Key es decir ID
            preparedStatement = connection.prepareStatement("INSERT INTO odontologos(nombre,apellido,matricula) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            //No le vamos a pasar el ID ya que hicimos que fuera autoincremental en la base de datos
            //preparedStatement.setInt(1,odontologo.getId());
            preparedStatement.setString(1, odontologo.getNombre());
            preparedStatement.setString(2, odontologo.getApellido());
            preparedStatement.setString(3, odontologo.getMatricula());

            //3 Ejecutar una sentencia SQL y obtener los ID que se autogeneraron en la base de datos
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next())
                odontologo.setId(keys.getInt(1));

            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return odontologo;



    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {
        return null;
    }
}
