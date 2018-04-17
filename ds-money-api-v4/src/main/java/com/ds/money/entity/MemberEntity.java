package com.ds.money.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MemberEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.username
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.site_id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private Integer siteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.site_name
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String siteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.create_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.agents
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String agents;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String world;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String corprator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String superior;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.company
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.comm_agent
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private BigDecimal commAgent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.comm_world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private BigDecimal commWorld;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.comm_corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private BigDecimal commCorprator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.comm_superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private BigDecimal commSuperior;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.comm_branch
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private BigDecimal commBranch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ds_member.update_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.id
     *
     * @return the value of ds_member.id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.id
     *
     * @param id the value for ds_member.id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.username
     *
     * @return the value of ds_member.username
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.username
     *
     * @param username the value for ds_member.username
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.site_id
     *
     * @return the value of ds_member.site_id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.site_id
     *
     * @param siteId the value for ds_member.site_id
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.site_name
     *
     * @return the value of ds_member.site_name
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.site_name
     *
     * @param siteName the value for ds_member.site_name
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.create_time
     *
     * @return the value of ds_member.create_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.create_time
     *
     * @param createTime the value for ds_member.create_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.agents
     *
     * @return the value of ds_member.agents
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getAgents() {
        return agents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.agents
     *
     * @param agents the value for ds_member.agents
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setAgents(String agents) {
        this.agents = agents == null ? null : agents.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.world
     *
     * @return the value of ds_member.world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getWorld() {
        return world;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.world
     *
     * @param world the value for ds_member.world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setWorld(String world) {
        this.world = world == null ? null : world.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.corprator
     *
     * @return the value of ds_member.corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getCorprator() {
        return corprator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.corprator
     *
     * @param corprator the value for ds_member.corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCorprator(String corprator) {
        this.corprator = corprator == null ? null : corprator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.superior
     *
     * @return the value of ds_member.superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getSuperior() {
        return superior;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.superior
     *
     * @param superior the value for ds_member.superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setSuperior(String superior) {
        this.superior = superior == null ? null : superior.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.company
     *
     * @return the value of ds_member.company
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.company
     *
     * @param company the value for ds_member.company
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.comm_agent
     *
     * @return the value of ds_member.comm_agent
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public BigDecimal getCommAgent() {
        return commAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.comm_agent
     *
     * @param commAgent the value for ds_member.comm_agent
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCommAgent(BigDecimal commAgent) {
        this.commAgent = commAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.comm_world
     *
     * @return the value of ds_member.comm_world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public BigDecimal getCommWorld() {
        return commWorld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.comm_world
     *
     * @param commWorld the value for ds_member.comm_world
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCommWorld(BigDecimal commWorld) {
        this.commWorld = commWorld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.comm_corprator
     *
     * @return the value of ds_member.comm_corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public BigDecimal getCommCorprator() {
        return commCorprator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.comm_corprator
     *
     * @param commCorprator the value for ds_member.comm_corprator
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCommCorprator(BigDecimal commCorprator) {
        this.commCorprator = commCorprator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.comm_superior
     *
     * @return the value of ds_member.comm_superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public BigDecimal getCommSuperior() {
        return commSuperior;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.comm_superior
     *
     * @param commSuperior the value for ds_member.comm_superior
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCommSuperior(BigDecimal commSuperior) {
        this.commSuperior = commSuperior;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.comm_branch
     *
     * @return the value of ds_member.comm_branch
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public BigDecimal getCommBranch() {
        return commBranch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.comm_branch
     *
     * @param commBranch the value for ds_member.comm_branch
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setCommBranch(BigDecimal commBranch) {
        this.commBranch = commBranch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ds_member.update_time
     *
     * @return the value of ds_member.update_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ds_member.update_time
     *
     * @param updateTime the value for ds_member.update_time
     *
     * @mbggenerated Thu Aug 06 03:05:53 EDT 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}