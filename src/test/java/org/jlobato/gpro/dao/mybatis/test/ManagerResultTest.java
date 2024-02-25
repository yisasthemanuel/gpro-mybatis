package org.jlobato.gpro.dao.mybatis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.jlobato.gpro.dao.mybatis.facade.FachadaManager;
import org.jlobato.gpro.dao.mybatis.facade.FachadaManagerResult;
import org.jlobato.gpro.dao.mybatis.model.Manager;
import org.jlobato.gpro.dao.mybatis.model.ManagerResult;
import org.jlobato.gpro.dao.mybatis.model.Race;
import org.junit.Test;

/**
 * The Class ManagerResultTest.
 */
public class ManagerResultTest extends MyBatisBaseTest {
	

	/**
	 * Test one.
	 */
	@Test
	public void testOne() {
		//Obtenemos el manager de test
		FachadaManager managerService = contexto.getBean(FachadaManager.class);
		assertNotNull(managerService);
		Manager manager = managerService.getManagerByCode("JESUS");
		//Obtenemos la carrera de test
		Race race = new Race();
		race.withIdRace((short)1);
		race.withIdSeason((short)1);
		assertNotNull(race);
		//Llamamos al servicio
		FachadaManagerResult resultsService = contexto.getBean(FachadaManagerResult.class);
		//Comprobamos que no hay resultado para esa carrera
		assertNull(resultsService.findManagerResult(manager, race));
		resultsService.updateManagerResult(manager, race, null, (short)36);
		//Comprobamos que se ha creado
		ManagerResult result = resultsService.findManagerResult(manager, race); 
		assertNotNull(result);
		//Comprobamos que no hay posición de parrilla de salida
		assertNull(result.getGridPosition());
		//Comprobamos que la posición de carrera es la correcta
		assertEquals(result.getRacePosition(), Short.valueOf((short)36));
		//Ahora cambiamos la posición y ponemos posición de parrilla de salida
		resultsService.updateManagerResult(manager, race, (short)33, (short)39);
		assertEquals(result.getRacePosition(), Short.valueOf((short)39));
		assertEquals(result.getGridPosition(), Short.valueOf((short)33));
		//Borramos
		resultsService.deleteManagerResult(manager, race);
		//Comprobamos que es nulo
		assertNull(resultsService.findManagerResult(manager, race));
	}
	
	/**
	 * Test multiple.
	 */
	@Test
	public void testMultiple() {
		assertNotNull(contexto);
		//Obtenemos el manager de test
		FachadaManager managerService = contexto.getBean(FachadaManager.class);
		assertNotNull(managerService);		
	}

}
