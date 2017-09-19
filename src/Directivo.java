public class Directivo extends Planta implements Administrativo{

	private double bonoExtra; 

	public Directivo( String nombre, String apellido, int antiguedad, boolean[] prestaciones, double pagoSemanal, double bono, String nombrePuesto) {
		super( nombre, apellido, antiguedad, pagoSemanal, prestaciones);  
		setBono(bono);
		setNombrePuesto(nombrePuesto);
	}
   
   
	public void setBono( double bono ) { 
		
		
		if (bono >= 0 && bono > BONO_MAXIMO) {
			
			bono = 0;
			
		}else {
			this.bonoExtra = bonoExtra;
		}
	}
   
   
	public double sueldo() { 
		
		
		return  super.sueldo() + bonoExtra;
		
		
	}
   
   public String administrar() {
	   return "Administra los recursos de su departamento";
   }
   
   public String definirAumentos() {
	   return "Define los aumentos de sueldo de sus empleados";
   }
   
   public String reportarLogros() {
	   return "Reporta los logros de su departamento";
   }
   
   	public void setNombrePuesto(String nombre){
		this.nombrePuesto = nombre;
	}
	
   
    public String toString() {
		return "\n\n***  Directivo  ***\n" + super.toString() + "\nCon bono extra de: " + this.bonoExtra;
	}
}