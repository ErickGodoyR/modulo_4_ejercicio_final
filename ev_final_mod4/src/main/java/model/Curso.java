package model;

import java.sql.Timestamp;

public class Curso {
	
	int id;
	String codigo;
	String nombre;
	int id_facilitador;
	Timestamp last_update;

	
	public Curso() {
		super();
	}


	public Curso(int id, String codigo, String nombre, int id_facilitador, Timestamp last_update) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.id_facilitador = id_facilitador;
		this.last_update = last_update;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getId_facilitador() {
		return id_facilitador;
	}


	public void setId_facilitador(int id_facilitador) {
		this.id_facilitador = id_facilitador;
	}


	public Timestamp getLast_update() {
		return last_update;
	}


	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", id_facilitador=" + id_facilitador
				+ ", last_update=" + last_update + "]";
	}

	

}
