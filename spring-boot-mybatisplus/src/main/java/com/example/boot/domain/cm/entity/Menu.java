package com.example.boot.domain.cm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author lvyongb
 * @since 2018-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cm_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父级菜单编码
     */
    private String parentCode;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 显示的优先级
     */
    private Integer priority;

    /**
     * 所有父菜单编码
     */
    private String parentsCode;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 状态 1：禁用，0：正常
     */
    private Integer status;

    /**
     * 删除标记1：删除，0：未删除
     */
    private Boolean delFlag;

    /**
     * 创建人员
     */
    private String creator;

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
