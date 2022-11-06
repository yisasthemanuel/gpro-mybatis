package org.jlobato.gpro.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jlobato.gpro.dao.mybatis.model.TechProblem;
import org.jlobato.gpro.dao.mybatis.model.TechProblemExample;

public interface TechProblemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    long countByExample(TechProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int deleteByExample(TechProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int deleteByPrimaryKey(Integer idTechproblem);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int insert(TechProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int insertSelective(TechProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    List<TechProblem> selectByExample(TechProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    TechProblem selectByPrimaryKey(Integer idTechproblem);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByExampleSelective(@Param("record") TechProblem record, @Param("example") TechProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByExample(@Param("record") TechProblem record, @Param("example") TechProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByPrimaryKeySelective(TechProblem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Nov 06 02:38:04 CET 2022
     */
    int updateByPrimaryKey(TechProblem record);
}