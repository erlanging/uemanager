package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.List;

public class SysStuQiuzhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStuQiuzhiExample() {
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

        public Criteria andQzidIsNull() {
            addCriterion("qzid is null");
            return (Criteria) this;
        }

        public Criteria andQzidIsNotNull() {
            addCriterion("qzid is not null");
            return (Criteria) this;
        }

        public Criteria andQzidEqualTo(Integer value) {
            addCriterion("qzid =", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidNotEqualTo(Integer value) {
            addCriterion("qzid <>", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidGreaterThan(Integer value) {
            addCriterion("qzid >", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qzid >=", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidLessThan(Integer value) {
            addCriterion("qzid <", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidLessThanOrEqualTo(Integer value) {
            addCriterion("qzid <=", value, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidIn(List<Integer> values) {
            addCriterion("qzid in", values, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidNotIn(List<Integer> values) {
            addCriterion("qzid not in", values, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidBetween(Integer value1, Integer value2) {
            addCriterion("qzid between", value1, value2, "qzid");
            return (Criteria) this;
        }

        public Criteria andQzidNotBetween(Integer value1, Integer value2) {
            addCriterion("qzid not between", value1, value2, "qzid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andZpidIsNull() {
            addCriterion("zpid is null");
            return (Criteria) this;
        }

        public Criteria andZpidIsNotNull() {
            addCriterion("zpid is not null");
            return (Criteria) this;
        }

        public Criteria andZpidEqualTo(Integer value) {
            addCriterion("zpid =", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotEqualTo(Integer value) {
            addCriterion("zpid <>", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidGreaterThan(Integer value) {
            addCriterion("zpid >", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zpid >=", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidLessThan(Integer value) {
            addCriterion("zpid <", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidLessThanOrEqualTo(Integer value) {
            addCriterion("zpid <=", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidIn(List<Integer> values) {
            addCriterion("zpid in", values, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotIn(List<Integer> values) {
            addCriterion("zpid not in", values, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidBetween(Integer value1, Integer value2) {
            addCriterion("zpid between", value1, value2, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotBetween(Integer value1, Integer value2) {
            addCriterion("zpid not between", value1, value2, "zpid");
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