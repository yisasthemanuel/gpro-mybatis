package org.jlobato.gpro.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public ManagerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
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
     * This method corresponds to the database table manager
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
     * This method corresponds to the database table manager
     *
     * @mbg.generated Sat Oct 19 19:30:10 CEST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
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
     * This class corresponds to the database table manager
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

        public Criteria andIdManagerIsNull() {
            addCriterion("id_manager is null");
            return (Criteria) this;
        }

        public Criteria andIdManagerIsNotNull() {
            addCriterion("id_manager is not null");
            return (Criteria) this;
        }

        public Criteria andIdManagerEqualTo(Short value) {
            addCriterion("id_manager =", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerNotEqualTo(Short value) {
            addCriterion("id_manager <>", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerGreaterThan(Short value) {
            addCriterion("id_manager >", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerGreaterThanOrEqualTo(Short value) {
            addCriterion("id_manager >=", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerLessThan(Short value) {
            addCriterion("id_manager <", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerLessThanOrEqualTo(Short value) {
            addCriterion("id_manager <=", value, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerIn(List<Short> values) {
            addCriterion("id_manager in", values, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerNotIn(List<Short> values) {
            addCriterion("id_manager not in", values, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerBetween(Short value1, Short value2) {
            addCriterion("id_manager between", value1, value2, "idManager");
            return (Criteria) this;
        }

        public Criteria andIdManagerNotBetween(Short value1, Short value2) {
            addCriterion("id_manager not between", value1, value2, "idManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerIsNull() {
            addCriterion("code_manager is null");
            return (Criteria) this;
        }

        public Criteria andCodeManagerIsNotNull() {
            addCriterion("code_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCodeManagerEqualTo(String value) {
            addCriterion("code_manager =", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerNotEqualTo(String value) {
            addCriterion("code_manager <>", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerGreaterThan(String value) {
            addCriterion("code_manager >", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerGreaterThanOrEqualTo(String value) {
            addCriterion("code_manager >=", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerLessThan(String value) {
            addCriterion("code_manager <", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerLessThanOrEqualTo(String value) {
            addCriterion("code_manager <=", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerLike(String value) {
            addCriterion("code_manager like", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerNotLike(String value) {
            addCriterion("code_manager not like", value, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerIn(List<String> values) {
            addCriterion("code_manager in", values, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerNotIn(List<String> values) {
            addCriterion("code_manager not in", values, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerBetween(String value1, String value2) {
            addCriterion("code_manager between", value1, value2, "codeManager");
            return (Criteria) this;
        }

        public Criteria andCodeManagerNotBetween(String value1, String value2) {
            addCriterion("code_manager not between", value1, value2, "codeManager");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("last_name =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("last_name >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("last_name <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("last_name like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("last_name not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("last_name in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andAvatarPathIsNull() {
            addCriterion("avatar_path is null");
            return (Criteria) this;
        }

        public Criteria andAvatarPathIsNotNull() {
            addCriterion("avatar_path is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarPathEqualTo(String value) {
            addCriterion("avatar_path =", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathNotEqualTo(String value) {
            addCriterion("avatar_path <>", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathGreaterThan(String value) {
            addCriterion("avatar_path >", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_path >=", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathLessThan(String value) {
            addCriterion("avatar_path <", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathLessThanOrEqualTo(String value) {
            addCriterion("avatar_path <=", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathLike(String value) {
            addCriterion("avatar_path like", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathNotLike(String value) {
            addCriterion("avatar_path not like", value, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathIn(List<String> values) {
            addCriterion("avatar_path in", values, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathNotIn(List<String> values) {
            addCriterion("avatar_path not in", values, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathBetween(String value1, String value2) {
            addCriterion("avatar_path between", value1, value2, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andAvatarPathNotBetween(String value1, String value2) {
            addCriterion("avatar_path not between", value1, value2, "avatarPath");
            return (Criteria) this;
        }

        public Criteria andCupWinsIsNull() {
            addCriterion("cup_wins is null");
            return (Criteria) this;
        }

        public Criteria andCupWinsIsNotNull() {
            addCriterion("cup_wins is not null");
            return (Criteria) this;
        }

        public Criteria andCupWinsEqualTo(int value) {
            addCriterion("cup_wins =", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsNotEqualTo(int value) {
            addCriterion("cup_wins <>", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsGreaterThan(int value) {
            addCriterion("cup_wins >", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsGreaterThanOrEqualTo(int value) {
            addCriterion("cup_wins >=", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsLessThan(int value) {
            addCriterion("cup_wins <", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsLessThanOrEqualTo(int value) {
            addCriterion("cup_wins <=", value, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsIn(List<Integer> values) {
            addCriterion("cup_wins in", values, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsNotIn(List<Integer> values) {
            addCriterion("cup_wins not in", values, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsBetween(int value1, int value2) {
            addCriterion("cup_wins between", value1, value2, "cupWins");
            return (Criteria) this;
        }

        public Criteria andCupWinsNotBetween(int value1, int value2) {
            addCriterion("cup_wins not between", value1, value2, "cupWins");
            return (Criteria) this;
        }

        public Criteria andIdGproIsNull() {
            addCriterion("id_gpro is null");
            return (Criteria) this;
        }

        public Criteria andIdGproIsNotNull() {
            addCriterion("id_gpro is not null");
            return (Criteria) this;
        }

        public Criteria andIdGproEqualTo(Integer value) {
            addCriterion("id_gpro =", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproNotEqualTo(Integer value) {
            addCriterion("id_gpro <>", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproGreaterThan(Integer value) {
            addCriterion("id_gpro >", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_gpro >=", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproLessThan(Integer value) {
            addCriterion("id_gpro <", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproLessThanOrEqualTo(Integer value) {
            addCriterion("id_gpro <=", value, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproIn(List<Integer> values) {
            addCriterion("id_gpro in", values, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproNotIn(List<Integer> values) {
            addCriterion("id_gpro not in", values, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproBetween(Integer value1, Integer value2) {
            addCriterion("id_gpro between", value1, value2, "idGpro");
            return (Criteria) this;
        }

        public Criteria andIdGproNotBetween(Integer value1, Integer value2) {
            addCriterion("id_gpro not between", value1, value2, "idGpro");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manager
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
     * This class corresponds to the database table manager
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