package model;

import java.sql.Timestamp;


public class Facilitador {
	
	int id;
	String rut;
	String nombre;
	String email;
	String telefono;
	Float valorhora;
	String banco;
	String ctabancaria;
	Timestamp last_update;

	
	public Facilitador() {
		super();
	}


	public Facilitador(int id, String rut, String nombre, String email, String telefono, Float valorhora, String banco,
			String ctabancaria, Timestamp last_update) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.valorhora = valorhora;
		this.banco = banco;
		this.ctabancaria = ctabancaria;
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


	public Float getValorhora() {
		return valorhora;
	}


	public void setValorhora(Float valorhora) {
		this.valorhora = valorhora;
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public String getCtabancaria() {
		return ctabancaria;
	}


	public void setCtabancaria(String ctabancaria) {
		this.ctabancaria = ctabancaria;
	}


	public Timestamp getLast_update() {
		return last_update;
	}


	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}


	@Override
	public String toString() {
		return "Facilitador [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", email=" + email + ", telefono="
				+ telefono + ", valorhora=" + valorhora + ", banco=" + banco + ", ctabancaria=" + ctabancaria
				+ ", last_update=" + last_update + "]";
	}

	
	
}
