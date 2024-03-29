package org.jlobato.gpro.dao.mybatis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.jlobato.gpro.dao.mybatis.facade.FachadaCategory;
import org.jlobato.gpro.dao.mybatis.facade.FachadaManager;
import org.jlobato.gpro.dao.mybatis.facade.FachadaTyres;
import org.jlobato.gpro.dao.mybatis.model.Manager;
import org.jlobato.gpro.dao.mybatis.model.Race;
import org.jlobato.gpro.dao.mybatis.model.Team;
import org.junit.Test;

/**
 * The Class ManagerHistoryTest.
 */
public class ManagerHistoryTest extends MyBatisBaseTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		//Obtenemos el manager de test
		FachadaManager managerService = contexto.getBean(FachadaManager.class);
		FachadaCategory categoryService = contexto.getBean(FachadaCategory.class);
		FachadaTyres tyresService = contexto.getBean(FachadaTyres.class);
		assertNotNull(managerService);
		assertNotNull(categoryService);
		assertNotNull(tyresService);
		managerService.updateManagerHistory("JESUS", Short.valueOf((short)16), categoryService.getCategoryByAltCode("R").getIdCategory().shortValue(), Short.valueOf((short)79), null, null, null, null, null, null, null, null, null, null, null);
		
		//TODO - Meter código de borrado
	}
	
	/**
	 * Test history.
	 */
	@Test
	public void testHistory() {
		FachadaManager managerServices = contexto.getBean(FachadaManager.class);
		assertEquals(0, getManagers(managerServices, 1, 22, 17).size());
		assertEquals(1, getManagers(managerServices, 1, 23, 1).size());
		assertEquals(1, getManagers(managerServices, 1, 25, 1).size());
		assertEquals(3, getManagers(managerServices, 1, 28, 1).size());
		assertEquals(4, getManagers(managerServices, 1, 30, 1).size());
		assertEquals(10, getManagers(managerServices, 1, 70, 1).size());
		assertEquals(10, getManagers(managerServices, 1, 60, 1).size());
		assertEquals(10, getManagers(managerServices, 1, 62, 1).size());
		assertEquals(9, getManagers(managerServices, 1, 61, 14).size());
		assertEquals(10, getManagers(managerServices, 1, 61, 13).size());
		assertEquals(9, getManagers(managerServices, 1, 66, 1).size());
		assertEquals(10, getManagers(managerServices, 1, 66, 7).size());
		assertEquals(9, getManagers(managerServices, 1, 66, 6).size());
		
	}
	
	
	/**
	 * Gets the managers.
	 *
	 * @param fManager the f manager
	 * @param idTeam the id team
	 * @param idSeason the id season
	 * @param idRace the id race
	 * @return the managers
	 */
	private List<Manager> getManagers(FachadaManager fManager, int idTeam, int idSeason, int idRace) {
		Team team = new Team().withIdTeam((short)idTeam);
		Race race = new Race();
		race.withIdSeason((short)idSeason).withIdRace((short)idRace);
		
		return fManager.getManagers(team, race);
	}

}
