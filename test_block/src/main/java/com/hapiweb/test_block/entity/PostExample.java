package com.hapiweb.test_block.entity;

import java.util.ArrayList;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andBlockGkIsNull() {
            addCriterion("BLOCK_GK is null");
            return (Criteria) this;
        }

        public Criteria andBlockGkIsNotNull() {
            addCriterion("BLOCK_GK is not null");
            return (Criteria) this;
        }

        public Criteria andBlockGkEqualTo(String value) {
            addCriterion("BLOCK_GK =", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkNotEqualTo(String value) {
            addCriterion("BLOCK_GK <>", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkGreaterThan(String value) {
            addCriterion("BLOCK_GK >", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkGreaterThanOrEqualTo(String value) {
            addCriterion("BLOCK_GK >=", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkLessThan(String value) {
            addCriterion("BLOCK_GK <", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkLessThanOrEqualTo(String value) {
            addCriterion("BLOCK_GK <=", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkLike(String value) {
            addCriterion("BLOCK_GK like", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkNotLike(String value) {
            addCriterion("BLOCK_GK not like", value, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkIn(List<String> values) {
            addCriterion("BLOCK_GK in", values, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkNotIn(List<String> values) {
            addCriterion("BLOCK_GK not in", values, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkBetween(String value1, String value2) {
            addCriterion("BLOCK_GK between", value1, value2, "blockGk");
            return (Criteria) this;
        }

        public Criteria andBlockGkNotBetween(String value1, String value2) {
            addCriterion("BLOCK_GK not between", value1, value2, "blockGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkIsNull() {
            addCriterion("AUTHOR_GK is null");
            return (Criteria) this;
        }

        public Criteria andAuthorGkIsNotNull() {
            addCriterion("AUTHOR_GK is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorGkEqualTo(String value) {
            addCriterion("AUTHOR_GK =", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkNotEqualTo(String value) {
            addCriterion("AUTHOR_GK <>", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkGreaterThan(String value) {
            addCriterion("AUTHOR_GK >", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_GK >=", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkLessThan(String value) {
            addCriterion("AUTHOR_GK <", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_GK <=", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkLike(String value) {
            addCriterion("AUTHOR_GK like", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkNotLike(String value) {
            addCriterion("AUTHOR_GK not like", value, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkIn(List<String> values) {
            addCriterion("AUTHOR_GK in", values, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkNotIn(List<String> values) {
            addCriterion("AUTHOR_GK not in", values, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkBetween(String value1, String value2) {
            addCriterion("AUTHOR_GK between", value1, value2, "authorGk");
            return (Criteria) this;
        }

        public Criteria andAuthorGkNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_GK not between", value1, value2, "authorGk");
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