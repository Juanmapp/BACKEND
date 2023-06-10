package com.proyect.clinica.nueva.clinica.odontologica.repository.impl;

import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import com.proyect.clinica.nueva.clinica.odontologica.model.Paciente;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;
import com.proyect.clinica.nueva.clinica.odontologica.util.Util;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PacienteDAOH2 implements IDAO<Paciente> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //con la instruccion INIT=RUNSCRIPT cuando se conecta a la base ejecuta el script de sql que esta en dicho archivo
    private final static String DB_URL = "jdbc:h2:~/test;";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "";
    @Override
    public List<Paciente> listar() {
        return null;}

    @Override
    public Paciente agregar(Paciente paciente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia especificando que el ID lo auto incrementa la base de datos y que nos devuelva esa Key es decir ID
            preparedStatement = connection.prepareStatement("INSERT INTO pacientes(nombre,apellido,dni,fecha_ingreso,domicilio_id) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            //No le vamos a pasar el ID ya que hicimos que fuera autoincremental en la base de datos
            //preparedStatement.setInt(1,odontologo.getId());
            preparedStatement.setString(1, paciente.getNombre());
            preparedStatement.setString(2, paciente.getApellido());
            preparedStatement.setString(3, paciente.getDni());
            preparedStatement.setTimestamp(4,  Util.dateToTimestamp(paciente.getFechaDeAlta()));
            preparedStatement.setInt(5,paciente.getDomicilio().getId());

            //3 Ejecutar una sentencia SQL y obtener los ID que se autogeneraron en la base de datos
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next())
                paciente.setId(keys.getInt(1));

            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return null;
    }
}
