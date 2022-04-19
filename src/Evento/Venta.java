package Evento;

import java.time.LocalDate;



public class Venta {
	
	private LocalDate fechaVenta;
	private Entrada entrada = new Entrada();
	private Cliente cliente = new Cliente();
	
	public Venta() {	
	}
	
	public Venta(LocalDate fechaVenta, Entrada entrada, Cliente cliente) {
		this.fechaVenta = fechaVenta;
		this.entrada = entrada;
		this.cliente = cliente;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	


}
