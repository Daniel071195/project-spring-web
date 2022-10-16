/**
 * 
 */
package com.danni.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;
import com.danni.projectspringweb.dao.EmpleadoDAO;
/**
 * @author Admin
 *@Repository ara que todas las clases repository sean interpretadas para spring como clases java "patron de diseño DAO"
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// Nombre del empleado
		return "Daniel Castañeda Galindo";
	}
  
}
