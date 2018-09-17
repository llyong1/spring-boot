package com.example.boot.module.cm;

import lombok.Builder;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;


//@Builder(toBuilder = true)
@ToString
@Table(name = "cm_user")
public class CmUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户真实名
     */
    @Column(name = "user_real_name")
    private String userRealName;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电话
     */
    private String telphone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态[0:正常 1:锁定 2:删除]
     */
    private String status;

    /**
     * 用户级别[0:普通用户 1:岗位用户 2:平台管理员 4:客户管理员]
     */
    @Column(name = "user_level")
    private Integer userLevel;

    /**
     * QQ
     */
    @Column(name = "qq_acount")
    private String qqAcount;

    /**
     * 微信
     */
    @Column(name = "wx_account")
    private String wxAccount;

    /**
     * 微博
     */
    @Column(name = "wb_account")
    private String wbAccount;

    /**
     * IP地址
     */
    @Column(name = "ip_address")
    private String ipAddress;

    /**
     * 删除标记1：删除，0：未删除
     */
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * 创建人员
     */
    private String creater;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人员
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_code - 用户id
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户id
     *
     * @param userCode 用户id
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户真实名
     *
     * @return user_real_name - 用户真实名
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * 设置用户真实名
     *
     * @param userRealName 用户真实名
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取电话
     *
     * @return telphone - 电话
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置电话
     *
     * @param telphone 电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取状态[0:正常 1:锁定 2:删除]
     *
     * @return status - 状态[0:正常 1:锁定 2:删除]
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态[0:正常 1:锁定 2:删除]
     *
     * @param status 状态[0:正常 1:锁定 2:删除]
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取用户级别[0:普通用户 1:岗位用户 2:平台管理员 4:客户管理员]
     *
     * @return user_level - 用户级别[0:普通用户 1:岗位用户 2:平台管理员 4:客户管理员]
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户级别[0:普通用户 1:岗位用户 2:平台管理员 4:客户管理员]
     *
     * @param userLevel 用户级别[0:普通用户 1:岗位用户 2:平台管理员 4:客户管理员]
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取QQ
     *
     * @return qq_acount - QQ
     */
    public String getQqAcount() {
        return qqAcount;
    }

    /**
     * 设置QQ
     *
     * @param qqAcount QQ
     */
    public void setQqAcount(String qqAcount) {
        this.qqAcount = qqAcount;
    }

    /**
     * 获取微信
     *
     * @return wx_account - 微信
     */
    public String getWxAccount() {
        return wxAccount;
    }

    /**
     * 设置微信
     *
     * @param wxAccount 微信
     */
    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    /**
     * 获取微博
     *
     * @return wb_account - 微博
     */
    public String getWbAccount() {
        return wbAccount;
    }

    /**
     * 设置微博
     *
     * @param wbAccount 微博
     */
    public void setWbAccount(String wbAccount) {
        this.wbAccount = wbAccount;
    }

    /**
     * 获取IP地址
     *
     * @return ip_address - IP地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置IP地址
     *
     * @param ipAddress IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 获取删除标记1：删除，0：未删除
     *
     * @return del_flag - 删除标记1：删除，0：未删除
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记1：删除，0：未删除
     *
     * @param delFlag 删除标记1：删除，0：未删除
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取创建人员
     *
     * @return creater - 创建人员
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人员
     *
     * @param creater 创建人员
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人员
     *
     * @return modifier - 修改人员
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人员
     *
     * @param modifier 修改人员
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}