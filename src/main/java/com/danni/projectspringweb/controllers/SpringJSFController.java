/**
 * 
 */
package com.danni.projectspringweb.controllers;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.danni.projectspringweb.services.SpringService;
/**
 * @author danni
 *controlador de ejemplo para demostrar la integracion de Spring con JSF
 *ocupamos la notacion @ManagedBean "la clase sea considerada como un controlador de JSF"
 *@ViewScope para indicar que la clase de la informacion del controlador sera a nivel de la pantalla 
 */
/*Anotaciones de JSF*/
@ManagedBean
@ViewScoped
public class SpringJSFController {
	// ::::::::::::CREANDO OBJETO SIN SPRING::::::::::::::.
	 //SpringService springService = new SpringServiceImpl();
	
	private String nombreEmpresa;
	/*propiedad de tipo String*/
	private String nombreEmpleado;
	
	// INTEGRACION JSF CON SPRING - UTILIZAREMOS NOTACION @ManagedProperty
	// inyectar el objeto de Spring
	@ManagedProperty("#{springServiceImpl}")
	// se inyecta en un objeto de tipo SpringService
	private SpringService springServiceImpl; /*crear metodos setters and getters*/
	
	
	 /*metodo para inicializar la pantalla de JSF ocupando la notacion @PostConstruct*/
	@PostConstruct
	public void init() {
		//como ocupar el BEAN "springServiceImpl" NOMBRE EMPRESA 
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre); 
		this.nombreEmpresa = nombre;
		
		//NOMBRE EMPLEADO "METODO"
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
		System.out.println(nombreEmpleado);
		/*Inisializo la propiedad */
		this.nombreEmpleado= nombreEmpleado;
		
	}
	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}
	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
}
