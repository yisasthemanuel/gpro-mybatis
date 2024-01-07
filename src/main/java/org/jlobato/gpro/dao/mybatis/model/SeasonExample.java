package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SeasonExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public SeasonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
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
     * This method corresponds to the database table season
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
     * This method corresponds to the database table season
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table season
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
     * This class corresponds to the database table season
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdSeasonIsNull() {
            addCriterion("id_season is null");
            return (Criteria) this;
        }

        public Criteria andIdSeasonIsNotNull() {
            addCriterion("id_season is not null");
            return (Criteria) this;
        }

        public Criteria andIdSeasonEqualTo(Short value) {
            addCriterion("id_season =", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonNotEqualTo(Short value) {
            addCriterion("id_season <>", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonGreaterThan(Short value) {
            addCriterion("id_season >", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonGreaterThanOrEqualTo(Short value) {
            addCriterion("id_season >=", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonLessThan(Short value) {
            addCriterion("id_season <", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonLessThanOrEqualTo(Short value) {
            addCriterion("id_season <=", value, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonIn(List<Short> values) {
            addCriterion("id_season in", values, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonNotIn(List<Short> values) {
            addCriterion("id_season not in", values, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonBetween(Short value1, Short value2) {
            addCriterion("id_season between", value1, value2, "idSeason");
            return (Criteria) this;
        }

        public Criteria andIdSeasonNotBetween(Short value1, Short value2) {
            addCriterion("id_season not between", value1, value2, "idSeason");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberIsNull() {
            addCriterion("season_number is null");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberIsNotNull() {
            addCriterion("season_number is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberEqualTo(int value) {
            addCriterion("season_number =", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberNotEqualTo(int value) {
            addCriterion("season_number <>", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberGreaterThan(int value) {
            addCriterion("season_number >", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberGreaterThanOrEqualTo(int value) {
            addCriterion("season_number >=", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberLessThan(int value) {
            addCriterion("season_number <", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberLessThanOrEqualTo(int value) {
            addCriterion("season_number <=", value, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberIn(List<Integer> values) {
            addCriterion("season_number in", values, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberNotIn(List<Integer> values) {
            addCriterion("season_number not in", values, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberBetween(int value1, int value2) {
            addCriterion("season_number between", value1, value2, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andSeasonNumberNotBetween(int value1, int value2) {
            addCriterion("season_number not between", value1, value2, "seasonNumber");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameSeasonIsNull() {
            addCriterion("name_season is null");
            return (Criteria) this;
        }

        public Criteria andNameSeasonIsNotNull() {
            addCriterion("name_season is not null");
            return (Criteria) this;
        }

        public Criteria andNameSeasonEqualTo(String value) {
            addCriterion("name_season =", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonNotEqualTo(String value) {
            addCriterion("name_season <>", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonGreaterThan(String value) {
            addCriterion("name_season >", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("name_season >=", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonLessThan(String value) {
            addCriterion("name_season <", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonLessThanOrEqualTo(String value) {
            addCriterion("name_season <=", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonLike(String value) {
            addCriterion("name_season like", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonNotLike(String value) {
            addCriterion("name_season not like", value, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonIn(List<String> values) {
            addCriterion("name_season in", values, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonNotIn(List<String> values) {
            addCriterion("name_season not in", values, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonBetween(String value1, String value2) {
            addCriterion("name_season between", value1, value2, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andNameSeasonNotBetween(String value1, String value2) {
            addCriterion("name_season not between", value1, value2, "nameSeason");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table season
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
     * This class corresponds to the database table season
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