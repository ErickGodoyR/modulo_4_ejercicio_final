package model;

//import java.security.Timestamp;
import java.sql.Timestamp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EstudianteDAO implements IEstudiante {

	
	
	@Override
	public void create(estudiante e) {

		String sql = "insert into estudiante (rut, nombre, email, telefono)"
				+ " values ('" + e.getRut() + "', '" + e.getNombre() + "', '" + e.getEmail() +
				"', '" + e.getTelefono() + "')";

				
		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql);

		} catch (SQLException ex) {
			System.out.println("Error en metodo create()");
			ex.printStackTrace();
		}

}

	
	
	@Override
	public estudiante read(int id) {
		estudiante es = null;
		Timestamp last_update = new Timestamp(new Date().getTime());

		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();

			String sql = "select id, rut, nombre, email, telefono, last_update "
					+ " from estudiante where id = " + id;
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {

				es = new estudiante(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"), 
						rs.getString("email"), rs.getString("telefono"), rs.getTimestamp("last_update"));

			}

		} catch (SQLException e) {

			System.out.println("Error al leer un actor");
			e.printStackTrace();

		}

		return es;
}

	
	
	@Override
	public List<estudiante> read() {
		List<estudiante> lista = new ArrayList<estudiante>();
		Timestamp last_update = new Timestamp(new Date().getTime());
		
		try {

			// creo o llamo la conexión
			Connection c = Conexion.getCon();

			// creo un objeto tipo Statement
			Statement s = c.createStatement();
			String sql = "select id, rut, nombre, email, telefono, last_update"
					+ " from estudiante";
			
			//, last_update
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				estudiante e = new estudiante();

				e.setId(rs.getInt("Id"));
				e.setRut(rs.getString("rut"));
				e.setNombre(rs.getString("nombre"));
				e.setEmail(rs.getString("email"));
				e.setTelefono(rs.getString("telefono"));
				e.setLast_update(rs.getTimestamp("last_update"));
								
				lista.add(e);

			}

			
		} catch (SQLException e) {
			System.out.println("Error en el metodo read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	
	
	@Override
	public void update(estudiante e) {
	
		String sql_estudiante = "update estudiante set rut = '" + e.getRut() + "', nombre = '" + e.getNombre() + "', email = '" + e.getEmail()
		+ "', telefono = '" + e.getTelefono() 
		+ "' where id = " + e.getId();


		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql_estudiante);

		} catch (SQLException ex) {
			System.out.println("Error en metodo update()");
			ex.printStackTrace();
		}
	}

	
	
	@Override
	public void delete(estudiante e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		String sql = "delete from estudiante where id = " + id;

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
