package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;
import model.CursoDAO;

/**
 * Servlet implementation class AgregarCursoServlet
 */
@WebServlet("/AgregarCursoServlet")
public class AgregarCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCursoServlet() {
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
		
		CursoDAO cDAO = new CursoDAO();
		
		if (op==null && id > 0) {
			
			//Consulta si existe estudiante
			Curso c = cDAO.read(id);
			
			request.setAttribute("curso", c);
			
			getServletContext().getRequestDispatcher("/view/agregarCurso.jsp").forward(request, response);	
		} else if (id == 0) {
			
			getServletContext().getRequestDispatcher("/view/agregarCurso.jsp").forward(request, response);
			
		} else if (op.equalsIgnoreCase("del")) {
			
			//borra un registro
			cDAO.delete(id);
			
			response.sendRedirect(request.getContextPath() + "/CursoServlet");
			
		} 
	
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		String strid_facilitador = request.getParameter("id_facilitador");
		String strlast_update = request.getParameter("last_update");
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");	
		
		String strId = request.getParameter("id"); 
		
			
		Curso c = null;
		CursoDAO cDAO = new CursoDAO();
		
		int id_facilitador = Integer.parseInt(strid_facilitador);
		
		
		//Si no existe estudiante, ingresa uno nuevo
		if (strId.isEmpty()) {
			
			c = new Curso();
			c.setCodigo(codigo);
			c.setNombre(nombre);
			c.setId_facilitador(id_facilitador);
				
			cDAO.create(c);
			
			
			//Si existe estudiante, actualiza sus datos
		} else {
			int id = Integer.parseInt(strId);
			//long last_update = Timestamp.parse(strlast_update);
			c = new Curso();
			//agregar id para que actualice
			c.setId(id);
			c.setCodigo(codigo);
			c.setNombre(nombre);
			c.setId_facilitador(id_facilitador);
			
			//e.setLast_update(last_update);
			
			cDAO.update(c);		
			
		}
		
		response.sendRedirect(request.getContextPath() + "/CursoServlet");
			
	}

}
