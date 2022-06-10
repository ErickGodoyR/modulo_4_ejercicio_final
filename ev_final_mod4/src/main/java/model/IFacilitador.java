package model;

import java.util.List;

public interface IFacilitador {

	/*
	 * C = create - crear
	 * R = read - leer
	 * U = update - actualizar
	 * D = delete - borrar
	 */
	
	public void create(Facilitador f);
	public Facilitador read(int id);
	public List<Facilitador> read();
	public void update(Facilitador f);
	public void delete(Facilitador f);
	public void delete(int id);

	
}
