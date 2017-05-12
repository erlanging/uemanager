package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysStuDanganExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStuDanganExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNull() {
            addCriterion("zhengzhimianmao is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIsNotNull() {
            addCriterion("zhengzhimianmao is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoEqualTo(String value) {
            addCriterion("zhengzhimianmao =", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotEqualTo(String value) {
            addCriterion("zhengzhimianmao <>", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThan(String value) {
            addCriterion("zhengzhimianmao >", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhengzhimianmao >=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThan(String value) {
            addCriterion("zhengzhimianmao <", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLessThanOrEqualTo(String value) {
            addCriterion("zhengzhimianmao <=", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoLike(String value) {
            addCriterion("zhengzhimianmao like", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotLike(String value) {
            addCriterion("zhengzhimianmao not like", value, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoIn(List<String> values) {
            addCriterion("zhengzhimianmao in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotIn(List<String> values) {
            addCriterion("zhengzhimianmao not in", values, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoBetween(String value1, String value2) {
            addCriterion("zhengzhimianmao between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andZhengzhimianmaoNotBetween(String value1, String value2) {
            addCriterion("zhengzhimianmao not between", value1, value2, "zhengzhimianmao");
            return (Criteria) this;
        }

        public Criteria andRutuandateIsNull() {
            addCriterion("rutuandate is null");
            return (Criteria) this;
        }

        public Criteria andRutuandateIsNotNull() {
            addCriterion("rutuandate is not null");
            return (Criteria) this;
        }

        public Criteria andRutuandateEqualTo(Date value) {
            addCriterionForJDBCDate("rutuandate =", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rutuandate <>", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateGreaterThan(Date value) {
            addCriterionForJDBCDate("rutuandate >", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rutuandate >=", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateLessThan(Date value) {
            addCriterionForJDBCDate("rutuandate <", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rutuandate <=", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateIn(List<Date> values) {
            addCriterionForJDBCDate("rutuandate in", values, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rutuandate not in", values, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rutuandate between", value1, value2, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rutuandate not between", value1, value2, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNull() {
            addCriterion("identityid is null");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNotNull() {
            addCriterion("identityid is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityidEqualTo(String value) {
            addCriterion("identityid =", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotEqualTo(String value) {
            addCriterion("identityid <>", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThan(String value) {
            addCriterion("identityid >", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThanOrEqualTo(String value) {
            addCriterion("identityid >=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThan(String value) {
            addCriterion("identityid <", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThanOrEqualTo(String value) {
            addCriterion("identityid <=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLike(String value) {
            addCriterion("identityid like", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotLike(String value) {
            addCriterion("identityid not like", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidIn(List<String> values) {
            addCriterion("identityid in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotIn(List<String> values) {
            addCriterion("identityid not in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidBetween(String value1, String value2) {
            addCriterion("identityid between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotBetween(String value1, String value2) {
            addCriterion("identityid not between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andSmallschoolIsNull() {
            addCriterion("smallschool is null");
            return (Criteria) this;
        }

        public Criteria andSmallschoolIsNotNull() {
            addCriterion("smallschool is not null");
            return (Criteria) this;
        }

        public Criteria andSmallschoolEqualTo(String value) {
            addCriterion("smallschool =", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolNotEqualTo(String value) {
            addCriterion("smallschool <>", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolGreaterThan(String value) {
            addCriterion("smallschool >", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolGreaterThanOrEqualTo(String value) {
            addCriterion("smallschool >=", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolLessThan(String value) {
            addCriterion("smallschool <", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolLessThanOrEqualTo(String value) {
            addCriterion("smallschool <=", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolLike(String value) {
            addCriterion("smallschool like", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolNotLike(String value) {
            addCriterion("smallschool not like", value, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolIn(List<String> values) {
            addCriterion("smallschool in", values, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolNotIn(List<String> values) {
            addCriterion("smallschool not in", values, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolBetween(String value1, String value2) {
            addCriterion("smallschool between", value1, value2, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschoolNotBetween(String value1, String value2) {
            addCriterion("smallschool not between", value1, value2, "smallschool");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateIsNull() {
            addCriterion("smallschooldate is null");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateIsNotNull() {
            addCriterion("smallschooldate is not null");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateEqualTo(String value) {
            addCriterion("smallschooldate =", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateNotEqualTo(String value) {
            addCriterion("smallschooldate <>", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateGreaterThan(String value) {
            addCriterion("smallschooldate >", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateGreaterThanOrEqualTo(String value) {
            addCriterion("smallschooldate >=", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateLessThan(String value) {
            addCriterion("smallschooldate <", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateLessThanOrEqualTo(String value) {
            addCriterion("smallschooldate <=", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateLike(String value) {
            addCriterion("smallschooldate like", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateNotLike(String value) {
            addCriterion("smallschooldate not like", value, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateIn(List<String> values) {
            addCriterion("smallschooldate in", values, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateNotIn(List<String> values) {
            addCriterion("smallschooldate not in", values, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateBetween(String value1, String value2) {
            addCriterion("smallschooldate between", value1, value2, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschooldateNotBetween(String value1, String value2) {
            addCriterion("smallschooldate not between", value1, value2, "smallschooldate");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterIsNull() {
            addCriterion("smallschoolmaster is null");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterIsNotNull() {
            addCriterion("smallschoolmaster is not null");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterEqualTo(String value) {
            addCriterion("smallschoolmaster =", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterNotEqualTo(String value) {
            addCriterion("smallschoolmaster <>", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterGreaterThan(String value) {
            addCriterion("smallschoolmaster >", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterGreaterThanOrEqualTo(String value) {
            addCriterion("smallschoolmaster >=", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterLessThan(String value) {
            addCriterion("smallschoolmaster <", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterLessThanOrEqualTo(String value) {
            addCriterion("smallschoolmaster <=", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterLike(String value) {
            addCriterion("smallschoolmaster like", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterNotLike(String value) {
            addCriterion("smallschoolmaster not like", value, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterIn(List<String> values) {
            addCriterion("smallschoolmaster in", values, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterNotIn(List<String> values) {
            addCriterion("smallschoolmaster not in", values, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterBetween(String value1, String value2) {
            addCriterion("smallschoolmaster between", value1, value2, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andSmallschoolmasterNotBetween(String value1, String value2) {
            addCriterion("smallschoolmaster not between", value1, value2, "smallschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolIsNull() {
            addCriterion("midschool is null");
            return (Criteria) this;
        }

        public Criteria andMidschoolIsNotNull() {
            addCriterion("midschool is not null");
            return (Criteria) this;
        }

        public Criteria andMidschoolEqualTo(String value) {
            addCriterion("midschool =", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolNotEqualTo(String value) {
            addCriterion("midschool <>", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolGreaterThan(String value) {
            addCriterion("midschool >", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolGreaterThanOrEqualTo(String value) {
            addCriterion("midschool >=", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolLessThan(String value) {
            addCriterion("midschool <", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolLessThanOrEqualTo(String value) {
            addCriterion("midschool <=", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolLike(String value) {
            addCriterion("midschool like", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolNotLike(String value) {
            addCriterion("midschool not like", value, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolIn(List<String> values) {
            addCriterion("midschool in", values, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolNotIn(List<String> values) {
            addCriterion("midschool not in", values, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolBetween(String value1, String value2) {
            addCriterion("midschool between", value1, value2, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolNotBetween(String value1, String value2) {
            addCriterion("midschool not between", value1, value2, "midschool");
            return (Criteria) this;
        }

        public Criteria andMidschooldateIsNull() {
            addCriterion("midschooldate is null");
            return (Criteria) this;
        }

        public Criteria andMidschooldateIsNotNull() {
            addCriterion("midschooldate is not null");
            return (Criteria) this;
        }

        public Criteria andMidschooldateEqualTo(String value) {
            addCriterion("midschooldate =", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateNotEqualTo(String value) {
            addCriterion("midschooldate <>", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateGreaterThan(String value) {
            addCriterion("midschooldate >", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateGreaterThanOrEqualTo(String value) {
            addCriterion("midschooldate >=", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateLessThan(String value) {
            addCriterion("midschooldate <", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateLessThanOrEqualTo(String value) {
            addCriterion("midschooldate <=", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateLike(String value) {
            addCriterion("midschooldate like", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateNotLike(String value) {
            addCriterion("midschooldate not like", value, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateIn(List<String> values) {
            addCriterion("midschooldate in", values, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateNotIn(List<String> values) {
            addCriterion("midschooldate not in", values, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateBetween(String value1, String value2) {
            addCriterion("midschooldate between", value1, value2, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andMidschooldateNotBetween(String value1, String value2) {
            addCriterion("midschooldate not between", value1, value2, "midschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschoolIsNull() {
            addCriterion("highschool is null");
            return (Criteria) this;
        }

        public Criteria andHighschoolIsNotNull() {
            addCriterion("highschool is not null");
            return (Criteria) this;
        }

        public Criteria andHighschoolEqualTo(String value) {
            addCriterion("highschool =", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolNotEqualTo(String value) {
            addCriterion("highschool <>", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolGreaterThan(String value) {
            addCriterion("highschool >", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolGreaterThanOrEqualTo(String value) {
            addCriterion("highschool >=", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolLessThan(String value) {
            addCriterion("highschool <", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolLessThanOrEqualTo(String value) {
            addCriterion("highschool <=", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolLike(String value) {
            addCriterion("highschool like", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolNotLike(String value) {
            addCriterion("highschool not like", value, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolIn(List<String> values) {
            addCriterion("highschool in", values, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolNotIn(List<String> values) {
            addCriterion("highschool not in", values, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolBetween(String value1, String value2) {
            addCriterion("highschool between", value1, value2, "highschool");
            return (Criteria) this;
        }

        public Criteria andHighschoolNotBetween(String value1, String value2) {
            addCriterion("highschool not between", value1, value2, "highschool");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterIsNull() {
            addCriterion("midschoolmaster is null");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterIsNotNull() {
            addCriterion("midschoolmaster is not null");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterEqualTo(String value) {
            addCriterion("midschoolmaster =", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterNotEqualTo(String value) {
            addCriterion("midschoolmaster <>", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterGreaterThan(String value) {
            addCriterion("midschoolmaster >", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterGreaterThanOrEqualTo(String value) {
            addCriterion("midschoolmaster >=", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterLessThan(String value) {
            addCriterion("midschoolmaster <", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterLessThanOrEqualTo(String value) {
            addCriterion("midschoolmaster <=", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterLike(String value) {
            addCriterion("midschoolmaster like", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterNotLike(String value) {
            addCriterion("midschoolmaster not like", value, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterIn(List<String> values) {
            addCriterion("midschoolmaster in", values, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterNotIn(List<String> values) {
            addCriterion("midschoolmaster not in", values, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterBetween(String value1, String value2) {
            addCriterion("midschoolmaster between", value1, value2, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andMidschoolmasterNotBetween(String value1, String value2) {
            addCriterion("midschoolmaster not between", value1, value2, "midschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterIsNull() {
            addCriterion("highschoolmaster is null");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterIsNotNull() {
            addCriterion("highschoolmaster is not null");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterEqualTo(String value) {
            addCriterion("highschoolmaster =", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterNotEqualTo(String value) {
            addCriterion("highschoolmaster <>", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterGreaterThan(String value) {
            addCriterion("highschoolmaster >", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterGreaterThanOrEqualTo(String value) {
            addCriterion("highschoolmaster >=", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterLessThan(String value) {
            addCriterion("highschoolmaster <", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterLessThanOrEqualTo(String value) {
            addCriterion("highschoolmaster <=", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterLike(String value) {
            addCriterion("highschoolmaster like", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterNotLike(String value) {
            addCriterion("highschoolmaster not like", value, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterIn(List<String> values) {
            addCriterion("highschoolmaster in", values, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterNotIn(List<String> values) {
            addCriterion("highschoolmaster not in", values, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterBetween(String value1, String value2) {
            addCriterion("highschoolmaster between", value1, value2, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschoolmasterNotBetween(String value1, String value2) {
            addCriterion("highschoolmaster not between", value1, value2, "highschoolmaster");
            return (Criteria) this;
        }

        public Criteria andHighschooldateIsNull() {
            addCriterion("highschooldate is null");
            return (Criteria) this;
        }

        public Criteria andHighschooldateIsNotNull() {
            addCriterion("highschooldate is not null");
            return (Criteria) this;
        }

        public Criteria andHighschooldateEqualTo(String value) {
            addCriterion("highschooldate =", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateNotEqualTo(String value) {
            addCriterion("highschooldate <>", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateGreaterThan(String value) {
            addCriterion("highschooldate >", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateGreaterThanOrEqualTo(String value) {
            addCriterion("highschooldate >=", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateLessThan(String value) {
            addCriterion("highschooldate <", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateLessThanOrEqualTo(String value) {
            addCriterion("highschooldate <=", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateLike(String value) {
            addCriterion("highschooldate like", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateNotLike(String value) {
            addCriterion("highschooldate not like", value, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateIn(List<String> values) {
            addCriterion("highschooldate in", values, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateNotIn(List<String> values) {
            addCriterion("highschooldate not in", values, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateBetween(String value1, String value2) {
            addCriterion("highschooldate between", value1, value2, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andHighschooldateNotBetween(String value1, String value2) {
            addCriterion("highschooldate not between", value1, value2, "highschooldate");
            return (Criteria) this;
        }

        public Criteria andUniverserIsNull() {
            addCriterion("universer is null");
            return (Criteria) this;
        }

        public Criteria andUniverserIsNotNull() {
            addCriterion("universer is not null");
            return (Criteria) this;
        }

        public Criteria andUniverserEqualTo(String value) {
            addCriterion("universer =", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserNotEqualTo(String value) {
            addCriterion("universer <>", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserGreaterThan(String value) {
            addCriterion("universer >", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserGreaterThanOrEqualTo(String value) {
            addCriterion("universer >=", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserLessThan(String value) {
            addCriterion("universer <", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserLessThanOrEqualTo(String value) {
            addCriterion("universer <=", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserLike(String value) {
            addCriterion("universer like", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserNotLike(String value) {
            addCriterion("universer not like", value, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserIn(List<String> values) {
            addCriterion("universer in", values, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserNotIn(List<String> values) {
            addCriterion("universer not in", values, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserBetween(String value1, String value2) {
            addCriterion("universer between", value1, value2, "universer");
            return (Criteria) this;
        }

        public Criteria andUniverserNotBetween(String value1, String value2) {
            addCriterion("universer not between", value1, value2, "universer");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNull() {
            addCriterion("\" academy\" is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNotNull() {
            addCriterion("\" academy\" is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyEqualTo(String value) {
            addCriterion("\" academy\" =", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotEqualTo(String value) {
            addCriterion("\" academy\" <>", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThan(String value) {
            addCriterion("\" academy\" >", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("\" academy\" >=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThan(String value) {
            addCriterion("\" academy\" <", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThanOrEqualTo(String value) {
            addCriterion("\" academy\" <=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLike(String value) {
            addCriterion("\" academy\" like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotLike(String value) {
            addCriterion("\" academy\" not like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyIn(List<String> values) {
            addCriterion("\" academy\" in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotIn(List<String> values) {
            addCriterion("\" academy\" not in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyBetween(String value1, String value2) {
            addCriterion("\" academy\" between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotBetween(String value1, String value2) {
            addCriterion("\" academy\" not between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andAwardsIsNull() {
            addCriterion("awards is null");
            return (Criteria) this;
        }

        public Criteria andAwardsIsNotNull() {
            addCriterion("awards is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsEqualTo(String value) {
            addCriterion("awards =", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotEqualTo(String value) {
            addCriterion("awards <>", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsGreaterThan(String value) {
            addCriterion("awards >", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsGreaterThanOrEqualTo(String value) {
            addCriterion("awards >=", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLessThan(String value) {
            addCriterion("awards <", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLessThanOrEqualTo(String value) {
            addCriterion("awards <=", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLike(String value) {
            addCriterion("awards like", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotLike(String value) {
            addCriterion("awards not like", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsIn(List<String> values) {
            addCriterion("awards in", values, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotIn(List<String> values) {
            addCriterion("awards not in", values, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsBetween(String value1, String value2) {
            addCriterion("awards between", value1, value2, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotBetween(String value1, String value2) {
            addCriterion("awards not between", value1, value2, "awards");
            return (Criteria) this;
        }

        public Criteria andPunishIsNull() {
            addCriterion("punish is null");
            return (Criteria) this;
        }

        public Criteria andPunishIsNotNull() {
            addCriterion("punish is not null");
            return (Criteria) this;
        }

        public Criteria andPunishEqualTo(String value) {
            addCriterion("punish =", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotEqualTo(String value) {
            addCriterion("punish <>", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThan(String value) {
            addCriterion("punish >", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThanOrEqualTo(String value) {
            addCriterion("punish >=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThan(String value) {
            addCriterion("punish <", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThanOrEqualTo(String value) {
            addCriterion("punish <=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLike(String value) {
            addCriterion("punish like", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotLike(String value) {
            addCriterion("punish not like", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishIn(List<String> values) {
            addCriterion("punish in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotIn(List<String> values) {
            addCriterion("punish not in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishBetween(String value1, String value2) {
            addCriterion("punish between", value1, value2, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotBetween(String value1, String value2) {
            addCriterion("punish not between", value1, value2, "punish");
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