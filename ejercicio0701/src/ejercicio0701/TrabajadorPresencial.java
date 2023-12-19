package ejercicio0701;

public class TrabajadorPresencial  extends Trabajador {
    private static double gasolina = 30.0;

    public TrabajadorPresencial(String nombre, String apellido, double precioPorHora) {
        super(nombre, apellido, precioPorHora);
    }

    @Deprecated
    public void metodoObsoleto() {
        System.out.println("Metodo  presencial obsoleto");
    }
    
    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }
}