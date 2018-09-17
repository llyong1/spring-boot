package com.example.boot.module.cm;

import lombok.Builder;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;


//@Builder(toBuilder = true)
@ToString
@Table(name = "cm_menu")
public class CmMenu {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单编码
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 父级菜单编码
     */
    @Column(name = "parent_code")
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
    @Column(name = "parents_code")
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
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * 创建人员
     */
    private String creator;

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
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取菜单编码
     *
     * @return menu_code - 菜单编码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单编码
     *
     * @param menuCode 菜单编码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取父级菜单编码
     *
     * @return parent_code - 父级菜单编码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置父级菜单编码
     *
     * @param parentCode 父级菜单编码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 获取层级
     *
     * @return level - 层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置层级
     *
     * @param level 层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取显示的优先级
     *
     * @return priority - 显示的优先级
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置显示的优先级
     *
     * @param priority 显示的优先级
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取所有父菜单编码
     *
     * @return parents_code - 所有父菜单编码
     */
    public String getParentsCode() {
        return parentsCode;
    }

    /**
     * 设置所有父菜单编码
     *
     * @param parentsCode 所有父菜单编码
     */
    public void setParentsCode(String parentsCode) {
        this.parentsCode = parentsCode;
    }

    /**
     * 获取菜单url
     *
     * @return url - 菜单url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单url
     *
     * @param url 菜单url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态 1：禁用，0：正常
     *
     * @return status - 状态 1：禁用，0：正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1：禁用，0：正常
     *
     * @param status 状态 1：禁用，0：正常
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return creator - 创建人员
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人员
     *
     * @param creator 创建人员
     */
    public void setCreator(String creator) {
        this.creator = creator;
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