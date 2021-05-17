package com.hapiweb.test_block.entity;

import java.util.ArrayList;
import java.util.List;

public class BlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andGenkeyIsNull() {
            addCriterion("GENKEY is null");
            return (Criteria) this;
        }

        public Criteria andGenkeyIsNotNull() {
            addCriterion("GENKEY is not null");
            return (Criteria) this;
        }

        public Criteria andGenkeyEqualTo(String value) {
            addCriterion("GENKEY =", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyNotEqualTo(String value) {
            addCriterion("GENKEY <>", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyGreaterThan(String value) {
            addCriterion("GENKEY >", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyGreaterThanOrEqualTo(String value) {
            addCriterion("GENKEY >=", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyLessThan(String value) {
            addCriterion("GENKEY <", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyLessThanOrEqualTo(String value) {
            addCriterion("GENKEY <=", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyLike(String value) {
            addCriterion("GENKEY like", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyNotLike(String value) {
            addCriterion("GENKEY not like", value, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyIn(List<String> values) {
            addCriterion("GENKEY in", values, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyNotIn(List<String> values) {
            addCriterion("GENKEY not in", values, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyBetween(String value1, String value2) {
            addCriterion("GENKEY between", value1, value2, "genkey");
            return (Criteria) this;
        }

        public Criteria andGenkeyNotBetween(String value1, String value2) {
            addCriterion("GENKEY not between", value1, value2, "genkey");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDiscIsNull() {
            addCriterion("DISC is null");
            return (Criteria) this;
        }

        public Criteria andDiscIsNotNull() {
            addCriterion("DISC is not null");
            return (Criteria) this;
        }

        public Criteria andDiscEqualTo(String value) {
            addCriterion("DISC =", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotEqualTo(String value) {
            addCriterion("DISC <>", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThan(String value) {
            addCriterion("DISC >", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThanOrEqualTo(String value) {
            addCriterion("DISC >=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThan(String value) {
            addCriterion("DISC <", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThanOrEqualTo(String value) {
            addCriterion("DISC <=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLike(String value) {
            addCriterion("DISC like", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotLike(String value) {
            addCriterion("DISC not like", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscIn(List<String> values) {
            addCriterion("DISC in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotIn(List<String> values) {
            addCriterion("DISC not in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscBetween(String value1, String value2) {
            addCriterion("DISC between", value1, value2, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotBetween(String value1, String value2) {
            addCriterion("DISC not between", value1, value2, "disc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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