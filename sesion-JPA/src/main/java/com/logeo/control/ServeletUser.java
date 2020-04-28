package com.logeo.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logeo.DAO.UsuarioDAO;
import com.logeo.model.TbUsuariop;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String usu = request.getParameter("usuario");
		String contrase = request.getParameter("contra");
		
		
		
		
		TbUsuariop usuario = new TbUsuariop();
		UsuarioDAO usuDao = new UsuarioDAO();
		
		
		
		usuario.setUsuario(usu);
		usuario.setContrasenia(contrase);
		
		int verificarusuario = usuDao.IngresoUsuario(usuario).size();
		
		if (verificarusuario>1) {
			
			System.out.println("Inicio Exitoso");
			
		}else {
			
			
			System.out.println("Verificacion Erronea");
		}
		
		response.sendRedirect("index.jsp");
		
	}


	}
	
	


