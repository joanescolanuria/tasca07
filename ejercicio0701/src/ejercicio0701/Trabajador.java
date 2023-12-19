package ejercicio0701;

public class Trabajador {
	protected String nombre;
	protected String apellido;
	protected double precioPorHora;

	public Trabajador(String nombre, String apellido, double precioPorHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioPorHora = precioPorHora;
	}

	public double calcularSueldo(int horasTrabajadas) {
		return horasTrabajadas * precioPorHora;
	}
}
