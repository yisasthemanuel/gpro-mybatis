package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class TechProblemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public TechProblemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
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
     * This method corresponds to the database table techproblem
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
     * This method corresponds to the database table techproblem
     *
     * @mbg.generated Sun Jan 07 12:17:47 CET 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table techproblem
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
     * This class corresponds to the database table techproblem
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

        public Criteria andIdTechproblemIsNull() {
            addCriterion("id_techproblem is null");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemIsNotNull() {
            addCriterion("id_techproblem is not null");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemEqualTo(Integer value) {
            addCriterion("id_techproblem =", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemNotEqualTo(Integer value) {
            addCriterion("id_techproblem <>", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemGreaterThan(Integer value) {
            addCriterion("id_techproblem >", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_techproblem >=", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemLessThan(Integer value) {
            addCriterion("id_techproblem <", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemLessThanOrEqualTo(Integer value) {
            addCriterion("id_techproblem <=", value, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemIn(List<Integer> values) {
            addCriterion("id_techproblem in", values, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemNotIn(List<Integer> values) {
            addCriterion("id_techproblem not in", values, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemBetween(Integer value1, Integer value2) {
            addCriterion("id_techproblem between", value1, value2, "idTechproblem");
            return (Criteria) this;
        }

        public Criteria andIdTechproblemNotBetween(Integer value1, Integer value2) {
            addCriterion("id_techproblem not between", value1, value2, "idTechproblem");
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

        public Criteria andTpLapIsNull() {
            addCriterion("tp_lap is null");
            return (Criteria) this;
        }

        public Criteria andTpLapIsNotNull() {
            addCriterion("tp_lap is not null");
            return (Criteria) this;
        }

        public Criteria andTpLapEqualTo(Short value) {
            addCriterion("tp_lap =", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapNotEqualTo(Short value) {
            addCriterion("tp_lap <>", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapGreaterThan(Short value) {
            addCriterion("tp_lap >", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapGreaterThanOrEqualTo(Short value) {
            addCriterion("tp_lap >=", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapLessThan(Short value) {
            addCriterion("tp_lap <", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapLessThanOrEqualTo(Short value) {
            addCriterion("tp_lap <=", value, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapIn(List<Short> values) {
            addCriterion("tp_lap in", values, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapNotIn(List<Short> values) {
            addCriterion("tp_lap not in", values, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapBetween(Short value1, Short value2) {
            addCriterion("tp_lap between", value1, value2, "tpLap");
            return (Criteria) this;
        }

        public Criteria andTpLapNotBetween(Short value1, Short value2) {
            addCriterion("tp_lap not between", value1, value2, "tpLap");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpIsNull() {
            addCriterion("description_tp is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpIsNotNull() {
            addCriterion("description_tp is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpEqualTo(String value) {
            addCriterion("description_tp =", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpNotEqualTo(String value) {
            addCriterion("description_tp <>", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpGreaterThan(String value) {
            addCriterion("description_tp >", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpGreaterThanOrEqualTo(String value) {
            addCriterion("description_tp >=", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpLessThan(String value) {
            addCriterion("description_tp <", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpLessThanOrEqualTo(String value) {
            addCriterion("description_tp <=", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpLike(String value) {
            addCriterion("description_tp like", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpNotLike(String value) {
            addCriterion("description_tp not like", value, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpIn(List<String> values) {
            addCriterion("description_tp in", values, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpNotIn(List<String> values) {
            addCriterion("description_tp not in", values, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpBetween(String value1, String value2) {
            addCriterion("description_tp between", value1, value2, "descriptionTp");
            return (Criteria) this;
        }

        public Criteria andDescriptionTpNotBetween(String value1, String value2) {
            addCriterion("description_tp not between", value1, value2, "descriptionTp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table techproblem
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
     * This class corresponds to the database table techproblem
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