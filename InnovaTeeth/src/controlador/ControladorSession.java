package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;


@WebServlet("/ControladorSession")
public class ControladorSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControladorSession() {
        super();
        
    }

	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession) request.getSession();
		String url = request.getParameter("url");
		Usuario miUsuario= (Usuario) misession.getAttribute("usuario");
		
		if (miUsuario==null) {
			System.out.println("tienes que registrarte para hacer eso");
			request.getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
		}
		else {
		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Se ha redirigido a: "+url);
		System.out.println("El usuario es: "+miUsuario.getNombre());}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
	

}
