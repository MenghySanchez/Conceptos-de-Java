package com.cmc.entidades;

public class Cliente {
	private String nombre;
	private String cedula;
	private int edad;
	private boolean estado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Cliente(){}
	
	public Cliente(String nombre, String cedula, int edad, boolean estado) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.estado = estado;
	}
	
	


}
