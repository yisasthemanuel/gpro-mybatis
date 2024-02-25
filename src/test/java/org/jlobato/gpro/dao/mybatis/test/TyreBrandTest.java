package org.jlobato.gpro.dao.mybatis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.util.IOUtils;
import org.jlobato.gpro.dao.mybatis.facade.FachadaTyres;
import org.jlobato.gpro.dao.mybatis.model.TyreBrand;
import org.junit.Test;

/**
 * The Class TyreBrandTest.
 */
public class TyreBrandTest extends MyBatisBaseTest {

	/**
	 * Test dunnos.
	 */
	@Test
	public void testDunnos() {
		testTyres("DU", "Dunnolop", "Dunno");
	}

	/**
	 * Test pipis.
	 */
	@Test
	public void testPipis() {
		testTyres("PI", "Pipirelli", "Pipis");
	}

	/**
	 * Test yokos.
	 */
	@Test
	public void testYokos() {
		testTyres("YO", "Yokomama", "Yokos");
	}

	/**
	 * Test contis.
	 */
	@Test
	public void testContis() {
		testTyres("CO", "Contimental", "Contis");
	}

	/**
	 * Test avonns.
	 */
	@Test
	public void testAvonns() {
		testTyres("AV", "Avonn", "Avonns");
	}

	/**
	 * Test badyears.
	 */
	@Test
	public void testBadyears() {
		testTyres("BY", "Badyear", "Badyears");
	}

	/**
	 * Test hans.
	 */
	@Test
	public void testHans() {
		testTyres("HA", "Hancock", "Hans");
	}

	/**
	 * Test michis.
	 */
	@Test
	public void testMichis() {
		testTyres("MI", "Michelini", "Michis");
	}

	/**
	 * Test bridges.
	 */
	@Test
	public void testBridges() {
		testTyres("BR", "Bridgerock", "Bridges");
	}

	/**
	 * Test tyres.
	 *
	 * @param code the code
	 * @param longName the long name
	 * @param shortName the short name
	 */
	private void testTyres(String code, String longName, String shortName) {
		FachadaTyres fachadaRepos = contexto.getBean(FachadaTyres.class);
		TyreBrand brand = fachadaRepos.getTyreBrand(code);
		if (brand == null) {
			fachadaRepos.addTyreBrand(longName, code);
		}
		brand = fachadaRepos.getTyreBrand(code);
		assertNotNull(brand);
		assertEquals(code, brand.getTyreBrandCode());
		assertEquals(longName, brand.getTyreBrandName());
		
		fachadaRepos.updateTyreBrand(brand.withTyreBrandName(shortName));
		brand = fachadaRepos.getTyreBrand(code);
		assertEquals(shortName, brand.getTyreBrandName());
		
		fachadaRepos.updateTyreBrand(brand.withTyreBrandName(longName));
		assertEquals(longName, brand.getTyreBrandName());
		assertNull(fachadaRepos.getTyreBrandIcon(brand.getIdTyreBrand()));
	}
	
	/**
	 * Test icons.
	 */
	@Test
	public void testIcons() {
		testIcon("/org/jlobato/gpro/imgs/tyres/avonn.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/pipirelli.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/dunnolop.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/yokomama.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/hancock.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/michelini.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/contimental.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/bridgerock.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/badyear.gif");
	}

	/**
	 * Test images.
	 */
	@Test
	public void testImages() {
		testIcon("/org/jlobato/gpro/imgs/tyres/avonn_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/pipirelli_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/dunnolop_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/yokomama_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/hancock_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/michelini_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/contimental_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/bridgerock_img.gif");
		testIcon("/org/jlobato/gpro/imgs/tyres/badyear_img.gif");
	}

	/**
	 * Test icon.
	 *
	 * @param path the path
	 */
	private void testIcon(String path) {
		try (InputStream is = getClass().getResourceAsStream(path)) {
			byte[] icon = IOUtils.toByteArray(is);
			assertNotNull(icon);
		} catch (IOException e) {
			fail("IOException " + e.getMessage());
		}
		
	}
}
