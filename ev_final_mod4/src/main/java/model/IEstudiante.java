package model;

import java.util.List;

public interface IEstudiante {


	/*
	 * C = create - crear
	 * R = read - leer
	 * U = update - actualizar
	 * D = delete - borrar
	 */
	
	public void create(estudiante e);
	public estudiante read(int id);
	public List<estudiante> read();
	public void update(estudiante e);
	public void delete(estudiante e);
	public void delete(int id);
	
	
	
}


