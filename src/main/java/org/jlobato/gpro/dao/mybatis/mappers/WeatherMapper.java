package org.jlobato.gpro.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jlobato.gpro.dao.mybatis.model.Weather;
import org.jlobato.gpro.dao.mybatis.model.WeatherExample;

public interface WeatherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    long countByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int deleteByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int deleteByPrimaryKey(Integer idWeather);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int insert(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int insertSelective(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    List<Weather> selectByExampleWithBLOBs(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    List<Weather> selectByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    Weather selectByPrimaryKey(Integer idWeather);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByExampleSelective(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByExample(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByPrimaryKeySelective(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByPrimaryKeyWithBLOBs(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun Oct 16 14:56:04 CEST 2022
     */
    int updateByPrimaryKey(Weather record);
}