package model;

import java.sql.Timestamp;

public class estudiante {
	int id;
	String rut;
	String nombre;
	String email;
	String telefono;
	Timestamp last_update;


public estudiante() {
	super();
}


public estudiante(int id, String rut, String nombre, String email, String telefono, Timestamp last_update) {
	super();
	this.id = id;
	this.rut = rut;
	this.nombre = nombre;
	this.email = email;
	this.telefono = telefono;
	this.last_update = last_update;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getRut() {
	return rut;
}


public void setRut(String rut) {
	this.rut = rut;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public Timestamp getLast_update() {
	return last_update;
}


public void setLast_update(Timestamp last_update) {
	this.last_update = last_update;
}


@Override
public String toString() {
	return "estudiante [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", email=" + email + ", telefono="
			+ telefono + ", last_update=" + last_update + "]";
}




}
