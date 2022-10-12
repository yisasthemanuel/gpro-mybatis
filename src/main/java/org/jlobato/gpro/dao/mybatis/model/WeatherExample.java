package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public WeatherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
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
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
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

        public Criteria andCodWeatherIsNull() {
            addCriterion("cod_weather is null");
            return (Criteria) this;
        }

        public Criteria andCodWeatherIsNotNull() {
            addCriterion("cod_weather is not null");
            return (Criteria) this;
        }

        public Criteria andCodWeatherEqualTo(String value) {
            addCriterion("cod_weather =", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherNotEqualTo(String value) {
            addCriterion("cod_weather <>", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherGreaterThan(String value) {
            addCriterion("cod_weather >", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("cod_weather >=", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherLessThan(String value) {
            addCriterion("cod_weather <", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherLessThanOrEqualTo(String value) {
            addCriterion("cod_weather <=", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherLike(String value) {
            addCriterion("cod_weather like", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherNotLike(String value) {
            addCriterion("cod_weather not like", value, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherIn(List<String> values) {
            addCriterion("cod_weather in", values, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherNotIn(List<String> values) {
            addCriterion("cod_weather not in", values, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherBetween(String value1, String value2) {
            addCriterion("cod_weather between", value1, value2, "codWeather");
            return (Criteria) this;
        }

        public Criteria andCodWeatherNotBetween(String value1, String value2) {
            addCriterion("cod_weather not between", value1, value2, "codWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherIsNull() {
            addCriterion("description_weather is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherIsNotNull() {
            addCriterion("description_weather is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherEqualTo(String value) {
            addCriterion("description_weather =", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherNotEqualTo(String value) {
            addCriterion("description_weather <>", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherGreaterThan(String value) {
            addCriterion("description_weather >", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("description_weather >=", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherLessThan(String value) {
            addCriterion("description_weather <", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherLessThanOrEqualTo(String value) {
            addCriterion("description_weather <=", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherLike(String value) {
            addCriterion("description_weather like", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherNotLike(String value) {
            addCriterion("description_weather not like", value, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherIn(List<String> values) {
            addCriterion("description_weather in", values, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherNotIn(List<String> values) {
            addCriterion("description_weather not in", values, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherBetween(String value1, String value2) {
            addCriterion("description_weather between", value1, value2, "descriptionWeather");
            return (Criteria) this;
        }

        public Criteria andDescriptionWeatherNotBetween(String value1, String value2) {
            addCriterion("description_weather not between", value1, value2, "descriptionWeather");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table weather
     *
     * @mbg.generated do_not_delete_during_merge Sun May 16 18:22:26 CEST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table weather
     *
     * @mbg.generated Sun May 16 18:22:26 CEST 2021
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