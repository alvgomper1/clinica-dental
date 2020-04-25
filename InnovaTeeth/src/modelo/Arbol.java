package modelo;

public class Arbol {
	private int id;
	private String nombre;
	private String descripcion;
	private Double altura;
	private Double anchura;
	private int idUsuario;
	
	public Arbol() {
	}

	public Arbol(int id,int idUsuario, String nombre, String descripcion, Double altura, Double anchura ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.altura = altura;
		this.anchura = anchura;
		this.idUsuario = idUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAnchura() {
		return anchura;
	}

	public void setAnchura(Double anchura) {
		this.anchura = anchura;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Arbol [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", altura=" + altura
				+ ", anchura=" + anchura + ", idUsuario=" + idUsuario + "]";
	}


}
