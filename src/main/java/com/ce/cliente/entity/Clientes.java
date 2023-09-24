package com.ce.cliente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "cliente")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idcliente")
	private int idcliente;
	@Column (name ="primernombre")
	private String primernombre;
	@Column(name = "segundonombre")
	private String segundonombre;
	@Column (name = "otronombre")
	private String otronombre;
	@Column (name="primerapellido")
	private String primerapellido;
	@Column (name = "segundoapellido")
	private String segundoapellido;
	@Column (name = "otroapellido")
	private String otroapellido;
	@Column (name = "genero")
	private String genero;
	@Column (name = "fechanacimiento")
	private String fechanacimiento;
	@Column (name ="segmento")
	private String segmento;
	@Column (name= "sueldo")
	private String sueldo;
	@Column (name= "dpi") 
	private String dpi;
	@Column (name ="correo")
	private String correo;
	@Column (name = "telefono" )
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getOtronombre() {
		return otronombre;
	}
	public void setOtronombre(String otronombre) {
		this.otronombre = otronombre;
	}
	public String getPrimerapellido() {
		return primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	public String getOtroapellido() {
		return otroapellido;
	}
	public void setOtroapellido(String otroapellido) {
		this.otroapellido = otroapellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getSueldo() {
		return sueldo;
	}
	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
	public String getDpi() {
		return dpi;
	}
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
