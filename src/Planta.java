public abstract class Planta extends Empleado {

	protected double pagoSemanal;
	protected boolean[] prestaciones;
	protected double diaVacaciones;
	protected String nombrePuesto;
	
	private static final String [] PRESTACIONES = {"Vales despensa", "Afore", "Infonavit", "Vacaciones Semana Santa", 
				"Vacaciones Verano", "Descuento proveedores afiliados", "Seguro de auto", "Seguro de vida"}; 
	private static final double [] PAGO_PRESTACIONES = {1000, 0.2, 0.1, 7, 2, 0.25, 5000, 25000}; 				 
	private static final double PORCENTAJE_PLANTA = 0.1;			
	private static final int MAXIMO_SUELDO = 25000;
	
	

	public Planta( String nombre, String apellido, int antiguedad, double pagoSemanal, boolean[] prestaciones) {
		super(nombre, apellido, antiguedad);
		
		String [] PRESTACIONES = {"Vales despensa", "Afore", "Infonavit", "Vacaciones Semana Santa", 
				"Vacaciones Verano", "Descuento proveedores afiliados", "Seguro de auto", "Seguro de vida"};
		
		if (this.pagoSemanal >= 0 && this.pagoSemanal <= MAXIMO_SUELDO) {
			this.pagoSemanal = 0;
		}else {
			this.pagoSemanal = pagoSemanal;
		}
		
		this.diaVacaciones = this.pagoSemanal * this.antiguedad * this.PORCENTAJE_PLANTA;
	}
	
   
   
    private String regresaPrestaciones() {
    	
    	    	
    	for(int i = 0; i < PRESTACIONES.length; i++) {
    		System.out.println(PRESTACIONES[i]);
    	}
    	
    	return "";
	}
	
	
	public double sueldo() { 
		/*
		 * TODO:
		 * Calcula el sueldo de un empleado de Planta de la siguiente manera:
		 *    El sueldo inicial es el pagoSemanal.
		 * A ese sueldo se le agregan las prestaciones de la siguiente forma:
		 *    Si el arreglo de instancia de prestaciones tiene un valor de true en la posición i, donde i es:
		 *       0, 6, 7: sumarle al sueldo el PAGO_PRESTACIONES de la misma posición i
		 *       1, 2, 5: sumarle al sueldo el PAGO_PRESTACIONES de la misma posición i multiplicado por el pagoSemanal
		 *       3, 4: sumarle al sueldo el PAGO_PRESTACIONES de la misma posición i multiplicado por diaVacaciones
		 */
		
		return 0.0;
	}
	
    public void setPagoSemanal( double pagoSemanal ) { 
		if (pagoSemanal > 0 && pagoSemanal <= MAXIMO_SUELDO)
			this.pagoSemanal = pagoSemanal;
	}
   
   	public String toString() {
		return "\n***  Empleado de Planta  ***\n" + super.toString() + "\nCon puesto: " + this.getNombrePuesto() +
				"\nPago semanal: " + this.pagoSemanal + "\nSueldo integrado: " + this.sueldo() + "\nPrestaciones: " + this.regresaPrestaciones();
	}
	
	public String getNombrePuesto() {
		return this.nombrePuesto;
	}
	
	public abstract setNombrePuesto() {
		
	}
	
	/*
	 * TODO:
	 * Crear método público abstracto de nombre setNombrePuesto.
	 * El método no regresa nada.
	 * El método recibe una cadena de caracteres con el nombre del puesto (nombrePuesto).
	 */
}