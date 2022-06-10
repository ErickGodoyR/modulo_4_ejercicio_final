package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EstudianteDAO;
import model.estudiante;

/**
 * Servlet implementation class AgregarEstudianteServlet
 */
@WebServlet("/AgregarEstudianteServlet")
public class AgregarEstudianteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarEstudianteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String op = request.getParameter("op");		
		String strId = request.getParameter("id");
		
		int id = 0;
		if (strId != null)
			id = Integer.parseInt(strId);
		
		EstudianteDAO eDAO = new EstudianteDAO();
		
		if (op==null && id > 0) {
			
			//Consulta si existe estudiante
			estudiante e = eDAO.read(id);
			
			request.setAttribute("estudiante", e);
			
			getServletContext().getRequestDispatcher("/view/agregarEstudiante.jsp").forward(request, response);	
		} else if (id == 0) {
			
			getServletContext().getRequestDispatcher("/view/agregarEstudiante.jsp").forward(request, response);
			
		} else if (op.equalsIgnoreCase("del")) {
			
			//borra un registro
			eDAO.delete(id);
			
			response.sendRedirect(request.getContextPath() + "/EstudianteServlet");
			
		} 
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String strlast_update = request.getParameter("last_update");
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");	
		
		String strId = request.getParameter("id"); 
		
			
		estudiante e = null;
		EstudianteDAO eDAO = new EstudianteDAO();
		
		//Si no existe estudiante, ingresa uno nuevo
		if (strId.isEmpty()) {
			e = new estudiante();
			e.setRut(rut);
			e.setNombre(nombre);
			e.setEmail(email);
			e.setTelefono(telefono);
			
			
			eDAO.create(e);
			
			
			//Si existe estudiante, actualiza sus datos
		} else {
			int id = Integer.parseInt(strId);
			//long last_update = Timestamp.parse(strlast_update);
			e = new estudiante();
			//agregar id para que actualice
			e.setId(id);
			e.setRut(rut);
			e.setNombre(nombre);
			e.setEmail(email);
			e.setTelefono(telefono);
			//e.setLast_update(last_update);
			
			eDAO.update(e);		
			
		}
		
		response.sendRedirect(request.getContextPath() + "/EstudianteServlet");
	
	}
	
	
}
