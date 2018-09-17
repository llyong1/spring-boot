package com.example.boot.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyongb
 * @date: 2018-09-17
 * @time: 10:44
 */
@Data
@TableName(value = "cm_user")
public class User {
    private Long id;

    private String userCode;

    private String userName;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;
}
