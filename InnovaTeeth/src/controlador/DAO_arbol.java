package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import modelo.Arbol;


public class DAO_arbol {		

	private Conexion con;

	public DAO_arbol(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcUserName, jdbcPassword);

	}

//registar un arbol
	public boolean registrar(Arbol u) {
		boolean estado = false;
		Statement stm;
		//id, idUsuario,nombre,descripcion,altura,anchura
		String sql = "INSERT INTO arboles VALUES (NULL,'" + u.getIdUsuario() + "','" +u.getNombre() + "','"
				+ u.getDescripcion() + "','" + u.getAltura()+ "','" + u.getAnchura() + "')";

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			stm.executeUpdate(sql);
			estado = true;
			stm.close();
			con.discconect();
		} catch (SQLException e) {
			estado = false;
			e.printStackTrace();
		}
		return estado;
	}

	public boolean editar(Arbol u) {
		boolean estado = false;
		Statement stm;

		String sql = "UPDATE arboles SET " + "id_usuario='" + u.getIdUsuario() + "'," + "nombre='" + u.getNombre() + "'," + "descripcion='" + u.getDescripcion()
				+ "',"  + "altura='" + u.getAltura() + "'," + "anchura='"
				+ u.getAnchura() + "' WHERE id=" + u.getId();

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			stm.execute(sql);
			estado = true;
			stm.close();
			con.discconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			estado = false;
			e.printStackTrace();
		}
		return estado;
	}

	public boolean eliminar(Arbol u) {
		boolean estado = false;
		Statement stm;

		String sql = "DELETE FROM  arboles WHERE id=" + u.getId();

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			stm.executeUpdate(sql);
			estado = true;
			stm.close();
			con.discconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			estado = false;
			e.printStackTrace();
		}
		return estado;
	}

	public void obtenerArboles() {
		Statement stm;
		ResultSet res = null;
		Arbol u;

		String sql = "SELECT * FROM  arboles";

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			res = stm.executeQuery(sql);

			while (res.next()) {
				u = new Arbol(res.getInt("id"), res.getInt("idUsuario"), res.getString("nombre"),
						res.getString("descripcion"), res.getDouble("altura"), res.getDouble("anchura"));
				System.out.println(u);
			}

			stm.close();
			con.discconect();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void obtenerArbol(int id) {
		Statement stm;
		ResultSet res = null;

		String sql = "SELECT * FROM  arboles WHERE id=" + id;

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			res = stm.executeQuery(sql);
			Arbol u;

			if (res.next()) {
				u = new Arbol(res.getInt("id"), res.getInt("idUsuario"), res.getString("nombre"),
						res.getString("descripcion"), res.getDouble("altura"), res.getDouble("anchura"));
				System.out.println(u);
			}
			stm.close();
			con.discconect();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}