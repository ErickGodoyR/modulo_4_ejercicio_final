package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EstudianteDAO;
import model.Facilitador;
import model.FacilitadorDAO;
import model.estudiante;

/**
 * Servlet implementation class AgregarFacilitadorServlet
 */
@WebServlet("/AgregarFacilitadorServlet")
public class AgregarFacilitadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarFacilitadorServlet() {
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

		
		FacilitadorDAO fDAO = new FacilitadorDAO();
		
		if (op==null && id > 0) {
			//código para consultar un usuario
			
			Facilitador f = fDAO.read(id);
			
			request.setAttribute("facilitador", f);
			
			getServletContext().getRequestDispatcher("/view/agregarFacilitador.jsp").forward(request, response);	
		} else if (id == 0) {
			
			getServletContext().getRequestDispatcher("/view/agregarFacilitador.jsp").forward(request, response);
			
		} else if (op.equalsIgnoreCase("del")) {
			//código para borrar un usuario
			
			fDAO.delete(id);
			
			response.sendRedirect(request.getContextPath() + "/FacilitadorServlet");
			
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
		Float valorhora = Float.parseFloat(request.getParameter("valorhora"));
		String banco = request.getParameter("banco");
		String ctabancaria = request.getParameter("ctabancaria");
		String strlast_update = request.getParameter("last_update");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");	
		
		String strId = request.getParameter("id"); 
		
			
		Facilitador f = null;
		FacilitadorDAO fDAO = new FacilitadorDAO();
		
		//if (!strId.isEmpty()) {
		if (strId.isEmpty()) {
			f = new Facilitador();
			f.setRut(rut);
			f.setNombre(nombre);
			f.setEmail(email);
			f.setTelefono(telefono);
			f.setValorhora(valorhora);
			f.setBanco(banco);
			f.setCtabancaria(ctabancaria);
			
			//e.setLast_update(last_update);
			
			fDAO.create(f);
			
			
			//eDAO.update(e);
		} else {
			int id = Integer.parseInt(strId);
			//int last_update = Timestamp.parseTimestamp(strlast_update);
			//Timestamp last_update = null;
			//Timestamp last_update = Timestamp.parseTimestamp(strlast_update);
			f = new Facilitador();
			f.setId(id);
			f.setRut(rut);
			f.setNombre(nombre);
			f.setEmail(email);
			f.setTelefono(telefono);
			f.setValorhora(valorhora);
			f.setBanco(banco);
			f.setCtabancaria(ctabancaria);
			//e.setLast_update(last_update);
			
			fDAO.update(f);		
			
		}
		
		response.sendRedirect(request.getContextPath() + "/FacilitadorServlet");
	
	}
	
		
}
