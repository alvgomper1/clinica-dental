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
       private static final String ERROR_NOTIFICACIONES = "Tienes que iniciar sesión";

    public ControladorSession() {
        super();
        
    }

	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession= (HttpSession) request.getSession();
		String cerrarSesion = "";
		cerrarSesion=request.getParameter("disconnect");
		String url = request.getParameter("url");
		Usuario miUsuario= (Usuario) misession.getAttribute("usuario");
		
		
		if (cerrarSesion!=null && cerrarSesion.equals("true")) {
			System.out.println("has elegido cerrar sesion");
			misession.invalidate();
		    response.sendRedirect("paginaPrincipal.jsp");
		}
		else {
		if (miUsuario==null) {
			if (url.equals("notificaciones.jsp")) {
				request.setAttribute("errorLogin", ERROR_NOTIFICACIONES);
			}
			
		
			request.getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
		}
		else {
			if (url.equals("paginaPrincipal.jsp")) {
				 response.sendRedirect("miPerfil.jsp");
			}
			else {
				
			
		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Se ha redirigido a: "+url);
		System.out.println("El usuario es: "+miUsuario.getNombre());}
		
		
		}
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	
	

}
