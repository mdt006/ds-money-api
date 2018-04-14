package com.ds.money.dao.mapper;

import com.ds.money.entity.DsSiteHashcode;
import com.ds.money.entity.DsSiteHashcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsSiteHashcodeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int countByExample(DsSiteHashcodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int deleteByExample(DsSiteHashcodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int deleteByPrimaryKey(Integer siteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int insert(DsSiteHashcode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int insertSelective(DsSiteHashcode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	List<DsSiteHashcode> selectByExample(DsSiteHashcodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	DsSiteHashcode selectByPrimaryKey(Integer siteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int updateByExampleSelective(@Param("record") DsSiteHashcode record,
			@Param("example") DsSiteHashcodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int updateByExample(@Param("record") DsSiteHashcode record,
			@Param("example") DsSiteHashcodeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int updateByPrimaryKeySelective(DsSiteHashcode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ds_site_hashcode
	 * @mbggenerated  Thu Jun 04 13:50:38 CST 2015
	 */
	int updateByPrimaryKey(DsSiteHashcode record);
}