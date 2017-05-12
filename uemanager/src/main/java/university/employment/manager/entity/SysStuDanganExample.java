package university.employment.manager.entity;

import java.util.ArrayList;
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

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
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

        public Criteria andXingzhengbanjiIsNull() {
            addCriterion("xingzhengbanji is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiIsNotNull() {
            addCriterion("xingzhengbanji is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiEqualTo(String value) {
            addCriterion("xingzhengbanji =", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiNotEqualTo(String value) {
            addCriterion("xingzhengbanji <>", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiGreaterThan(String value) {
            addCriterion("xingzhengbanji >", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiGreaterThanOrEqualTo(String value) {
            addCriterion("xingzhengbanji >=", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiLessThan(String value) {
            addCriterion("xingzhengbanji <", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiLessThanOrEqualTo(String value) {
            addCriterion("xingzhengbanji <=", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiLike(String value) {
            addCriterion("xingzhengbanji like", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiNotLike(String value) {
            addCriterion("xingzhengbanji not like", value, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiIn(List<String> values) {
            addCriterion("xingzhengbanji in", values, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiNotIn(List<String> values) {
            addCriterion("xingzhengbanji not in", values, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiBetween(String value1, String value2) {
            addCriterion("xingzhengbanji between", value1, value2, "xingzhengbanji");
            return (Criteria) this;
        }

        public Criteria andXingzhengbanjiNotBetween(String value1, String value2) {
            addCriterion("xingzhengbanji not between", value1, value2, "xingzhengbanji");
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

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
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

        public Criteria andRutuandateEqualTo(String value) {
            addCriterion("rutuandate =", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotEqualTo(String value) {
            addCriterion("rutuandate <>", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateGreaterThan(String value) {
            addCriterion("rutuandate >", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateGreaterThanOrEqualTo(String value) {
            addCriterion("rutuandate >=", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateLessThan(String value) {
            addCriterion("rutuandate <", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateLessThanOrEqualTo(String value) {
            addCriterion("rutuandate <=", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateLike(String value) {
            addCriterion("rutuandate like", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotLike(String value) {
            addCriterion("rutuandate not like", value, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateIn(List<String> values) {
            addCriterion("rutuandate in", values, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotIn(List<String> values) {
            addCriterion("rutuandate not in", values, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateBetween(String value1, String value2) {
            addCriterion("rutuandate between", value1, value2, "rutuandate");
            return (Criteria) this;
        }

        public Criteria andRutuandateNotBetween(String value1, String value2) {
            addCriterion("rutuandate not between", value1, value2, "rutuandate");
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

        public Criteria andHomeaddrIsNull() {
            addCriterion("homeaddr is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddrIsNotNull() {
            addCriterion("homeaddr is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddrEqualTo(String value) {
            addCriterion("homeaddr =", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrNotEqualTo(String value) {
            addCriterion("homeaddr <>", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrGreaterThan(String value) {
            addCriterion("homeaddr >", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddr >=", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrLessThan(String value) {
            addCriterion("homeaddr <", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrLessThanOrEqualTo(String value) {
            addCriterion("homeaddr <=", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrLike(String value) {
            addCriterion("homeaddr like", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrNotLike(String value) {
            addCriterion("homeaddr not like", value, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrIn(List<String> values) {
            addCriterion("homeaddr in", values, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrNotIn(List<String> values) {
            addCriterion("homeaddr not in", values, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrBetween(String value1, String value2) {
            addCriterion("homeaddr between", value1, value2, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andHomeaddrNotBetween(String value1, String value2) {
            addCriterion("homeaddr not between", value1, value2, "homeaddr");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("contactphone is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("contactphone is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("contactphone =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("contactphone <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("contactphone >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactphone >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("contactphone <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("contactphone <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("contactphone like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("contactphone not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("contactphone in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("contactphone not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("contactphone between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("contactphone not between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andGuanxiIsNull() {
            addCriterion("guanxi is null");
            return (Criteria) this;
        }

        public Criteria andGuanxiIsNotNull() {
            addCriterion("guanxi is not null");
            return (Criteria) this;
        }

        public Criteria andGuanxiEqualTo(String value) {
            addCriterion("guanxi =", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiNotEqualTo(String value) {
            addCriterion("guanxi <>", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiGreaterThan(String value) {
            addCriterion("guanxi >", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiGreaterThanOrEqualTo(String value) {
            addCriterion("guanxi >=", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiLessThan(String value) {
            addCriterion("guanxi <", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiLessThanOrEqualTo(String value) {
            addCriterion("guanxi <=", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiLike(String value) {
            addCriterion("guanxi like", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiNotLike(String value) {
            addCriterion("guanxi not like", value, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiIn(List<String> values) {
            addCriterion("guanxi in", values, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiNotIn(List<String> values) {
            addCriterion("guanxi not in", values, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiBetween(String value1, String value2) {
            addCriterion("guanxi between", value1, value2, "guanxi");
            return (Criteria) this;
        }

        public Criteria andGuanxiNotBetween(String value1, String value2) {
            addCriterion("guanxi not between", value1, value2, "guanxi");
            return (Criteria) this;
        }

        public Criteria andXuexijingliIsNull() {
            addCriterion("xuexijingli is null");
            return (Criteria) this;
        }

        public Criteria andXuexijingliIsNotNull() {
            addCriterion("xuexijingli is not null");
            return (Criteria) this;
        }

        public Criteria andXuexijingliEqualTo(String value) {
            addCriterion("xuexijingli =", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliNotEqualTo(String value) {
            addCriterion("xuexijingli <>", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliGreaterThan(String value) {
            addCriterion("xuexijingli >", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliGreaterThanOrEqualTo(String value) {
            addCriterion("xuexijingli >=", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliLessThan(String value) {
            addCriterion("xuexijingli <", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliLessThanOrEqualTo(String value) {
            addCriterion("xuexijingli <=", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliLike(String value) {
            addCriterion("xuexijingli like", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliNotLike(String value) {
            addCriterion("xuexijingli not like", value, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliIn(List<String> values) {
            addCriterion("xuexijingli in", values, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliNotIn(List<String> values) {
            addCriterion("xuexijingli not in", values, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliBetween(String value1, String value2) {
            addCriterion("xuexijingli between", value1, value2, "xuexijingli");
            return (Criteria) this;
        }

        public Criteria andXuexijingliNotBetween(String value1, String value2) {
            addCriterion("xuexijingli not between", value1, value2, "xuexijingli");
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("studentid like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("studentid not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNull() {
            addCriterion("jiguan is null");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNotNull() {
            addCriterion("jiguan is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanEqualTo(String value) {
            addCriterion("jiguan =", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotEqualTo(String value) {
            addCriterion("jiguan <>", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThan(String value) {
            addCriterion("jiguan >", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("jiguan >=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThan(String value) {
            addCriterion("jiguan <", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThanOrEqualTo(String value) {
            addCriterion("jiguan <=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLike(String value) {
            addCriterion("jiguan like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotLike(String value) {
            addCriterion("jiguan not like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanIn(List<String> values) {
            addCriterion("jiguan in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotIn(List<String> values) {
            addCriterion("jiguan not in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanBetween(String value1, String value2) {
            addCriterion("jiguan between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotBetween(String value1, String value2) {
            addCriterion("jiguan not between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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