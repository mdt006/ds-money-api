package com.ds.money.entity;

import java.util.ArrayList;
import java.util.List;

public class DsFromKeyTypeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public DsFromKeyTypeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andTypeNameIsNull() {
			addCriterion("type_name is null");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNotNull() {
			addCriterion("type_name is not null");
			return (Criteria) this;
		}

		public Criteria andTypeNameEqualTo(String value) {
			addCriterion("type_name =", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotEqualTo(String value) {
			addCriterion("type_name <>", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThan(String value) {
			addCriterion("type_name >", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
			addCriterion("type_name >=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThan(String value) {
			addCriterion("type_name <", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThanOrEqualTo(String value) {
			addCriterion("type_name <=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLike(String value) {
			addCriterion("type_name like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotLike(String value) {
			addCriterion("type_name not like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameIn(List<String> values) {
			addCriterion("type_name in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotIn(List<String> values) {
			addCriterion("type_name not in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameBetween(String value1, String value2) {
			addCriterion("type_name between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotBetween(String value1, String value2) {
			addCriterion("type_name not between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyIsNull() {
			addCriterion("fk_from_key is null");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyIsNotNull() {
			addCriterion("fk_from_key is not null");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyEqualTo(String value) {
			addCriterion("fk_from_key =", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyNotEqualTo(String value) {
			addCriterion("fk_from_key <>", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyGreaterThan(String value) {
			addCriterion("fk_from_key >", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyGreaterThanOrEqualTo(String value) {
			addCriterion("fk_from_key >=", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyLessThan(String value) {
			addCriterion("fk_from_key <", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyLessThanOrEqualTo(String value) {
			addCriterion("fk_from_key <=", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyLike(String value) {
			addCriterion("fk_from_key like", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyNotLike(String value) {
			addCriterion("fk_from_key not like", value, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyIn(List<String> values) {
			addCriterion("fk_from_key in", values, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyNotIn(List<String> values) {
			addCriterion("fk_from_key not in", values, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyBetween(String value1, String value2) {
			addCriterion("fk_from_key between", value1, value2, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andFkFromKeyNotBetween(String value1, String value2) {
			addCriterion("fk_from_key not between", value1, value2, "fkFromKey");
			return (Criteria) this;
		}

		public Criteria andGameTypeIsNull() {
			addCriterion("game_type is null");
			return (Criteria) this;
		}

		public Criteria andGameTypeIsNotNull() {
			addCriterion("game_type is not null");
			return (Criteria) this;
		}

		public Criteria andGameTypeEqualTo(String value) {
			addCriterion("game_type =", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeNotEqualTo(String value) {
			addCriterion("game_type <>", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeGreaterThan(String value) {
			addCriterion("game_type >", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
			addCriterion("game_type >=", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeLessThan(String value) {
			addCriterion("game_type <", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeLessThanOrEqualTo(String value) {
			addCriterion("game_type <=", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeLike(String value) {
			addCriterion("game_type like", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeNotLike(String value) {
			addCriterion("game_type not like", value, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeIn(List<String> values) {
			addCriterion("game_type in", values, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeNotIn(List<String> values) {
			addCriterion("game_type not in", values, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeBetween(String value1, String value2) {
			addCriterion("game_type between", value1, value2, "gameType");
			return (Criteria) this;
		}

		public Criteria andGameTypeNotBetween(String value1, String value2) {
			addCriterion("game_type not between", value1, value2, "gameType");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ds_from_key_type
	 * @mbggenerated  Wed Oct 14 00:55:56 CST 2015
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ds_from_key_type
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 26 15:57:10 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}