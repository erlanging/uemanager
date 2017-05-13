package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.List;

public class SysStuJianliExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStuJianliExample() {
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

        public Criteria andHomepageIsNull() {
            addCriterion("homepage is null");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNotNull() {
            addCriterion("homepage is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageEqualTo(String value) {
            addCriterion("homepage =", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotEqualTo(String value) {
            addCriterion("homepage <>", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThan(String value) {
            addCriterion("homepage >", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("homepage >=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThan(String value) {
            addCriterion("homepage <", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThanOrEqualTo(String value) {
            addCriterion("homepage <=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLike(String value) {
            addCriterion("homepage like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotLike(String value) {
            addCriterion("homepage not like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageIn(List<String> values) {
            addCriterion("homepage in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotIn(List<String> values) {
            addCriterion("homepage not in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageBetween(String value1, String value2) {
            addCriterion("homepage between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotBetween(String value1, String value2) {
            addCriterion("homepage not between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andJlidIsNull() {
            addCriterion("jlid is null");
            return (Criteria) this;
        }

        public Criteria andJlidIsNotNull() {
            addCriterion("jlid is not null");
            return (Criteria) this;
        }

        public Criteria andJlidEqualTo(Integer value) {
            addCriterion("jlid =", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidNotEqualTo(Integer value) {
            addCriterion("jlid <>", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidGreaterThan(Integer value) {
            addCriterion("jlid >", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jlid >=", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidLessThan(Integer value) {
            addCriterion("jlid <", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidLessThanOrEqualTo(Integer value) {
            addCriterion("jlid <=", value, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidIn(List<Integer> values) {
            addCriterion("jlid in", values, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidNotIn(List<Integer> values) {
            addCriterion("jlid not in", values, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidBetween(Integer value1, Integer value2) {
            addCriterion("jlid between", value1, value2, "jlid");
            return (Criteria) this;
        }

        public Criteria andJlidNotBetween(Integer value1, Integer value2) {
            addCriterion("jlid not between", value1, value2, "jlid");
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andYingwennameIsNull() {
            addCriterion("yingwenname is null");
            return (Criteria) this;
        }

        public Criteria andYingwennameIsNotNull() {
            addCriterion("yingwenname is not null");
            return (Criteria) this;
        }

        public Criteria andYingwennameEqualTo(String value) {
            addCriterion("yingwenname =", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameNotEqualTo(String value) {
            addCriterion("yingwenname <>", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameGreaterThan(String value) {
            addCriterion("yingwenname >", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameGreaterThanOrEqualTo(String value) {
            addCriterion("yingwenname >=", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameLessThan(String value) {
            addCriterion("yingwenname <", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameLessThanOrEqualTo(String value) {
            addCriterion("yingwenname <=", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameLike(String value) {
            addCriterion("yingwenname like", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameNotLike(String value) {
            addCriterion("yingwenname not like", value, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameIn(List<String> values) {
            addCriterion("yingwenname in", values, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameNotIn(List<String> values) {
            addCriterion("yingwenname not in", values, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameBetween(String value1, String value2) {
            addCriterion("yingwenname between", value1, value2, "yingwenname");
            return (Criteria) this;
        }

        public Criteria andYingwennameNotBetween(String value1, String value2) {
            addCriterion("yingwenname not between", value1, value2, "yingwenname");
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

        public Criteria andMibilephoneIsNull() {
            addCriterion("mibilephone is null");
            return (Criteria) this;
        }

        public Criteria andMibilephoneIsNotNull() {
            addCriterion("mibilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMibilephoneEqualTo(String value) {
            addCriterion("mibilephone =", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneNotEqualTo(String value) {
            addCriterion("mibilephone <>", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneGreaterThan(String value) {
            addCriterion("mibilephone >", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mibilephone >=", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneLessThan(String value) {
            addCriterion("mibilephone <", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneLessThanOrEqualTo(String value) {
            addCriterion("mibilephone <=", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneLike(String value) {
            addCriterion("mibilephone like", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneNotLike(String value) {
            addCriterion("mibilephone not like", value, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneIn(List<String> values) {
            addCriterion("mibilephone in", values, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneNotIn(List<String> values) {
            addCriterion("mibilephone not in", values, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneBetween(String value1, String value2) {
            addCriterion("mibilephone between", value1, value2, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andMibilephoneNotBetween(String value1, String value2) {
            addCriterion("mibilephone not between", value1, value2, "mibilephone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangIsNull() {
            addCriterion("qiuzhiyixiang is null");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangIsNotNull() {
            addCriterion("qiuzhiyixiang is not null");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangEqualTo(String value) {
            addCriterion("qiuzhiyixiang =", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangNotEqualTo(String value) {
            addCriterion("qiuzhiyixiang <>", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangGreaterThan(String value) {
            addCriterion("qiuzhiyixiang >", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangGreaterThanOrEqualTo(String value) {
            addCriterion("qiuzhiyixiang >=", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangLessThan(String value) {
            addCriterion("qiuzhiyixiang <", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangLessThanOrEqualTo(String value) {
            addCriterion("qiuzhiyixiang <=", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangLike(String value) {
            addCriterion("qiuzhiyixiang like", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangNotLike(String value) {
            addCriterion("qiuzhiyixiang not like", value, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangIn(List<String> values) {
            addCriterion("qiuzhiyixiang in", values, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangNotIn(List<String> values) {
            addCriterion("qiuzhiyixiang not in", values, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangBetween(String value1, String value2) {
            addCriterion("qiuzhiyixiang between", value1, value2, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhiyixiangNotBetween(String value1, String value2) {
            addCriterion("qiuzhiyixiang not between", value1, value2, "qiuzhiyixiang");
            return (Criteria) this;
        }

        public Criteria andJinengIsNull() {
            addCriterion("jineng is null");
            return (Criteria) this;
        }

        public Criteria andJinengIsNotNull() {
            addCriterion("jineng is not null");
            return (Criteria) this;
        }

        public Criteria andJinengEqualTo(String value) {
            addCriterion("jineng =", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengNotEqualTo(String value) {
            addCriterion("jineng <>", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengGreaterThan(String value) {
            addCriterion("jineng >", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengGreaterThanOrEqualTo(String value) {
            addCriterion("jineng >=", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengLessThan(String value) {
            addCriterion("jineng <", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengLessThanOrEqualTo(String value) {
            addCriterion("jineng <=", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengLike(String value) {
            addCriterion("jineng like", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengNotLike(String value) {
            addCriterion("jineng not like", value, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengIn(List<String> values) {
            addCriterion("jineng in", values, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengNotIn(List<String> values) {
            addCriterion("jineng not in", values, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengBetween(String value1, String value2) {
            addCriterion("jineng between", value1, value2, "jineng");
            return (Criteria) this;
        }

        public Criteria andJinengNotBetween(String value1, String value2) {
            addCriterion("jineng not between", value1, value2, "jineng");
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

        public Criteria andLastmodifyIsNull() {
            addCriterion("lastmodify is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIsNotNull() {
            addCriterion("lastmodify is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyEqualTo(String value) {
            addCriterion("lastmodify =", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotEqualTo(String value) {
            addCriterion("lastmodify <>", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyGreaterThan(String value) {
            addCriterion("lastmodify >", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyGreaterThanOrEqualTo(String value) {
            addCriterion("lastmodify >=", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyLessThan(String value) {
            addCriterion("lastmodify <", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyLessThanOrEqualTo(String value) {
            addCriterion("lastmodify <=", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyLike(String value) {
            addCriterion("lastmodify like", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotLike(String value) {
            addCriterion("lastmodify not like", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIn(List<String> values) {
            addCriterion("lastmodify in", values, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotIn(List<String> values) {
            addCriterion("lastmodify not in", values, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyBetween(String value1, String value2) {
            addCriterion("lastmodify between", value1, value2, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotBetween(String value1, String value2) {
            addCriterion("lastmodify not between", value1, value2, "lastmodify");
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