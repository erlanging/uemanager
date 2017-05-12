package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.List;

public class SysJiuyetongjiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJiuyetongjiExample() {
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

        public Criteria andTjidIsNull() {
            addCriterion("tjid is null");
            return (Criteria) this;
        }

        public Criteria andTjidIsNotNull() {
            addCriterion("tjid is not null");
            return (Criteria) this;
        }

        public Criteria andTjidEqualTo(Integer value) {
            addCriterion("tjid =", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotEqualTo(Integer value) {
            addCriterion("tjid <>", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidGreaterThan(Integer value) {
            addCriterion("tjid >", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjid >=", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidLessThan(Integer value) {
            addCriterion("tjid <", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidLessThanOrEqualTo(Integer value) {
            addCriterion("tjid <=", value, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidIn(List<Integer> values) {
            addCriterion("tjid in", values, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotIn(List<Integer> values) {
            addCriterion("tjid not in", values, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidBetween(Integer value1, Integer value2) {
            addCriterion("tjid between", value1, value2, "tjid");
            return (Criteria) this;
        }

        public Criteria andTjidNotBetween(Integer value1, Integer value2) {
            addCriterion("tjid not between", value1, value2, "tjid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Integer value) {
            addCriterion("totalnum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Integer value) {
            addCriterion("totalnum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Integer value) {
            addCriterion("totalnum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Integer value) {
            addCriterion("totalnum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("totalnum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Integer> values) {
            addCriterion("totalnum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Integer> values) {
            addCriterion("totalnum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("totalnum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumIsNull() {
            addCriterion("employmentnum is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumIsNotNull() {
            addCriterion("employmentnum is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumEqualTo(Integer value) {
            addCriterion("employmentnum =", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumNotEqualTo(Integer value) {
            addCriterion("employmentnum <>", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumGreaterThan(Integer value) {
            addCriterion("employmentnum >", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("employmentnum >=", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumLessThan(Integer value) {
            addCriterion("employmentnum <", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumLessThanOrEqualTo(Integer value) {
            addCriterion("employmentnum <=", value, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumIn(List<Integer> values) {
            addCriterion("employmentnum in", values, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumNotIn(List<Integer> values) {
            addCriterion("employmentnum not in", values, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumBetween(Integer value1, Integer value2) {
            addCriterion("employmentnum between", value1, value2, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andEmploymentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("employmentnum not between", value1, value2, "employmentnum");
            return (Criteria) this;
        }

        public Criteria andSalaryavgIsNull() {
            addCriterion("salaryavg is null");
            return (Criteria) this;
        }

        public Criteria andSalaryavgIsNotNull() {
            addCriterion("salaryavg is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryavgEqualTo(Integer value) {
            addCriterion("salaryavg =", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgNotEqualTo(Integer value) {
            addCriterion("salaryavg <>", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgGreaterThan(Integer value) {
            addCriterion("salaryavg >", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgGreaterThanOrEqualTo(Integer value) {
            addCriterion("salaryavg >=", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgLessThan(Integer value) {
            addCriterion("salaryavg <", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgLessThanOrEqualTo(Integer value) {
            addCriterion("salaryavg <=", value, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgIn(List<Integer> values) {
            addCriterion("salaryavg in", values, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgNotIn(List<Integer> values) {
            addCriterion("salaryavg not in", values, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgBetween(Integer value1, Integer value2) {
            addCriterion("salaryavg between", value1, value2, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andSalaryavgNotBetween(Integer value1, Integer value2) {
            addCriterion("salaryavg not between", value1, value2, "salaryavg");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumIsNull() {
            addCriterion("postgraduatenum is null");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumIsNotNull() {
            addCriterion("postgraduatenum is not null");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumEqualTo(Integer value) {
            addCriterion("postgraduatenum =", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumNotEqualTo(Integer value) {
            addCriterion("postgraduatenum <>", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumGreaterThan(Integer value) {
            addCriterion("postgraduatenum >", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postgraduatenum >=", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumLessThan(Integer value) {
            addCriterion("postgraduatenum <", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumLessThanOrEqualTo(Integer value) {
            addCriterion("postgraduatenum <=", value, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumIn(List<Integer> values) {
            addCriterion("postgraduatenum in", values, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumNotIn(List<Integer> values) {
            addCriterion("postgraduatenum not in", values, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumBetween(Integer value1, Integer value2) {
            addCriterion("postgraduatenum between", value1, value2, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andPostgraduatenumNotBetween(Integer value1, Integer value2) {
            addCriterion("postgraduatenum not between", value1, value2, "postgraduatenum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumIsNull() {
            addCriterion("civilservantnum is null");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumIsNotNull() {
            addCriterion("civilservantnum is not null");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumEqualTo(Integer value) {
            addCriterion("civilservantnum =", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumNotEqualTo(Integer value) {
            addCriterion("civilservantnum <>", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumGreaterThan(Integer value) {
            addCriterion("civilservantnum >", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("civilservantnum >=", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumLessThan(Integer value) {
            addCriterion("civilservantnum <", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumLessThanOrEqualTo(Integer value) {
            addCriterion("civilservantnum <=", value, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumIn(List<Integer> values) {
            addCriterion("civilservantnum in", values, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumNotIn(List<Integer> values) {
            addCriterion("civilservantnum not in", values, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumBetween(Integer value1, Integer value2) {
            addCriterion("civilservantnum between", value1, value2, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andCivilservantnumNotBetween(Integer value1, Integer value2) {
            addCriterion("civilservantnum not between", value1, value2, "civilservantnum");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Integer value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Integer value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Integer value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Integer value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Integer value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Integer value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Integer> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Integer> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Integer value1, Integer value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Integer value1, Integer value2) {
            addCriterion("other not between", value1, value2, "other");
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