package org.jlobato.gpro.dao.mybatis.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

/**
 * The Class MyBatisBaseTest.
 */
public class MyBatisBaseTest {
	
	/** The contexto. */
	protected ClassPathXmlApplicationContext contexto = null;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		//Cargamos el contexto spring (el mismo contexto que la aplicación web)
		contexto = new ClassPathXmlApplicationContext("/spring-applicationContext.xml");
		
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		contexto.close();
	}
	
}
