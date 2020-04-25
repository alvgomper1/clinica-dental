package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Articulo;
import modelo.Usuario;

@WebServlet("/ControllerUsuario")
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO_usuario daoUsuario;

	public ControllerUsuario() {
		super();
	}

	public void init() throws ServletException {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUserName = getServletContext().getInitParameter("jdbcUserName");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		try {
			daoUsuario = new DAO_usuario(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = request.getSession(true);
		String op = request.getParameter("opcion");
		String idEliminar = request.getParameter("idEliminar");

		switch (op) {
		case "registrar":
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
			String usuario = request.getParameter("usuario");
			String email = request.getParameter("email");
			String contrasena = request.getParameter("contrasena");

			Usuario u = new Usuario(0, nombre, apellidos, email, usuario, contrasena);
			if (daoUsuario.registrar(u)) {
				System.out.println("Usuario " + usuario + " ingresado");
				request.getRequestDispatcher("/FormularioLogin.jsp").forward(request, response);
			} else {
				System.out.println("Usuario no ingresado");
				request.getRequestDispatcher("/FormularioRegistro.jsp").forward(request, response);
			}
			break;

		case "editar":
			Usuario u2 = new Usuario(2, "Editado", "Gomez Perez", "alvarogomez@0630gmail.com", "alvarogp99", "qwerty");
			if (daoUsuario.editar(u2)) {
				System.out.println("Usuario actualizado");
			} else {
				System.out.println("Usuario no actualizado");
			}
			break;

		case "eliminar":
			if (daoUsuario.eliminar(Integer.parseInt(idEliminar))) {
				System.out.println("Usuario eliminado");
			} else {
				System.out.println("Usuario no eliminado");
			}
			break;

		case "consultar":
			String contrasenaIncorrecta = "Contraseña incorrecta";
			String usuarioIncorrecto = "El nº de socio no existe";
			String nombreUsuario = request.getParameter("nombreUsuario");
			Usuario user = daoUsuario.obtenerUsuarios().stream().filter(x -> x.getNombreUsuario().equals(nombreUsuario))
					.findFirst().orElse(null);

			String contrasenaLogin = request.getParameter("contrasenaLogin");

			if (user != null) {
				System.out.println("El usuario existe");

				if (user.getContrasena().equals(contrasenaLogin)) {
					System.out.println("Usuario y contraseña correctos");

					misession.setAttribute("usuario", user);
					request.setAttribute("nombreUsuario", nombreUsuario);
					request.getRequestDispatcher("/ventajasClub.jsp").forward(request, response);
				} else {
					System.out.println("Contraseña incorrecta");
					request.setAttribute("errorLogin", contrasenaIncorrecta);
					request.getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
				}
			} else {
				System.out.println("El usuario no existe");
				request.setAttribute("errorLogin", usuarioIncorrecto);
				request.getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
			}

			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
