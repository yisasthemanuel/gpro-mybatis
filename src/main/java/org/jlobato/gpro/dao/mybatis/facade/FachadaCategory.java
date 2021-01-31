package org.jlobato.gpro.dao.mybatis.facade;

import java.util.List;

import org.jlobato.gpro.dao.mybatis.mappers.CategoryMapper;
import org.jlobato.gpro.dao.mybatis.model.Category;
import org.jlobato.gpro.dao.mybatis.model.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * The Class FachadaCategory.
 */
@Service
@Transactional
public class FachadaCategory {
	
	/** The category DAO. */
	@Autowired
	private CategoryMapper categoryDAO;
	
	/**
	 * Gets the categories.
	 *
	 * @return the categories
	 */
	public List<Category> getCategories() {
		CategoryExample example = new CategoryExample();
		example.setOrderByClause("lvl_category");
		return categoryDAO.selectByExample(example);
	}
	
	/**
	 * Gets the category by code.
	 *
	 * @param code the code
	 * @return the category by code
	 */
	public Category getCategoryByCode(String code) {
		Category result = null;
		CategoryExample example = new CategoryExample();
		example.createCriteria().andCodeAltCategoryEqualTo(code);
		List<Category> category = categoryDAO.selectByExample(example);
		if (!category.isEmpty()) {
			result = category.get(0);
		}
		
		return result;
	}
	
	/**
	 * Gets the category.
	 *
	 * @param idCategory the id category
	 * @return the category
	 */
	public Category getCategory(Short idCategory) {
		Category result = null;
		CategoryExample example = new CategoryExample();
		example.createCriteria().andIdCategoryEqualTo(idCategory);
		List<Category> category = categoryDAO.selectByExample(example);
		if (!category.isEmpty()) {
			result = category.get(0);
		}
		
		return result;
	}

}
