package servicios;

import daos.IDao;
import entidades.Estudiante;

import java.util.List;

public class EstudianteService {

    private IDao<Estudiante> estudianteIDao;

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e) {
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id) {
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscar(Long id) {
    return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos() {
        return estudianteIDao.buscarTodos();
    }

}
