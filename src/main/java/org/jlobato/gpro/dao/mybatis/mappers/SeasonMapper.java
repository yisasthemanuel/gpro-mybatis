package org.jlobato.gpro.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jlobato.gpro.dao.mybatis.model.Season;
import org.jlobato.gpro.dao.mybatis.model.SeasonExample;

public interface SeasonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    long countByExample(SeasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int deleteByExample(SeasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int deleteByPrimaryKey(Short idSeason);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int insert(Season record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int insertSelective(Season record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    List<Season> selectByExample(SeasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    Season selectByPrimaryKey(Short idSeason);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int updateByExampleSelective(@Param("record") Season record, @Param("example") SeasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int updateByExample(@Param("record") Season record, @Param("example") SeasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int updateByPrimaryKeySelective(Season record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    int updateByPrimaryKey(Season record);
}