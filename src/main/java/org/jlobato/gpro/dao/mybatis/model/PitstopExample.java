package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class PitstopExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public PitstopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
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
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
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

        public Criteria andIdPitstopIsNull() {
            addCriterion("id_pitstop is null");
            return (Criteria) this;
        }

        public Criteria andIdPitstopIsNotNull() {
            addCriterion("id_pitstop is not null");
            return (Criteria) this;
        }

        public Criteria andIdPitstopEqualTo(Integer value) {
            addCriterion("id_pitstop =", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopNotEqualTo(Integer value) {
            addCriterion("id_pitstop <>", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopGreaterThan(Integer value) {
            addCriterion("id_pitstop >", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_pitstop >=", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopLessThan(Integer value) {
            addCriterion("id_pitstop <", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopLessThanOrEqualTo(Integer value) {
            addCriterion("id_pitstop <=", value, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopIn(List<Integer> values) {
            addCriterion("id_pitstop in", values, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopNotIn(List<Integer> values) {
            addCriterion("id_pitstop not in", values, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopBetween(Integer value1, Integer value2) {
            addCriterion("id_pitstop between", value1, value2, "idPitstop");
            return (Criteria) this;
        }

        public Criteria andIdPitstopNotBetween(Integer value1, Integer value2) {
            addCriterion("id_pitstop not between", value1, value2, "idPitstop");
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

        public Criteria andPitNoIsNull() {
            addCriterion("pit_no is null");
            return (Criteria) this;
        }

        public Criteria andPitNoIsNotNull() {
            addCriterion("pit_no is not null");
            return (Criteria) this;
        }

        public Criteria andPitNoEqualTo(Short value) {
            addCriterion("pit_no =", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoNotEqualTo(Short value) {
            addCriterion("pit_no <>", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoGreaterThan(Short value) {
            addCriterion("pit_no >", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoGreaterThanOrEqualTo(Short value) {
            addCriterion("pit_no >=", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoLessThan(Short value) {
            addCriterion("pit_no <", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoLessThanOrEqualTo(Short value) {
            addCriterion("pit_no <=", value, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoIn(List<Short> values) {
            addCriterion("pit_no in", values, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoNotIn(List<Short> values) {
            addCriterion("pit_no not in", values, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoBetween(Short value1, Short value2) {
            addCriterion("pit_no between", value1, value2, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitNoNotBetween(Short value1, Short value2) {
            addCriterion("pit_no not between", value1, value2, "pitNo");
            return (Criteria) this;
        }

        public Criteria andPitLapIsNull() {
            addCriterion("pit_lap is null");
            return (Criteria) this;
        }

        public Criteria andPitLapIsNotNull() {
            addCriterion("pit_lap is not null");
            return (Criteria) this;
        }

        public Criteria andPitLapEqualTo(Short value) {
            addCriterion("pit_lap =", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapNotEqualTo(Short value) {
            addCriterion("pit_lap <>", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapGreaterThan(Short value) {
            addCriterion("pit_lap >", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapGreaterThanOrEqualTo(Short value) {
            addCriterion("pit_lap >=", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapLessThan(Short value) {
            addCriterion("pit_lap <", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapLessThanOrEqualTo(Short value) {
            addCriterion("pit_lap <=", value, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapIn(List<Short> values) {
            addCriterion("pit_lap in", values, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapNotIn(List<Short> values) {
            addCriterion("pit_lap not in", values, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapBetween(Short value1, Short value2) {
            addCriterion("pit_lap between", value1, value2, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitLapNotBetween(Short value1, Short value2) {
            addCriterion("pit_lap not between", value1, value2, "pitLap");
            return (Criteria) this;
        }

        public Criteria andPitReasonIsNull() {
            addCriterion("pit_reason is null");
            return (Criteria) this;
        }

        public Criteria andPitReasonIsNotNull() {
            addCriterion("pit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPitReasonEqualTo(String value) {
            addCriterion("pit_reason =", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonNotEqualTo(String value) {
            addCriterion("pit_reason <>", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonGreaterThan(String value) {
            addCriterion("pit_reason >", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("pit_reason >=", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonLessThan(String value) {
            addCriterion("pit_reason <", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonLessThanOrEqualTo(String value) {
            addCriterion("pit_reason <=", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonLike(String value) {
            addCriterion("pit_reason like", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonNotLike(String value) {
            addCriterion("pit_reason not like", value, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonIn(List<String> values) {
            addCriterion("pit_reason in", values, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonNotIn(List<String> values) {
            addCriterion("pit_reason not in", values, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonBetween(String value1, String value2) {
            addCriterion("pit_reason between", value1, value2, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitReasonNotBetween(String value1, String value2) {
            addCriterion("pit_reason not between", value1, value2, "pitReason");
            return (Criteria) this;
        }

        public Criteria andPitTyresIsNull() {
            addCriterion("pit_tyres is null");
            return (Criteria) this;
        }

        public Criteria andPitTyresIsNotNull() {
            addCriterion("pit_tyres is not null");
            return (Criteria) this;
        }

        public Criteria andPitTyresEqualTo(Short value) {
            addCriterion("pit_tyres =", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresNotEqualTo(Short value) {
            addCriterion("pit_tyres <>", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresGreaterThan(Short value) {
            addCriterion("pit_tyres >", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresGreaterThanOrEqualTo(Short value) {
            addCriterion("pit_tyres >=", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresLessThan(Short value) {
            addCriterion("pit_tyres <", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresLessThanOrEqualTo(Short value) {
            addCriterion("pit_tyres <=", value, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresIn(List<Short> values) {
            addCriterion("pit_tyres in", values, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresNotIn(List<Short> values) {
            addCriterion("pit_tyres not in", values, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresBetween(Short value1, Short value2) {
            addCriterion("pit_tyres between", value1, value2, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitTyresNotBetween(Short value1, Short value2) {
            addCriterion("pit_tyres not between", value1, value2, "pitTyres");
            return (Criteria) this;
        }

        public Criteria andPitFuelIsNull() {
            addCriterion("pit_fuel is null");
            return (Criteria) this;
        }

        public Criteria andPitFuelIsNotNull() {
            addCriterion("pit_fuel is not null");
            return (Criteria) this;
        }

        public Criteria andPitFuelEqualTo(Short value) {
            addCriterion("pit_fuel =", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelNotEqualTo(Short value) {
            addCriterion("pit_fuel <>", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelGreaterThan(Short value) {
            addCriterion("pit_fuel >", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelGreaterThanOrEqualTo(Short value) {
            addCriterion("pit_fuel >=", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelLessThan(Short value) {
            addCriterion("pit_fuel <", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelLessThanOrEqualTo(Short value) {
            addCriterion("pit_fuel <=", value, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelIn(List<Short> values) {
            addCriterion("pit_fuel in", values, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelNotIn(List<Short> values) {
            addCriterion("pit_fuel not in", values, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelBetween(Short value1, Short value2) {
            addCriterion("pit_fuel between", value1, value2, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitFuelNotBetween(Short value1, Short value2) {
            addCriterion("pit_fuel not between", value1, value2, "pitFuel");
            return (Criteria) this;
        }

        public Criteria andPitRefillIsNull() {
            addCriterion("pit_refill is null");
            return (Criteria) this;
        }

        public Criteria andPitRefillIsNotNull() {
            addCriterion("pit_refill is not null");
            return (Criteria) this;
        }

        public Criteria andPitRefillEqualTo(Short value) {
            addCriterion("pit_refill =", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillNotEqualTo(Short value) {
            addCriterion("pit_refill <>", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillGreaterThan(Short value) {
            addCriterion("pit_refill >", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillGreaterThanOrEqualTo(Short value) {
            addCriterion("pit_refill >=", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillLessThan(Short value) {
            addCriterion("pit_refill <", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillLessThanOrEqualTo(Short value) {
            addCriterion("pit_refill <=", value, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillIn(List<Short> values) {
            addCriterion("pit_refill in", values, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillNotIn(List<Short> values) {
            addCriterion("pit_refill not in", values, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillBetween(Short value1, Short value2) {
            addCriterion("pit_refill between", value1, value2, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitRefillNotBetween(Short value1, Short value2) {
            addCriterion("pit_refill not between", value1, value2, "pitRefill");
            return (Criteria) this;
        }

        public Criteria andPitTimeIsNull() {
            addCriterion("pit_time is null");
            return (Criteria) this;
        }

        public Criteria andPitTimeIsNotNull() {
            addCriterion("pit_time is not null");
            return (Criteria) this;
        }

        public Criteria andPitTimeEqualTo(Integer value) {
            addCriterion("pit_time =", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeNotEqualTo(Integer value) {
            addCriterion("pit_time <>", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeGreaterThan(Integer value) {
            addCriterion("pit_time >", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pit_time >=", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeLessThan(Integer value) {
            addCriterion("pit_time <", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pit_time <=", value, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeIn(List<Integer> values) {
            addCriterion("pit_time in", values, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeNotIn(List<Integer> values) {
            addCriterion("pit_time not in", values, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeBetween(Integer value1, Integer value2) {
            addCriterion("pit_time between", value1, value2, "pitTime");
            return (Criteria) this;
        }

        public Criteria andPitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pit_time not between", value1, value2, "pitTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pitstop
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 19 19:30:10 CEST 2024
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pitstop
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
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