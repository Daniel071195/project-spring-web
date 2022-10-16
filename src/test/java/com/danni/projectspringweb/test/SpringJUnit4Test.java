/**
 * 
 */
package com.danni.projectspringweb.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.danni.projectspringweb.services.SpringService;
/*** @author danni
 *clase de prueba unitartia con Spring JUnit4
 *NOTA no tiene soporte Spring Test para Junit5
 *@RunWith(SpringRunner.class) "me permitira indicar que se realizaran pruebas unitarias con SPRINg"
 * @ContextConfiguration  con esta notacion podemos indicar la ubicacion aaplicationContext
 * No podemos utilizar la ubicacion del archivo WEB-INF ya que se encuentra fuera del ClassPath
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {
	/*primera prueba utilizando anotaciones */
	@Autowired
	private SpringService springServiceImpl;
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}
}
