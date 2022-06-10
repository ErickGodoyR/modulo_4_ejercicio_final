package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CursoDAO implements ICurso {

	@Override
	public void create(Curso c) {

		String sql = "insert into curso (codigo, nombre, id_facilitador)"
				+ " values ('" + c.getCodigo() + "', '" + c.getNombre() + "', '" + c.getId_facilitador() + "')";

				
		try {

			Connection co = Conexion.getCon();
			Statement s = co.createStatement();
			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error en metodo create()");
			e.printStackTrace();
		}

	}

	
	
	@Override
	public Curso read(int id) {
		Curso cso = null;
		Timestamp last_update = new Timestamp(new Date().getTime());

		try {

			Connection c = Conexion.getCon();
			Statement s = c.createStatement();

			String sql = "select id, codigo, nombre, id_facilitador, last_update "
					+ " from curso where id = " + id;
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {

				cso = new Curso(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombre"), rs.getInt("id_facilitador"), 
						rs.getTimestamp("last_update"));

			}

		} catch (SQLException e) {

			System.out.println("Error al leer curso");
			e.printStackTrace();

		}

		return cso;

	}

	
	
	@Override
	public List<Curso> read() {
		List<Curso> lista_curso = new ArrayList<Curso>();
		Timestamp last_update = new Timestamp(new Date().getTime());
		
		try {

			// Llama a la conexion
			Connection c = Conexion.getCon();

			// creo un objeto tipo Statement
			Statement s = c.createStatement();
			String sql = "select id, codigo, nombre, id_facilitador, last_update"
					+ " from curso";
			
			//, last_update
			
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				Curso cso = new Curso();

				cso.setId(rs.getInt("Id"));
				cso.setCodigo(rs.getString("codigo"));
				cso.setNombre(rs.getString("nombre"));
				cso.setId_facilitador(rs.getInt("id_facilitador"));
				cso.setLast_update(rs.getTimestamp("last_update"));
								
				lista_curso.add(cso);

			}

			
		} catch (SQLException e) {
			System.out.println("Error en el metodo read()");
			e.printStackTrace();
		}
		
		return lista_curso;

	}

	
	
	@Override
	public void update(Curso c) {

		String sql_curso = "update curso set codigo = '" + c.getCodigo() + "', nombre = '" + c.getNombre() + "', id_facilitador = '" + c.getId_facilitador() 
		+ "' where id = " + c.getId();


		try {

			Connection co = Conexion.getCon();
			Statement s = co.createStatement();
			s.execute(sql_curso);

		} catch (SQLException e) {
			System.out.println("Error en metodo update()");
			e.printStackTrace();
		}

	}

	
	
	@Override
	public void delete(Curso c) {
		// TODO Auto-generated method stub

	}

	
	
	@Override
	public void delete(int id) {
		String sql = "delete from curso where id = " + id;

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

