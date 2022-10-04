package com.example.demo.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class Ordenes {
	private static final long serialVersionUID = 1L;
    private String Cantidad;
	private String Orden;
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	public String getOrden() {
		return Orden;
	}
	public void setOrden(String orden) {
		Orden = orden;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
