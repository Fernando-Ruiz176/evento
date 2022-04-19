package Evento;

public class Asiento {
	
	private int asiento;
	private boolean estado;
	
	public Asiento(int asiento, boolean estado) {
		this.asiento = asiento;
		this.estado = estado;
	}
	public Asiento() {
		
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
