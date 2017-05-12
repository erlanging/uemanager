package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysQiyeZhaopinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysQiyeZhaopinExample() {
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

        public Criteria andQyidIsNull() {
            addCriterion("qyid is null");
            return (Criteria) this;
        }

        public Criteria andQyidIsNotNull() {
            addCriterion("qyid is not null");
            return (Criteria) this;
        }

        public Criteria andQyidEqualTo(Integer value) {
            addCriterion("qyid =", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotEqualTo(Integer value) {
            addCriterion("qyid <>", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThan(Integer value) {
            addCriterion("qyid >", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qyid >=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThan(Integer value) {
            addCriterion("qyid <", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThanOrEqualTo(Integer value) {
            addCriterion("qyid <=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidIn(List<Integer> values) {
            addCriterion("qyid in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotIn(List<Integer> values) {
            addCriterion("qyid not in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidBetween(Integer value1, Integer value2) {
            addCriterion("qyid between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotBetween(Integer value1, Integer value2) {
            addCriterion("qyid not between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("workplace is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("workplace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("workplace =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("workplace <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("workplace >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("workplace >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("workplace <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("workplace <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("workplace like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("workplace not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("workplace in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("workplace not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("workplace between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("workplace not between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishtime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("workexperience is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("workexperience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(String value) {
            addCriterion("workexperience =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(String value) {
            addCriterion("workexperience <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(String value) {
            addCriterion("workexperience >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("workexperience >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(String value) {
            addCriterion("workexperience <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(String value) {
            addCriterion("workexperience <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLike(String value) {
            addCriterion("workexperience like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotLike(String value) {
            addCriterion("workexperience not like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<String> values) {
            addCriterion("workexperience in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<String> values) {
            addCriterion("workexperience not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(String value1, String value2) {
            addCriterion("workexperience between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(String value1, String value2) {
            addCriterion("workexperience not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIsNull() {
            addCriterion("recruitnum is null");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIsNotNull() {
            addCriterion("recruitnum is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitnumEqualTo(Integer value) {
            addCriterion("recruitnum =", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotEqualTo(Integer value) {
            addCriterion("recruitnum <>", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumGreaterThan(Integer value) {
            addCriterion("recruitnum >", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitnum >=", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumLessThan(Integer value) {
            addCriterion("recruitnum <", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumLessThanOrEqualTo(Integer value) {
            addCriterion("recruitnum <=", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIn(List<Integer> values) {
            addCriterion("recruitnum in", values, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotIn(List<Integer> values) {
            addCriterion("recruitnum not in", values, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumBetween(Integer value1, Integer value2) {
            addCriterion("recruitnum between", value1, value2, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitnum not between", value1, value2, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionIsNull() {
            addCriterion("jobdescription is null");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionIsNotNull() {
            addCriterion("jobdescription is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionEqualTo(String value) {
            addCriterion("jobdescription =", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionNotEqualTo(String value) {
            addCriterion("jobdescription <>", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionGreaterThan(String value) {
            addCriterion("jobdescription >", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("jobdescription >=", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionLessThan(String value) {
            addCriterion("jobdescription <", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionLessThanOrEqualTo(String value) {
            addCriterion("jobdescription <=", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionLike(String value) {
            addCriterion("jobdescription like", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionNotLike(String value) {
            addCriterion("jobdescription not like", value, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionIn(List<String> values) {
            addCriterion("jobdescription in", values, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionNotIn(List<String> values) {
            addCriterion("jobdescription not in", values, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionBetween(String value1, String value2) {
            addCriterion("jobdescription between", value1, value2, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andJobdescriptionNotBetween(String value1, String value2) {
            addCriterion("jobdescription not between", value1, value2, "jobdescription");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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