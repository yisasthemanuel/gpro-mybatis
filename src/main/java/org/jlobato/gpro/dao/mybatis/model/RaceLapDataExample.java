package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class RaceLapDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public RaceLapDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdRacelapdataIsNull() {
            addCriterion("id_racelapdata is null");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataIsNotNull() {
            addCriterion("id_racelapdata is not null");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataEqualTo(Integer value) {
            addCriterion("id_racelapdata =", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataNotEqualTo(Integer value) {
            addCriterion("id_racelapdata <>", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataGreaterThan(Integer value) {
            addCriterion("id_racelapdata >", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_racelapdata >=", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataLessThan(Integer value) {
            addCriterion("id_racelapdata <", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataLessThanOrEqualTo(Integer value) {
            addCriterion("id_racelapdata <=", value, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataIn(List<Integer> values) {
            addCriterion("id_racelapdata in", values, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataNotIn(List<Integer> values) {
            addCriterion("id_racelapdata not in", values, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataBetween(Integer value1, Integer value2) {
            addCriterion("id_racelapdata between", value1, value2, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacelapdataNotBetween(Integer value1, Integer value2) {
            addCriterion("id_racelapdata not between", value1, value2, "idRacelapdata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataIsNull() {
            addCriterion("id_racedata is null");
            return (Criteria) this;
        }

        public Criteria andIdRacedataIsNotNull() {
            addCriterion("id_racedata is not null");
            return (Criteria) this;
        }

        public Criteria andIdRacedataEqualTo(Integer value) {
            addCriterion("id_racedata =", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataNotEqualTo(Integer value) {
            addCriterion("id_racedata <>", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataGreaterThan(Integer value) {
            addCriterion("id_racedata >", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_racedata >=", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataLessThan(Integer value) {
            addCriterion("id_racedata <", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataLessThanOrEqualTo(Integer value) {
            addCriterion("id_racedata <=", value, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataIn(List<Integer> values) {
            addCriterion("id_racedata in", values, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataNotIn(List<Integer> values) {
            addCriterion("id_racedata not in", values, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataBetween(Integer value1, Integer value2) {
            addCriterion("id_racedata between", value1, value2, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andIdRacedataNotBetween(Integer value1, Integer value2) {
            addCriterion("id_racedata not between", value1, value2, "idRacedata");
            return (Criteria) this;
        }

        public Criteria andLapNoIsNull() {
            addCriterion("lap_no is null");
            return (Criteria) this;
        }

        public Criteria andLapNoIsNotNull() {
            addCriterion("lap_no is not null");
            return (Criteria) this;
        }

        public Criteria andLapNoEqualTo(Short value) {
            addCriterion("lap_no =", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoNotEqualTo(Short value) {
            addCriterion("lap_no <>", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoGreaterThan(Short value) {
            addCriterion("lap_no >", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoGreaterThanOrEqualTo(Short value) {
            addCriterion("lap_no >=", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoLessThan(Short value) {
            addCriterion("lap_no <", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoLessThanOrEqualTo(Short value) {
            addCriterion("lap_no <=", value, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoIn(List<Short> values) {
            addCriterion("lap_no in", values, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoNotIn(List<Short> values) {
            addCriterion("lap_no not in", values, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoBetween(Short value1, Short value2) {
            addCriterion("lap_no between", value1, value2, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapNoNotBetween(Short value1, Short value2) {
            addCriterion("lap_no not between", value1, value2, "lapNo");
            return (Criteria) this;
        }

        public Criteria andLapTimeIsNull() {
            addCriterion("lap_time is null");
            return (Criteria) this;
        }

        public Criteria andLapTimeIsNotNull() {
            addCriterion("lap_time is not null");
            return (Criteria) this;
        }

        public Criteria andLapTimeEqualTo(Integer value) {
            addCriterion("lap_time =", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeNotEqualTo(Integer value) {
            addCriterion("lap_time <>", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeGreaterThan(Integer value) {
            addCriterion("lap_time >", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lap_time >=", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeLessThan(Integer value) {
            addCriterion("lap_time <", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeLessThanOrEqualTo(Integer value) {
            addCriterion("lap_time <=", value, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeIn(List<Integer> values) {
            addCriterion("lap_time in", values, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeNotIn(List<Integer> values) {
            addCriterion("lap_time not in", values, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeBetween(Integer value1, Integer value2) {
            addCriterion("lap_time between", value1, value2, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lap_time not between", value1, value2, "lapTime");
            return (Criteria) this;
        }

        public Criteria andLapPositionIsNull() {
            addCriterion("lap_position is null");
            return (Criteria) this;
        }

        public Criteria andLapPositionIsNotNull() {
            addCriterion("lap_position is not null");
            return (Criteria) this;
        }

        public Criteria andLapPositionEqualTo(Short value) {
            addCriterion("lap_position =", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionNotEqualTo(Short value) {
            addCriterion("lap_position <>", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionGreaterThan(Short value) {
            addCriterion("lap_position >", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionGreaterThanOrEqualTo(Short value) {
            addCriterion("lap_position >=", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionLessThan(Short value) {
            addCriterion("lap_position <", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionLessThanOrEqualTo(Short value) {
            addCriterion("lap_position <=", value, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionIn(List<Short> values) {
            addCriterion("lap_position in", values, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionNotIn(List<Short> values) {
            addCriterion("lap_position not in", values, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionBetween(Short value1, Short value2) {
            addCriterion("lap_position between", value1, value2, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andLapPositionNotBetween(Short value1, Short value2) {
            addCriterion("lap_position not between", value1, value2, "lapPosition");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundIsNull() {
            addCriterion("id_tyrecompound is null");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundIsNotNull() {
            addCriterion("id_tyrecompound is not null");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundEqualTo(Integer value) {
            addCriterion("id_tyrecompound =", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundNotEqualTo(Integer value) {
            addCriterion("id_tyrecompound <>", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundGreaterThan(Integer value) {
            addCriterion("id_tyrecompound >", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tyrecompound >=", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundLessThan(Integer value) {
            addCriterion("id_tyrecompound <", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundLessThanOrEqualTo(Integer value) {
            addCriterion("id_tyrecompound <=", value, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundIn(List<Integer> values) {
            addCriterion("id_tyrecompound in", values, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundNotIn(List<Integer> values) {
            addCriterion("id_tyrecompound not in", values, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundBetween(Integer value1, Integer value2) {
            addCriterion("id_tyrecompound between", value1, value2, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdTyrecompoundNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tyrecompound not between", value1, value2, "idTyrecompound");
            return (Criteria) this;
        }

        public Criteria andIdWeatherIsNull() {
            addCriterion("id_weather is null");
            return (Criteria) this;
        }

        public Criteria andIdWeatherIsNotNull() {
            addCriterion("id_weather is not null");
            return (Criteria) this;
        }

        public Criteria andIdWeatherEqualTo(Integer value) {
            addCriterion("id_weather =", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherNotEqualTo(Integer value) {
            addCriterion("id_weather <>", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherGreaterThan(Integer value) {
            addCriterion("id_weather >", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_weather >=", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherLessThan(Integer value) {
            addCriterion("id_weather <", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherLessThanOrEqualTo(Integer value) {
            addCriterion("id_weather <=", value, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherIn(List<Integer> values) {
            addCriterion("id_weather in", values, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherNotIn(List<Integer> values) {
            addCriterion("id_weather not in", values, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherBetween(Integer value1, Integer value2) {
            addCriterion("id_weather between", value1, value2, "idWeather");
            return (Criteria) this;
        }

        public Criteria andIdWeatherNotBetween(Integer value1, Integer value2) {
            addCriterion("id_weather not between", value1, value2, "idWeather");
            return (Criteria) this;
        }

        public Criteria andLapTempIsNull() {
            addCriterion("lap_temp is null");
            return (Criteria) this;
        }

        public Criteria andLapTempIsNotNull() {
            addCriterion("lap_temp is not null");
            return (Criteria) this;
        }

        public Criteria andLapTempEqualTo(Short value) {
            addCriterion("lap_temp =", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempNotEqualTo(Short value) {
            addCriterion("lap_temp <>", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempGreaterThan(Short value) {
            addCriterion("lap_temp >", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempGreaterThanOrEqualTo(Short value) {
            addCriterion("lap_temp >=", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempLessThan(Short value) {
            addCriterion("lap_temp <", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempLessThanOrEqualTo(Short value) {
            addCriterion("lap_temp <=", value, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempIn(List<Short> values) {
            addCriterion("lap_temp in", values, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempNotIn(List<Short> values) {
            addCriterion("lap_temp not in", values, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempBetween(Short value1, Short value2) {
            addCriterion("lap_temp between", value1, value2, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapTempNotBetween(Short value1, Short value2) {
            addCriterion("lap_temp not between", value1, value2, "lapTemp");
            return (Criteria) this;
        }

        public Criteria andLapHumidityIsNull() {
            addCriterion("lap_humidity is null");
            return (Criteria) this;
        }

        public Criteria andLapHumidityIsNotNull() {
            addCriterion("lap_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andLapHumidityEqualTo(Short value) {
            addCriterion("lap_humidity =", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityNotEqualTo(Short value) {
            addCriterion("lap_humidity <>", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityGreaterThan(Short value) {
            addCriterion("lap_humidity >", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityGreaterThanOrEqualTo(Short value) {
            addCriterion("lap_humidity >=", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityLessThan(Short value) {
            addCriterion("lap_humidity <", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityLessThanOrEqualTo(Short value) {
            addCriterion("lap_humidity <=", value, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityIn(List<Short> values) {
            addCriterion("lap_humidity in", values, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityNotIn(List<Short> values) {
            addCriterion("lap_humidity not in", values, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityBetween(Short value1, Short value2) {
            addCriterion("lap_humidity between", value1, value2, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapHumidityNotBetween(Short value1, Short value2) {
            addCriterion("lap_humidity not between", value1, value2, "lapHumidity");
            return (Criteria) this;
        }

        public Criteria andLapEventsIsNull() {
            addCriterion("lap_events is null");
            return (Criteria) this;
        }

        public Criteria andLapEventsIsNotNull() {
            addCriterion("lap_events is not null");
            return (Criteria) this;
        }

        public Criteria andLapEventsEqualTo(String value) {
            addCriterion("lap_events =", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsNotEqualTo(String value) {
            addCriterion("lap_events <>", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsGreaterThan(String value) {
            addCriterion("lap_events >", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsGreaterThanOrEqualTo(String value) {
            addCriterion("lap_events >=", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsLessThan(String value) {
            addCriterion("lap_events <", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsLessThanOrEqualTo(String value) {
            addCriterion("lap_events <=", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsLike(String value) {
            addCriterion("lap_events like", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsNotLike(String value) {
            addCriterion("lap_events not like", value, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsIn(List<String> values) {
            addCriterion("lap_events in", values, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsNotIn(List<String> values) {
            addCriterion("lap_events not in", values, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsBetween(String value1, String value2) {
            addCriterion("lap_events between", value1, value2, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andLapEventsNotBetween(String value1, String value2) {
            addCriterion("lap_events not between", value1, value2, "lapEvents");
            return (Criteria) this;
        }

        public Criteria andWornTyresIsNull() {
            addCriterion("worn_tyres is null");
            return (Criteria) this;
        }

        public Criteria andWornTyresIsNotNull() {
            addCriterion("worn_tyres is not null");
            return (Criteria) this;
        }

        public Criteria andWornTyresEqualTo(Boolean value) {
            addCriterion("worn_tyres =", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresNotEqualTo(Boolean value) {
            addCriterion("worn_tyres <>", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresGreaterThan(Boolean value) {
            addCriterion("worn_tyres >", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresGreaterThanOrEqualTo(Boolean value) {
            addCriterion("worn_tyres >=", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresLessThan(Boolean value) {
            addCriterion("worn_tyres <", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresLessThanOrEqualTo(Boolean value) {
            addCriterion("worn_tyres <=", value, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresIn(List<Boolean> values) {
            addCriterion("worn_tyres in", values, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresNotIn(List<Boolean> values) {
            addCriterion("worn_tyres not in", values, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresBetween(Boolean value1, Boolean value2) {
            addCriterion("worn_tyres between", value1, value2, "wornTyres");
            return (Criteria) this;
        }

        public Criteria andWornTyresNotBetween(Boolean value1, Boolean value2) {
            addCriterion("worn_tyres not between", value1, value2, "wornTyres");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table racelapdata
     *
     * @mbg.generated do_not_delete_during_merge Sun Jan 07 12:17:47 CET 2024
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table racelapdata
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}