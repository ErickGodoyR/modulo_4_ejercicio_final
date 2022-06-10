package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilitadorDAO implements IFacilitador {

	
	@Override
	public void create(Facilitador f) {

		String sql = "insert into facilitador (rut, nombre, email, telefono, valorhora, banco, ctabancaria)"
				+ " values ('" + f.getRut() + "', '" + f.getNombre() + "', '" + f.getEmail() +
				"', '" + f.getTelefono() + "', '" + f.getValorhora() + "', '" + f.getBanco() + "' , "
						+ "'" + f.getCtabancaria() + "')";
				
		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql);
			
			
			

		} catch (SQLException e) {
			System.out.println("Error en metodo create()");
			e.printStackTrace();
		}

}

	
	
	@Override
	public Facilitador read(int id) {
		Facilitador fa = null;
		Timestamp last_update = new Timestamp(new Date().getTime());

		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();

			String sql = "select id, rut, nombre, email, telefono, valorhora, banco, ctabancaria, last_update "
					+ " from facilitador where id = " + id;
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {

				fa = new Facilitador(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), 
						rs.getString("email"), rs.getString("telefono"), rs.getFloat("valorhora"), rs.getString("banco"),
						rs.getString("ctabancaria"), rs.getTimestamp("last_update"));
			}

		} catch (SQLException e) {

			System.out.println("Error al leer un actor");
			e.printStackTrace();

		}

		return fa;
		
	}

	
	
	@Override
	public List<Facilitador> read() {
		List<Facilitador> lista = new ArrayList<Facilitador>();
		Timestamp last_update = new Timestamp(new Date().getTime());
		
		try {

			// creo o llama la conexion
			Connection c = Conexion.getCon();

			// creo un objeto tipo Statement
			Statement s = c.createStatement();
			String sql = "select id, rut, nombre, email, telefono, valorhora, banco, ctabancaria, last_update "
					+ " from facilitador";
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				Facilitador fa = new Facilitador();

				fa.setId(rs.getInt("Id"));
				fa.setRut(rs.getString("rut"));
				fa.setNombre(rs.getString("nombre"));
				fa.setEmail(rs.getString("email"));
				fa.setTelefono(rs.getString("telefono"));
				fa.setValorhora(rs.getFloat("valorhora"));
				fa.setBanco(rs.getString("banco"));
				fa.setCtabancaria(rs.getString("ctabancaria"));
				fa.setLast_update(rs.getTimestamp("last_update"));
								
				lista.add(fa);
			}

			
		} catch (SQLException e) {
			System.out.println("Error en el metodo read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	
	
	@Override
	public void update(Facilitador f) {
		//Timestamp last_update = new Timestamp(new Date().getTime());
		
		Timestamp last_update = new Timestamp(System.currentTimeMillis());

		String sql_facilitador = "update facilitador set rut = '" + f.getRut() + "', nombre = '" + f.getNombre() + "', email = '" + f.getEmail()
		+ "', telefono = '" + f.getTelefono() + "', valorhora = '" + f.getValorhora() + "', banco = '" + f.getBanco() + "', ctabancaria = '" + f.getCtabancaria() 
		+ "' where id = " + f.getId();

		
		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql_facilitador);

		} catch (SQLException e) {
			System.out.println("Error en metodo update()");
			e.printStackTrace();
		}

	}

	
	
	@Override
	public void delete(Facilitador f) {
		// TODO Auto-generated method stub

	}

	
	
	@Override
	public void delete(int id) {
		String sql = "delete from facilitador where id = " + id;

		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error en metodo delete()");
			e.printStackTrace();
		}

	}

}
