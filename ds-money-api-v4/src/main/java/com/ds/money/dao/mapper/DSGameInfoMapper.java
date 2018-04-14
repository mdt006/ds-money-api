package com.ds.money.dao.mapper;

import com.ds.money.entity.DSGameInfo;
import com.ds.money.entity.DSGameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DSGameInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int countByExample(DSGameInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int deleteByExample(DSGameInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int insert(DSGameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int insertSelective(DSGameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    List<DSGameInfo> selectByExample(DSGameInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    DSGameInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int updateByExampleSelective(@Param("record") DSGameInfo record, @Param("example") DSGameInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int updateByExample(@Param("record") DSGameInfo record, @Param("example") DSGameInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int updateByPrimaryKeySelective(DSGameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ds_game_info
     *
     * @mbggenerated Fri Oct 30 16:29:30 CST 2015
     */
    int updateByPrimaryKey(DSGameInfo record);
}