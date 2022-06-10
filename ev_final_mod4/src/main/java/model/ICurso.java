package model;

import java.util.List;

public interface ICurso {
	
	/*
	 * C = create - crear
	 * R = read - leer
	 * U = update - actualizar
	 * D = delete - borrar
	 */
	
	public void create(Curso c);
	public Curso read(int id);
	public List<Curso> read();
	public void update(Curso c);
	public void delete(Curso c);
	public void delete(int id);
	
	
}
