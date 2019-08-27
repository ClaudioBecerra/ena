package dao;

import java.sql.SQLException;
import java.util.List;

public interface CRUD<T> {

	List<T> listarTodos() throws SQLException;
	List<T> listarPorId(int id) throws SQLException;
	T leerPorId (int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int id);
}
