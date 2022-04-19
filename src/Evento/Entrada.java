package Evento;

import java.time.LocalDate;


public class Entrada {
	
	private int valor;
	private boolean estadoEntrada;
	private LocalDate fechaEvento;
	private String nombreEvento;
	private Asiento asiento = new Asiento();
	
	public Entrada() {
	}

	public Entrada(int valor, boolean estadoEntrada, LocalDate fechaEvento, String nombreEvento, Asiento asiento) {
		this.valor = valor;
		this.estadoEntrada = estadoEntrada;
		this.fechaEvento = fechaEvento;
		this.nombreEvento = nombreEvento;
		this.asiento = asiento;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isEstadoEntrada() {
		return estadoEntrada;
	}

	public void setEstadoEntrada(boolean estadoEntrada) {
		this.estadoEntrada = estadoEntrada;
	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getNomEvento() {
		return nombreEvento;
	}

	public void setNomEvento(String nomEvento) {
		this.nombreEvento = nomEvento;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
	
	
	

}
