package com.hapiweb.test_block.entity;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andPostGkIsNull() {
            addCriterion("POST_GK is null");
            return (Criteria) this;
        }

        public Criteria andPostGkIsNotNull() {
            addCriterion("POST_GK is not null");
            return (Criteria) this;
        }

        public Criteria andPostGkEqualTo(String value) {
            addCriterion("POST_GK =", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkNotEqualTo(String value) {
            addCriterion("POST_GK <>", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkGreaterThan(String value) {
            addCriterion("POST_GK >", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkGreaterThanOrEqualTo(String value) {
            addCriterion("POST_GK >=", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkLessThan(String value) {
            addCriterion("POST_GK <", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkLessThanOrEqualTo(String value) {
            addCriterion("POST_GK <=", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkLike(String value) {
            addCriterion("POST_GK like", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkNotLike(String value) {
            addCriterion("POST_GK not like", value, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkIn(List<String> values) {
            addCriterion("POST_GK in", values, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkNotIn(List<String> values) {
            addCriterion("POST_GK not in", values, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkBetween(String value1, String value2) {
            addCriterion("POST_GK between", value1, value2, "postGk");
            return (Criteria) this;
        }

        public Criteria andPostGkNotBetween(String value1, String value2) {
            addCriterion("POST_GK not between", value1, value2, "postGk");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
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

        public Criteria andReplyToGkIsNull() {
            addCriterion("REPLY_TO_GK is null");
            return (Criteria) this;
        }

        public Criteria andReplyToGkIsNotNull() {
            addCriterion("REPLY_TO_GK is not null");
            return (Criteria) this;
        }

        public Criteria andReplyToGkEqualTo(String value) {
            addCriterion("REPLY_TO_GK =", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkNotEqualTo(String value) {
            addCriterion("REPLY_TO_GK <>", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkGreaterThan(String value) {
            addCriterion("REPLY_TO_GK >", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_TO_GK >=", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkLessThan(String value) {
            addCriterion("REPLY_TO_GK <", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkLessThanOrEqualTo(String value) {
            addCriterion("REPLY_TO_GK <=", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkLike(String value) {
            addCriterion("REPLY_TO_GK like", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkNotLike(String value) {
            addCriterion("REPLY_TO_GK not like", value, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkIn(List<String> values) {
            addCriterion("REPLY_TO_GK in", values, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkNotIn(List<String> values) {
            addCriterion("REPLY_TO_GK not in", values, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkBetween(String value1, String value2) {
            addCriterion("REPLY_TO_GK between", value1, value2, "replyToGk");
            return (Criteria) this;
        }

        public Criteria andReplyToGkNotBetween(String value1, String value2) {
            addCriterion("REPLY_TO_GK not between", value1, value2, "replyToGk");
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