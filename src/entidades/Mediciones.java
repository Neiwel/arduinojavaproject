package entidades;

public class Mediciones {
	private String nombre;
	private String tipo;
	private double valor;
	 
	
	// Metodos
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getTipo(String tipo){
		return this.tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public Double getValor(double valor){
		return this.valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Medicion [nombre=" + nombre + ", tipo=" + tipo
				+ ", valor" + valor + "]";
	}
	
}
