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
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    long countByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int deleteByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int deleteByPrimaryKey(Integer idWeather);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int insert(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int insertSelective(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    List<Weather> selectByExampleWithBLOBs(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    List<Weather> selectByExample(WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    Weather selectByPrimaryKey(Integer idWeather);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByExampleSelective(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByExample(@Param("record") Weather record, @Param("example") WeatherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByPrimaryKeySelective(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByPrimaryKeyWithBLOBs(Weather record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    int updateByPrimaryKey(Weather record);
}