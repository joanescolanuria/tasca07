package ejercicio0701;

public class TrabajadorOnline extends Trabajador {
    private static final double TARIFA_PLANEA_INTERNET = 35.0;

    public TrabajadorOnline(String nombre, String apellido, double precioPorHora) {
        super(nombre, apellido, precioPorHora);
    }
    @Deprecated
    public void metodoObsoletoOnline() {
        System.out.println("Metodo online obsoleto");
    }
    

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + TARIFA_PLANEA_INTERNET;
    }
}