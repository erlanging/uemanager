package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.List;

public class SysStuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStuInfoExample() {
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

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthdate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthdate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
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

        public Criteria andStudyidIsNull() {
            addCriterion("studyid is null");
            return (Criteria) this;
        }

        public Criteria andStudyidIsNotNull() {
            addCriterion("studyid is not null");
            return (Criteria) this;
        }

        public Criteria andStudyidEqualTo(String value) {
            addCriterion("studyid =", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotEqualTo(String value) {
            addCriterion("studyid <>", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThan(String value) {
            addCriterion("studyid >", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThanOrEqualTo(String value) {
            addCriterion("studyid >=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThan(String value) {
            addCriterion("studyid <", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThanOrEqualTo(String value) {
            addCriterion("studyid <=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLike(String value) {
            addCriterion("studyid like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotLike(String value) {
            addCriterion("studyid not like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidIn(List<String> values) {
            addCriterion("studyid in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotIn(List<String> values) {
            addCriterion("studyid not in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidBetween(String value1, String value2) {
            addCriterion("studyid between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotBetween(String value1, String value2) {
            addCriterion("studyid not between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNull() {
            addCriterion("identityId is null");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNotNull() {
            addCriterion("identityId is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityidEqualTo(String value) {
            addCriterion("identityId =", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotEqualTo(String value) {
            addCriterion("identityId <>", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThan(String value) {
            addCriterion("identityId >", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThanOrEqualTo(String value) {
            addCriterion("identityId >=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThan(String value) {
            addCriterion("identityId <", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThanOrEqualTo(String value) {
            addCriterion("identityId <=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLike(String value) {
            addCriterion("identityId like", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotLike(String value) {
            addCriterion("identityId not like", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidIn(List<String> values) {
            addCriterion("identityId in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotIn(List<String> values) {
            addCriterion("identityId not in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidBetween(String value1, String value2) {
            addCriterion("identityId between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotBetween(String value1, String value2) {
            addCriterion("identityId not between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeIsNull() {
            addCriterion("identityCardType is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeIsNotNull() {
            addCriterion("identityCardType is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeEqualTo(String value) {
            addCriterion("identityCardType =", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeNotEqualTo(String value) {
            addCriterion("identityCardType <>", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeGreaterThan(String value) {
            addCriterion("identityCardType >", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("identityCardType >=", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeLessThan(String value) {
            addCriterion("identityCardType <", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeLessThanOrEqualTo(String value) {
            addCriterion("identityCardType <=", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeLike(String value) {
            addCriterion("identityCardType like", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeNotLike(String value) {
            addCriterion("identityCardType not like", value, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeIn(List<String> values) {
            addCriterion("identityCardType in", values, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeNotIn(List<String> values) {
            addCriterion("identityCardType not in", values, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeBetween(String value1, String value2) {
            addCriterion("identityCardType between", value1, value2, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andIdentitycardtypeNotBetween(String value1, String value2) {
            addCriterion("identityCardType not between", value1, value2, "identitycardtype");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNull() {
            addCriterion("politicsStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNotNull() {
            addCriterion("politicsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusEqualTo(String value) {
            addCriterion("politicsStatus =", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotEqualTo(String value) {
            addCriterion("politicsStatus <>", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThan(String value) {
            addCriterion("politicsStatus >", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("politicsStatus >=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThan(String value) {
            addCriterion("politicsStatus <", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThanOrEqualTo(String value) {
            addCriterion("politicsStatus <=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLike(String value) {
            addCriterion("politicsStatus like", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotLike(String value) {
            addCriterion("politicsStatus not like", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIn(List<String> values) {
            addCriterion("politicsStatus in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotIn(List<String> values) {
            addCriterion("politicsStatus not in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusBetween(String value1, String value2) {
            addCriterion("politicsStatus between", value1, value2, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotBetween(String value1, String value2) {
            addCriterion("politicsStatus not between", value1, value2, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andHealthconditionIsNull() {
            addCriterion("healthcondition is null");
            return (Criteria) this;
        }

        public Criteria andHealthconditionIsNotNull() {
            addCriterion("healthcondition is not null");
            return (Criteria) this;
        }

        public Criteria andHealthconditionEqualTo(String value) {
            addCriterion("healthcondition =", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionNotEqualTo(String value) {
            addCriterion("healthcondition <>", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionGreaterThan(String value) {
            addCriterion("healthcondition >", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionGreaterThanOrEqualTo(String value) {
            addCriterion("healthcondition >=", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionLessThan(String value) {
            addCriterion("healthcondition <", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionLessThanOrEqualTo(String value) {
            addCriterion("healthcondition <=", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionLike(String value) {
            addCriterion("healthcondition like", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionNotLike(String value) {
            addCriterion("healthcondition not like", value, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionIn(List<String> values) {
            addCriterion("healthcondition in", values, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionNotIn(List<String> values) {
            addCriterion("healthcondition not in", values, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionBetween(String value1, String value2) {
            addCriterion("healthcondition between", value1, value2, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHealthconditionNotBetween(String value1, String value2) {
            addCriterion("healthcondition not between", value1, value2, "healthcondition");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiIsNull() {
            addCriterion("hukousuozaidi is null");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiIsNotNull() {
            addCriterion("hukousuozaidi is not null");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiEqualTo(String value) {
            addCriterion("hukousuozaidi =", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiNotEqualTo(String value) {
            addCriterion("hukousuozaidi <>", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiGreaterThan(String value) {
            addCriterion("hukousuozaidi >", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiGreaterThanOrEqualTo(String value) {
            addCriterion("hukousuozaidi >=", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiLessThan(String value) {
            addCriterion("hukousuozaidi <", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiLessThanOrEqualTo(String value) {
            addCriterion("hukousuozaidi <=", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiLike(String value) {
            addCriterion("hukousuozaidi like", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiNotLike(String value) {
            addCriterion("hukousuozaidi not like", value, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiIn(List<String> values) {
            addCriterion("hukousuozaidi in", values, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiNotIn(List<String> values) {
            addCriterion("hukousuozaidi not in", values, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiBetween(String value1, String value2) {
            addCriterion("hukousuozaidi between", value1, value2, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukousuozaidiNotBetween(String value1, String value2) {
            addCriterion("hukousuozaidi not between", value1, value2, "hukousuozaidi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiIsNull() {
            addCriterion("hukouxingzhi is null");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiIsNotNull() {
            addCriterion("hukouxingzhi is not null");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiEqualTo(String value) {
            addCriterion("hukouxingzhi =", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiNotEqualTo(String value) {
            addCriterion("hukouxingzhi <>", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiGreaterThan(String value) {
            addCriterion("hukouxingzhi >", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("hukouxingzhi >=", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiLessThan(String value) {
            addCriterion("hukouxingzhi <", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiLessThanOrEqualTo(String value) {
            addCriterion("hukouxingzhi <=", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiLike(String value) {
            addCriterion("hukouxingzhi like", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiNotLike(String value) {
            addCriterion("hukouxingzhi not like", value, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiIn(List<String> values) {
            addCriterion("hukouxingzhi in", values, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiNotIn(List<String> values) {
            addCriterion("hukouxingzhi not in", values, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiBetween(String value1, String value2) {
            addCriterion("hukouxingzhi between", value1, value2, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andHukouxingzhiNotBetween(String value1, String value2) {
            addCriterion("hukouxingzhi not between", value1, value2, "hukouxingzhi");
            return (Criteria) this;
        }

        public Criteria andTechangIsNull() {
            addCriterion("techang is null");
            return (Criteria) this;
        }

        public Criteria andTechangIsNotNull() {
            addCriterion("techang is not null");
            return (Criteria) this;
        }

        public Criteria andTechangEqualTo(String value) {
            addCriterion("techang =", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangNotEqualTo(String value) {
            addCriterion("techang <>", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangGreaterThan(String value) {
            addCriterion("techang >", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangGreaterThanOrEqualTo(String value) {
            addCriterion("techang >=", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangLessThan(String value) {
            addCriterion("techang <", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangLessThanOrEqualTo(String value) {
            addCriterion("techang <=", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangLike(String value) {
            addCriterion("techang like", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangNotLike(String value) {
            addCriterion("techang not like", value, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangIn(List<String> values) {
            addCriterion("techang in", values, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangNotIn(List<String> values) {
            addCriterion("techang not in", values, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangBetween(String value1, String value2) {
            addCriterion("techang between", value1, value2, "techang");
            return (Criteria) this;
        }

        public Criteria andTechangNotBetween(String value1, String value2) {
            addCriterion("techang not between", value1, value2, "techang");
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

        public Criteria andContactinfoIsNull() {
            addCriterion("contactinfo is null");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNotNull() {
            addCriterion("contactinfo is not null");
            return (Criteria) this;
        }

        public Criteria andContactinfoEqualTo(String value) {
            addCriterion("contactinfo =", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotEqualTo(String value) {
            addCriterion("contactinfo <>", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThan(String value) {
            addCriterion("contactinfo >", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThanOrEqualTo(String value) {
            addCriterion("contactinfo >=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThan(String value) {
            addCriterion("contactinfo <", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThanOrEqualTo(String value) {
            addCriterion("contactinfo <=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLike(String value) {
            addCriterion("contactinfo like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotLike(String value) {
            addCriterion("contactinfo not like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoIn(List<String> values) {
            addCriterion("contactinfo in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotIn(List<String> values) {
            addCriterion("contactinfo not in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoBetween(String value1, String value2) {
            addCriterion("contactinfo between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotBetween(String value1, String value2) {
            addCriterion("contactinfo not between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiIsNull() {
            addCriterion("suozaibanji is null");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiIsNotNull() {
            addCriterion("suozaibanji is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiEqualTo(String value) {
            addCriterion("suozaibanji =", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiNotEqualTo(String value) {
            addCriterion("suozaibanji <>", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiGreaterThan(String value) {
            addCriterion("suozaibanji >", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiGreaterThanOrEqualTo(String value) {
            addCriterion("suozaibanji >=", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiLessThan(String value) {
            addCriterion("suozaibanji <", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiLessThanOrEqualTo(String value) {
            addCriterion("suozaibanji <=", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiLike(String value) {
            addCriterion("suozaibanji like", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiNotLike(String value) {
            addCriterion("suozaibanji not like", value, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiIn(List<String> values) {
            addCriterion("suozaibanji in", values, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiNotIn(List<String> values) {
            addCriterion("suozaibanji not in", values, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiBetween(String value1, String value2) {
            addCriterion("suozaibanji between", value1, value2, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andSuozaibanjiNotBetween(String value1, String value2) {
            addCriterion("suozaibanji not between", value1, value2, "suozaibanji");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("zhuanye is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("zhuanye is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("zhuanye =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("zhuanye <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("zhuanye >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanye >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("zhuanye <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("zhuanye <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("zhuanye like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("zhuanye not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("zhuanye in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("zhuanye not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("zhuanye between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("zhuanye not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andSusheidIsNull() {
            addCriterion("susheId is null");
            return (Criteria) this;
        }

        public Criteria andSusheidIsNotNull() {
            addCriterion("susheId is not null");
            return (Criteria) this;
        }

        public Criteria andSusheidEqualTo(String value) {
            addCriterion("susheId =", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotEqualTo(String value) {
            addCriterion("susheId <>", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidGreaterThan(String value) {
            addCriterion("susheId >", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidGreaterThanOrEqualTo(String value) {
            addCriterion("susheId >=", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLessThan(String value) {
            addCriterion("susheId <", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLessThanOrEqualTo(String value) {
            addCriterion("susheId <=", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidLike(String value) {
            addCriterion("susheId like", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotLike(String value) {
            addCriterion("susheId not like", value, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidIn(List<String> values) {
            addCriterion("susheId in", values, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotIn(List<String> values) {
            addCriterion("susheId not in", values, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidBetween(String value1, String value2) {
            addCriterion("susheId between", value1, value2, "susheid");
            return (Criteria) this;
        }

        public Criteria andSusheidNotBetween(String value1, String value2) {
            addCriterion("susheId not between", value1, value2, "susheid");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("zhiwu is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("zhiwu is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("zhiwu =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("zhiwu <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("zhiwu >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("zhiwu >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("zhiwu <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("zhiwu <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("zhiwu like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("zhiwu not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("zhiwu in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("zhiwu not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("zhiwu between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("zhiwu not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andDushengzinvIsNull() {
            addCriterion("dushengzinv is null");
            return (Criteria) this;
        }

        public Criteria andDushengzinvIsNotNull() {
            addCriterion("dushengzinv is not null");
            return (Criteria) this;
        }

        public Criteria andDushengzinvEqualTo(String value) {
            addCriterion("dushengzinv =", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvNotEqualTo(String value) {
            addCriterion("dushengzinv <>", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvGreaterThan(String value) {
            addCriterion("dushengzinv >", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvGreaterThanOrEqualTo(String value) {
            addCriterion("dushengzinv >=", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvLessThan(String value) {
            addCriterion("dushengzinv <", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvLessThanOrEqualTo(String value) {
            addCriterion("dushengzinv <=", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvLike(String value) {
            addCriterion("dushengzinv like", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvNotLike(String value) {
            addCriterion("dushengzinv not like", value, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvIn(List<String> values) {
            addCriterion("dushengzinv in", values, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvNotIn(List<String> values) {
            addCriterion("dushengzinv not in", values, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvBetween(String value1, String value2) {
            addCriterion("dushengzinv between", value1, value2, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andDushengzinvNotBetween(String value1, String value2) {
            addCriterion("dushengzinv not between", value1, value2, "dushengzinv");
            return (Criteria) this;
        }

        public Criteria andLianxirennameIsNull() {
            addCriterion("lianxirenname is null");
            return (Criteria) this;
        }

        public Criteria andLianxirennameIsNotNull() {
            addCriterion("lianxirenname is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirennameEqualTo(String value) {
            addCriterion("lianxirenname =", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameNotEqualTo(String value) {
            addCriterion("lianxirenname <>", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameGreaterThan(String value) {
            addCriterion("lianxirenname >", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirenname >=", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameLessThan(String value) {
            addCriterion("lianxirenname <", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameLessThanOrEqualTo(String value) {
            addCriterion("lianxirenname <=", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameLike(String value) {
            addCriterion("lianxirenname like", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameNotLike(String value) {
            addCriterion("lianxirenname not like", value, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameIn(List<String> values) {
            addCriterion("lianxirenname in", values, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameNotIn(List<String> values) {
            addCriterion("lianxirenname not in", values, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameBetween(String value1, String value2) {
            addCriterion("lianxirenname between", value1, value2, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirennameNotBetween(String value1, String value2) {
            addCriterion("lianxirenname not between", value1, value2, "lianxirenname");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiIsNull() {
            addCriterion("lianxirenguanxi is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiIsNotNull() {
            addCriterion("lianxirenguanxi is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiEqualTo(String value) {
            addCriterion("lianxirenguanxi =", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiNotEqualTo(String value) {
            addCriterion("lianxirenguanxi <>", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiGreaterThan(String value) {
            addCriterion("lianxirenguanxi >", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirenguanxi >=", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiLessThan(String value) {
            addCriterion("lianxirenguanxi <", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiLessThanOrEqualTo(String value) {
            addCriterion("lianxirenguanxi <=", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiLike(String value) {
            addCriterion("lianxirenguanxi like", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiNotLike(String value) {
            addCriterion("lianxirenguanxi not like", value, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiIn(List<String> values) {
            addCriterion("lianxirenguanxi in", values, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiNotIn(List<String> values) {
            addCriterion("lianxirenguanxi not in", values, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiBetween(String value1, String value2) {
            addCriterion("lianxirenguanxi between", value1, value2, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenguanxiNotBetween(String value1, String value2) {
            addCriterion("lianxirenguanxi not between", value1, value2, "lianxirenguanxi");
            return (Criteria) this;
        }

        public Criteria andLianxirenageIsNull() {
            addCriterion("lianxirenage is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenageIsNotNull() {
            addCriterion("lianxirenage is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenageEqualTo(String value) {
            addCriterion("lianxirenage =", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageNotEqualTo(String value) {
            addCriterion("lianxirenage <>", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageGreaterThan(String value) {
            addCriterion("lianxirenage >", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirenage >=", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageLessThan(String value) {
            addCriterion("lianxirenage <", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageLessThanOrEqualTo(String value) {
            addCriterion("lianxirenage <=", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageLike(String value) {
            addCriterion("lianxirenage like", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageNotLike(String value) {
            addCriterion("lianxirenage not like", value, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageIn(List<String> values) {
            addCriterion("lianxirenage in", values, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageNotIn(List<String> values) {
            addCriterion("lianxirenage not in", values, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageBetween(String value1, String value2) {
            addCriterion("lianxirenage between", value1, value2, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenageNotBetween(String value1, String value2) {
            addCriterion("lianxirenage not between", value1, value2, "lianxirenage");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrIsNull() {
            addCriterion("lianxirenaddr is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrIsNotNull() {
            addCriterion("lianxirenaddr is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrEqualTo(String value) {
            addCriterion("lianxirenaddr =", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrNotEqualTo(String value) {
            addCriterion("lianxirenaddr <>", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrGreaterThan(String value) {
            addCriterion("lianxirenaddr >", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirenaddr >=", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrLessThan(String value) {
            addCriterion("lianxirenaddr <", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrLessThanOrEqualTo(String value) {
            addCriterion("lianxirenaddr <=", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrLike(String value) {
            addCriterion("lianxirenaddr like", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrNotLike(String value) {
            addCriterion("lianxirenaddr not like", value, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrIn(List<String> values) {
            addCriterion("lianxirenaddr in", values, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrNotIn(List<String> values) {
            addCriterion("lianxirenaddr not in", values, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrBetween(String value1, String value2) {
            addCriterion("lianxirenaddr between", value1, value2, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenaddrNotBetween(String value1, String value2) {
            addCriterion("lianxirenaddr not between", value1, value2, "lianxirenaddr");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIsNull() {
            addCriterion("lianxirenphone is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIsNotNull() {
            addCriterion("lianxirenphone is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneEqualTo(String value) {
            addCriterion("lianxirenphone =", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotEqualTo(String value) {
            addCriterion("lianxirenphone <>", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneGreaterThan(String value) {
            addCriterion("lianxirenphone >", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirenphone >=", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLessThan(String value) {
            addCriterion("lianxirenphone <", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLessThanOrEqualTo(String value) {
            addCriterion("lianxirenphone <=", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneLike(String value) {
            addCriterion("lianxirenphone like", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotLike(String value) {
            addCriterion("lianxirenphone not like", value, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneIn(List<String> values) {
            addCriterion("lianxirenphone in", values, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotIn(List<String> values) {
            addCriterion("lianxirenphone not in", values, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneBetween(String value1, String value2) {
            addCriterion("lianxirenphone between", value1, value2, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andLianxirenphoneNotBetween(String value1, String value2) {
            addCriterion("lianxirenphone not between", value1, value2, "lianxirenphone");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIsNull() {
            addCriterion("openingtime is null");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIsNotNull() {
            addCriterion("openingtime is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeEqualTo(String value) {
            addCriterion("openingtime =", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotEqualTo(String value) {
            addCriterion("openingtime <>", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeGreaterThan(String value) {
            addCriterion("openingtime >", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeGreaterThanOrEqualTo(String value) {
            addCriterion("openingtime >=", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeLessThan(String value) {
            addCriterion("openingtime <", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeLessThanOrEqualTo(String value) {
            addCriterion("openingtime <=", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeLike(String value) {
            addCriterion("openingtime like", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotLike(String value) {
            addCriterion("openingtime not like", value, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeIn(List<String> values) {
            addCriterion("openingtime in", values, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotIn(List<String> values) {
            addCriterion("openingtime not in", values, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeBetween(String value1, String value2) {
            addCriterion("openingtime between", value1, value2, "openingtime");
            return (Criteria) this;
        }

        public Criteria andOpeningtimeNotBetween(String value1, String value2) {
            addCriterion("openingtime not between", value1, value2, "openingtime");
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

        public Criteria andConnectphoneIsNull() {
            addCriterion("connectphone is null");
            return (Criteria) this;
        }

        public Criteria andConnectphoneIsNotNull() {
            addCriterion("connectphone is not null");
            return (Criteria) this;
        }

        public Criteria andConnectphoneEqualTo(String value) {
            addCriterion("connectphone =", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotEqualTo(String value) {
            addCriterion("connectphone <>", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneGreaterThan(String value) {
            addCriterion("connectphone >", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneGreaterThanOrEqualTo(String value) {
            addCriterion("connectphone >=", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLessThan(String value) {
            addCriterion("connectphone <", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLessThanOrEqualTo(String value) {
            addCriterion("connectphone <=", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLike(String value) {
            addCriterion("connectphone like", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotLike(String value) {
            addCriterion("connectphone not like", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneIn(List<String> values) {
            addCriterion("connectphone in", values, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotIn(List<String> values) {
            addCriterion("connectphone not in", values, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneBetween(String value1, String value2) {
            addCriterion("connectphone between", value1, value2, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotBetween(String value1, String value2) {
            addCriterion("connectphone not between", value1, value2, "connectphone");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiIsNull() {
            addCriterion("lianxirendanwei is null");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiIsNotNull() {
            addCriterion("lianxirendanwei is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiEqualTo(String value) {
            addCriterion("lianxirendanwei =", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiNotEqualTo(String value) {
            addCriterion("lianxirendanwei <>", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiGreaterThan(String value) {
            addCriterion("lianxirendanwei >", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiGreaterThanOrEqualTo(String value) {
            addCriterion("lianxirendanwei >=", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiLessThan(String value) {
            addCriterion("lianxirendanwei <", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiLessThanOrEqualTo(String value) {
            addCriterion("lianxirendanwei <=", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiLike(String value) {
            addCriterion("lianxirendanwei like", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiNotLike(String value) {
            addCriterion("lianxirendanwei not like", value, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiIn(List<String> values) {
            addCriterion("lianxirendanwei in", values, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiNotIn(List<String> values) {
            addCriterion("lianxirendanwei not in", values, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiBetween(String value1, String value2) {
            addCriterion("lianxirendanwei between", value1, value2, "lianxirendanwei");
            return (Criteria) this;
        }

        public Criteria andLianxirendanweiNotBetween(String value1, String value2) {
            addCriterion("lianxirendanwei not between", value1, value2, "lianxirendanwei");
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