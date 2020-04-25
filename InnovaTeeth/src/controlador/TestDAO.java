package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;
import modelo.Articulo;

public class TestDAO {
	private Conexion con;

	public TestDAO(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con = new Conexion(jdbcURL, jdbcUserName, jdbcPassword);
		 //con.connection();
		//System.out.println(con.getJdbcConnection());
	}

	//registar un articulo
	public boolean registrar(Articulo a) {
		boolean estado = false;
		Statement stm;

		String sql = "INSERT INTO articulos VALUES (NULL,'" + a.getNombre() + "','" + a.getDescripcion() + "',"
				+ a.getPrecio() + ")";

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

	// actualiza un articulo
	public boolean editar(Articulo a) {
		boolean estado = false;
		Statement stm;

		String sql = "UPDATE articulos SET nombre='" + a.getNombre() + "' WHERE id=" + a.getId();

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

	// elimina un articulo
	public boolean eliminar(Articulo a) {
		boolean estado = false;
		Statement stm;

		String sql = "DELETE FROM  articulos WHERE id=" + a.getId();

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

	// obtiene todos los articulos
	public void obtenerArticulos() {
		Statement stm;
		ResultSet res = null;
		Articulo a;

		String sql = "SELECT * FROM  articulos";

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			res = stm.executeQuery(sql);
			
			while (res.next()) {
				a = new Articulo(res.getInt("id"), res.getString("nombre"), res.getString("descripcion"),
						res.getDouble("precio"));
				System.out.println(a);
			}
			
			stm.close();
			con.discconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	// obtiene un sólo articulo
	public void obtenerArticulo(int id) {
		Statement stm;
		ResultSet rs = null;

		String sql = "SELECT * FROM  articulos WHERE id=" + id;

		try {
			con.connection();
			stm = con.getJdbcConnection().createStatement();
			rs = stm.executeQuery(sql);
			Articulo a;
			
			if (rs.next()) {
				a = new Articulo(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
						rs.getDouble("precio"));
				System.out.println(a);
			}
			stm.close();
			con.discconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}
}
