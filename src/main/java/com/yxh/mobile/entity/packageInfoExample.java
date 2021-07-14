package com.yxh.mobile.entity;

import java.util.ArrayList;
import java.util.List;

public class packageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public packageInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageTalkIsNull() {
            addCriterion("package_talk is null");
            return (Criteria) this;
        }

        public Criteria andPackageTalkIsNotNull() {
            addCriterion("package_talk is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTalkEqualTo(Integer value) {
            addCriterion("package_talk =", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkNotEqualTo(Integer value) {
            addCriterion("package_talk <>", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkGreaterThan(Integer value) {
            addCriterion("package_talk >", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_talk >=", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkLessThan(Integer value) {
            addCriterion("package_talk <", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkLessThanOrEqualTo(Integer value) {
            addCriterion("package_talk <=", value, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkIn(List<Integer> values) {
            addCriterion("package_talk in", values, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkNotIn(List<Integer> values) {
            addCriterion("package_talk not in", values, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkBetween(Integer value1, Integer value2) {
            addCriterion("package_talk between", value1, value2, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageTalkNotBetween(Integer value1, Integer value2) {
            addCriterion("package_talk not between", value1, value2, "packageTalk");
            return (Criteria) this;
        }

        public Criteria andPackageSmsIsNull() {
            addCriterion("package_sms is null");
            return (Criteria) this;
        }

        public Criteria andPackageSmsIsNotNull() {
            addCriterion("package_sms is not null");
            return (Criteria) this;
        }

        public Criteria andPackageSmsEqualTo(Integer value) {
            addCriterion("package_sms =", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsNotEqualTo(Integer value) {
            addCriterion("package_sms <>", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsGreaterThan(Integer value) {
            addCriterion("package_sms >", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_sms >=", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsLessThan(Integer value) {
            addCriterion("package_sms <", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsLessThanOrEqualTo(Integer value) {
            addCriterion("package_sms <=", value, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsIn(List<Integer> values) {
            addCriterion("package_sms in", values, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsNotIn(List<Integer> values) {
            addCriterion("package_sms not in", values, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsBetween(Integer value1, Integer value2) {
            addCriterion("package_sms between", value1, value2, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("package_sms not between", value1, value2, "packageSms");
            return (Criteria) this;
        }

        public Criteria andPackageFlowIsNull() {
            addCriterion("package_flow is null");
            return (Criteria) this;
        }

        public Criteria andPackageFlowIsNotNull() {
            addCriterion("package_flow is not null");
            return (Criteria) this;
        }

        public Criteria andPackageFlowEqualTo(Integer value) {
            addCriterion("package_flow =", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowNotEqualTo(Integer value) {
            addCriterion("package_flow <>", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowGreaterThan(Integer value) {
            addCriterion("package_flow >", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_flow >=", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowLessThan(Integer value) {
            addCriterion("package_flow <", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowLessThanOrEqualTo(Integer value) {
            addCriterion("package_flow <=", value, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowIn(List<Integer> values) {
            addCriterion("package_flow in", values, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowNotIn(List<Integer> values) {
            addCriterion("package_flow not in", values, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowBetween(Integer value1, Integer value2) {
            addCriterion("package_flow between", value1, value2, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackageFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("package_flow not between", value1, value2, "packageFlow");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNull() {
            addCriterion("package_price is null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNotNull() {
            addCriterion("package_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceEqualTo(Double value) {
            addCriterion("package_price =", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotEqualTo(Double value) {
            addCriterion("package_price <>", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThan(Double value) {
            addCriterion("package_price >", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("package_price >=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThan(Double value) {
            addCriterion("package_price <", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThanOrEqualTo(Double value) {
            addCriterion("package_price <=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIn(List<Double> values) {
            addCriterion("package_price in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotIn(List<Double> values) {
            addCriterion("package_price not in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceBetween(Double value1, Double value2) {
            addCriterion("package_price between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotBetween(Double value1, Double value2) {
            addCriterion("package_price not between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andOverTalkIsNull() {
            addCriterion("over_talk is null");
            return (Criteria) this;
        }

        public Criteria andOverTalkIsNotNull() {
            addCriterion("over_talk is not null");
            return (Criteria) this;
        }

        public Criteria andOverTalkEqualTo(Double value) {
            addCriterion("over_talk =", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkNotEqualTo(Double value) {
            addCriterion("over_talk <>", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkGreaterThan(Double value) {
            addCriterion("over_talk >", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkGreaterThanOrEqualTo(Double value) {
            addCriterion("over_talk >=", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkLessThan(Double value) {
            addCriterion("over_talk <", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkLessThanOrEqualTo(Double value) {
            addCriterion("over_talk <=", value, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkIn(List<Double> values) {
            addCriterion("over_talk in", values, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkNotIn(List<Double> values) {
            addCriterion("over_talk not in", values, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkBetween(Double value1, Double value2) {
            addCriterion("over_talk between", value1, value2, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverTalkNotBetween(Double value1, Double value2) {
            addCriterion("over_talk not between", value1, value2, "overTalk");
            return (Criteria) this;
        }

        public Criteria andOverSmsIsNull() {
            addCriterion("over_sms is null");
            return (Criteria) this;
        }

        public Criteria andOverSmsIsNotNull() {
            addCriterion("over_sms is not null");
            return (Criteria) this;
        }

        public Criteria andOverSmsEqualTo(Double value) {
            addCriterion("over_sms =", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsNotEqualTo(Double value) {
            addCriterion("over_sms <>", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsGreaterThan(Double value) {
            addCriterion("over_sms >", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsGreaterThanOrEqualTo(Double value) {
            addCriterion("over_sms >=", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsLessThan(Double value) {
            addCriterion("over_sms <", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsLessThanOrEqualTo(Double value) {
            addCriterion("over_sms <=", value, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsIn(List<Double> values) {
            addCriterion("over_sms in", values, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsNotIn(List<Double> values) {
            addCriterion("over_sms not in", values, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsBetween(Double value1, Double value2) {
            addCriterion("over_sms between", value1, value2, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverSmsNotBetween(Double value1, Double value2) {
            addCriterion("over_sms not between", value1, value2, "overSms");
            return (Criteria) this;
        }

        public Criteria andOverFlowIsNull() {
            addCriterion("over_flow is null");
            return (Criteria) this;
        }

        public Criteria andOverFlowIsNotNull() {
            addCriterion("over_flow is not null");
            return (Criteria) this;
        }

        public Criteria andOverFlowEqualTo(Double value) {
            addCriterion("over_flow =", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowNotEqualTo(Double value) {
            addCriterion("over_flow <>", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowGreaterThan(Double value) {
            addCriterion("over_flow >", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("over_flow >=", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowLessThan(Double value) {
            addCriterion("over_flow <", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowLessThanOrEqualTo(Double value) {
            addCriterion("over_flow <=", value, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowIn(List<Double> values) {
            addCriterion("over_flow in", values, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowNotIn(List<Double> values) {
            addCriterion("over_flow not in", values, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowBetween(Double value1, Double value2) {
            addCriterion("over_flow between", value1, value2, "overFlow");
            return (Criteria) this;
        }

        public Criteria andOverFlowNotBetween(Double value1, Double value2) {
            addCriterion("over_flow not between", value1, value2, "overFlow");
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