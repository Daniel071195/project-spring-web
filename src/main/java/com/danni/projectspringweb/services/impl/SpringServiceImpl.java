/**
 * 
 */
package com.danni.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danni.projectspringweb.dao.EmpleadoDAO;
import com.danni.projectspringweb.services.SpringService;
/**
 * @author Admin
 *@Service " va a generar el bean de la clase SpringServiceIMPl para no agregarlo en applicationContext
 *@Service spring genera un ogjeto de la clase, pero como objeto logico "logica de negocio"
 *Reglas de negocio  
 */
@Service
public class SpringServiceImpl implements SpringService {
	/*implementacion repository*/
	/*@Autowired = para poder inyectar un objeto de spring de una clase a otra clase */
	@Autowired
	/*Generar el objeto de implementacion 
	 * "EmpleadoDAOImpl" nombre de la instancia a partir de las clases no de interfaces
	 * "EmpleadoDAO" Nombre de la interface  */
	private EmpleadoDAO empleadoDAOImpl;
    /*implemento SpringServiceImpl*/
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}
	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado(); 
	}
}
