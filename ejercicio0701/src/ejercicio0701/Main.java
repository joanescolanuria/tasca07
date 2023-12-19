package ejercicio0701;

public class Main {

	public static void main(String[] args) {
		TrabajadorPresencial presencial = new TrabajadorPresencial("Joel", "Vasquez", 15.0);
		TrabajadorOnline online = new TrabajadorOnline("Ana", "Jara", 20.0);

		int horasTrabajadas = 40;

		double sueldoPresencial = presencial.calcularSueldo(horasTrabajadas);
		double sueldoOnline = online.calcularSueldo(horasTrabajadas);

		System.out.println("Sueldo presencial: " + sueldoPresencial);
		System.out.println("Sueldo online: " + sueldoOnline);
	}

}
