package com.example.boot.domain.cm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lvyongb
 * @since 2018-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cm_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户真实名
     */
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
    private Integer userLevel;

    /**
     * QQ
     */
    private String qqAcount;

    /**
     * 微信
     */
    private String wxAccount;

    /**
     * 微博
     */
    private String wbAccount;

    /**
     * IP地址
     */
    private String ipAddress;

    /**
     * 删除标记1：删除，0：未删除
     */
    private Boolean delFlag;

    /**
     * 创建人员
     */
    private String creater;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人员
     */
    private String modifier;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
