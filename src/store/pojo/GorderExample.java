package store.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GorderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("O_ID is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("O_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(BigDecimal value) {
            addCriterion("O_ID =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(BigDecimal value) {
            addCriterion("O_ID <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(BigDecimal value) {
            addCriterion("O_ID >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_ID >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(BigDecimal value) {
            addCriterion("O_ID <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_ID <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<BigDecimal> values) {
            addCriterion("O_ID in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<BigDecimal> values) {
            addCriterion("O_ID not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_ID between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_ID not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("GAME_ID is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("GAME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(BigDecimal value) {
            addCriterion("GAME_ID =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(BigDecimal value) {
            addCriterion("GAME_ID <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(BigDecimal value) {
            addCriterion("GAME_ID >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GAME_ID >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(BigDecimal value) {
            addCriterion("GAME_ID <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GAME_ID <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<BigDecimal> values) {
            addCriterion("GAME_ID in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<BigDecimal> values) {
            addCriterion("GAME_ID not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GAME_ID between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GAME_ID not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceIsNull() {
            addCriterion("O_TOTALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceIsNotNull() {
            addCriterion("O_TOTALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceEqualTo(BigDecimal value) {
            addCriterion("O_TOTALPRICE =", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("O_TOTALPRICE <>", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("O_TOTALPRICE >", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TOTALPRICE >=", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceLessThan(BigDecimal value) {
            addCriterion("O_TOTALPRICE <", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TOTALPRICE <=", value, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceIn(List<BigDecimal> values) {
            addCriterion("O_TOTALPRICE in", values, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("O_TOTALPRICE not in", values, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TOTALPRICE between", value1, value2, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TOTALPRICE not between", value1, value2, "oTotalprice");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("O_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("O_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Short value) {
            addCriterion("O_STATUS =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Short value) {
            addCriterion("O_STATUS <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Short value) {
            addCriterion("O_STATUS >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("O_STATUS >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Short value) {
            addCriterion("O_STATUS <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Short value) {
            addCriterion("O_STATUS <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Short> values) {
            addCriterion("O_STATUS in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Short> values) {
            addCriterion("O_STATUS not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Short value1, Short value2) {
            addCriterion("O_STATUS between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Short value1, Short value2) {
            addCriterion("O_STATUS not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNull() {
            addCriterion("O_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNotNull() {
            addCriterion("O_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOTimeEqualTo(Date value) {
            addCriterionForJDBCDate("O_TIME =", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("O_TIME <>", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("O_TIME >", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("O_TIME >=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThan(Date value) {
            addCriterionForJDBCDate("O_TIME <", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("O_TIME <=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeIn(List<Date> values) {
            addCriterionForJDBCDate("O_TIME in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("O_TIME not in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("O_TIME between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("O_TIME not between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andOGroupIsNull() {
            addCriterion("O_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andOGroupIsNotNull() {
            addCriterion("O_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andOGroupEqualTo(BigDecimal value) {
            addCriterion("O_GROUP =", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupNotEqualTo(BigDecimal value) {
            addCriterion("O_GROUP <>", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupGreaterThan(BigDecimal value) {
            addCriterion("O_GROUP >", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_GROUP >=", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupLessThan(BigDecimal value) {
            addCriterion("O_GROUP <", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_GROUP <=", value, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupIn(List<BigDecimal> values) {
            addCriterion("O_GROUP in", values, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupNotIn(List<BigDecimal> values) {
            addCriterion("O_GROUP not in", values, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_GROUP between", value1, value2, "oGroup");
            return (Criteria) this;
        }

        public Criteria andOGroupNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_GROUP not between", value1, value2, "oGroup");
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