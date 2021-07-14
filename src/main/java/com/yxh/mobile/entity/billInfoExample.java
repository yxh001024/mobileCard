package com.yxh.mobile.entity;

import java.util.ArrayList;
import java.util.List;

public class billInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public billInfoExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andTalkIsNull() {
            addCriterion("talk is null");
            return (Criteria) this;
        }

        public Criteria andTalkIsNotNull() {
            addCriterion("talk is not null");
            return (Criteria) this;
        }

        public Criteria andTalkEqualTo(Integer value) {
            addCriterion("talk =", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotEqualTo(Integer value) {
            addCriterion("talk <>", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkGreaterThan(Integer value) {
            addCriterion("talk >", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkGreaterThanOrEqualTo(Integer value) {
            addCriterion("talk >=", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkLessThan(Integer value) {
            addCriterion("talk <", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkLessThanOrEqualTo(Integer value) {
            addCriterion("talk <=", value, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkIn(List<Integer> values) {
            addCriterion("talk in", values, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotIn(List<Integer> values) {
            addCriterion("talk not in", values, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkBetween(Integer value1, Integer value2) {
            addCriterion("talk between", value1, value2, "talk");
            return (Criteria) this;
        }

        public Criteria andTalkNotBetween(Integer value1, Integer value2) {
            addCriterion("talk not between", value1, value2, "talk");
            return (Criteria) this;
        }

        public Criteria andSmsIsNull() {
            addCriterion("sms is null");
            return (Criteria) this;
        }

        public Criteria andSmsIsNotNull() {
            addCriterion("sms is not null");
            return (Criteria) this;
        }

        public Criteria andSmsEqualTo(Integer value) {
            addCriterion("sms =", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotEqualTo(Integer value) {
            addCriterion("sms <>", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsGreaterThan(Integer value) {
            addCriterion("sms >", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sms >=", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsLessThan(Integer value) {
            addCriterion("sms <", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsLessThanOrEqualTo(Integer value) {
            addCriterion("sms <=", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsIn(List<Integer> values) {
            addCriterion("sms in", values, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotIn(List<Integer> values) {
            addCriterion("sms not in", values, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsBetween(Integer value1, Integer value2) {
            addCriterion("sms between", value1, value2, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("sms not between", value1, value2, "sms");
            return (Criteria) this;
        }

        public Criteria andFlowIsNull() {
            addCriterion("flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(Integer value) {
            addCriterion("flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(Integer value) {
            addCriterion("flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(Integer value) {
            addCriterion("flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(Integer value) {
            addCriterion("flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(Integer value) {
            addCriterion("flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<Integer> values) {
            addCriterion("flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<Integer> values) {
            addCriterion("flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(Integer value1, Integer value2) {
            addCriterion("flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("flow not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andTalkCostIsNull() {
            addCriterion("talk_cost is null");
            return (Criteria) this;
        }

        public Criteria andTalkCostIsNotNull() {
            addCriterion("talk_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTalkCostEqualTo(Double value) {
            addCriterion("talk_cost =", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostNotEqualTo(Double value) {
            addCriterion("talk_cost <>", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostGreaterThan(Double value) {
            addCriterion("talk_cost >", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostGreaterThanOrEqualTo(Double value) {
            addCriterion("talk_cost >=", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostLessThan(Double value) {
            addCriterion("talk_cost <", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostLessThanOrEqualTo(Double value) {
            addCriterion("talk_cost <=", value, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostIn(List<Double> values) {
            addCriterion("talk_cost in", values, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostNotIn(List<Double> values) {
            addCriterion("talk_cost not in", values, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostBetween(Double value1, Double value2) {
            addCriterion("talk_cost between", value1, value2, "talkCost");
            return (Criteria) this;
        }

        public Criteria andTalkCostNotBetween(Double value1, Double value2) {
            addCriterion("talk_cost not between", value1, value2, "talkCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostIsNull() {
            addCriterion("sms_cost is null");
            return (Criteria) this;
        }

        public Criteria andSmsCostIsNotNull() {
            addCriterion("sms_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCostEqualTo(Double value) {
            addCriterion("sms_cost =", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostNotEqualTo(Double value) {
            addCriterion("sms_cost <>", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostGreaterThan(Double value) {
            addCriterion("sms_cost >", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostGreaterThanOrEqualTo(Double value) {
            addCriterion("sms_cost >=", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostLessThan(Double value) {
            addCriterion("sms_cost <", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostLessThanOrEqualTo(Double value) {
            addCriterion("sms_cost <=", value, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostIn(List<Double> values) {
            addCriterion("sms_cost in", values, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostNotIn(List<Double> values) {
            addCriterion("sms_cost not in", values, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostBetween(Double value1, Double value2) {
            addCriterion("sms_cost between", value1, value2, "smsCost");
            return (Criteria) this;
        }

        public Criteria andSmsCostNotBetween(Double value1, Double value2) {
            addCriterion("sms_cost not between", value1, value2, "smsCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostIsNull() {
            addCriterion("flow_cost is null");
            return (Criteria) this;
        }

        public Criteria andFlowCostIsNotNull() {
            addCriterion("flow_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCostEqualTo(Double value) {
            addCriterion("flow_cost =", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostNotEqualTo(Double value) {
            addCriterion("flow_cost <>", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostGreaterThan(Double value) {
            addCriterion("flow_cost >", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostGreaterThanOrEqualTo(Double value) {
            addCriterion("flow_cost >=", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostLessThan(Double value) {
            addCriterion("flow_cost <", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostLessThanOrEqualTo(Double value) {
            addCriterion("flow_cost <=", value, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostIn(List<Double> values) {
            addCriterion("flow_cost in", values, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostNotIn(List<Double> values) {
            addCriterion("flow_cost not in", values, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostBetween(Double value1, Double value2) {
            addCriterion("flow_cost between", value1, value2, "flowCost");
            return (Criteria) this;
        }

        public Criteria andFlowCostNotBetween(Double value1, Double value2) {
            addCriterion("flow_cost not between", value1, value2, "flowCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeIsNull() {
            addCriterion("total_recharge is null");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeIsNotNull() {
            addCriterion("total_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeEqualTo(Double value) {
            addCriterion("total_recharge =", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeNotEqualTo(Double value) {
            addCriterion("total_recharge <>", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeGreaterThan(Double value) {
            addCriterion("total_recharge >", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_recharge >=", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeLessThan(Double value) {
            addCriterion("total_recharge <", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeLessThanOrEqualTo(Double value) {
            addCriterion("total_recharge <=", value, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeIn(List<Double> values) {
            addCriterion("total_recharge in", values, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeNotIn(List<Double> values) {
            addCriterion("total_recharge not in", values, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeBetween(Double value1, Double value2) {
            addCriterion("total_recharge between", value1, value2, "totalRecharge");
            return (Criteria) this;
        }

        public Criteria andTotalRechargeNotBetween(Double value1, Double value2) {
            addCriterion("total_recharge not between", value1, value2, "totalRecharge");
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