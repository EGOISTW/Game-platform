package store.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GameinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameinfoExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("G_ID is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("G_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(BigDecimal value) {
            addCriterion("G_ID =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(BigDecimal value) {
            addCriterion("G_ID <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(BigDecimal value) {
            addCriterion("G_ID >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("G_ID >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(BigDecimal value) {
            addCriterion("G_ID <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("G_ID <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<BigDecimal> values) {
            addCriterion("G_ID in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<BigDecimal> values) {
            addCriterion("G_ID not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("G_ID between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("G_ID not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("G_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("G_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("G_NAME =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("G_NAME <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("G_NAME >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("G_NAME >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("G_NAME <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("G_NAME <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("G_NAME like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("G_NAME not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("G_NAME in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("G_NAME not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("G_NAME between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("G_NAME not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGPhotoIsNull() {
            addCriterion("G_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andGPhotoIsNotNull() {
            addCriterion("G_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andGPhotoEqualTo(String value) {
            addCriterion("G_PHOTO =", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoNotEqualTo(String value) {
            addCriterion("G_PHOTO <>", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoGreaterThan(String value) {
            addCriterion("G_PHOTO >", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("G_PHOTO >=", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoLessThan(String value) {
            addCriterion("G_PHOTO <", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoLessThanOrEqualTo(String value) {
            addCriterion("G_PHOTO <=", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoLike(String value) {
            addCriterion("G_PHOTO like", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoNotLike(String value) {
            addCriterion("G_PHOTO not like", value, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoIn(List<String> values) {
            addCriterion("G_PHOTO in", values, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoNotIn(List<String> values) {
            addCriterion("G_PHOTO not in", values, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoBetween(String value1, String value2) {
            addCriterion("G_PHOTO between", value1, value2, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGPhotoNotBetween(String value1, String value2) {
            addCriterion("G_PHOTO not between", value1, value2, "gPhoto");
            return (Criteria) this;
        }

        public Criteria andGContextIsNull() {
            addCriterion("G_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andGContextIsNotNull() {
            addCriterion("G_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andGContextEqualTo(String value) {
            addCriterion("G_CONTEXT =", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextNotEqualTo(String value) {
            addCriterion("G_CONTEXT <>", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextGreaterThan(String value) {
            addCriterion("G_CONTEXT >", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextGreaterThanOrEqualTo(String value) {
            addCriterion("G_CONTEXT >=", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextLessThan(String value) {
            addCriterion("G_CONTEXT <", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextLessThanOrEqualTo(String value) {
            addCriterion("G_CONTEXT <=", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextLike(String value) {
            addCriterion("G_CONTEXT like", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextNotLike(String value) {
            addCriterion("G_CONTEXT not like", value, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextIn(List<String> values) {
            addCriterion("G_CONTEXT in", values, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextNotIn(List<String> values) {
            addCriterion("G_CONTEXT not in", values, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextBetween(String value1, String value2) {
            addCriterion("G_CONTEXT between", value1, value2, "gContext");
            return (Criteria) this;
        }

        public Criteria andGContextNotBetween(String value1, String value2) {
            addCriterion("G_CONTEXT not between", value1, value2, "gContext");
            return (Criteria) this;
        }

        public Criteria andGPublisherIsNull() {
            addCriterion("G_PUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andGPublisherIsNotNull() {
            addCriterion("G_PUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andGPublisherEqualTo(String value) {
            addCriterion("G_PUBLISHER =", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherNotEqualTo(String value) {
            addCriterion("G_PUBLISHER <>", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherGreaterThan(String value) {
            addCriterion("G_PUBLISHER >", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("G_PUBLISHER >=", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherLessThan(String value) {
            addCriterion("G_PUBLISHER <", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherLessThanOrEqualTo(String value) {
            addCriterion("G_PUBLISHER <=", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherLike(String value) {
            addCriterion("G_PUBLISHER like", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherNotLike(String value) {
            addCriterion("G_PUBLISHER not like", value, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherIn(List<String> values) {
            addCriterion("G_PUBLISHER in", values, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherNotIn(List<String> values) {
            addCriterion("G_PUBLISHER not in", values, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherBetween(String value1, String value2) {
            addCriterion("G_PUBLISHER between", value1, value2, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGPublisherNotBetween(String value1, String value2) {
            addCriterion("G_PUBLISHER not between", value1, value2, "gPublisher");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNull() {
            addCriterion("G_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNotNull() {
            addCriterion("G_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGStatusEqualTo(Short value) {
            addCriterion("G_STATUS =", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotEqualTo(Short value) {
            addCriterion("G_STATUS <>", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThan(Short value) {
            addCriterion("G_STATUS >", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("G_STATUS >=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThan(Short value) {
            addCriterion("G_STATUS <", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThanOrEqualTo(Short value) {
            addCriterion("G_STATUS <=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusIn(List<Short> values) {
            addCriterion("G_STATUS in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotIn(List<Short> values) {
            addCriterion("G_STATUS not in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusBetween(Short value1, Short value2) {
            addCriterion("G_STATUS between", value1, value2, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotBetween(Short value1, Short value2) {
            addCriterion("G_STATUS not between", value1, value2, "gStatus");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("PUBLISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("PUBLISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PUBLISH_DATE <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("PUBLISH_DATE in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PUBLISH_DATE not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUBLISH_DATE between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PUBLISH_DATE not between", value1, value2, "publishDate");
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