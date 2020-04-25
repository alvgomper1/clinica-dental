package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Articulo;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TestDAO test;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUserName = getServletContext().getInitParameter("jdbcUserName");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL);
		System.out.println(jdbcUserName+" <-- user");
		System.out.println(jdbcPassword+" <-- pswd");
		try {
			test = new TestDAO(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String op = request.getParameter("opcion");
		switch (op) {
		case "1":
			Articulo articulo = new Articulo(0, "Televisor", "Televisor LG 25 pulgadas", 560.00);
			if (test.registrar(articulo)) {
				System.out.println("Articulo ingresado");
			} else {
				System.out.println("Articulo no ingresado");
			}

			break;

		case "2":
			Articulo a1 = new Articulo(2, "Computadora", "Televisor LG 60 pulgadas", 560);
			if (test.editar(a1)) {
				System.out.println("Articulo actualizado");
			} else {
				System.out.println("Articulo no actualizado");
			}

			break;

		case "3":
			Articulo a2 = new Articulo(3, "Computadora", "Televisor LG 60 pulgadas", 560);
			if (test.eliminar(a2)) {
				System.out.println("Articulo eliminado");
			} else {
				System.out.println("Articulo no eliminado");
			}
			break;

		case "4":
			test.obtenerArticulo(2);
			break;

		case "5":
			test.obtenerArticulos();
			break;
		default:
			break;
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
