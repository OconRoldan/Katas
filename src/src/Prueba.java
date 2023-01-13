
public class Prueba implements Metodos {

	String Nombre;

	public Prueba(String nombre) {
		super();
		Nombre = nombre;
	}

	public void cambioNombre() {
		this.setNombre("HOLA");

	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int calcularPorcentaje(int numeroPollito, int porcentaje) {

		int resultadoNumeroPollitoTuneado = (numeroPollito * porcentaje) / 100;

		return resultadoNumeroPollitoTuneado;
	}

}
