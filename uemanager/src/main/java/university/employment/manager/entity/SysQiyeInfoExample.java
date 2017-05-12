package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.List;

public class SysQiyeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysQiyeInfoExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andQynameIsNull() {
            addCriterion("qyname is null");
            return (Criteria) this;
        }

        public Criteria andQynameIsNotNull() {
            addCriterion("qyname is not null");
            return (Criteria) this;
        }

        public Criteria andQynameEqualTo(String value) {
            addCriterion("qyname =", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameNotEqualTo(String value) {
            addCriterion("qyname <>", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameGreaterThan(String value) {
            addCriterion("qyname >", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameGreaterThanOrEqualTo(String value) {
            addCriterion("qyname >=", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameLessThan(String value) {
            addCriterion("qyname <", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameLessThanOrEqualTo(String value) {
            addCriterion("qyname <=", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameLike(String value) {
            addCriterion("qyname like", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameNotLike(String value) {
            addCriterion("qyname not like", value, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameIn(List<String> values) {
            addCriterion("qyname in", values, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameNotIn(List<String> values) {
            addCriterion("qyname not in", values, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameBetween(String value1, String value2) {
            addCriterion("qyname between", value1, value2, "qyname");
            return (Criteria) this;
        }

        public Criteria andQynameNotBetween(String value1, String value2) {
            addCriterion("qyname not between", value1, value2, "qyname");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNull() {
            addCriterion("\" businessNo\" is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("\" businessNo\" is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("\" businessNo\" =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("\" businessNo\" <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("\" businessNo\" >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("\" businessNo\" >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("\" businessNo\" <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("\" businessNo\" <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("\" businessNo\" like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("\" businessNo\" not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("\" businessNo\" in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("\" businessNo\" not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("\" businessNo\" between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("\" businessNo\" not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumIsNull() {
            addCriterion("nationaltaxregisnum is null");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumIsNotNull() {
            addCriterion("nationaltaxregisnum is not null");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumEqualTo(String value) {
            addCriterion("nationaltaxregisnum =", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumNotEqualTo(String value) {
            addCriterion("nationaltaxregisnum <>", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumGreaterThan(String value) {
            addCriterion("nationaltaxregisnum >", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumGreaterThanOrEqualTo(String value) {
            addCriterion("nationaltaxregisnum >=", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumLessThan(String value) {
            addCriterion("nationaltaxregisnum <", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumLessThanOrEqualTo(String value) {
            addCriterion("nationaltaxregisnum <=", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumLike(String value) {
            addCriterion("nationaltaxregisnum like", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumNotLike(String value) {
            addCriterion("nationaltaxregisnum not like", value, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumIn(List<String> values) {
            addCriterion("nationaltaxregisnum in", values, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumNotIn(List<String> values) {
            addCriterion("nationaltaxregisnum not in", values, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumBetween(String value1, String value2) {
            addCriterion("nationaltaxregisnum between", value1, value2, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andNationaltaxregisnumNotBetween(String value1, String value2) {
            addCriterion("nationaltaxregisnum not between", value1, value2, "nationaltaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumIsNull() {
            addCriterion("localtaxregisnum is null");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumIsNotNull() {
            addCriterion("localtaxregisnum is not null");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumEqualTo(String value) {
            addCriterion("localtaxregisnum =", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumNotEqualTo(String value) {
            addCriterion("localtaxregisnum <>", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumGreaterThan(String value) {
            addCriterion("localtaxregisnum >", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumGreaterThanOrEqualTo(String value) {
            addCriterion("localtaxregisnum >=", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumLessThan(String value) {
            addCriterion("localtaxregisnum <", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumLessThanOrEqualTo(String value) {
            addCriterion("localtaxregisnum <=", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumLike(String value) {
            addCriterion("localtaxregisnum like", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumNotLike(String value) {
            addCriterion("localtaxregisnum not like", value, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumIn(List<String> values) {
            addCriterion("localtaxregisnum in", values, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumNotIn(List<String> values) {
            addCriterion("localtaxregisnum not in", values, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumBetween(String value1, String value2) {
            addCriterion("localtaxregisnum between", value1, value2, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andLocaltaxregisnumNotBetween(String value1, String value2) {
            addCriterion("localtaxregisnum not between", value1, value2, "localtaxregisnum");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("bankaccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankaccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankaccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankaccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankaccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankaccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankaccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankaccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankaccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankaccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankaccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankaccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankaccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNull() {
            addCriterion("legalrepresentative is null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNotNull() {
            addCriterion("legalrepresentative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeEqualTo(String value) {
            addCriterion("legalrepresentative =", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotEqualTo(String value) {
            addCriterion("legalrepresentative <>", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThan(String value) {
            addCriterion("legalrepresentative >", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legalrepresentative >=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThan(String value) {
            addCriterion("legalrepresentative <", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legalrepresentative <=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLike(String value) {
            addCriterion("legalrepresentative like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotLike(String value) {
            addCriterion("legalrepresentative not like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIn(List<String> values) {
            addCriterion("legalrepresentative in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotIn(List<String> values) {
            addCriterion("legalrepresentative not in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeBetween(String value1, String value2) {
            addCriterion("legalrepresentative between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotBetween(String value1, String value2) {
            addCriterion("legalrepresentative not between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIsNull() {
            addCriterion("legalphone is null");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIsNotNull() {
            addCriterion("legalphone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalphoneEqualTo(String value) {
            addCriterion("legalphone =", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotEqualTo(String value) {
            addCriterion("legalphone <>", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneGreaterThan(String value) {
            addCriterion("legalphone >", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneGreaterThanOrEqualTo(String value) {
            addCriterion("legalphone >=", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLessThan(String value) {
            addCriterion("legalphone <", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLessThanOrEqualTo(String value) {
            addCriterion("legalphone <=", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLike(String value) {
            addCriterion("legalphone like", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotLike(String value) {
            addCriterion("legalphone not like", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIn(List<String> values) {
            addCriterion("legalphone in", values, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotIn(List<String> values) {
            addCriterion("legalphone not in", values, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneBetween(String value1, String value2) {
            addCriterion("legalphone between", value1, value2, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotBetween(String value1, String value2) {
            addCriterion("legalphone not between", value1, value2, "legalphone");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNull() {
            addCriterion("contactname is null");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNotNull() {
            addCriterion("contactname is not null");
            return (Criteria) this;
        }

        public Criteria andContactnameEqualTo(String value) {
            addCriterion("contactname =", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotEqualTo(String value) {
            addCriterion("contactname <>", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThan(String value) {
            addCriterion("contactname >", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactname >=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThan(String value) {
            addCriterion("contactname <", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThanOrEqualTo(String value) {
            addCriterion("contactname <=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLike(String value) {
            addCriterion("contactname like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotLike(String value) {
            addCriterion("contactname not like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameIn(List<String> values) {
            addCriterion("contactname in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotIn(List<String> values) {
            addCriterion("contactname not in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameBetween(String value1, String value2) {
            addCriterion("contactname between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotBetween(String value1, String value2) {
            addCriterion("contactname not between", value1, value2, "contactname");
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

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andLegalformIsNull() {
            addCriterion("legalform is null");
            return (Criteria) this;
        }

        public Criteria andLegalformIsNotNull() {
            addCriterion("legalform is not null");
            return (Criteria) this;
        }

        public Criteria andLegalformEqualTo(String value) {
            addCriterion("legalform =", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformNotEqualTo(String value) {
            addCriterion("legalform <>", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformGreaterThan(String value) {
            addCriterion("legalform >", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformGreaterThanOrEqualTo(String value) {
            addCriterion("legalform >=", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformLessThan(String value) {
            addCriterion("legalform <", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformLessThanOrEqualTo(String value) {
            addCriterion("legalform <=", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformLike(String value) {
            addCriterion("legalform like", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformNotLike(String value) {
            addCriterion("legalform not like", value, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformIn(List<String> values) {
            addCriterion("legalform in", values, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformNotIn(List<String> values) {
            addCriterion("legalform not in", values, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformBetween(String value1, String value2) {
            addCriterion("legalform between", value1, value2, "legalform");
            return (Criteria) this;
        }

        public Criteria andLegalformNotBetween(String value1, String value2) {
            addCriterion("legalform not between", value1, value2, "legalform");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesIsNull() {
            addCriterion("numberoemployees is null");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesIsNotNull() {
            addCriterion("numberoemployees is not null");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesEqualTo(Integer value) {
            addCriterion("numberoemployees =", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesNotEqualTo(Integer value) {
            addCriterion("numberoemployees <>", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesGreaterThan(Integer value) {
            addCriterion("numberoemployees >", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberoemployees >=", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesLessThan(Integer value) {
            addCriterion("numberoemployees <", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesLessThanOrEqualTo(Integer value) {
            addCriterion("numberoemployees <=", value, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesIn(List<Integer> values) {
            addCriterion("numberoemployees in", values, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesNotIn(List<Integer> values) {
            addCriterion("numberoemployees not in", values, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesBetween(Integer value1, Integer value2) {
            addCriterion("numberoemployees between", value1, value2, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andNumberoemployeesNotBetween(Integer value1, Integer value2) {
            addCriterion("numberoemployees not between", value1, value2, "numberoemployees");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
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